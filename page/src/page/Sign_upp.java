package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Sign_upp {

	@Test(dataProvider="details")
    public void register(String Firstname,String Lastname,String Signupemail,String Signuppassword ,String date,String mobile,String shortbio){
	System.setProperty("webdriver.chrome.driver","C:\\Users\\komatineni.lakshmi\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();	
	
	Contact3 Data =new Contact3(driver);
	Data.recv();
	Data.signin();
	Data.signup();
	Data.setinfo(Firstname,Lastname,Signupemail,Signuppassword,date,mobile,shortbio);
	Data. register.click();
	
	}
	@DataProvider(name="details")
	public Object[][] Testcase()
	{
	Object[][] data = new Object[23][7];
	data[0][0]="komatineni";
	data[0][1]="lakshmi";
	data[0][2]="lucky@gmail.com";
	data[0][3]="lakhm123i";
	data[0][4]="11/11/1999";
	data[0][5]="9618484594";
	data[0][6]="luncky hello";
	data[1][0]="ko";
	data[1][1]="lakshmi";
	data[1][2]="lucky@gmail.com";
	data[1][3]="lakhm123i";
	data[1][4]="11/11/1999";
	data[1][5]="9618484594";
	data[1][6]="luncky hello";
	data[2][0]="komatineniiiiiiiiiiiiiiiiii";
	data[2][1]="lakshmi";
	data[2][2]="lucky@gmail.com";
	data[2][3]="lakhm123i";
	data[2][4]="11/11/1999";
	data[2][5]="9618484594";
	data[2][6]="luncky hello";
	data[3][0]="@@@@@@@@@@@@@@@@@";
	data[3][1]="lakshmi";
	data[3][2]="lucky@gmail.com";
	data[3][3]="lakhm123i";
	data[3][4]="11/11/1999";
	data[3][5]="9618484594";
	data[3][6]="luncky hello";
	data[4][0]="111111111111111111";
	data[4][1]="lakshmi";
	data[4][2]="lucky@gmail.com";
	data[4][3]="lakhm123i";
	data[4][4]="11/11/1999";
	data[4][5]="9618484594";
	data[4][6]="luncky hello";
	data[5][0]="            ";
	data[5][1]="lakshmi";
	data[5][2]="lucky@gmail.com";
	data[5][3]="lakhm123i";
	data[5][4]="11/11/1999";
	data[5][5]="9618484594";
	data[5][6]="luncky hello";
	data[6][0]="komatineni";
	data[6][1]="li";
	data[6][2]="lucky@gmail.com";
	data[6][3]="lakhm123i";
	data[6][4]="11/11/1999";
	data[6][5]="9618484594";
	data[6][6]="luncky hello";
	data[7][0]="komatineni";
	data[7][1]="lakshmiiiiiiiiiiiiiiiii";
	data[7][2]="lucky@gmail.com";
	data[7][3]="lakhm123i";
	data[7][4]="11/11/1999";
	data[7][5]="9618484594";
	data[7][6]="luncky hello";
	data[8][0]="komatineni";
	data[8][1]="@@@@@@@@@@@@@@@@@";
	data[8][2]="lucky@gmail.com";
	data[8][3]="lakhm123i";
	data[8][4]="11/11/1999";
	data[8][5]="9618484594";
	data[8][6]="luncky hello";
	data[9][0]="komatineni";
	data[9][1]="11111111111111111";
	data[9][2]="lucky@gmail.com";
	data[9][3]="lakhm123i";
	data[9][4]="11/11/1999";
	data[9][5]="9618484594";
	data[9][6]="luncky hello";
	data[10][0]="komatineni";
	data[10][1]="             ";
	data[10][2]="lucky@gmail.com";
	data[10][3]="lakhm123i";
	data[10][4]="11/11/1999";
	data[10][5]="9618484594";
	data[10][6]="luncky hello";
	data[11][0]="komatineni";
	data[11][1]="lakshmi";
	data[11][2]="lucky@gmail";
	data[11][3]="lakhm123i";
	data[11][4]="11/11/1999";
	data[11][5]="9618484594";
	data[11][6]="luncky hello";
	data[12][0]="komatineni";
	data[12][1]="lakshmi";
	data[12][2]="lucky@mn";
	data[12][3]="lakhm123i";
	data[12][4]="11/11/1999";
	data[12][5]="9618484594";
	data[12][6]="luncky hello";
	data[13][0]="komatineni";
	data[13][1]="lakshmi";
	data[13][2]="           ";
	data[13][3]="lakhm123i";
	data[13][4]="11/11/1999";
	data[13][5]="9618484594";
	data[13][6]="luncky hello";
	data[14][0]="komatineni";
	data[14][1]="lakshmi";
	data[14][2]="lucky@gmail.com";
	data[14][3]="lakhmmmmm";
	data[14][4]="11/11/1999";
	data[14][5]="9618484594";
	data[14][6]="luncky hello";	
	data[15][0]="komatineni";
	data[15][1]="lakshmi";
	data[15][2]="lucky@gmail.com";
	data[15][3]="12345679";
	data[15][4]="11/11/1999";
	data[15][5]="9618484594";
	data[15][6]="luncky hello";
	data[16][0]="komatineni";
	data[16][1]="lakshmi";
	data[16][2]="lucky@gmail.com";
	data[16][3]="             ";
	data[16][4]="11/11/1999";
	data[16][5]="9618484594";
	data[16][6]="luncky hello";
	data[17][0]="komatineni";
	data[17][1]="lakshmi";
	data[17][2]="lucky@gmail.com";
	data[17][3]="lakhm123i";
	data[17][4]="        ";
	data[17][5]="9618484594";
	data[17][6]="luncky hello";
	data[18][0]="komatineni";
	data[18][1]="lakshmi";
	data[18][2]="lucky@gmail.com";
	data[18][3]="lakhm123i";
	data[18][4]="11/11/1999";
	data[18][5]="961848459";
	data[18][6]="luncky hello";
	data[19][0]="komatineni";
	data[19][1]="lakshmi";
	data[19][2]="lucky@gmail.com";
	data[19][3]="lakhm123i";
	data[19][4]="11/11/1999";
	data[19][5]="961848459444";
	data[19][6]="luncky hello";
	data[20][0]="komatineni";
	data[20][1]="lakshmi";
	data[20][2]="lucky@gmail.com";
	data[20][3]="lakhm123i";
	data[20][4]="11/11/1999";
	data[20][5]="          ";
	data[20][6]="luncky hello";
	data[21][0]="komatineni";
	data[21][1]="lakshmi";
	data[21][2]="lucky@gmail.com";
	data[21][3]="lakhm123i";
	data[21][4]="11/11/1999";
	data[21][5]="9618484594";
	data[21][6]="i am lakshmi";
	data[22][0]="komatineni";
	data[22][1]="lakshmi";
	data[22][2]="lucky@gmail.com";
	data[22][3]="lakhm123i";
	data[22][4]="11/11/1999";
	data[22][5]="9618484594";
	data[22][6]="            ";
	
	
	return data;
		
	}
}
	
			
			
			
			
			
	
		
		
