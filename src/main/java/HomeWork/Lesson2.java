package HomeWork;
import java.io.IOException;
import java.util.Scanner;
public class Lesson2 {
    public static void main (String[] args)
    {
        System.out.println( "Задание1\n");
        printThreeWords();
        System.out.println( "\nЗадание1 версия 2\n");
        printThreeWordsV2();
        System.out.println( "\nЗадание2\n");
        checkSumSign();
        System.out.println( "\nЗадание3\n");
        printColor();
        System.out.println ( "\nЗадание4\n");
        compareNumbers();

    }
    // Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец
//три слова: Orange, Banana, Apple.
    public static void printThreeWords()
    {
        System.out.println("Orange\nBanana\nApple"  );
    }

    public static void printThreeWordsV2()
    {
        System.out.println("Orange"  );
        System.out.println("Banana"  );
        System.out.println("Apple"  );
    }



    // Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и
    //инициализируйте их любыми значениями, которыми захотите. Далее метод должен
    //просуммировать эти переменные, и если их сумма больше или равна 0, то вывести в
    //консоль сообщение “Сумма положительная”, в противном случае - “Сумма
    //отрицательная”;
    public static void checkSumSign()
    {

        int a,b ;
        Scanner in = new Scanner(System.in);
        System.out.println ("введите целое число а");
        a = in.nextInt();
        System.out.println ("а = " + a);
        System.out.println ("введите целое число b");
        b = in.nextInt();
        System.out.println ("b = " + b);
        // можно создать переменую с , где будет хранится сумма а + b
        if ((a+b)>=0)
        {
            System.out.println("Сумма положительна\nCумма равна " + (a+b)  );
        }
        else
        {
            System.out.println("Сумма отрицательная\nCумма равна " + (a+b));
        }

    }
    //Создайте метод printColor() в теле которого задайте int переменную value и
    //инициализируйте ее любым значением. Если value меньше 0 (0 включительно), то в
    //консоль метод должен вывести сообщение “Красный”, если лежит в пределах от 0 (0
    //исключительно) до 100 (100 включительно), то “Желтый”, если больше 100 (100
    //исключительно) - “Зеленый”;
    public  static  void  printColor()
    {
        int value ;
        Scanner in = new Scanner(System.in);
        System.out.println("введите целое число ");
        value = in.nextInt();
        if (value <= 0)
        {
            System.out.println("Красный");
        }
        if (value > 0 && value <=100 )
        {
            System.out.println("Желтый");

        }
        if (value > 100)
        {
            System.out.println("Зеленый");
        }
    /*
    else
    {
        System.out.println("что то не так!");
    }

     */

    }
//Создайте метод compareNumbers(), в теле которого объявите две int переменные a и
//b, и инициализируйте их любыми значениями, которыми захотите. Если a больше или
//равно b, то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a
//< b”;

    public  static  void compareNumbers()
    {
        int a,b ;
        Scanner in = new Scanner(System.in);
        System.out.println ("введите целое число а");
        //a = in.nextInt();
        a = in.nextInt();
        System.out.println ("а = " + a);
        System.out.println ("введите целое число b");
        b = in.nextInt();
        System.out.println ("b = " + b);
        if (a>=b)
        {
            System.out.println("a >= b");
        }
        else
        {
            System.out.println(" a <  b");
        }


    }
}

