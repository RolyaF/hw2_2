import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int startValue = 100;
        int replenishmentValue = 1100;
        int total = startValue + replenishmentValue;

        if (replenishmentValue >= 1000) {
            System.out.println("бонус равен  " + (replenishmentValue / 100) + ", итоговая сумма на счету клиента — " + ((total) + (replenishmentValue / 100)));
        } else {
            System.out.println("бонусов нет, итоговая сумма на счету клиента — " + (total));
        }
    }
}