package cy.olesiabokk.calcproj.service;

import cy.olesiabokk.calcproj.util.InputReader;

public class ResultWriterService {
    public static void printResult(double num1, double num2, double result, char operator, String operatorName) {
        System.out.println(operatorName + "\n" + InputReader.convertNumber(num1) + " " + operator + " " +
                InputReader.convertNumber(num2) + " = " + InputReader.convertNumber(result));
    }
}
