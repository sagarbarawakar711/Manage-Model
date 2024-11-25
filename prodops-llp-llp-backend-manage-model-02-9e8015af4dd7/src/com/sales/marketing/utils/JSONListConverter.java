package com.sales.marketing.utils;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.sales.marketing.exception.ExceptionResponse;

/**
 * JSONListConverter class is responsible for performing following operations.
 * 1) Convert List of Person objects to JSON String in java.
 * 
 * @author PunnayyaSastryJandhyala
 *
 */
public class JSONListConverter {

	public static final String URL_PATH = "server_api_uri_JSONListConverter"; //"http://localhost:8090";
	public static final String NO_OBJECT_FOUND = "No data found";
	public static final String GIVEN_INPUT_VALUE = " for a given value ";

	public String arrayToJson(@SuppressWarnings("rawtypes") List list, String userInputValue, String sourceName) throws JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		if (list.isEmpty()) {
			List<ExceptionResponse> exceptionResponse = new ArrayList<ExceptionResponse>();
			exceptionResponse.add(new ExceptionResponse((userInputValue.isEmpty() ? NO_OBJECT_FOUND : NO_OBJECT_FOUND + GIVEN_INPUT_VALUE +sourceName), URL_PATH +userInputValue + sourceName));
			return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(exceptionResponse);
		} else {
			objectMapper.enable(SerializationFeature.INDENT_OUTPUT);// Set pretty printing of json
			return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(list);
		}
	}
}
