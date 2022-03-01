package com.ED.response;

import lombok.Data;

@Data
public class PlanData {
private String name;
private String ssn;
private String planStatus;
private String startDate;
private String endsDate;
private Double benefitAmnt;
private String denielReason;
}
