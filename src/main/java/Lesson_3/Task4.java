package Lesson_3;
import java.util.Scanner;
public class Task4 {
    public static void main (String[] args)
    {
        /*
        Написать метод, которому в качестве аргументов передается строка и число, метод
должен отпечатать в консоль указанную строку, указанное количество раз;

         */
        Scanner sc = new Scanner(System.in);
        System.out.println("введите строку");
        String st = sc.nextLine();
        // System.out.println(st);
        System.out.println("Сколько рвз вывести эту строку ? введите число");
        int a = sc.nextInt();
        sc.close();
        cicle(st,a);



    }
    public static void  cicle (String a, int b)
    {
        if (b>0){
            for (int i = 0; i < b ; i++)
                System.out.println(a);}
        else System.out.println("так как число было меньше или равно 0, то ничего не выведу ");

    }


}
