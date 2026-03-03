package exampreparation;

import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCWR {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            File file = new File("file.txt");
            file.createNewFile();
            System.out.println("File Created: " + file.getName());

            System.out.print("\nEnter text to Write In File: ");
            PrintWriter writer = new PrintWriter(file);
            writer.println(scanner.nextLine());
            System.out.println("Data written successfully.");
            writer.close();

            System.out.println("\nFile content:");
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNextLine()) {
                System.out.println(fileReader.nextLine());
            }
            fileReader.close();

        } catch (IOException e) {
            System.out.println("Error occurred.");
        }

        scanner.close();
    }
}
