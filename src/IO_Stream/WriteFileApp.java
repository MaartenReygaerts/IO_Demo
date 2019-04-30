package IO_Stream;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFileApp {
    public static void main(String[] args) {

        try (FileWriter file = new FileWriter("MyTextFile.txt")) {


            file.write("Hello");
            file.write("World");

        } catch (IOException e) {
            System.out.println("IO error " + e.getMessage());
        }
    }
}
