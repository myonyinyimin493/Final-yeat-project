/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment;

/**
 *
 * @author DELL
 */
public class member {
    String memnam;
    String memi;
    String memco;
    String memba;
    String comge;

    public member(String memnam, String memmi, String memco, String memba, String comge) {
        this.memnam = memnam;
        this.memi = memmi;
        this.memco = memco;
        this.memba = memba;
        this.comge = comge;
    }
    @Override
     public String toString(){
       return (memnam+":"+memi+":"+memco+":"+memba+":"+comge);
    }
    public String getComge() {
        return comge;
    }

    public String getMemba() {
        return memba;
    }

    public String getMemco() {
        return memco;
    }

    public String getMemmi() {
        return memi;
    }

    public String getMemnam() {
        return memnam;
    }


}
