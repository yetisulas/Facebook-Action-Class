package tests.day18_xmlFiles;

import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.ConfigReader;
import utilities.Driver;


public class C02_Ornek {
@Test

    public void facebookTesti(){

    //1. "https://facebook.com" Adresine gidin
    //2. “create new account” butonuna basin
    // 3. “firstName” giris kutusuna bir isim yazin
    //4. “surname” giris kutusuna bir soyisim yazin
    //5. “email” giris kutusuna bir email yazin
    //6. “email” onay kutusuna emaili tekrar yazin
    //7. Bir sifre girin
    //8. Tarih icin gun secin
    //9. Tarih icin ay secin
    //10. Tarih icin yil secin
    //11. Cinsiyeti secin
    //12. Isaretlediginiz cinsiyetin secili, diger cinsiyet kutusunun secili olmadigini test edin.
    //13. Sayfayi kapatin
    //sayfayi kapatin
    Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));

    FacebookPage facebookPage=new FacebookPage();
    facebookPage.createButonu.click();

    Actions action =new Actions(Driver.getDriver());
    action.click(facebookPage.firstNameButonu).sendKeys(ConfigReader.getProperty("firstName"))
            .sendKeys(Keys.TAB)
            .sendKeys(ConfigReader.getProperty("surname"))
            .sendKeys(Keys.TAB)
            .sendKeys(ConfigReader.getProperty("email"))
            .sendKeys(Keys.TAB)
            .sendKeys(ConfigReader.getProperty("email"))
            .sendKeys(Keys.TAB)
            .sendKeys(ConfigReader.getProperty("password"))
            .sendKeys(Keys.TAB)
            .sendKeys(Keys.TAB)
            .sendKeys(ConfigReader.getProperty("gun"))
            .sendKeys(Keys.TAB)
            .sendKeys(ConfigReader.getProperty("ay"))
            .sendKeys(Keys.TAB)
            .sendKeys(ConfigReader.getProperty("yil"))
            .sendKeys(Keys.TAB)
            .sendKeys(Keys.TAB)
            .sendKeys(Keys.ARROW_RIGHT).perform();
    Assert.assertTrue(facebookPage.erkekRadioButon.isSelected()
                           && !facebookPage.kadinRadioButon.isSelected()
                           && !facebookPage.ozelRadioButon.isSelected());

    facebookPage.kaydolButonu.click();

    Driver.closeDriver();








}
}
