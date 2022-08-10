import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class SearchTest extends BaseTest{

    private String SEARCH_KEYWORD = "Samsung Galaxy S8";
    private String EXPECTED_SEARCH_QUERY = "query=Samsung+Galaxy+S8";
    private String PAGE_TITLE = "Apple Store";

    @Test(priority = 1)
    public void checkThatUrlContainsSearchWord() {
        getHomePage().searchByKeyword(SEARCH_KEYWORD);
        assertTrue(getDriver().getCurrentUrl().contains(EXPECTED_SEARCH_QUERY));
    }

    @Test(priority = 2)
    public void checkPageTitle(){
        getHomePage().clickOnTheAppleStoreLink();
        getSearchResultPage().implicitWait(10);
        assertTrue(getSearchResultPage().getTitlePage().equals(PAGE_TITLE));
    }

    @Test (priority = 3)
    public void checkElementsAmountOnThePage(){
        getHomePage().searchByKeyword(SEARCH_KEYWORD);
        getHomePage().implicitWait(30);
        assertEquals(getSearchResultPage().getSearchResultCount(), 12);
    }

}
