package Lesson8;

import java.util.ArrayList;
import java.util.List;

public class Tel_Book {
    private List<String> last_name = new ArrayList<>();
    private List<Integer> phone = new ArrayList<>();

    public List<String> getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name.add(last_name);
    }

    public List<Integer> getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone.add(phone);
    }


    public void add(String last_name, int phone_number) {
        setLast_name(last_name);
        setPhone(phone_number);
    }

    public void get(String last_name) {

        if (getLast_name().contains(last_name)) {
            System.out.println("Телефон/ы пользователя/ей с такой фамилей");
                /*
                for (String lname : getLast_name())
                {
                    if(lname == last_name)
                    {

                     int i = getLast_name().indexOf(lname);
                        System.out.println(i);
                        System.out.println("Телефон: " + getPhone().get(i));
                    }
                }

                 *

                 */
            for (int i = 0; i < getLast_name().size(); i++)
            {
                if (getLast_name().get(i) == last_name) {
                    System.out.println("Телефон: " + getPhone().get(i));

                }
            }
        } else System.out.println("Нет такого человека или данные введены некоректно ");


    }
}
