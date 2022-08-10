import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.lang.model.element.Element;
import java.util.List;

public class SearchResultPage extends BasePage {

    @FindBy(xpath = "//div[@class='prod-cart__descr']")
    private List<WebElement> searchResultsProductsListText;

    @FindBy(xpath = "//h1[@class='page-title']")
    private WebElement titlePage;

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getSearchResultList(){
        return searchResultsProductsListText;
    }

    public int getSearchResultCount(){
        return getSearchResultList().size();
    }

    public String getTitlePage(){
        return titlePage.getText();
    }


}
