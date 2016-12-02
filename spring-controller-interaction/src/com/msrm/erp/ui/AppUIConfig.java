package com.msrm.erp.ui;

import java.util.HashMap;
import java.util.Map;

public final class AppUIConfig {

	private AppUIConfig() {
	}

	private static Map<String, SharableController> controllers = new HashMap<>();

	public static void registerController(SharableController controller) {
		controllers.put(controller.toString(), controller);
	}

	public static void print() {
		controllers.forEach((k, v) -> {
			System.out.println(k + " : " + v);
		});
	}
}
