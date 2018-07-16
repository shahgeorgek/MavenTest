package DLLogin;

import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private HomePageView homePageView;

    //page URL

    private static String PAGE_URL ="https://my-digitallife-qa2.stage.att.com/dl";


    //CONSTRUCTOR


    public HomePage(WebDriver driver) throws InterruptedException {

    //initialize element
    this.driver=driver;
    this.homePageView = new HomePageView(driver);
    driver.get(PAGE_URL);


    }

    //METHODS

    public void setUserID(String customer_username) {
       this.homePageView.getUserid().sendKeys(customer_username);

    }

    public void setPassword(String customer_password) {
        this.homePageView.getPassword().sendKeys(customer_password);

    }

    public void clickLoginButton(){
       this.homePageView.clickSign_In_Button().click();

    }

    public void clickForgotLink() throws InterruptedException{

        Thread.sleep(5000);
        this.homePageView.clickForgot_Link().click();
    }
}
