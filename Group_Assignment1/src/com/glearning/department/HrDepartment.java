package com.glearning.department;

/**
 * This class will show all the functionalities of HR department 
 * 
 * @author Sunita Dhruw, Aswin Raj Kumar, Praveen
 * 
 * @since 17-12-2022
 */

public class HrDepartment extends SuperDepartment {

	//This method will return department name
	@Override
	public String departmentName() {
		return " HR Department";
	}

	//This method will update about today's work 
	@Override
	public String getTodaysWork() {
		return "Fill today's timesheet and mark your attendance";
	}
	
    //This method will update about work deadline
	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	//This method will update about activities of HR department
	public String doActivity() {
		return "Team Lunch";
		
	}
	
}
