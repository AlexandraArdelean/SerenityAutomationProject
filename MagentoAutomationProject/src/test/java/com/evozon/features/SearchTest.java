package com.evozon.features;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "features/simple_products.csv")
public class SearchTest extends BaseTest{
    private String product_name;
    @Test
    public void verifyIfSearchResultsPageTitleIsCorrect(){
        searchSteps.searchProduct(product_name);
    }
}
