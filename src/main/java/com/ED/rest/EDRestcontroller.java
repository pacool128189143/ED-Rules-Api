package com.ED.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ED.request.CitizenData;
import com.ED.response.PlanData;
import com.ED.service.EDRulesService;

@RestController
public class EDRestcontroller {

	@Autowired
	private EDRulesService edRulesService;

	@PostMapping("/citizendata")
	public ResponseEntity<PlanData> getPlanedatas(@RequestBody CitizenData citizenData) {
		PlanData planeData = edRulesService.getPlaneData(citizenData);
		return new ResponseEntity<PlanData>(planeData, HttpStatus.OK);
	}
}
