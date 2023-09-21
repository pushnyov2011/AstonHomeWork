package Lesson8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Task1 {
    /*
1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не
считаем). Посчитать, сколько раз встречается каждое слово
 */
    public  static void main (String[] Args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("ТЕСТ");
        arrayList.add("тест");
        arrayList.add("тест2");
        arrayList.add("2");
        arrayList.add("пять");
        arrayList.add("шесть");
        arrayList.add("шесть");
        arrayList.add("семь");
        arrayList.add("семь");
        arrayList.add("Семе");
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        ptint_no_massa_with_out_dublicate(arrayList);

    }

    // метод будет выводить все не повторяющееся элементы в массиве
    public  static  void ptint_no_massa_with_out_dublicate (ArrayList<String> arrayList) // хотел все на методы разделить но запихнул все в один
    {
        System.out.println("------------------Убрал дубликаты ---------------------");
        Set<String> colection = new HashSet(); // использовал коллекцию сет , что бы убрать дубликаты из массива
        //  colection .add(arrayList);
        /*
        for (Object o : colection)
        {
            System.out.println(o);
        }
      System.out.println(colection.size());
        */

        for (String o : arrayList)
        {
            colection.add(o);
        }


        for (Object o : colection)
        {

            System.out.println(o);
        }

        System.out.println("------------------Количество повторений ---------------------");
        for (String string_from_set : colection)
        {
            int counng =0;
            for (int i = 0; i < arrayList.size(); i++)
            {
                if (string_from_set == arrayList.get(i))
                {counng++;}
            }
            System.out.println(string_from_set+ " слова / элемент повторяется " + counng + " раз");
        }
        System.out.println("------------------Без повторений(которые не содержат дубликаты) ---------------------");
        for (String string_from_set : colection)
        {
            int counng =0;
            for (int i = 0; i < arrayList.size(); i++)
            {
                if (string_from_set == arrayList.get(i))
                {counng++;}
            }
            if (counng == 1)
            {
                System.out.println(string_from_set);
            }
        }
    }
}
