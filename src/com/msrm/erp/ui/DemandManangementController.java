package com.msrm.erp.ui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemandManangementController implements SharableController {

	public DemandManangementController() {
		AppUIConfig.registerController(this);
	}

	@RequestMapping("/demand/home")
	public void demandHomeProcessor() {
		System.out.println("Demand home page");
	}

}
