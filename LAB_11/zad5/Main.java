import javax.swing.JFrame;
public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        JFrame jf = new JFrame("Calculator");

        jf.setSize(200, 300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(calculator);
        jf.setVisible(true);
    }

}
