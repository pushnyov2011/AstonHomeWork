package Lesson_4;
import java.util.Scanner;
public class Park {
    /*
    Создать класс Park с внутренним классом, с помощью объектов которого можно хранить информацию об аттракционах, времени их работы и стоимости.
     */
    public static class Atraction{
        private String atraction_name ;
        private  String start_work;
        private  String finish_work;
        private  String lanch_start;
        private  String lanch_finish;
        private  int atraction_cost;

        public String getAtraction_name() {
            return atraction_name;
        }

        public String getStart_work() {
            return start_work;
        }

        public String getFinish_work() {
            return finish_work;
        }



        public int getAtraction_cost() {
            return atraction_cost;
        }

        public void setAtraction_name(String atraction_name) {
            this.atraction_name = atraction_name;
        }

        public void setStart_work(String start_work) {
            this.start_work = start_work;
        }

        public void setFinish_work(String finish_work) {
            this.finish_work = finish_work;
        }

        public String getLanch_start() {
            return lanch_start;
        }

        public void setLanch_start(String lanch_start) {
            this.lanch_start = lanch_start;
        }

        public String getLanch_finish() {
            return lanch_finish;
        }

        public void setLanch_finish(String lanch_finish) {
            this.lanch_finish = lanch_finish;
        }

        public void setAtraction_cost(int atraction_cost) {
            if (atraction_cost >= 0 ) {
                this.atraction_cost = atraction_cost;}
            else this.atraction_cost = atraction_cost * -1 ;
        }

        public Atraction(String atraction_name, String start_work, String finish_work, String lanch_start, String lanch_finish, int atraction_cost) {
            this.atraction_name = atraction_name;
            this.start_work = start_work;
            this.finish_work = finish_work;
            this.lanch_start = lanch_start;
            this.lanch_finish = lanch_finish;
            this.atraction_cost = atraction_cost;
        }

        public Atraction() {
            this.atraction_name = "Тестовый аттракционн";
            this.start_work = "11:00";
            this.finish_work = "17:00";
            this.lanch_start = "13:00 ";
            this.lanch_finish = "14:00" ;
            this.atraction_cost = 100 ;
        }

        public  void  atraction_info()
        {
            System.out.println("Инфо об аттракционне:");
            System.out.println("Название аттракциона: " + getAtraction_name());
            System.out.println("начало работы: " + getStart_work());
            System.out.println("работает ДО: " + getFinish_work());
            System.out.println("Обед с " + getLanch_start() + " по " + getLanch_finish() );
            System.out.println("Стоимость: "  + getAtraction_cost());

        }

        public  void zapoln_info_about_attraction() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ввдети название аттракциона");
            setAtraction_name(sc.nextLine());
            System.out.println("ввдеите начлао время начало работы аттракциона \nПример формата 00:00");
            setStart_work(sc.nextLine());
            System.out.println("ввдеите начлао время оконачания работы аттракциона\nПример формата 00:00");
            setFinish_work(sc.nextLine());
            System.out.println("ввдеите начало времени обеда аттракциона \nПример формата 00:00");
            setLanch_start(sc.nextLine());
            System.out.println("ввдеите окончания времени обеда аттракциона \nПример формата 00:00");
            setLanch_finish(sc.nextLine());
            System.out.println("введеите стоимость аттракциона");
            setAtraction_cost(sc.nextInt());
            atraction_info();
        }
        }
}
