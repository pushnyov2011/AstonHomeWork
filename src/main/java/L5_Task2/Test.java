package L5_Task2;

public class Test {
    public static void main(String[] args) {
        {
            Rectangle rectangle = new Rectangle(5, 6.8, "зеленый" ,"голубые"  );
            rectangle.InfoAboutFigue();
            Circle circle = new Circle( 6.5  , "синий" , "красный ");
            circle.InfoAboutFigue();
            Triangle triangle = new Triangle(5,2,5, "розовый", "белый");
            triangle.InfoAboutFigue();


        }
    }
}

