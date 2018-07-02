/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barcode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Aman Nirala
 */
public class logRead {
    public static String DataCapture(String logPath)throws IOException
    {
         String prevData="";
    FileReader fr = new FileReader(logPath);
    BufferedReader br = new BufferedReader(fr);
    String st;
    while((st=br.readLine())!=null)
    {  
        prevData+= st+"\n";
    }
    return prevData;
    }
   
 public static void main(String args[]) throws IOException
 {
    String c = DataCapture("C:\\Users\\hp\\Documents\\NetBeansProjects\\Barcode\\logs.txt");
    System.out.println(c);
 }
}
