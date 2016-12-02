package com.msrm.erp.ui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SupplyManangementController implements SharableController {

	public SupplyManangementController() {
		register();
	}

	@RequestMapping("/supply/home")
	public void supplyHomeProcessor() {
		AppUIConfig.print();
		System.out.println("Supply home page");
	}

}
