package com.onlineinteract.interfaces.api;

/**
 * Created by Digilogue on 07/11/2016.
 */
public interface Insurable extends Sellable, Transportable {
    /**
     * Returns insured value in cents
     */
    public int insuredValue();
}