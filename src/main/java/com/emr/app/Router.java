package com.emr.app;

import java.util.concurrent.ConcurrentHashMap;

import javax.swing.JLayeredPane;
import javax.swing.SwingUtilities;

public enum Router {

	INSTANCE;

	private JLayeredPane layeredPane;
	private ConcurrentHashMap<Class, RoutingPanel> routes;

	private Router() {
		routes = new ConcurrentHashMap<>();
	}

	public void setLayeredPane(JLayeredPane layeredPane) {
		this.layeredPane = layeredPane;
	}

	public void registerRoute(RoutingPanel route) {
		this.routes.put(route.getClass(), route);
	}

	public void route(Class route) {
		layeredPane.removeAll();
		RoutingPanel panel = routes.get(route);
		panel.execute();
		layeredPane.add(panel);
		layeredPane.revalidate();
	}

}
