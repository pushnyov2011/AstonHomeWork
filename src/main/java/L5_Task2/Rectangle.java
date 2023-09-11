package L5_Task2;

public class Rectangle implements FigureInterface {
    public Rectangle(double a ,double b, String color , String borderColor)
    {
        this.a = a;
        this.b = b;
        this.Color = color;
        this.borderColor = borderColor;
    }

    private double a;
    private double b;
    private final String name = "Прямоугольник ";

    private String Color;

    private String borderColor;

    @Override
    public double area() {
        return a * b;
    }

    @Override
    public double perimtr() {
        return ((2*a) + (2*b));
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
