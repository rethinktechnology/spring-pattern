package com.msrm.erp.ui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ResourceManagementController {

	public ResourceManagementController() {
	}

	@RequestMapping("/resource/home")
	public void resourceHomeProcessor() {
		System.out.println("Resource home page");
	}

}
