import org.junit.Test;
import pages.HomePage;
import pages.LoginPage;


public class TestUygulama {


    @Test
    public void arama() {

        LoginPage loginPage = new LoginPage();
        loginPage.login();

        HomePage homePage = new HomePage();
        homePage.setArama();

    }

}
