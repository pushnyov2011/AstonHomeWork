package L5_Task1;

public class Animal {
    private  String name;
    // private boolean CanSwim; // какиео живтоные не умееют плавать, поэтому нужна провека
    private int ogran_dist_run;
    private int orgran_dist_swim;
    private static int animal_count; // по аналогии с котоми сделал
    // плавание: кот не умеет плавать, собака 10 м.).


    public static int getAnimal_count() {
        return animal_count;
    }

    public static void setAnimal_count(int Animal_count) {
        animal_count = Animal_count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


/*
    public boolean isCanSwim() {
        return CanSwim;
    }

    public void setCanSwim(boolean canSwim) {
        this.CanSwim = canSwim;
    }

 */

    public int getOgran_dist_run() {
        return ogran_dist_run;
    }

    public void setOgran_dist_run(int ogran_dist_run) {
        this.ogran_dist_run = ogran_dist_run;
    }

    public int getOrgran_dist_swim() {
        return orgran_dist_swim;
    }

    public void setOrgran_dist_swim(int orgran_dist_swim) {
        if( orgran_dist_swim >= 0) {
            this.orgran_dist_swim = orgran_dist_swim;
        }
        else  this.orgran_dist_swim = orgran_dist_swim * -1;


    }

    public void print_count_animal()
    {
        System.out.println("Количество созданных живтоных : " + getAnimal_count() );
    }

    //. Все животные могут бежать и плыть. В качестве параметра каждому методу
    //передается длина препятствия. Результатом выполнения действия будет печать в
    //консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
    /*
    *У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.;
плавание: кот не умеет плавать, собака 10 м.).

    *
     */
    public  void run(int dist)
    {
        if (dist <= getOgran_dist_run() ){
            System.out.println(getName() + " Пробежал: " + dist + " m" ) ;}
        else {System.out.println(getName() + " Не сможет пробежать такую дистанцию!!!!");
        }
    }
    public void swim (int dist)
    {
        // if (CanSwim)
        //   {
        if (dist <= getOrgran_dist_swim() && getOrgran_dist_swim()!=0)
        {
            System.out.println(getName() + " Проплыл " + dist + " m");
        }
        else  System.out.println(getName() + " Не сможет столько проплыть");
        //    }
        //    else  System.out.println("Не умею плавать и воду не люблю :)");

    }

    public void print_info_animal()
    {
        System.out.println("Инфо");
        System.out.println("Имя/ кличка: "+ getName());

    }


}

