import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Scanner Scan = new Scanner(System.in);
//
//        System.out.println("Enter 3 sides of triangle");
//        double s1 = Scan.nextDouble();
//        double s2 = Scan.nextDouble();
//        double s3 = Scan.nextDouble();
//
//        System.out.println("Enter the color");
//        String c= Scan.next();
//
//        System.out.println("Enter if filled (True/False)");
//        boolean f= Scan.nextBoolean();
//
//        Triangle t1 = new Triangle(s1,s2,s3,c,f);
//        System.out.println(t1.toString());


        ArrayList<GeometricObjects> arr = new ArrayList<>();
        arr.add(new Triangle(5,5,5,"white",true));
        arr.add(new Triangle(5,3,4,"red",true));
        arr.add(new Square(5,"white",true));
        arr.add(new Square(9,"white",true));
        arr.add(new Square(4,"white",true));


        for(int i=0;i<arr.size();i++){
            if(arr.get(i) instanceof Triangle){
                System.out.println(((Triangle) arr.get(i)).getArea());
                ((Triangle) arr.get(i)).howToColor();
            } else if (arr.get(i) instanceof Square) {
                ((Square) arr.get(i)).PrintAreaAndPerimeter();
                ((Square) arr.get(i)).howToColor();
            }
        }
        }
    }
