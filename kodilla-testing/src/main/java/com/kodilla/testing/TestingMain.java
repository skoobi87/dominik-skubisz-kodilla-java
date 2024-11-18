package com.kodilla.testing;
import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;


public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        //Zadanie test jednostkowy

        Calculator calculator = new Calculator();

        System.out.println("\nTest kalkulatora\n");

        // Testowanie dodawania
        int addResult = calculator.add(10, 5);
        if (addResult == 15) {
            System.out.println("Test dodawania: OK");
        } else {
            System.out.println("Test dodawania: BŁĄD");
        }

        // Testowanie odejmowania
        int subtractResult = calculator.subtract(10, 5);
        if (subtractResult == 5) {
            System.out.println("Test odejmowania: OK");
        } else {
            System.out.println("Test odejmowania: BŁĄD");
        }
    }
}
