package com.evozon.features.productList;

import com.evozon.features.BaseTest;
import com.evozon.utils.Constants;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class ProductsListTest extends BaseTest {

    @Test
//    @Ignore
    public void verifySortByPriceAscendingTest() {
        searchSteps.executeSearch(Constants.SIMPLE_PRODUCT);
        productsListSteps.verifySortByPriceAscending();
    }
}