package com.glearning.department;

/**
 * This class will show all the functionalities of Admin department
 * 
 * @author Sunita Dhruw, Aswin Raj Kumar
 * 
 * @since 17-12-2022
 */

public class AdminDepartment extends SuperDepartment {
    
	
	//This method will return department name
	@Override
	public String departmentName() {
		return " Admin Department";
	}
	
    //This method will update about today's work of admin department
	@Override
	public String getTodaysWork() {
		return "Complete your documents Submission";
	}
	
    //This method will update about work deadline
	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
	}

}
