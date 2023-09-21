package Lesson8;

public class Task2 {
    public static void main (String[] args)
    {
        Tel_Book tel_book = new Tel_Book();

        String [] ln = {"Тест", "Tets","Тест","Пуш"};
        int [] phone = {111 , 103, 222, 102};

        tel_book.add(ln[0], phone[0]);
        tel_book.add(ln[1], phone[1]);
        tel_book.add(ln[2], phone[2]);
        tel_book.add(ln[3], phone[3]);


        tel_book.get("Тест");

    }
}
