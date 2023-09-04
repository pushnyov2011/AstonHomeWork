package Lesson_3;
import java.util.Scanner;
public class Task6 {
    public static void  main (String[] args)
    {
        /*
        Написать метод, который определяет, является ли год високосным, и возвращает boolean
(високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го,
при этом каждый 400-й – високосный.


         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Ввести год");
        int a = sc.nextInt();
        boolean b = usl(a);
        System.out.println(u2(a));
        System.out.println(usl(a));


        if  (b == true)

        {
            System.out.println("високосный");
        }
        else

        {
            System.out.println(" не високосный");
        }



    }

    public static boolean usl(int a)
    {
        if (a%4 == 0)
        {
            if (a% 100 == 0 && a%400 != 0)
            {
                return  false;
            }
            else  return true;
        }

        else  return  false;

    }

    public static int u2 (int i)
    {
        return    i%4;
    }



}
