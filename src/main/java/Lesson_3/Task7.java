package Lesson_3;

public class Task7 {
    public  static  void  main (String [] args) {
        /*
        Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его
значениями 1 2 3 4 5 6 7 8 … 100;

         */
        int[] mas = new int[100];
        zapol(mas);
        // System.out.println("размерность массива =" + mas.length);
        /*
        for (int i = 0 ; i <mas.length; i++ )
        {
            System.out.println("Элемент массива "+ i +" = " + mas[i]);
        }
    }
*/
    }
    public  static  void  zapol (int[] m)
    {
        int a = 1;
        for (int i = 0 ; i <m.length; i++)
        {
            m[i] = a;
            a++;
            System.out.println("Элемент массива "+ i +" = " + m[i]);

        }
    }

}
