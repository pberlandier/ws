
package com.ws.odm.priority.model;

import java.util.List;

public class Case {

	public String caseFolderId;

	public String agreementNumber;

	public String agreementInfo;

	public String agreementInfoTemplate;

	public CaseMetaInformation caseMetaInformation;

	public CaseFolder caseFolder;

	public Agreement agreement;

	public List<Producer> producers;

	public List<Party> parties;

	public List<FundAllocation> fundAllocations;

	public List<Object> enhancedNigos;

	public List<IncludedFormWizardStep> includedFormWizardSteps;

	public List<TransfersAggObj> transfersAggObj;

	public Object arrangements;

}
