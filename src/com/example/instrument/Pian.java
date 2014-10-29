package com.example.instrument;

import com.example.exception.SingleException;
import com.example.interfaces.IPlay;

/**
 * Created by VoldHouse on 10/29/2014.
 */
public class Pian extends Instrument implements IPlay {

    public Pian(String mNume) {
        super(mNume);
    }

    public Pian(String mNume, String mTara, int mAni) {
        super(mNume, mTara, mAni);
    }

    @Override
    public void play() throws SingleException {
        if(getmNume()==null || getmAni() ==0)
            throw new SingleException("Numele pianului sau anii sunt invalizi!");
        System.out.println("Acesta este un pian: "+getmNume()+" si are durata de cantat de:"+getmAni()+" ani, iar tara de provenienta este: "+getmTara());

    }

    @Override
    public void adjust() throws SingleException{
        if(getmNume()==null)
            throw new SingleException("Numele pianului este invalid");
        System.out.println("Acesta este un pian: "+getmNume()+" si durata de ajustare este de 10 minute!");

    }

    @Override
    public boolean Clape(String mNume) {
        return mNume!=null && (mNume.startsWith("Mar")); //numele marcii( Marshall ptr piane)
    }

    @Override
    public void Provenienta(String country) {
        super.Provenienta(country);
    }
}
