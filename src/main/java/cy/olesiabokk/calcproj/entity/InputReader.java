package cy.olesiabokk.calcproj.entity;

import java.util.Scanner;

public class InputReader {
    public static Scanner sc = new Scanner(System.in);
    static char operator;

    public static double getNum() {
        return sc.nextDouble();
    }

    public static char getOperator() {
        operator = sc.next().charAt(0);
        while (!Character.valueOf(operator).equals('+') && !Character.valueOf(operator).equals('-')
                && !Character.valueOf(operator).equals('*') && !Character.valueOf(operator).equals('/')) {
            System.out.println("Can not read operator. \nPlease, enter +, -, * or /");
            operator = sc.next().charAt(0);
        }
        return operator;
    }

    public static String convertNumber(double a) {
        if (a == (int) a) {
            return Integer.valueOf((int) a).toString();
        } else {
            return Double.valueOf(a).toString();
        }
    }
}
