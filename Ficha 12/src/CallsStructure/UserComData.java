/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CallsStructure;

/**
 * this class is the structure of an user phone Data
 *
 * @author Pedro Machado "pedroma2000"
 */
public class UserComData {
    
    private int vmail;
    private double dmin;
    private double emin; 
    private double nmin;
    private double intmin;
    private String code;
    private String phnumber;

    /**
     * Default constructor
     */
    public UserComData() {
    }

    /**
     * this constructor is used to build an object given specified parameters
     * @param vmail
     * @param dmin
     * @param emin
     * @param nmin
     * @param intmin
     * @param code
     * @param phnumber
     */
    public UserComData(int vmail, double dmin, double emin, double nmin, double intmin, String code, String phnumber) {
        this.vmail = vmail;
        this.dmin = dmin;
        this.emin = emin;
        this.nmin = nmin;
        this.intmin = intmin;
        this.code = code;
        this.phnumber = phnumber;
    }

    /**
     * 
     * @return
     */
    public int getVmail() {
        return vmail;
    }

    /**
     *
     * @param vmail
     */
    public void setVmail(int vmail) {
        this.vmail = vmail;
    }

    /**
     *
     * @return
     */
    public double getDmin() {
        return dmin;
    }

    /**
     *
     * @param dmin
     */
    public void setDmin(double dmin) {
        this.dmin = dmin;
    }

    /**
     *
     * @return
     */
    public double getEmin() {
        return emin;
    }

    /**
     *
     * @param emin
     */
    public void setEmin(double emin) {
        this.emin = emin;
    }

    /**
     *
     * @return
     */
    public double getNmin() {
        return nmin;
    }

    /**
     *
     * @param nmin
     */
    public void setNmin(double nmin) {
        this.nmin = nmin;
    }

    /**
     *
     * @return
     */
    public double getIntmin() {
        return intmin;
    }

    /**
     *
     * @param intmin
     */
    public void setIntmin(double intmin) {
        this.intmin = intmin;
    }

    /**
     *
     * @return
     */
    public String getCode() {
        return code;
    }

    /**
     *
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     *
     * @return
     */
    public String getPhnumber() {
        return phnumber;
    }

    /**
     *
     * @param phnumber
     */
    public void setPhnumber(String phnumber) {
        this.phnumber = phnumber;
    }
    
    @Override
    public String toString(){
        String text = "Number - " + phnumber + "\n";
               text +="     Voice Mail - "+ vmail +"\n";
               text +="     Day minutes - "+ dmin +"\n";
               text +="     Evening Minutes - "+ emin +"\n";
               text +="     Night Minutes - "+ nmin +"\n";
               text +="     Intern Minutes - "+ intmin +"\n";
               text +="     Code - "+ code +"\n";
               
        return text;
    }
}
