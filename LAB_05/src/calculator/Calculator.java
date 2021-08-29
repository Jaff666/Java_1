package calculator;

public class Calculator {

    Calculator(){}
    
    double Calculate(double num1){
        return num1*num1;
    }
    double Calculate(double num1, double num2){
        return num1*num2;
    }
    double Calculate(double num1, double num2, double num3){
        return (num1+num2+num3);
    }
}
