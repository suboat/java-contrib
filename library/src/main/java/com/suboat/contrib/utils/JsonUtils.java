package com.suboat.contrib.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;

public class JsonUtils {

	private static final ObjectMapper JSON = new ObjectMapper();

	static {
		JSON.setSerializationInclusion(JsonInclude.Include.NON_NULL);
		JSON.configure(SerializationFeature.INDENT_OUTPUT, Boolean.TRUE);
	}

	public static String toJson(Object obj) {
		try {
			return JSON.writeValueAsString(obj);
		}
		catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return "{}";
	}

	public static Object fromJson(String content, Class valueType) {
		if (content == null || content.length() <= 2) {
			return null;
		}
		Object object = null;
		try {
			object = JSON.readValue(content, valueType);
		}
		catch (final IOException e) {
			System.out.println(e.getMessage());
		}
		return object;
	}

}
