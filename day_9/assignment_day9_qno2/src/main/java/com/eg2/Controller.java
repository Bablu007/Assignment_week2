package com.eg2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	  @Value("${cmdb.resource-url}")
	  private String fileDirectory;
	@GetMapping("/get")
	public String  getValue() {
		return fileDirectory;
	}
}
