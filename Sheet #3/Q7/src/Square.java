public class Square extends GeometricObjects implements iColorable{
    double length;

    public Square(){}
    public Square(double length,String color,boolean filled){
        super(color, filled);
        this.length=length;
    }

    public void PrintAreaAndPerimeter(){
        System.out.println("Area: "+length*length);
        System.out.println("Preimeter: "+length*4);
    }


    public void howToColor() {
        System.out.println("Color all four sides");
    }


}
