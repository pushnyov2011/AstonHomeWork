package Lesson_4;

public class Sotrudnik {
    // Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата,возраст.

        private String FIO;
        private String kem_rabotaet ;// должность
        private String email;
        private int telephone; // будет целотичсленным
        private double zp ; // зп может быть не целочисленыс например 30р 50к
        private  int age;

        public String getFIO() {
        return FIO;
    }

        //public void String

        public void setFIO(String FIO)
        {
            this.FIO = FIO;
        }

        public double getZp() {
        return zp;
    }

        public void setZp(double zp) {         // добавил проверку на зп  . возраст и телефон , если будет отрицательное число , то умножит на -1 и сделает его положительным
        if (zp >=0) {
            this.zp = zp;
        }
        else
        {
            this.zp = zp * -1;

        }



    }

        public int getAge() {
        return age;
    }

        public void setAge(int age) {
        if (age >= 0 )
        {
            this.age = age;
        }
        else
        {
            this.age = age * -1;
        }

    }

        public int getTelephone() {
        return telephone;
    }

        public void setTelephone(int telephone) {
        if (telephone >= 0 ) {
            this.telephone = telephone;   }
        else
        {
            this.telephone = telephone * -1;

        }
    }

        public String getEmail() {
        return email;
    }

        public void setEmail(String email) {
        this.email = email;
    }

        public String getKem_rabotaet() {
        return kem_rabotaet;
    }

        public void setKem_rabotaet(String kem_rabotaet) {
        this.kem_rabotaet = kem_rabotaet;
    }

        //задание 2
    public  Sotrudnik() // Конструктор класса должен заполнять эти поля при создании объекта.

        {
            //  по дефулту будут такие данные
            FIO =  "Аноним" ;
            kem_rabotaet = "Никто не знает";
            email = "test@test.ts" ;
            telephone = 123456789;
            zp = 0;
            age = 50;
        }
    public  Sotrudnik(String FIO, String kem_rabotaet, String email, int telephone, double zp, int age)
        {
            // ложно сработать , если ввели данне
            this.FIO = FIO;
            this.kem_rabotaet = kem_rabotaet;
            this.email = email;
            this.telephone = telephone;
            this.zp = zp;
            this.age = age;


        }

        // public  Sotrudnik ()


        public  static void main (String[] args)
        {
            Sotrudnik person = new Sotrudnik();
            person.print_info();

            Sotrudnik person2 = new Sotrudnik("ТЕст","Qa", "yander@ys.ru", 54564546, 456.6 ,80);
            person2.print_info();

            Sotrudnik person3 = new Sotrudnik();




        }


    /*
    нутри класса «Сотрудник» написать метод, который выводит информацию об
объекте в консоль.

     */

        public  void  print_info()
        {
            System.out.println("Досье на сотрудника  ");
            System.out.println("ФИО: " + getFIO());
            System.out.println("Должность: " + getKem_rabotaet() );
            System.out.println("Почта: " + getEmail() );
            System.out.println("Тел:+  " + getTelephone());
            System.out.println("Зп: " + getZp()+ " шоколадныхх монет");
            System.out.println("Возраст:  " + getAge());

        }


    }

