/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment;

/**
 *
 * @author DELL
 */
public class namepass {
    String ur;
    String ep;

    public namepass(String ur, String ep) {
        this.ur = ur;
        this.ep = ep;
    }

    @Override
 public String toString(){
       return (ur+":"+ep+":");
    }
}
