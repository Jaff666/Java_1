public class MainCalculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.Calculate(4));
        System.out.println(calculator.Calculate(4,15));
        System.out.println(calculator.Calculate(1,6,7));
    }
}
