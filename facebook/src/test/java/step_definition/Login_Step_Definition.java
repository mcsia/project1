package step_definition;

//import org.openqa.selenium.WebDriver;

//import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LoginPage;



public class Login_Step_Definition extends Login.facebook.Base{

	
	@Given("^User on the landing page$")
	    public void user_on_the_landing_page() throws Throwable {
	        driver=initialisingbrowser();
	        String url=getUrl();
	        driver.get(url);
	    }

	 @When("^User login with valid (.+) and (.+)$")
	    public void user_login_with_valid_and(String username, String password) throws Throwable {
	        LoginPage lp=new LoginPage(driver);
	        lp.getUsername().sendKeys(username);
	        lp.getPassword().sendKeys(password);
	        lp.getLogin().click();
	    }

	    @Then("^Home Page is populated$")
	    public void home_page_is_populated() throws Throwable {
	        
	        
	    	String text=driver.getTitle();
            if(text.equals("Facebook"))	       
	        {System.out.println(text);}
	    }

}
