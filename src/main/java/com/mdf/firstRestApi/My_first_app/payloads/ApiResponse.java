package com.mdf.firstRestApi.My_first_app.payloads;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
@AllArgsConstructor
@JsonPropertyOrder({"message","success"})
public class ApiResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NonNull
	@JsonProperty("success")
	private Boolean success;
	
	@NonNull
	@JsonProperty("message")
	private String message;
	
}
