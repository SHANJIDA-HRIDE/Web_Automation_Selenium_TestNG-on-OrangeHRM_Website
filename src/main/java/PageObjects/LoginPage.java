package PageObjects;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ITextBox;
import frameworks.BaseForm;
import org.openqa.selenium.By;

public class LoginPage extends BaseForm {
    public LoginPage(){
        super(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header'][@data-v-7b563373=''][@data-v-358db50f='']"), "login page is not open");
    }
    private final ITextBox username = getElementFactory().getTextBox(By.xpath("//input[@class='oxd-input oxd-input--active'][@name='username'][@placeholder='Username'][@autofocus=''][@data-v-1f99f73c='']"),"Username");
    private final ITextBox password = getElementFactory().getTextBox(By.xpath("//input[@class='oxd-input oxd-input--active'][@type='password'][@name='password'][@placeholder='Password'][@data-v-1f99f73c='']"),"Password");
    private final IButton loginButton = getElementFactory().getButton(By.xpath("//button[@type='submit'][@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button'][@data-v-10d463b7=''][@data-v-358db50f='']"),"LoginButton");
    public void setUsername(String value){
        username.clearAndType(value);
    }
    public void setPassword(String value){
        password.clearAndType(value);
    }
    public void setLoginButton(){
        loginButton.clickAndWait();
    }
}
