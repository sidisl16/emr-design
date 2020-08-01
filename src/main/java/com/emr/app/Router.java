package com.emr.app;

import java.util.concurrent.ConcurrentHashMap;

import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public enum Router {

	INSTANCE;

	private JLayeredPane layeredPane;
	private ConcurrentHashMap<Class, JPanel> routes;

	private Router() {
		routes = new ConcurrentHashMap<>();
	}

	public void setLayeredPane(JLayeredPane layeredPane) {
		this.layeredPane = layeredPane;
	}

	public void registerRoute(JPanel route) {
		this.routes.put(route.getClass(), route);
	}

	public void route(Class route) {
		layeredPane.removeAll();
		layeredPane.add(routes.get(route));
		layeredPane.repaint();
		layeredPane.revalidate();
	}

}
