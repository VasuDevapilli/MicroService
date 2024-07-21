package com.excelr.controller;

import java.util.List;

import com.excelr.model.Citizen;
import com.excelr.model.VaccinationCenter;

public class RequiredResponse {
	

	private VaccinationCenter center;
	private List<Citizen> citizens;
	public RequiredResponse(VaccinationCenter center, List<Citizen> citizens) {
		super();
		this.center = center;
		this.citizens = citizens;
	}
	@Override
	public String toString() {
		return "RequiredResponse [center=" + center + ", citizens=" + citizens + "]";
	}
	public VaccinationCenter getCenter() {
		return center;
	}
	public void setCenter(VaccinationCenter center) {
		this.center = center;
	}
	public List<Citizen> getCitizens() {
		return citizens;
	}
	public void setCitizens(List<Citizen> citizens) {
		this.citizens = citizens;
	}

}
