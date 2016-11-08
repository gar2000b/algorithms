package com.onlineinteract.interfaces.api;

/**
 * Created by Digilogue on 07/11/2016.
 * <p>
 * Interface for objects that can be transported.
 */
public interface Transportable {

    /**
     * Returns the weight in grams.
     */
    public int weight();

    /**
     * Returns whether the object is hazardous.
     */
    public boolean isHazardous();
}
