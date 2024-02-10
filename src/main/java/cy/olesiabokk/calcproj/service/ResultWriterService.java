package cy.olesiabokk.calcproj.service;

import cy.olesiabokk.calcproj.entity.Entities;

public class ResultWriterService {
    public static void printResult(double num1, double num2, double result, char operator, String operatorName) {
        System.out.println(operatorName + "\n" + Entities.converter(num1) + " " + operator + " " +
                Entities.converter(num2) + " = " + Entities.converter(result));
    }
}
