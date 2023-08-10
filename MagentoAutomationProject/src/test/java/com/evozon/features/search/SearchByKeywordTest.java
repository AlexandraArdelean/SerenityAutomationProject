package com.evozon.features.search;

import com.evozon.features.BaseTest;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "features/search_keywords.csv")
public class SearchByKeywordTest extends BaseTest {
    private String keyword;

    @Test
    public void validSearchByKeywordTest() {
        searchSteps.executeSearch(keyword);
        productListAndDetailsStep.checkIfSearchTermAppearsInProductDetails(keyword);
    }
}
