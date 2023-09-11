package L5_Task1;

public class Dogs extends  Animal{
    //бег: кот 200 м., собака 500 м.;
    private final int ograich_dogs_run = 500;
    private final int oggani_dogs_swim = 10;
    private static int dogs_count; // по аналогии с котоми сделал
    // плавание: кот не умеет плавать, собака 10 м.).


    public static int getDogs_count() {
        return dogs_count;
    }

    public static void setDogs_count(int dogs_count) {
        Dogs.dogs_count = dogs_count;
    }


    public Dogs() {

        this.setName("Собака для теста");
        this.setOgran_dist_run(ograich_dogs_run);
        this.setOrgran_dist_swim(oggani_dogs_swim);
        this.setDogs_count(getDogs_count() +1 );
        this.setAnimal_count(getAnimal_count()+1);


    }
    public Dogs (String dog_name)
    {
        this.setName(dog_name);
        this.setOgran_dist_run(ograich_dogs_run);
        this.setOrgran_dist_swim(oggani_dogs_swim);
        this.setDogs_count(getDogs_count() +1 );
        this.setAnimal_count(getAnimal_count()+1);
    }



    public static void main(String[] args) {
        Dogs dogs = new Dogs();
        Dogs dogs2 = new Dogs();
        dogs.run(200);
        dogs.swim(5);
        dogs.print_count_dogs();
        dogs.print_count_animal();


    }
    public void print_count_dogs()
    {

        System.out.println("Количество созданных собак : " + getDogs_count() );
    }

}
