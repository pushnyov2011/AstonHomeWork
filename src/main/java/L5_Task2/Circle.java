package L5_Task2;

public class Circle implements FigureInterface
{
    public Circle(double r ,  String color , String borderColor ) {
        this.r = r;
        this.Color = color;
        this.borderColor = borderColor;
    }
    private String Color;

    private String borderColor;


    private double r;
    private final String name = "Круг";

    @Override
    public double area() {
        return (float) (Math.PI * r * r);
    }

    @Override
    public double perimtr() {
        return (float) (2 * Math.PI * r);
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
