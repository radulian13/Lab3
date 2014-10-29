package com.example.interfaces;

import com.example.exception.SingleException;

/**
 * Created by VoldHouse on 10/29/2014.
 */
public interface IPlay {
    /**
     * Aceasta este interfata Instrument pe care o voi folosi in Main
     */

    void play() throws SingleException;
    void adjust() throws SingleException;
}
