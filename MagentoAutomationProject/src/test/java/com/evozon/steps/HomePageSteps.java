package com.evozon.steps;

import net.thucydides.core.annotations.Step;

public class HomePageSteps extends BaseSteps {
    @Step
    public void goToCategory(String category) {
        homePage.clickCategoryLinkByName(category);
    }

    @Step
    public void goToSubcategory(String category, String subcategory) {
        homePage.hoverCategoryLinkByName(category);
        homePage.clickSubcategoryLinkByCategoryAndName(category, subcategory);
    }
}
