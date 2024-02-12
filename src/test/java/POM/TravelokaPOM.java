package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TravelokaPOM {
    WebDriver driver;
    public TravelokaPOM(WebDriver driver) {
        this.driver = driver;
    }

    By btnRentCar = By.xpath("//h4[.='Rental Mobil']");
    By radioWithoutDriver = By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-1naam9t r-16uyjmq r-rs99b7 r-18yzcnr r-1777fci r-yc9v9c']");
    By txtInputLocation = By.xpath("//input[@data-testid=\"rental-search-form-location-input\"]");
    By inputStartDate = By.xpath("//input[@data-testid=\"rental-search-form-date-input-start\"]");
    By inputStartTime = By.xpath("//input[@data-testid=\"rental-search-form-time-input-start\"]");
    By inputEndDate = By.xpath("//input[@data-testid=\"rental-search-form-date-input-end\"]");
    By inputEndTime = By.xpath("//input[@data-testid=\"rental-search-form-time-input-end\"]");
    By btnSearchCar = By.xpath("//div[@data-testid=\"rental-search-form-cta\"]");
    By btnSelectCar = By.xpath("//div[@class='css-1dbjc4n r-1ihkh82 r-1q2s4rl r-ttdzmv']/div[@class='css-1dbjc4n r-150rngu r-eqz5dr r-16y2uox r-1wbh5a2 r-11yh6sk r-1rnoaur r-1sncvnh']/div[@class='css-1dbjc4n']/div[1]//div[@class='css-901oao css-bfa6kz r-jwli3a r-t1w4ow r-cygvgh r-b88u0q r-1iukymi r-q4m81j']");
    By btnSelectCarProvider = By.xpath("//div[@class='css-1dbjc4n r-1kihuf0 r-169s5xo r-uwe93p r-136ojw6']//div[4]//div[@class='css-1dbjc4n r-1awozwy r-13awgt0 r-18u37iz r-1777fci']");
    By radioPickUpLocationRentCarOffice = By.xpath("//div[@class='css-1dbjc4n r-14lw9ot r-kdyh1x r-b4qz5r r-1ifxtd0 r-nsbfu8 r-136ojw6']//div[@class='css-1dbjc4n r-18u37iz']//div[@class='css-1dbjc4n r-1awozwy r-14lw9ot r-16uyjmq r-rs99b7 r-18yzcnr r-1777fci r-yc9v9c']/div[@class='css-1dbjc4n r-1q9bdsx r-d045u9 r-tbmifm r-16eto9q']");
    By radioDropOffLocationOthersLocation = By.xpath("//div[@class='css-1dbjc4n r-14lw9ot r-kdyh1x r-b4qz5r r-1ifxtd0 r-nsbfu8 r-184en5c']//div[@class='css-1dbjc4n r-1awozwy r-1naam9t r-16uyjmq r-rs99b7 r-18yzcnr r-1777fci r-yc9v9c']/div[@class='css-1dbjc4n r-1q9bdsx r-d045u9 r-tbmifm r-16eto9q']");
    By txtNote = By.xpath("//textarea[@class='css-11aywtz r-13awgt0 r-t1w4ow r-ubezar r-majxgm r-135wba7 r-bcqeeo r-1ny4l3l r-10paoce r-13n6l4s']");
    By btnLanjutkanBookNow = By.xpath("//div[@class='css-18t94o4 css-1dbjc4n r-kdyh1x r-1loqt21 r-10paoce r-5wp0in r-5njf8e r-1otgn73 r-lrvibr']");
    By txtNamaLengkapPemesan = By.xpath("//div[@class='css-1dbjc4n r-tzxfm6']/div[@class='css-1dbjc4n']/div[@class='css-1dbjc4n']/div[@class='css-1dbjc4n r-14lw9ot r-kdyh1x r-da5iq2 r-bztko3']//div[@class='css-1dbjc4n r-14lw9ot']/div[@class='css-1dbjc4n']//input[@class='css-11aywtz r-13awgt0 r-t1w4ow r-ubezar r-majxgm r-135wba7 r-bcqeeo r-1ny4l3l r-10paoce r-13n6l4s']");
    By txtPhoneNumberPemesan = By.xpath("//div[@class='css-1dbjc4n r-18u37iz']//input[@class='css-11aywtz r-13awgt0 r-t1w4ow r-ubezar r-135wba7 r-bcqeeo r-1ny4l3l r-10paoce r-edyy15 r-13n6l4s']");
    By txtEmailPemesan = By.xpath("//div[@class='css-1dbjc4n r-18u37iz']//input[@class='css-11aywtz r-13awgt0 r-t1w4ow r-ubezar r-majxgm r-135wba7 r-bcqeeo r-1ny4l3l r-10paoce r-13n6l4s']");
    By droplistTitlePengemudi = By.xpath("//select[@class='r-30o5oe r-1niwhzg r-1yadl64 r-1p0dtai r-t1w4ow r-ubezar r-majxgm r-1pi2tsx r-1r74h94 r-135wba7 r-crgep1 r-orgf3d r-1ny4l3l r-10paoce r-u8s1d r-3mc0re r-ipm5af r-34rx7k r-417010']");
    By txtNamaLengkapPengemudi = By.xpath("//input[@class='css-11aywtz r-13awgt0 r-t1w4ow r-ubezar r-majxgm r-135wba7 r-bcqeeo r-1ny4l3l r-10paoce r-13n6l4s']");
    By txtPhoneNumberPengemudi = By.xpath("//input[@class='css-11aywtz r-13awgt0 r-t1w4ow r-ubezar r-135wba7 r-bcqeeo r-1ny4l3l r-10paoce r-edyy15 r-13n6l4s']");
    By btnLanjutkanBookingCarWithoutDriver = By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-13awgt0 r-18u37iz r-1777fci']");
    By txtBookRequest = By.xpath("//textarea[@class='css-11aywtz r-13awgt0 r-t1w4ow r-ubezar r-majxgm r-135wba7 r-bcqeeo r-1ny4l3l r-10paoce r-13n6l4s']");
    By btnAllRequirements = By.xpath("//div[@class='css-1dbjc4n r-13awgt0 r-18u37iz']");
    By checkboxSelectAllRequirements = By.xpath("//div[@class='css-1dbjc4n r-nsbfu8']//div[@class='css-1dbjc4n r-1loqt21 r-1otgn73 r-1i6wzkk r-lrvibr']");
    By btnSaveRequirements = By.xpath("//div[@class='css-1dbjc4n r-nsbfu8']//div[@role='button']");
    By btnContinuePayment = By.xpath("//div[@class='css-901oao css-bfa6kz r-jwli3a r-t1w4ow r-1uirtdp r-b88u0q r-uzxld0 r-q4m81j']");
    By btnContinuePaymentConfirm = By.xpath("//div[@class='css-1dbjc4n r-1wzrnnt']//div[@class='css-18t94o4 css-1dbjc4n r-kdyh1x r-1loqt21 r-10paoce r-1e081e0 r-5njf8e r-1otgn73 r-lrvibr']/div[@class='css-1dbjc4n r-1awozwy r-13awgt0 r-18u37iz r-1777fci']");




    public void clickRentCarMenu(){
        driver.findElement(btnRentCar).isDisplayed();
        driver.findElement(btnRentCar).click();
    }
    public void clickRadioRentWithoutDriver(){
        driver.findElement(radioWithoutDriver).isDisplayed();
        driver.findElement(radioWithoutDriver).click();
    }
    public void inputLocation(String location){
        driver.findElement(txtInputLocation).isDisplayed();
        driver.findElement(txtInputLocation).sendKeys(location);
    }
    public void inputStartDate(String startDate){
        driver.findElement(inputStartDate).isDisplayed();
        driver.findElement(inputStartDate).sendKeys(startDate);
    }
    public void inputStartTime(String startTime){
        driver.findElement(inputStartTime).isDisplayed();
        driver.findElement(inputStartTime).sendKeys(startTime);
    }
    public void inputEndDate(String endDate){
        driver.findElement(inputEndDate).isDisplayed();
        driver.findElement(inputEndDate).sendKeys(endDate);
    }
    public void inputEndTime(String endTime){
        driver.findElement(inputEndTime).isDisplayed();
        driver.findElement(inputEndTime).sendKeys(endTime);
    }
    public void clickSearchCar(){
        driver.findElement(btnSearchCar).isDisplayed();
        driver.findElement(btnSearchCar).click();
    }
    public void clickSelectCar(){
        driver.findElement(btnSelectCar).isDisplayed();
        driver.findElement(btnSelectCar).click();
    }
    public void clickSelectCarProvider(){
        driver.findElement(btnSelectCarProvider).isDisplayed();
        driver.findElement(btnSelectCarProvider).click();
    }
    public void clickPickUpLocationRentCarOffice(){
        driver.findElement(radioPickUpLocationRentCarOffice).isDisplayed();
        driver.findElement(radioPickUpLocationRentCarOffice).click();
    }
    public void clickDropOffLocationOthers(){
        driver.findElement(radioDropOffLocationOthersLocation).isDisplayed();
        driver.findElement(radioDropOffLocationOthersLocation).click();
    }
    public void inputNote(String note){
        driver.findElement(txtNote).isDisplayed();
        driver.findElement(txtNote).sendKeys(note);
    }
    public void clickLanjutkanBook(){
        driver.findElement(btnLanjutkanBookNow).isDisplayed();
        driver.findElement(btnLanjutkanBookNow).click();
    }
    public void inputNamaPemesan(String namaPemesan){
        driver.findElement(txtNamaLengkapPemesan).isDisplayed();
        driver.findElement(txtNamaLengkapPemesan).sendKeys(namaPemesan);
    }
    public void inputPhoneNumberPemesan(String phoneNumberPemesan){
        driver.findElement(txtPhoneNumberPemesan).isDisplayed();
        driver.findElement(txtPhoneNumberPemesan).sendKeys(phoneNumberPemesan);
    }
    public void inputEmailPemesan(String emailPemesan){
        driver.findElement(txtEmailPemesan).isDisplayed();
        driver.findElement(txtEmailPemesan).sendKeys(emailPemesan);
    }
    public void selectTitleDriver(String title){
        Select select = new Select((WebElement) droplistTitlePengemudi);
        select.selectByValue(title);
    }
    public void inputNamaPengemudi(String namaPengemudi){
        driver.findElement(txtNamaLengkapPengemudi).isDisplayed();
        driver.findElement(txtNamaLengkapPengemudi).sendKeys(namaPengemudi);
    }
    public void inputPhoneNumberPengemudi(String phoneNumberPengemudi){
        driver.findElement(txtPhoneNumberPengemudi).isDisplayed();
        driver.findElement(txtPhoneNumberPengemudi).sendKeys(phoneNumberPengemudi);
    }
    public void clickLanjutkanBookingCarWithoutDriver(){
        driver.findElement(btnLanjutkanBookingCarWithoutDriver).isDisplayed();
        driver.findElement(btnLanjutkanBookingCarWithoutDriver).click();
    }
    public void inputBookRequest(String bookReq){
        driver.findElement(txtBookRequest).isDisplayed();
        driver.findElement(txtBookRequest).sendKeys(bookReq);
    }
    public void clickAllRequirements(){
        driver.findElement(btnAllRequirements).isDisplayed();
        driver.findElement(btnAllRequirements).click();
    }
    public void clickSelectAllAcceptRequirements(){
        driver.findElement(checkboxSelectAllRequirements).isDisplayed();
        driver.findElement(checkboxSelectAllRequirements).click();
    }
    public void clickSaveRequirements(){
        driver.findElement(btnSaveRequirements).isDisplayed();
        driver.findElement(btnSaveRequirements).click();
    }
    public void clickContinuePayment(){
        driver.findElement(btnContinuePayment).isDisplayed();
        driver.findElement(btnContinuePayment).click();
    }
    public void clickContinuePaymentConfirm(){
        driver.findElement(btnContinuePaymentConfirm).isDisplayed();
        driver.findElement(btnContinuePaymentConfirm).click();
    }

}
