package com.guvi.junit_testing;

public class UserAuthentication {
	
	public String userLogin(String email, String password)
	{
		if(email.equals("admin@guvi.in") && password.equals("admin@123"))
		{
			return "success";
		}
		else if(!email.equals("admin@guvi.in") && password.equals("admin@123"))
		{
			return "failed";
		}
		else if(email.equals("admin@guvi.in") && !password.equals("admin@123"))
		{
			return "failed";
		}
		else if(!email.equals("admin@guvi.in") && !password.equals("admin@123"))
		{
			return "failed";
		}
		else
		{
			return "failed";
		}
	}

}
