package com.evozon.steps;

import net.thucydides.core.annotations.Step;

public class HomePageSteps extends BaseSteps {
    @Step
    public void goToSubcategory(String category, String subcategory) {
        homePage.clickCategoryLinkByName(category);
        homePage.clickSubcategoryLinkByCategoryAndName(category, subcategory);
    }
}
