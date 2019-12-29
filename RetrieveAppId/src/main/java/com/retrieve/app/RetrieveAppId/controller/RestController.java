package com.retrieve.app.RetrieveAppId.controller;


import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping(value = "/retrieve")
@Validated
public class RestController {

	@PostMapping("/data")
	public String retrieveData(@Valid @NotEmpty(message = "id cannot be empty!") @Min(value = 0, message ="should be greater than 0") 
	@Max(value = 1000, message = "should be less than 1000") String id) {
		
		return "Request id:" +id;
	}
	

}
