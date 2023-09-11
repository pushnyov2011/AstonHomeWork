package L5_Task2;

public class Triangle implements  FigureInterface {
    public Triangle(double a ,double b, double c , String color , String borderColor)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.Color = color;
        this.borderColor = borderColor;
    }

    private double a;
    private double b;
    private double c;
    private final String name = "треугольник  ";

    private String Color;

    private String borderColor;

    @Override
    public double area() {
       double p =  perimtr() /2;
        return (double) Math.sqrt(p * (p - a) * (p - b) * (p - c)) ;

    }

    @Override
    public double perimtr() {
        return a + b + c ;
    }

    @Override
    public  void  InfoAboutFigue()
    {
        System.out.println(name);
        System.out.println("Площадь " + area());
        System.out.println("Перимтре " + perimtr());
        System.out.println("цевт фигуры " + Color );
        System.out.println("цвет границы " + borderColor );
    }

}
