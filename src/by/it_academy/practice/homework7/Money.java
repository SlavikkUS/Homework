package by.it_academy.practice.homework7;


public class Money {
    private int rubles;
    private int coins;

    public Money(int rubles, int coins) {
        this.rubles = rubles;
        this.coins = coins;
        if (coins > 99) {
            this.rubles += coins / 100;
            this.coins = coins % 100;
        }
    }

    public Money addSum(Money money) {
        rubles += money.getRubles();
        coins += money.getCoins();
        if (coins > 99) {
            rubles += coins / 100;
            coins = coins % 100;
        }
        return this;
    }

    public void checkBiggerObject(Money money) {
        if ((this.rubles - money.rubles) < 0) {
            System.out.println(" Второй объект больше ");
        } else if ((this.rubles - money.rubles) == 0) {
            if ((this.coins - money.coins) < 0) {
                System.out.println("Второй объект больше");
            } else if ((this.coins - money.coins) == 0) {
                System.out.println("Числа равны ");
            } else System.out.println("Первый объект больше");
        } else {
            System.out.println("Первый объект больше");
        }
    }

    public int getRubles() {
        return rubles;
    }

    public int getCoins() {
        return coins;
    }

    @Override
    public String toString() {
        return this.rubles + "," + this.coins;
    }
}