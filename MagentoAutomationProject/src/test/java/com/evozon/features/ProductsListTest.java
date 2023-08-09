package com.evozon.features;

import com.evozon.utils.Constants;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class ProductsListTest extends BaseTest {
    @Test
    public void checkIfProductIsAvailableTest() {
        productsListSteps.searchAProduct(Constants.SIMPLE_PRODUCT);
    }

    @Test
    public void verifySortByPriceAscendingTest() {
        productsListSteps.searchAProduct(Constants.SIMPLE_PRODUCT);
        productsListSteps.verifySortByPriceAscending();
    }
}