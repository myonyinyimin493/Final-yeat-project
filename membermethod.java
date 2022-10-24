/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class membermethod {
    public void save (member mem) throws IOException{
         File f=new File("memdata.txt");
        String location=f.getAbsolutePath();
        FileWriter fw = new FileWriter(location,true);
        PrintWriter pw = new PrintWriter(fw);
        pw.println(mem);
        pw.close();
        fw.close();


    }
     public ArrayList<member> display() throws FileNotFoundException, IOException{
        File f = new File ("memdata.txt");
        String location= f.getAbsolutePath();
        FileReader fr = new FileReader(location);
        BufferedReader br = new BufferedReader(fr);
        ArrayList<member> al = new ArrayList();
        while (br.ready()){
            String str=br.readLine();
            String[]data=str.toString().split(":");
            member m= new member (data[0],data[1],data[2],data[3],data[4]);
            al.add(m);
        }
        return al;

}}
