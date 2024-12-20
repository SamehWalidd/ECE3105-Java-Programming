import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("D://AAST//Term 5//Java Programming//ECE3105 Java Programming//Sheet #5//Q6//src//s.txt");
        Scanner s = new Scanner(f);

        int CharC=0;
        int LineC=0;
        int WordsC=0;

        while(s.hasNextLine()){
            String s1 = s.nextLine();
            LineC++;
            CharC += s1.length();
            String [] words = s1.split(" ");
            WordsC += words.length;
        }

        System.out.println(LineC + " " + CharC + " " + WordsC );

    }
}