package lv.acodemy;

public class Loops {
    public static void main(String[] args) {
        String[] shoppingList = {"Bread", "Milk", "Eggs", "Fruits"};
        for (int i = 0; i < shoppingList.length; i++) {
            System.out.println("Current products is " + shoppingList[i]);
        }

        int j = 0;
        while (j < shoppingList.length) {
            System.out.println("Current product is " + shoppingList[j]);
            j++;
        }

        do {
            System.out.println("Current product is " + shoppingList[j]);
            j++;
        } while (j < shoppingList.length);

        boolean x = 1< 5 && 6>3 && 5 > 3;
        System.out.println(x);
    }
}
