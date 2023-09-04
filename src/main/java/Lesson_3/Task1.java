package Lesson_3;
import java.util.Scanner;

public class Task1 {
    public static  void main (String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("введеди целое число а");
        int a = sc.nextInt();
        System.out.println("введеди целое число b ");
        int b = sc.nextInt();
        sc.close();
        System.out.println(provuslovia(a,b));
        System.out.println(provuslovia2(a,b));


    }


        public static boolean provuslovia (int a ,int b)
        {

            int c = a+b;
            if (c > 10 &&  c <=20 )
            {
                return true;
            }
            else return false;


        }



    public  static boolean  provuslovia2 (int a ,int b)
    {
        int c = a+b ;
        boolean tf = (c > 10 &&  c <=20 ) ? true : false ;
        return tf ;


    }
        /*
        Написать метод, принимающий на вход два целых числа и проверяющий, что их
сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в
противном случае – false.5


         */

}
