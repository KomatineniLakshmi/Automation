package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class sign_inn {

	@Test(dataProvider="details")
    public void login(String Cusername,String Csigninpassword ){
	System.setProperty("webdriver.chrome.driver","C:\\Users\\komatineni.lakshmi\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();	
	
	Contact3 Alexa = new Contact3(driver);
	Alexa.moveto();
	Alexa.Signin();
	Alexa.form(Cusername,Csigninpassword);
	Alexa.submit();

	}
	@DataProvider(name="details")
	public Object[][] Testcase()
	{
	Object[][] data = new Object[5][2];
	data[0][0]="la";
	data[0][1]="LLLLLLLLLLLL"	;
	
	data[1][0]="lakkkkkkkkkkkkkkkkssssssss";
	data[1][1]="1111111111"	;
	
	data[2][0]="      ";
	data[2][1]="@@@@@@@@@@@"	;
	
	data[3][0]="lakshmi";
	data[3][1]="          "	;
	
	data[4][0]="      ";
	data[4][1]="       "	;
	
	return data;
	}
}