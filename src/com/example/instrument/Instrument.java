package com.example.instrument;

/**
 * Created by VoldHouse on 10/29/2014.
 */
public abstract class Instrument {
    private String mNume;
    private String mTara;
    private int mAni;
    public abstract boolean Clape(String mNume);
    public void Provenienta(String tara)
    {
        mTara=tara;
    }

    public Instrument(String mNume) {
        this.mNume = mNume;
    }

    protected Instrument(String mNume, String mTara, int mAni) {
        this.mNume = mNume;
        this.mTara = mTara;
        this.mAni = mAni;
    }

    public String getmNume() {
        return mNume;
    }

    public void setmNume(String mNume) {
        this.mNume = mNume;
    }

    public int getmAni() {
        return mAni;
    }

    public void setmAni(int mAni) {
        this.mAni = mAni;
    }

    public String getmTara() {
        return mTara;
    }

    public void setmTara(String mTara) {
        this.mTara = mTara;
    }
}
