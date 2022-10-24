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
public class Logmethod {
    public void save(namepass log) throws IOException{
     File f=new File("in.txt");
        String location=f.getAbsolutePath();
        FileWriter fw = new FileWriter(location,true);
        PrintWriter pw = new PrintWriter(fw);
        pw.println(log);
        pw.close();
        fw.close();
    }
 public ArrayList<namepass> display() throws FileNotFoundException, IOException{
        File f = new File ("in.txt");
        String location= f.getAbsolutePath();
        FileReader fr = new FileReader(location);
        BufferedReader br = new BufferedReader(fr);
        ArrayList<namepass> pass = new ArrayList();
        while (br.ready()){
            String str=br.readLine();
            String[]data=str.toString().split(":");
            namepass p= new namepass(data[0],data[1]);
            pass.add(p);
        }
        return pass;
    }
    }

