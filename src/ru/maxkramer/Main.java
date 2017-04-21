package ru.maxkramer;

/**
 * Created by maxkr on 4/20/2017.
 */
public class Main {
    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Базовый", "Сосиска", 3.56, "Белый");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Помидор", 0.27);
        hamburger.addHamburgerAddition2("Лук", 0.75);
        hamburger.addHamburgerAddition3("Сыр", 1.12);
        price = hamburger.itemizeHamburger();
    }
}
