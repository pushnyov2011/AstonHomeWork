package Lesson7;

public class Task {
    /*
   Напишите метод, на вход которого подается двумерный строковый массив
размером 4х4. При подаче массива другого размера необходимо бросить
исключение MyArraySizeException
    */
    public static void main(String[] args) {
        String [][] mas = new String[4][3];

        String [][] ms2 = {{"5","3","2","1"}, {"1","3","2","1"}, {"1","3","2","1"}, {"1","j","2","J"}};
        //  System.out.println(mas.length);
        try {
            // mas_four_on_four(mas);
            mas_four_on_four(ms2);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }

    }

    /*
    Далее метод должен пройтись по всем элементам массива, преобразовать в
int и просуммировать. Если в каком-то элементе массива преобразование не
удалось (например, в ячейке лежит символ или текст вместо числа), должно быть
брошено исключение MyArrayDataException с детализацией, в какой именно
ячейке лежат неверные данные.
     */
    public static void mas_four_on_four(String[][]  mas ) throws MyArraySizeException, MyArrayDataException
    {
        int suma = 0;
        try{

            if( mas.length !=4)
            {
                throw new MyArraySizeException("Длина массива больше или меньше 4 -рех");
            }
            for (int i=0; i < mas.length ;i ++)
            {

                if (mas[i].length!= 4 )
                {
                    throw new MyArraySizeException("Колонок в массиве больше или мешьне 4 - рех");
                }
                for ( int j = 0; j <mas[i].length; j++)
                {
                    try
                    {
                        suma = suma + Integer.parseInt(mas[i][j]); // пере водим стринг в инт , если инт то сложит
                    }

                    catch ( NumberFormatException e)
                    {
                        throw  new MyArrayDataException("Элемент масива в ячейке["+ i+"]" + "["+j+"]"+ "Не число типа инт");
                    }


                }
                //  count_row = j;
            }


        }
        finally {
            System.out.println("Сумма элменоов массива равна : " + suma);
        }
    }
}
