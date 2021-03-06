package com.suboat.contrib.utils;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Bean工具
 */
public class BeanUtils extends org.springframework.beans.BeanUtils {

	/**
	 * 转换属性名称为setter方法
	 * @param propertyName 属性名称
	 * @return setter方法名
	 */
	private static String convertSetterName(String propertyName) {
		return "set" + String.valueOf(propertyName.charAt(0)).toUpperCase() + propertyName.substring(1);
	}

	/**
	 * 尝试给bean的对应属性名赋值
	 * @param bean bean对象名称
	 * @param propertyName 属性名
	 * @param propertyValue 属性值
	 * @return 是否正常调用赋值
	 */
	public static boolean trySet(Object bean, String propertyName, Object propertyValue) {
		String methodName = "set" + String.valueOf(propertyName.charAt(0)).toUpperCase() + propertyName.substring(1);
		try {
			Arrays.stream(bean.getClass().getMethods()).filter(method -> method.getName().equals(methodName));
			Method method = bean.getClass().getMethod(methodName, propertyValue.getClass());
			method.invoke(bean, propertyValue);
			return true;
		}
		catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
			return false;
		}
	}

	/**
	 * 拷贝非空字段
	 * @param from 源数据
	 * @param to 结果数据
	 */
	public static void copyNotNullProperties(Object from, Object to) {
		if (from == null || to == null) {
			return;
		}
		Arrays.stream(from.getClass().getMethods())
				.filter(method -> method.getName().startsWith("get") || method.getName().startsWith("is"))
				.forEach(getter -> {
					if (getter.getParameterCount() == 0) {
						try {
							String setterName = null;
							if (getter.getName().startsWith("get"))
								setterName = "set" + getter.getName().substring(3);
							else
								setterName = "set" + getter.getName().substring(2);

							Object val = getter.invoke(from, null);

							if (val != null && !setterName.equals("setClass")) {
								Method setter = to.getClass().getMethod(setterName, val.getClass());
								if (setter != null) {
									setter.invoke(to, val);
								}
							}
						}
						// catch (NoSuchMethodException e) {
						// // 忽略错误
						// }
						catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
							e.printStackTrace();
						}
					}
				});
	}

	// 查找空值字段
	public static String[] getNullPropertyNames(Object source) {
		final BeanWrapper src = new BeanWrapperImpl(source);
		java.beans.PropertyDescriptor[] pds = src.getPropertyDescriptors();

		Set<String> emptyNames = new HashSet<String>();
		for (java.beans.PropertyDescriptor pd : pds) {
			Object srcValue = src.getPropertyValue(pd.getName());
			if (srcValue == null)
				emptyNames.add(pd.getName());
		}

		String[] result = new String[emptyNames.size()];
		return emptyNames.toArray(result);
	}

	// 拷贝非空字段
	public static void copyPropertiesIgnoreNull(Object src, Object target) {
		if (src == null || target == null) {
			return;
		}
		BeanUtils.copyProperties(src, target, getNullPropertyNames(src));
	}

}
