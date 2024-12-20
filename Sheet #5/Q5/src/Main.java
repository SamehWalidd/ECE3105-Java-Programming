import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://cs.armstrong.edu/liang/data/Lincoln.txt.");
        Scanner f = new Scanner(url.openStream());

        int c=0;

        while(f.hasNext())
            c++;
        System.out.println(c);
    }
}