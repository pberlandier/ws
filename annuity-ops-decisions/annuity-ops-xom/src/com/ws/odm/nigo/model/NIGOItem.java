package com.ws.odm.nigo.model;

public class NIGOItem {
	private int id;
	private String messageText;

	/*
	 * Ignore these for now...
	 */
	// private String nigoId;
	// private String msgPart1Txt;
	// private String msgPart2Txt;
	// private String msgPart3Txt;
	// private String msgPart4Txt;
	// private String msgPart5Txt;
	// private String msgPart6Txt;
	// private String rmdtTxt;
	// private String descTxt;
	// private String remediationPlan;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessageText() {
		return messageText;
	}

	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}
}
