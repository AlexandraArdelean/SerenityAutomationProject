package com.evozon.features.productList;

import com.evozon.features.BaseTest;
import com.evozon.utils.Constants;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class ProductsListTest extends BaseTest {

    @Test
    public void verifySortByPriceAscendingTest() {
        searchSteps.executeSearch(Constants.SORT_KEYWORD);
        productsListSteps.setSortByPrice();
        productsListSteps.verifyIfSortedByPriceAscending();
    }

    @Test
    public void verifySortByPriceDescendingTest() {
        searchSteps.executeSearch(Constants.SORT_KEYWORD);
        productsListSteps.setSortByPrice();
        productsListSteps.changeSortOrder();
        productsListSteps.verifyIfSortedByPriceDescending();
    }

    @Test
    public void verifySortByNameAscendingTest() {
        searchSteps.executeSearch(Constants.SORT_KEYWORD);
        productsListSteps.setSortByName();
        productsListSteps.verifyIfSortedByNameAscending();
    }

    @Test
    public void verifySortByNameDescendingTest() {
        searchSteps.executeSearch(Constants.SORT_KEYWORD);
        productsListSteps.setSortByName();
        productsListSteps.changeSortOrder();
        productsListSteps.verifyIfSortedByNameDescending();
    }
}