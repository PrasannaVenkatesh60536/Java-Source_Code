package org.studyeasy.phone;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class except {
    public static void main(String[] args)  {
        try {
            gt();
        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
        } finally {
            System.out.println("Error buddy");
        }

    }
    public static void gt() throws FileNotFoundException {
 //FileReader f=new FileReader("one.txt");
        System.out.println("Error");
 throw new FileNotFoundException();

    }

}
