package L5_Task1;

public class Tarelka {
    private int food_in_tarelkfa;

    public int getFood_in_tarelkfa() {
        return food_in_tarelkfa;
    }

    public void setFood_in_tarelkfa(int food_in_tarelkfa)
    {
        if (food_in_tarelkfa >= 0)
            //{
            this.food_in_tarelkfa = food_in_tarelkfa;
        //  }
        // else  {this.food_in_tarelkfa = food_in_tarelkfa * -1;}

    }

    public Tarelka(int food_in_tarelkfa) {
        this.food_in_tarelkfa = food_in_tarelkfa;
    }

    public  Tarelka()
    {
        this.food_in_tarelkfa = 5 ;
    }

    // Сделать так, чтобы в тарелке с едой не могло получиться отрицательного
    //количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).

    public void  minus_in_tarelka (int minus_food) //boolean is_animal_eat)
    {
        if  (minus_food > 0) // проверим, что из тарелки отнимаем не отритальцное чилос
        {

            int new_count_in_food_in_tarelkfa = getFood_in_tarelkfa() - minus_food;
            if (new_count_in_food_in_tarelkfa >= 0)
            {
                setFood_in_tarelkfa(new_count_in_food_in_tarelkfa);
                //   is_animal_eat = true;
                System.out.println("Кот поел");
            }
            /*
             Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть
не может быть наполовину сыт (это сделано для упрощения логики
программы).

             */
            else {
                System.out.println("В тарелке не достачное количество еды, наверное надо пополнить");
                //   is_animal_eat = false;
            }
        }
        if(minus_food ==0 )
        {
            System.out.println("Ничего не съел");
            //  is_animal_eat = false;
        }
        if (minus_food < 0)
        {
            System.out.println("Вы пытаетсь заставить съесть живтоное отрицательное количестов еды");
            //    is_animal_eat = false;
        }
        // если метод вызвали , значит он голодный, а если он не поел или ему не дали поесть ,
        // остается голодным поэтомц false

    }



    public  void ino_food_in_tarelka()
    {
        System.out.println("в тарелке сейчас " + getFood_in_tarelkfa() + " ед. еды");
    }
    /*
     Добавить в тарелку метод, с помощью которого можно было бы добавлять
еду в тарелку.

     */
    public void add_food_in_tarelka (int a)
    {
        if (a> 0 )
        {
            System.out.println("В тарелку добавили " + a + " едю еды");
            setFood_in_tarelkfa(a);
            ino_food_in_tarelka();

        }
        else System.out.println("Положи в тарелку еды )");
    }
}
