package Lesson_3;

public class Task8 {
    public  static void main (String[] args)
    {
        /*
        Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие
6 умножить на 2;

         */
        System.out.println("первоночальный массив \n");
        int[] mas = {1,5,3,2,11,4,5,2,4,8,9,1};
        pechat_mas(mas);
        System.out.println(" \n ноый массив ");
        novi_mas(mas);
        pechat_mas(mas);

    }

    public static   void  pechat_mas(int[] a){
        for (int i = 0; i < a.length; i ++)
            System.out.print(a[i] +",");
    }

    public static void  novi_mas(int[] a)
    {
        for (int i = 0; i < a.length; i ++)
        {
            if (a[i] < 6 )
            {
                a[i] = a[i] *2;

            }
        }



    }
}
