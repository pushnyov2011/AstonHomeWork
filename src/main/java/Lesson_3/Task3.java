package Lesson_3;
import java.util.Scanner;
public class Task3 {
        /*
        Написать метод, которому в качестве параметра передается целое число. Метод
должен вернуть true, если число отрицательное, и вернуть false если положительное.
Замечание: ноль считаем положительным числом.

         */
        public static void main (String[] args)
        {
        System.out.println("Введите целое цисло =");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
        sc.close();
    boolean b = provuslovia(a);
        if (b != false){
        System.out.println("введенное чиссло отрицательное");}
        else
    {
        System.out.println("введенное чиссло не отрицательное");
    }
}
    public static boolean provuslovia(int a)
    {
        if (a>=0 )
        {
            return false;
        }
        else return true;
    }

}
