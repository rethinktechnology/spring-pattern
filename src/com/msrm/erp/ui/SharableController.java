package com.msrm.erp.ui;

public interface SharableController {

	public default void register() {
		AppUIConfig.registerController(this);
	}
}
