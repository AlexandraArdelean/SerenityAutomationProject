package com.evozon.features.search;

import com.evozon.features.BaseTest;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "features/simple_products.csv")
public class SearchByProductNameTest extends BaseTest {
    private String product_name;

    @Test
    public void validSearchByProductNameTest() {
        searchSteps.executeSearch(product_name);
        searchSteps.verifyIfSearchedProductIsInList(product_name);
    }
}
