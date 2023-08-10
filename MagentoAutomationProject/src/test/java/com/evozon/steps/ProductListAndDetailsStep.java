package com.evozon.steps;

import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class ProductListAndDetailsStep extends BaseSteps {

    @Step
    public void verifyIfProductDetailsContainKeyword(String keyword) {
        Assert.assertTrue(productDetailsPage.getProductNameSpanText(), textContainsKeywordIgnoringCase(productDetailsPage.getProductNameSpanText(), keyword) ||
                textContainsKeywordIgnoringCase(productDetailsPage.getShortDescriptionDivText(), keyword) ||
                textContainsKeywordIgnoringCase(productDetailsPage.getDescriptionDivText(), keyword));
    }

    private boolean textContainsKeywordIgnoringCase(String text, String keyword) {
        return Matchers.containsStringIgnoringCase(keyword).matches(text);
    }

    @Step
    public void checkIfSearchTermAppearsInProductDetails(String searchTerm) {
        List<String> links = new ArrayList<>(productsListPage.getProductLinksList());
        while (!productsListPage.isLastPage()) {
            productsListPage.goToNextPage();
            links.addAll(productsListPage.getProductLinksList());
        }
        links.forEach(link -> {
            getDriver().navigate().to(link);
            verifyIfProductDetailsContainKeyword(searchTerm);
        });
    }
}
