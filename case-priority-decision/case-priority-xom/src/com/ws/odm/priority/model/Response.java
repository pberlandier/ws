package com.ws.odm.priority.model;

import java.util.ArrayList;
import java.util.List;

public class Response {
	public int priority;
	public List<String> reasons = new ArrayList<String>();
	
	public void adjustPriority(int adjustment, String reason) {
		priority += adjustment;
		reasons.add(reason);
	}
}
