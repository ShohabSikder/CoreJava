
package binarytest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class BinaryTest {

    
    public static void main(String[] args) {
        int [] numbers={10,20,30,40,50};
        String[] gret={"Hello","Welcome","Bye","Good Night"};
        
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream("C:\\Users\\user\\Desktop\\test.dat");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BinaryTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        try {
            ObjectInputStream inputStream= new ObjectInputStream(fileInputStream);
        } catch (IOException ex) {
            Logger.getLogger(BinaryTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
