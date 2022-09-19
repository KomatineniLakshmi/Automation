package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Contact1 {

	@Test(dataProvider="details")
    public void login(String UserName,String email,String phonee,String message){
	System.setProperty("webdriver.chrome.driver","C:\\Users\\komatineni.lakshmi\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();	
	
	Contact3 Cont=new Contact3(driver);
	Cont.move();
	Cont.clickSupport();
	Cont.clickContactUs();
	Cont.setdetails(UserName,email, phonee,message);
	Cont.clicksend();
	}
	
		@DataProvider(name="details")
		public Object[][] Testcase()
		{
		Object[][] data = new Object[13][4];
		data[0][0]="lakshmi";
		data[0][1]="komatineni@gmail.com";
		data[0][2]="9618484594";
		data[0][3]="hello";
		data[1][0]="la";
		data[1][1]="komatineni@gmail.com";
		data[1][2]="9618484594";
		data[1][3]="hill";
		data[2][0]="LLLLLLLLLLLLLLLLLLLLL";
		data[2][1]="komatineni@gmail.com";
		data[2][2]="9618484594";
		data[2][3]="hill";
		data[3][0]="@@@@@@@@@@@@@";
		data[3][1]="komatineni@gmail.com";
		data[3][2]="9618484594";
		data[3][3]="helooo";
		data[4][0]="11111111111111111";
		data[4][1]="komatineni@gmail.com";
		data[4][2]="9618484594";
		data[4][3]="helooo";
		data[5][0]="       ";
		data[5][1]="komatineni@gmail.com";
		data[5][2]="9618484594";
		data[5][3]="helooo";
		data[6][0]="lakshmi";
		data[6][1]="komatineni@gamil";
		data[6][2]="9618484594";
		data[6][3]=	"hellooo";
		data[7][0]="lakshmi";
		data[7][1]="komatineni@mnk";
		data[7][2]="9618484594";
		data[7][3]="helooo";
		data[8][0]="lakshmi";
		data[8][1]="               ";
		data[8][2]="9618484594";
		data[8][3]="helooo";
		data[9][0]="lakshmi ";
		data[9][1]="komatineni@gmail.com";
		data[9][2]="961848459994";
		data[9][3]="helooo";
		data[10][0]="lakshmi";
		data[10][1]="komatineni@gamil";
		data[10][2]="961848459";
		data[10][3]="hellooo";
		data[11][0]="lakshmi";
		data[11][1]="komatineni@gamil";
		data[11][2]="        ";
		data[11][3]="hellooo";
		data[12][0]="lakshmi";
		data[12][1]="komatineni@gamil";
		data[12][2]="961848459";
		data[12][3]="         ";
	
		return data;
		}
}
		

		

