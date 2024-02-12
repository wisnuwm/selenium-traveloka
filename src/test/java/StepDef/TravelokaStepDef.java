package StepDef;

import Global.InitDriver;
import POM.TravelokaPOM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TravelokaStepDef extends InitDriver {
    public TravelokaStepDef() {
        super();
    }
    TravelokaPOM travelokaPOM = new TravelokaPOM(driver);

    @Given("Select cars product")
    public void selectCarsProduct() {
        travelokaPOM.clickRentCarMenu();
    }

    @And("Select tab Without Driver")
    public void selectTabWithoutDriver() {
        travelokaPOM.clickRadioRentWithoutDriver();
    }

    @And("Select Pick-up Location {string}")
    public void selectPickUpLocation(String loc) {
        travelokaPOM.inputLocation(loc);
    }

    @And("Select Pick-up Date {string} & Time {string}")
    public void selectPickUpDateTime(String date, String time) {
        travelokaPOM.inputStartDate(date);
        travelokaPOM.inputStartTime(time);
    }

    @And("Select Drop-off Date {string} & Time {string}")
    public void selectDropOffDateTime(String date, String time) {
        travelokaPOM.inputEndDate(date);
        travelokaPOM.inputEndTime(time);
    }

    @And("Click button Search Car")
    public void clickButtonSearchCar() {
        travelokaPOM.clickSearchCar();
    }

    @And("Select Car")
    public void selectCar() {
        travelokaPOM.clickSelectCar();
    }

    @And("Select Car Provider")
    public void selectCarProvider() {
        travelokaPOM.clickSelectCarProvider();
    }

    @And("Select Pick-up Location in “Rental Office”")
    public void selectPickUpLocationInRentalOffice() {
        travelokaPOM.clickPickUpLocationRentCarOffice();
    }

    @And("Select Drop-off Location in “Other Location”")
    public void selectDropOffLocationInOtherLocation() {
        travelokaPOM.clickDropOffLocationOthers();
    }

    @And("Input Pick-up or Drop-off notes is optional {string}")
    public void inputPickUpOrDropOffNotesIsOptional(String note) {
        travelokaPOM.inputNote(note);
    }

    @When("Click button Book Now")
    public void clickButtonBookNow() {
        travelokaPOM.clickLanjutkanBook();
    }

    @And("Fill Pemesan details nama pemesan {string} phone number {string} and email {string}")
    public void fillPemesanDetailsNamaPemesanPhoneNumberAndEmail(String arg0, String arg1, String arg2) {
        travelokaPOM.inputNamaPemesan(arg0);
        travelokaPOM.inputPhoneNumberPemesan(arg1);
        travelokaPOM.inputEmailPemesan(arg2);
    }
    @And("Fill Driver Details title {string} nama lengkap {string} and phone number {string}")
    public void fillDriverDetailsTitleNamaLengkapAndPhoneNumber(String arg0, String arg1, String arg2) {
        travelokaPOM.selectTitleDriver(arg0);
        travelokaPOM.inputNamaPengemudi(arg1);
        travelokaPOM.inputPhoneNumberPengemudi(arg2);
    }
    @And("Click Continue")
    public void clickContinue() {
        travelokaPOM.clickLanjutkanBookingCarWithoutDriver();
    }

    @And("Add a special request {string}")
    public void addASpecialRequestIsOptional(String request) {
        travelokaPOM.inputBookRequest(request);
    }

    @And("Check all rental requirements")
    public void checkAllRentalRequirements() {
        travelokaPOM.clickAllRequirements();
        travelokaPOM.clickSelectAllAcceptRequirements();
        travelokaPOM.clickSaveRequirements();
    }

    @Then("Select payment method and proceed payment")
    public void selectPaymentMethodAndProceedPayment() {
        travelokaPOM.clickContinuePayment();
        travelokaPOM.clickContinuePaymentConfirm();
    }
}
