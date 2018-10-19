/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jarkom
 */
public class TestStreaming {
   public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        try {
            File file = new File("test.txt"); // siapkan file sumber
            String hasilBaca="";
            fis = new FileInputStream(file);
            int dataInt;
            while((dataInt=fis.read()) !=-1){
                hasilBaca = hasilBaca + (char) dataInt;
            }
            System.out.println(hasilBaca);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestStreaming.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TestStreaming.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(TestStreaming.class.getName()).log(Level.SEVERE, null, ex);
            }
}    
} 
}
