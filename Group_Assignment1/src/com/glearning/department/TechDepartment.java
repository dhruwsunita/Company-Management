package com.glearning.department;

/**
 * This class will show all the technical functionalities of Technical department
 * 
 * @author Sunita Dhruw, Aswin Raj Kumar, Praveen
 * 
 * @since 17-12-2022
 */

public class TechDepartment extends SuperDepartment {

	//This method will return department name
	@Override
	public String departmentName() {
		return " Tech Department";
	}

	//This method will update about today's work
	@Override
	public String getTodaysWork() {
		return"Complete coding of Module 1";
	}

	//This method will update about work deadline
	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	//This method will update about technical information of technical department
	public String getTechStackInformation() {
		return "Core Java";
	}
	
}
