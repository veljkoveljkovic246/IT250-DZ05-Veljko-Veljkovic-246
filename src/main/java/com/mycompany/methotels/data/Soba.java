/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.methotels.data;

import org.apache.tapestry5.ioc.annotations.Inject;

/**
 *
 * @author Veljko
 */
public class Soba {
    private String ime;
    private String sprat;
    private boolean tv;
    private boolean internet;
    private boolean djakuzi;

    @Inject
    public Soba() {
    }

    public Soba(String ime, String sprat, boolean tv, boolean internet, boolean djakuzi) {
        this.ime = ime;
        this.sprat = sprat;
        this.tv = tv;
        this.internet = internet;
        this.djakuzi = djakuzi;
    }

    /**
     * @return the ime
     */
    public String getIme() {
        return ime;
    }

    /**
     * @param ime the ime to set
     */
    public void setIme(String ime) {
        this.ime = ime;
    }

    /**
     * @return the sprat
     */
    public String getSprat() {
        return sprat;
    }

    /**
     * @param sprat the sprat to set
     */
    public void setSprat(String sprat) {
        this.sprat = sprat;
    }

    /**
     * @return the tv
     */
    public boolean isTv() {
        return tv;
    }

    /**
     * @param tv the tv to set
     */
    public void setTv(boolean tv) {
        this.tv = tv;
    }

    /**
     * @return the internet
     */
    public boolean isInternet() {
        return internet;
    }

    /**
     * @param internet the internet to set
     */
    public void setInternet(boolean internet) {
        this.internet = internet;
    }

    /**
     * @return the djakuzi
     */
    public boolean isDjakuzi() {
        return djakuzi;
    }

    /**
     * @param djakuzi the djakuzi to set
     */
    public void setDjakuzi(boolean djakuzi) {
        this.djakuzi = djakuzi;
    }
    
    
    
}
