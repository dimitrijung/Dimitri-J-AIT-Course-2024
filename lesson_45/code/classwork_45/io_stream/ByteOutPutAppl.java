package classwork_45.io_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteOutPutAppl {
    public static void main(String[] args) {

        try (FileOutputStream fout = new FileOutputStream("data.txt")) {
        fout.write(65);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}