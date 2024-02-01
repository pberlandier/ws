package com.ws.odm.nigo.model;

import java.util.ArrayList;
import java.util.List;

public class NIGOList {
	private List<NIGOItem> items = new ArrayList<NIGOItem>();

	public List<NIGOItem> getItems() {
		return items;
	}

	public void setItems(List<NIGOItem> items) {
		this.items = items;
	}

	public void addItem(int id, String messageText) {
		NIGOItem item = new NIGOItem();
		item.setId(id);
		item.setMessageText(messageText);
		items.add(item);
	}

	public void print() {
		if (items.size() != 0) {
			System.out.println("NIGO items:");
			for (NIGOItem item : items) {
				System.out.println("  - " + item.getId() + ": " + item.getMessageText());
			}
		} else {
			System.out.println("Form is in good order.");
		}
	}
}
