package com.ws.odm.mapping;

import java.util.ArrayList;
import java.util.List;

public class MappedForms {
	private List<MappedForm> elements = new ArrayList<MappedForm>();

	public List<MappedForm> getElements() {
		return elements;
	}

	public void setElements(List<MappedForm> elements) {
		this.elements = elements;
	}
	
	public void addElement(String indexFormId, String consolidatedFormName, String formName, String paperFormId) {
		MappedForm form = new MappedForm();
		form.setIndexFormId(indexFormId);
		form.setConsolidatedFormName(consolidatedFormName);
		form.setFormName(formName);
		form.setPaperFormId(paperFormId);
		elements.add(form);
	}
	
	public void print() {
		System.out.println("Required forms");
		for (MappedForm form : elements) {
			System.out.println("  - " +form.getPaperFormId());
		}
	}
}
