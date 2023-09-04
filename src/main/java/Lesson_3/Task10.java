package Lesson_3;
import java.util.Scanner;

public class Task10 {
    public static  void  main (String[] args)
    {

/*
Написать метод, принимающий на вход два аргумента: len и initialValue, и
возвращающий одномерный массив типа int длиной len, каждая ячейка которого
равна initialValue;

 */
        Scanner sc = new Scanner(System.in);
        //int[] mas = new int[];
        System.out.println("введите разменоть масива");
        int len = sc.nextInt();
        System.out.println("введите значение дяля ячеик");
        int initialValue = sc.nextInt();
        sc.close();
        int[] mas1 = massive(len, initialValue);
        for (int i=0 ; i <mas1.length; i++)
            System.out.print(mas1[i] +",");





    }
    public static  int[] massive (int l, int i)
    {
        int[] mas = new int[l];
        for (int a = 0 ; a < mas.length; a++)
        {
            mas[a] = i;

        }
        return  mas;

    }
}
