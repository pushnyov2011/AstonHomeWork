package L5_Task1;

public class Cats extends  Animal
{
    private final int ograich_cats_run = 200;
    private final int oggani_cats_swim = 0;
    // плавание: кот не умеет плавать, собака 10 м.).
    //4. * Добавить подсчет созданных котов, собак и животных.
    private  static int countCats; //static  Если поле объявлено static, существует ровно одно воплощение поля, независимо от того, сколько экземпляров (возможно, ноль) класса в конечном итоге может быть создано

    public static int getCountCats() {
        return countCats;
    }

    public static void setCountCats(int countCats) {
        Cats.countCats = countCats;
    }
    /*
Каждому коту нужно добавить поле сытость (когда создаем котов, они
голодны). Если коту удалось покушать (хватило еды), сытость = true.

 */
    private boolean isCat_eat;

    public boolean getisCat_eat() {
        return isCat_eat;
    }

    public void setCat_eat(boolean cat_eat) {
        isCat_eat = cat_eat;
    }
    private  int appetit_catl; // сколько коту нужно еды?

    public int getAppetit_catl() {
        return appetit_catl;
    }

    public void setAppetit_catl(int appetit_catl) {
        this.appetit_catl = appetit_catl;
    }

    public Cats() {

        this.setName("Кот для теста");
        this.setOgran_dist_run(ograich_cats_run);
        this.setOrgran_dist_swim(oggani_cats_swim);
        this.setCat_eat(false);
        this.setAppetit_catl(6);
        this.setCountCats(getCountCats()+1);
        this.setAnimal_count(getAnimal_count()+1);



    }
    public Cats (String cot_name, int appetit_catl)
    {
        this.setName(cot_name);
        this.setAppetit_catl(appetit_catl);
        this.setOgran_dist_run(ograich_cats_run);
        this.setOrgran_dist_swim(ograich_cats_run);
        this.setCountCats(getCountCats()+1);
        this.setAnimal_count(getAnimal_count()+1);
        this.setCat_eat(false);

    }

    @Override // переопределил метод плавать для котов
    public void swim(int dist)
    {
        dist = 0;
        super.swim(dist);
        System.out.println("Коты не умеют плавать");
    }

    public static void main(String[] args) {
        Cats cat = new Cats();
        Cats cat2 = new Cats();
        Cats cat3 = new Cats();
        cat.run(200);
        cat.swim(0);
        cat.print_count_cats();


    }

    public void print_count_cats()
    {
        System.out.println("Количество созданных котов: " + getCountCats() );
    }

    //public void
    @Override
    public void print_info_animal()
    {
        super.print_info_animal();
        System.out.println("Кот сыт? " + getisCat_eat() );
    }

    public void eat(Tarelka p)
    {
        int tarekka_do = p.getFood_in_tarelkfa();
        // boolean  a;
        System.out.println("Кот пытается съесть " + appetit_catl + " ед. еды");
        p.minus_in_tarelka(appetit_catl);
        int tarekka_posle = p.getFood_in_tarelkfa();
        if (tarekka_do>tarekka_posle) {isCat_eat = true ;} // самый лучшей  способ узнать поел кот или нет это сравнить тарелки до и после
        else  isCat_eat = false;


    }
}

