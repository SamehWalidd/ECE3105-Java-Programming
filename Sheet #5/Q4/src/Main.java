import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("textfile.txt");
        Scanner s = new Scanner(f);

        String text = "";
        int k = 0;

        while (s.hasNext()) {
            String word = s.next();
            text += word + " ";
            k++;
        }


        System.out.println(text);


        s.close();
    }
}
