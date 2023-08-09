package com.evozon.utils;

import java.util.List;

public enum Categories {
    WOMEN("Women", List.of("New Arrivals", "Tops & Blouses", "Pants & Denim", "Dresses & Skirts")),
    MEN("Men", List.of("New Arrivals", "Shirts", "Tees, Knits and Polos", "Pants & Denim", "Blazers")),
    ACCESSORIES("Accessories", List.of()),
    HOME_DECOR("Home & Decor", List.of()),
    SALE("Sale", List.of()),
    VIP("VIP", List.of());

    public final String text;
    public final List<String> subcategories;

    Categories(String text, List<String> subcategories) {
        this.text = text;
        this.subcategories = subcategories;
    }
}
