package TestCase;
import PageObjects.LoginPage;
import aquality.selenium.core.utilities.ISettingsFile;
import aquality.selenium.core.utilities.JsonSettingsFile;
import org.testng.annotations.Test;

public class TestOfLogin extends BaseTest{
    @Test
    public void Login(){
        ISettingsFile testdata = new JsonSettingsFile("testdata.json");
        LoginPage login = new LoginPage();

        login.setUsername(testdata.getValue("/username").toString());
        login.setPassword(testdata.getValue("/password").toString());
        login.setLoginButton();


    }
}
