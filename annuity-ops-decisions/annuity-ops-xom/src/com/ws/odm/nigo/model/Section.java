package com.ws.odm.nigo.model;

import java.util.Hashtable;

public class Section {
	private Hashtable<String, String> fields = new Hashtable<String, String>();

	public Hashtable<String, String> getFields() {
		return fields;
	}

	public void setFields(Hashtable<String, String> fields) {
		this.fields = fields;
	}

	public void addField(String id, String value) {
		fields.put(id, value);
	}
}
