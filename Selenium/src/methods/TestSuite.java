package methods;

import java.io.IOException;

public class TestSuite {

	public static void main(String[] args) throws IOException
	{
		OrgHRMMaster om=new OrgHRMMaster();
		//Login
		System.out.println("Login Tc");
		String res=om.org_Launch(om.url);
		System.out.println("Application Launch "+res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println("Application Login "+res);
		
		res=om.org_Logout();
		System.out.println("Application Logout "+res);
		
		om.org_Close();
		System.out.println("Application Closed Successfully");
		//Empreg
		System.out.println("Empreg Tc");
		res=om.org_Launch(om.url);
		System.out.println("Application Launch "+res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println("Application Login "+res);
		
		res=om.org_Empreg("Sharath", "Chandra");
		System.out.println("Employee Reg "+res);
		
		res=om.org_Logout();
		System.out.println("Application Logout "+res);
		
		om.org_Close();
		System.out.println("Application Closed Successfully");
		//Userreg
		System.out.println("Usereg Tc");
		res=om.org_Launch(om.url);
		System.out.println("Application Launch "+res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println("Application Login "+res);
		
		res=om.org_Userreg("Sharath Chandra", "SharathChandra", "SharathChandra", "SharathChandra");
		System.out.println("User registraion "+res);
		
		res=om.org_Logout();
		System.out.println("Application Logout "+res);
		
		om.org_Close();
		System.out.println("Application Closed Successfully");
		//UserLogin
		System.out.println("UserLogin TC");
		res=om.org_Launch(om.url);
		System.out.println("Application Launch "+res);
		
		res=om.org_Login("SharathChandra", "SharathChandra");
		System.out.println("Application Login "+res);
		
		res=om.org_Logout();
		System.out.println("Application Logout "+res);
		
		om.org_Close();
		System.out.println("Application Closed Successfully");

	}

}
