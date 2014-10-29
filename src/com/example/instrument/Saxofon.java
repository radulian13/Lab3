package com.example.instrument;

import com.example.exception.SingleException;
import com.example.interfaces.IPlay;

/**
 * Created by VoldHouse on 10/29/2014.
 */
public class Saxofon extends Instrument implements IPlay {


    @Override
    public boolean Clape(String mNume) {
        return false;
    }

    @Override
    public void Provenienta(String country) {
        super.Provenienta(country);
    }

    public Saxofon(String mNume) {
        super(mNume);
    }

    public Saxofon(String mNume, String mTara, int mAni) {
        super(mNume, mTara, mAni);
    }

    public void AreClape() {
        System.out.println("Acesta este un saxofon: "+getmNume()+" din : "+getmTara()+" si este un instrument de suflat!");
    }


    @Override
    public void play() throws SingleException {
        if(getmNume()==null || getmAni() ==0)
            throw new SingleException("Numele saxofonului sau anii sunt invalizi!");
        System.out.println("Acesta este un saxofon: "+getmNume()+" si are durata de cantat de:"+getmAni()+" ani"+" , iar tara de provenienta este:"+getmTara());
    }

    @Override
    public void adjust() throws SingleException {
        if(getmNume()==null)
            throw new SingleException("Numele saxofonului este invalid");
        System.out.println("Acesta este un saxofon: "+getmNume()+" si durata de ajustare este de 3 minute!");
    }
}
