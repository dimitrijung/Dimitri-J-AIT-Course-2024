package classwork_46.io_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteInputAppl {
    public static void main(String[] args) {

        try (FileInputStream fin = new FileInputStream("data.txt")) {

            System.out.println(fin.available());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }// end of main
}// end of class
