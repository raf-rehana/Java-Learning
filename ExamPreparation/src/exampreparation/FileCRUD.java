
package exampreparation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCRUD {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\Admin\\Desktop\\raf.dat");

        try {
            
            
            FileOutputStream output = new FileOutputStream(file);
            for (int i = 1; i <= 10; i++) {
                output.write((i + " ").getBytes());
            }
        } catch (IOException e) {
        }
        try {
            FileInputStream input = new FileInputStream(file);
            int value;
            while ((value = input.read()) != -1) {
                System.out.print((char)value + "");
            }
        } catch (IOException e) {
        }
    }
}

