package stepDefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;

public class ProductSteps {

	WebDriver driver = BaseClass.driver;
	
	@Then("Product price should be as per below table")
	public void product_price_should_be_as_per_below_table(io.cucumber.datatable.DataTable dataTable) {

		int rows = dataTable.height();
		
		for(int i = 0;i<rows;i++) {
			
			String product = dataTable.cell(i, 0);
			String price = dataTable.cell(i, 1);
			String actual_price = driver.findElement(By.xpath("//div[text()='"+product +"']/following::div[@class='inventory_item_price']["+(i+1)+"]")).getText();
			
			Assert.assertEquals(price, actual_price);

			
			//xpath for price - //div[text()='Sauce Labs Backpack']/following::div[@class='inventory_item_price']
			// to make the xpath dynamic and to iterate through the data table we have given (i+1) so now thee price will iterate //div[text()='Sauce Labs Backpack']/following::div[@class='inventory_item_price'][1] and //div[text()='Sauce Labs Backpack']/following::div[@class='inventory_item_price'][2]
		}
	}
}
