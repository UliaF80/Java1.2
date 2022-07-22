public class Main {
    public static void main(String[] args) {

        int initialCounting = 2_350;
        int replenishment =1_260;

        int bonus;
        if (replenishment >1000 ) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        int finalCouting = initialCounting + replenishment + bonus;
        System.out.println("Итоговый счёт: " + finalCouting);
        System.out.println("Бонусные рубли:" + bonus);
    }
}
