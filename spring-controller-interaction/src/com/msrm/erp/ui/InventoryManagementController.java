package com.msrm.erp.ui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InventoryManagementController implements SharableController {

	public InventoryManagementController() {
		this.register();
	}

	@RequestMapping("/inventory/home")
	public void inventoryHomeProcessor() {
		System.out.println("Inventory home page");
	}

}
