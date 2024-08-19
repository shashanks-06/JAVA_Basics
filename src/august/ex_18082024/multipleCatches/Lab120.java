package august.ex_18082024.multipleCatches;

// Multiple Catches

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab120 {
    public static void main(String[] args) {
        String path = "C://abc.txt";
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {                     // Basket
            System.out.println("FileNotFoundException : "+e);
        }catch (Exception e){                                   // Bigger Basket
            System.out.println("Exception : "+e);
        }
    }
}
