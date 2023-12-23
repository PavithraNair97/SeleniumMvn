package TestScript;

import org.testng.annotations.Test;

import POMScript.RegisterPage;

public class RegisterTest {

	@Test(dataProvider="data")
	public void testCase(String FirstName,String LN,String EM,String Pwd,String pwd) {
		RegisterPage r= new RegisterPage( );
		
		r.getFirstName();
		r.getLastName();
		//r.get
		
	}
}
