package com.emr.app;

import javax.swing.table.DefaultTableModel;

public class CheckBoxTableDataModel extends DefaultTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		if (columnIndex > 3) {
			return Boolean.class;
		}
		return super.getColumnClass(columnIndex);
	}

}