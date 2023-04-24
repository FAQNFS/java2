public class java2 {

    public static void main(String[] args) {

        int balance = 100;
        int popolnenie = 1200;

        int bonus;
        if (popolnenie > 1000) {
            bonus = popolnenie / 100;
        } else {
            bonus = 0;
        }

        int summa = balance + popolnenie + bonus;

        System.out.println("Баланс пополнен на:" + popolnenie);
        System.out.println("Бонусов за пополнение:"+ bonus);
        System.out.println("Сумма на счёте:" + summa);
    }
}
