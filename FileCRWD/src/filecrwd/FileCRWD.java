package filecrwd;

import java.io.File;
import java.io.PrintWriter;

public class FileCRWD {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\Admin\\Desktop\\raf.txt");

        try {
            PrintWriter writer = new PrintWriter(file);
            writer.write("Hey, I m Rafiaah Here.....");

            for (int i = 1; i <= 100; i++) {
                writer.write( i);
            }

            writer.close();

        } catch (Exception e) {

        }
    }

}
