package dataprovider;

import org.testng.annotations.DataProvider;

public class DataStorage {
	@DataProvider
	public String[][] loginData() {
		String[][] data= {{"admin","admin"},{"admin","ad"},{"ad","admin"},{"ad","ad"}};
		return data;
	}
	
	@DataProvider
	public String[][] registerData(){
		String[][] data= {	
							{"virat","kohli","virat1234@gmail.com","virat@18","virat@18"},
							{"Rohit","sharma","rohit1234@gmail.com","Rohit@45","Rohit@45"},
							{"virat","kohli","virat1234@gmail.com","virat@18","virat@18"}
						};
		return data;
	}
	
}
