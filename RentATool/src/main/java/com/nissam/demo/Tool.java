package com.nissam.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tool {
	@Id
	private int tool_id;
	
	private String name;
	private String catelogue;
	private String power;
	private String purpose;
	private String manufacture_company;
	private String remarks;
	
	public int getToolid() {
		return tool_id;
	}
	public void setToolid(int toolid) {
		this.tool_id = toolid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCatelogue() {
		return catelogue;
	}
	public void setCatelogue(String catelogue) {
		this.catelogue = catelogue;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String use) {
		this.purpose = use;
	}
	public String getManufacture_company() {
		return manufacture_company;
	}
	public void setManufacture_company(String manufacture_company) {
		this.manufacture_company = manufacture_company;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
}
