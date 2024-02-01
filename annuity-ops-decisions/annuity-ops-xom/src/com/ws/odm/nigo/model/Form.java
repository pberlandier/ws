package com.ws.odm.nigo.model;

import java.util.Hashtable;
import java.util.List;

public class Form {
	private String id;
	private Hashtable<String, Section> sections = new Hashtable<String, Section>();

	public Form() {
	}

	public List<Field> getFields() {
		return null;
	}

	public void setFields(List<Field> fields) {
		for (Field field : fields) {
			Section section = sections.get(field.getSectionId());
			if (section == null) {
				section = new Section();
				sections.put(field.getSectionId(), section);
			}
			section.addField(field.getId(), field.getValue());
		}
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Hashtable<String, Section> getSections() {
		return sections;
	}

	public void setSections(Hashtable<String, Section> sections) {
		this.sections = sections;
	}

	public String getFieldValue(String sectionName, String fieldName) {
		Section section = sections.get(sectionName);
		if (section == null) {
			return null;
		} else {
			return section.getFields().get(fieldName);
		}
	}
}
