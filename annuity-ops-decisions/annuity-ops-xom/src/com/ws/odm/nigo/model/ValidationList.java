package com.ws.odm.nigo.model;

import java.util.ArrayList;
import java.util.List;

public class ValidationList {
	private List<ValidationItem> items = new ArrayList<ValidationItem>();

	public List<ValidationItem> getItems() {
		return items;
	}

	public void setItems(List<ValidationItem> items) {
		this.items = items;
	}

	public void addItem(Form form, String sectionId, String fieldId, String nigoId, int uniqueId) {
		ValidationItem item = new ValidationItem();
		item.setValue(form.getFieldValue(sectionId, fieldId));
		item.setId(uniqueId);
		item.setNigoId(nigoId);
		items.add(item);
	}

}
