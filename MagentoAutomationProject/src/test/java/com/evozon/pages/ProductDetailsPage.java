package com.evozon.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductDetailsPage extends BasePage {
    @FindBy(css = ".add-to-cart-buttons .btn-cart")
    private WebElementFacade addToCartButton;
    @FindBy(css = "#configurable_swatch_color li a")
    private List<WebElementFacade> colourOptionsList;
    @FindBy(css = "#configurable_swatch_size li a")
    private List<WebElementFacade> sizeOptionsList;
    @FindBy(css = "#downloadable-links-list li")
    private List<WebElementFacade> linksList;

    public void selectColourOption(final String colourName) {
        this.colourOptionsList
                .stream()
                .filter(el -> colourName.equalsIgnoreCase(el.getAttribute("name")))
                .findFirst()
                .ifPresent(this::clickOn);
    }

    public void selectSizeOption(final String sizeName) {
        this.sizeOptionsList
                .stream()
                .filter(el -> sizeName.equalsIgnoreCase(el.getAttribute("name")))
                .findFirst()
                .ifPresent(this::clickOn);
    }

    public void clickAddToCartButton() {
        this.addToCartButton.click();
    }

    public void selectLinkByTitle(final String title) {
        this.linksList
                .stream()
//                .peek(el -> System.out.println(el.findElement(By.tagName("label")).getText()))
                .filter(el -> el.findElement(By.tagName("label")).getText().equalsIgnoreCase(title))
                .findFirst()
                .ifPresent(el -> this.clickOn(el.findElement(By.tagName("input"))));
    }
}
