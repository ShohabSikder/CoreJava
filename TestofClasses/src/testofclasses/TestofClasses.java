package testofclasses;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestofClasses {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\user\\Desktop\\Shohab.txt");
        Scanner read = new Scanner(file);
//       PrintWriter pw= new PrintWriter(file);
//       
//        System.out.println("Does it exist? " + file.exists());
//        
//        pw.println("Hello Java");
//        pw.close();

        
//        
        if (file.exists()) {
            String tenWords = " ";
            int count = 0;
            while (read.hasNext()) {
                String word = read.next();
                tenWords += word + " ";
                count++;
                if (count == 10) {
                    System.out.println(tenWords);
                    count = 0;
                    tenWords=" ";
                }
                
                
            }
        } 
        
        

//        read.close();
    }

}
