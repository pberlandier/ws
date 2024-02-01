package com.ws.odm.mapping;

public class InputCBU {
	private CLICType CLIC;
	private IFSType IFS;
	private INTType INT;
	private NAType NAT;

	public CLICType getCLIC() {
		return CLIC;
	}

	public void setCLIC(CLICType cLIC) {
		CLIC = cLIC;
	}

	public IFSType getIFS() {
		return IFS;
	}

	public void setIFS(IFSType iFS) {
		IFS = iFS;
	}

	public INTType getINT() {
		return INT;
	}

	public void setINT(INTType iNT) {
		INT = iNT;
	}

	public NAType getNAT() {
		return NAT;
	}

	public void setNAT(NAType nAT) {
		NAT = nAT;
	}

	public enum CLICType {
		AM, AD, PP
	}

	public enum IFSType {
		ACL, HZ, MR, SS, SmSel
	}

	public enum INTType {
		IX, JM, AQ, MV, NM, SP, IS, Select, ACH, PN, VR
	}

	public enum NAType {
		SS, AQ, MV, NM, SP, IS, ACH, PN, VR, SmSel
	}

}
