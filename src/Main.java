public class Main {
    public static void main(String[] args) {

        int amaunt = 1200;

        int balans = 100;

        int persent = 1;

        if (amaunt < 1100) {
            System.out.println(" Your personal account balance : " + balans);
        }

        if (amaunt >= 1100) {

            int bonus = amaunt * persent / 100;

            System.out.println(" Your bonuses: " + bonus);

            balans = amaunt + balans;

            System.out.println(" Your personal account balance : " + balans);
        }

        System.out.println(" Deposit amount : " + amaunt);
    }
}

