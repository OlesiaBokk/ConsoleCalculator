package cy.olesiabokk.calcproj._main;

import cy.olesiabokk.calcproj.entity.InputReader;
import cy.olesiabokk.calcproj.service.ResultWriterService;
import cy.olesiabokk.calcproj.util.Calculator;

public class _Main {
    public static void main(String[] args) {
        System.out.println("Enter Math operator. Use +, -, * or /");
        char operator = InputReader.getOperator();
        System.out.println("Enter 2 numbers");
        double firstNum = InputReader.getNum();
        double secondNum = InputReader.getNum();
        double result = 0;
        String operatorName = "";
        if (operator == '+') {
            operatorName = "Addition";
            result = Calculator.add(firstNum, secondNum);
        } else if (operator == '-') {
            operatorName = "Subtraction";
            result = Calculator.subtract(firstNum, secondNum);
        } else if (operator == '*') {
            operatorName = "Multiplication";
            result = Calculator.multiply(firstNum, secondNum);
        } else if (operator == '/') {
            if (secondNum == 0) {
                System.out.println("Divide by zero is UNACCEPTABLE (c) Lemongrab \n Please, enter another number");
                secondNum = InputReader.getNum();
            }
            operatorName = "Division";
            result = Calculator.divide(firstNum, secondNum);
        }
        ResultWriterService.printResult(firstNum, secondNum, result, operator, operatorName);
    }
}
