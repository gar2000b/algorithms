package com.onlineinteract.interfaces;

import com.onlineinteract.interfaces.api.Sellable;

/**
 * Created by Digilogue on 07/11/2016.
 */
public class Photograph implements Sellable {
    private String description;
    private int price;
    private boolean colour;

    public Photograph(String description, int price, boolean colour) {
        this.description = description;
        this.price = price;
        this.colour = colour;
    }

    public String description() {
        return this.description;
    }

    public int listPrice() {
        return this.price;
    }

    public int lowestPrice() {
        return this.price / 2;
    }

    public boolean isColor() {
        return this.colour;
    }
}
