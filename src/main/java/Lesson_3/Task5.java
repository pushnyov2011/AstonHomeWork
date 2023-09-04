package Lesson_3;
import java.util.Scanner;
public class Task5 {
         /*
        Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1,
0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

         */
         public static void main (String[] ar)
         {
        System.out.println("массив До");
    int mas[] = {1,1,0,0,1,0,1,1,0,1};
        for (int i = 0; i< mas.length ;i ++)
    {  System.out.print(mas[i]);}
        System.out.println("\nХотите поменять в массиве  0 на 1, 1 на 0 ?  \nДля замены введите 'y'" );
    Scanner sc = new Scanner(System.in);
    String  s = sc.next() ;
        switch (s) {
        case "y":
            System.out.println("y");
            zamenamas(mas);
            System.out.println("массив после замены");
            for (int i = 0; i< mas.length ;i ++)
            {  System.out.print(mas[i]);}
            break;
        default:
            System.out.println("ок , не меняем");
            break;

    }

}

    public static void zamenamas(int[] m)
    {
        for(int i = 0; i<m.length; i++)
        {
            if (m[i] ==0)
            {
                m[i]=1;
            }
            else m[i] = 0;


        }

    }

}
