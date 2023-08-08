package com.evozon.features;

import org.junit.Test;

public class ProductsListTest extends BaseTest {
    @Test
    public void checkIfProductIsAvailableTest() {
        productsListSteps.searchAProduct("PEARL STUD EARRINGS");
    }

    @Test
    public void verifySortByPriceAscendingTest() {
        productsListSteps.searchAProduct("earrings");
        productsListSteps.verifySortByPriceAscending();
    }

    @Test
    public void addProductToCart(){
        productsListSteps.searchAProduct("earrings");
        productsListSteps.addSimpleProductToCart("SWING TIME EARRINGS");
        productsListSteps.verifyIsProductAddedToCart();
    }
}
