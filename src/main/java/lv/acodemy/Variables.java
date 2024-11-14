package lv.acodemy;

public class Variables {
    public static void main(String[] args) {

        int age = 29;
        int currentYear = 2024;
        int InventoryItemCount = 100;

        System.out.println(age);
        System.out.println(currentYear);
        System.out.println(InventoryItemCount);

        double temperature = 36.6;
        double price = 19.99;
        double distance = 38400.0;

        System.out.println(temperature);
        System.out.println(price);
        System.out.println(distance);

        char grade = 'A';
        char myInitial = 'N';
        char currencySymbol = '$';

        System.out.println(grade);
        System.out.println(myInitial);
        System.out.println(currencySymbol);

        boolean hasAccess = true;
        System.out.println(hasAccess);

        boolean isSummer = false;
        System.out.println(isSummer);

        long phoneNumber = 21431211;
        System.out.println(phoneNumber);

        float interestRate = 4.5f;
        System.out.println(interestRate);

        int a = 10;
        int b = 5;
        int sum = a + b;
        System.out.println(sum);

        int c = 20;
        int d = 8;
        int difference = c - d;
        System.out.println(difference);

        int m = 7;
        int n = 3 ;
        int result = m * n;
        System.out.println(result);

        int num1 = 10;
        int num2 = 3;
        int division = num1 / num2;
        System.out.println(division);

        double num3 = 10.0;
        double num4 = 3.0;
        double divResult = num3 / num4;
        System.out.println(divResult);

        int f = 12;
        int g = 5;
        int remainder = f % g;
        System.out.println(remainder);

        int number = 8;
        boolean isEven = (number % 2 == 0);
        System.out.println(isEven);

        number++;
        System.out.println(number);
        number--;
        System.out.println(number);

        int counter = 10;
        counter++;
        int postIncrement  = counter++;
        int preIncrement = ++ counter;
        System.out.println(postIncrement);
        System.out.println(preIncrement);

        String name = "Jelena";
        String lastName = "Kurash";

        System.out.println(name);
        System.out.println(lastName);

        String fullName = name + " " + lastName;
        System.out.println(fullName);

        System.out.println(String.format("My name is: %s, My surname is: %s", name, lastName));

        var myCurrentAge = 30;
        var text = "Hello World";


    }
}
