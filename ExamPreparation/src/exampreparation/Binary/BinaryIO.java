package exampreparation.Binary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryIO {

    public static void main(String[] args) {
        File file = new File("hello.dat");

        try (FileOutputStream output = new FileOutputStream(file)) {
            for (int i = 1; i <= 20; i++) {
                output.write(i);
            }
        } catch (FileNotFoundException ex) {
            System.getLogger(BinaryIO.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        } catch (IOException ex) {
            System.getLogger(BinaryIO.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }

        try (FileInputStream input = new FileInputStream(file)) {
            int value;
            while ((value = input.read()) != -1) {
                System.out.println(value);
            }

        } catch (FileNotFoundException ex) {
            System.getLogger(BinaryIO.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        } catch (IOException ex) {
            System.getLogger(BinaryIO.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }

    }

}
