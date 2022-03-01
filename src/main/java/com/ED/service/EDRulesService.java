package com.ED.service;

import org.springframework. stereotype.Service;

import com.ED.request.CitizenData;
import com.ED.response.PlanData;

@Service
public class EDRulesService {

	public PlanData getPlaneData(CitizenData citizenData) {
		PlanData planData = new PlanData();
		String planeName = citizenData.getPlaneName();

		if ("SNAP".equals(planeName)) {
			if (citizenData.getIncome() >= 200) {
				planData.setBenefitAmnt(3503.00);
				planData.setStartDate("25-feb-2022");
				planData.setEndsDate("30-mar-2022");
				planData.setPlanStatus("Approved");
			} else {
				planData.setPlanStatus("DENIED");
				planData.setDenielReason("High income");
			}
		}
	
		else if ("CCAP".equals(planeName)) {
				if (citizenData.getKidsEligile()>=16) {
					
					planData.setBenefitAmnt(3502.00);
					planData.setStartDate("25-feb-2022");
					planData.setEndsDate("30-mar-2022");
					planData.setPlanStatus("Approved");
				} 
				else {
					planData.setPlanStatus("DENIED");
					planData.setDenielReason("High income and having kids under 16 age");
				}
		}

		else if ("MEDICAID".equals(planeName)) {

				if (citizenData.getIncome() <= 300.00) {
					planData.setBenefitAmnt(3501.00);
					planData.setStartDate("25-feb-2022");
					planData.setEndsDate("30-mar-2022");
					planData.setPlanStatus("Approved");
				} else {
					planData.setPlanStatus("DENIED");
					planData.setDenielReason("High income and you are not qulify by medicaid plane");
				}
			}

		 else if ("MEDICARE".equals(planeName)) {

				if (citizenData.getAge() <= 65) {
					planData.setBenefitAmnt(3504.00);
					planData.setStartDate("25-feb-2022");
					planData.setEndsDate("30-mar-2022");
					planData.setPlanStatus("Approved");
				} else {
					planData.setPlanStatus("DENIED");
					planData.setDenielReason("age less than 65");
				}

		} 
	else if ("KW".equals(planeName)) {

				if (citizenData.getEmpstatus().equals("un-epmloye")) {
					planData.setBenefitAmnt(3500.00);
					planData.setStartDate("25-feb-2022");
					planData.setEndsDate("30-mar-2022");
					planData.setPlanStatus("Approved");
				} else {
					planData.setPlanStatus("DENIED");
					planData.setDenielReason("You are employement of government");
				}
			}
			
	else {
		if("".equals(planeName)) {
			//planeName.set
		}
	}
		

		return planData;
	}

}