import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//input[@id='input_search']")
    private WebElement searchInput;

    @FindBy(xpath = "//button[@class='button-reset search-btn']")
    private WebElement searchButton;

    @FindBy(xpath = "//span[@class='sidebar-item']")
    private WebElement productCatalogButton;

    @FindBy(xpath = "//span[text()='Apple Store']")
    private WebElement appleStore;

    @FindBy(xpath = "//div[contains(@class,'mobile__right')]//div[contains(@class,'active-cart-item')]")
    private WebElement amountOfProductsInCart;

    public HomePage(WebDriver driver) {
        super(driver);
    }



    public void searchByKeyword(final String keyword) {
        searchInput.sendKeys(keyword);
        searchButton.click();
    }

    public void clickOnTheProductCatalogButton(){
        productCatalogButton.click();
    }

    public void clickOnTheAppleStoreLink(){
        clickOnTheProductCatalogButton();
        appleStore.click();
    }

    public String getTextOfAmountProductsInCart() {
        return amountOfProductsInCart.getText();
    }


















}
