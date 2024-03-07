package Task2;

public class Main {

    public static void main(String[] args) {
        Cafe menu = new Cafe();
        menu.loadMenuData();

        for (String element : menu.coffeeMenu) {
            System.out.println(element);
        }
    }
}
