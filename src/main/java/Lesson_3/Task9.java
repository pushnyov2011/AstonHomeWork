package Lesson_3;
import java.lang.reflect.Array;
import java.util.Arrays;
public class Task9 {
    /*
      Создать квадратный двумерный целочисленный массив (количество строк и
столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные
элементы единицами (можно только одну из диагоналей, если обе сложно).
Определить элементы одной из диагоналей можно по следующему принципу:
индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
       */
    public  static void main (String[] args)
    {
    int[][] mas = new int[5][5];
    zaop_mas(mas);
        System.out.println("певоначальный массив");
    prin_mass(mas);
        System.out.println("массив после замены");
    zamena_diag(mas);
    prin_mass(mas);
    // System.out.println("массив по сле замены");
    //zamena2(mas);
    //     zamena_diag2(mas);

    //    prin_mass(mas);

    // в обратную  сторону пока не получилось сделать





}
    public static void zamena_diag(int [][]a) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i] == a[j] || a[(a.length -1)-i]==a[j] )
                {
                    a[i][j] = 1;
                }


            }


        }

    }








    public static void  prin_mass (int [][]a)
    {
        for (int i = 0 ; i < a.length; i ++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
    public static void zaop_mas (int [][] a)
    {
        int b = 5 ;
        for ( int i = 0; i < a.length ; i++)
        {
            for ( int j = 0; j < a.length ; j++)
            {
                a[i][j] = b;
            }
        }

    }

}
