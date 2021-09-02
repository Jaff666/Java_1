import javax.swing.*;

public class Divider {
    public static void main(String[] args) {
    try
    {
        String number = JOptionPane.showInputDialog(null, "Podaj liczbę");
        String divider = JOptionPane.showInputDialog(null, "Podaj dzielnik");
        if (convertToInteger(divider) == 0 || number.matches("[a-z]")) 
        {
            throw new ArithmeticException();
        } 
        else
        {
            int result = convertToInteger(number) / convertToInteger(divider);
            JOptionPane.showMessageDialog(null, String.format("Wynik dzielenia to %d", result));
        }
    } 
    catch (ArithmeticException e)  
    {
        JOptionPane.showMessageDialog(null, "Nie dziel przez 0 ani nie podawaj liter!");
    }
    }

    private static int convertToInteger(String number){
        return Integer.parseInt(number);
    }
}
