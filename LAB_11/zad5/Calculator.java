import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Calculator extends JPanel implements ActionListener {
    private GridBagConstraints scene = new GridBagConstraints();
    private JButton[] btn = new JButton[16];
    private JPanel keybord;
    private JPanel labelScene;
    private JLabel label;
    private char[] symbols = { '*', '/', '+', '-' };
    private Character symbol = null;
    private Integer result = null;
    private String number = "";

    public Calculator() {
        setLayout(new GridLayout(2, 2));
        keybord = new JPanel(new GridBagLayout());
        labelScene = new JPanel(new GridBagLayout());
        labelScene.setBackground(Color.LIGHT_GRAY);
        keybord.setBackground(Color.GRAY);
        label = new JLabel("");
        char[] buttons = {
                '7', '8', '9', symbols[0],
                '4', '5', '6', symbols[1],
                '1', '2', '3', symbols[2],
                'C', '0', '=', symbols[3]};
        int counter = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                scene = new GridBagConstraints();
                btn[counter] = new JButton(Character.toString(buttons[counter]));
                btn[counter].addActionListener(this);
                scene.gridy = i;
                scene.gridx = j;
                btn[counter].setBackground(Color.YELLOW);
                keybord.add(btn[counter],scene);

                counter++;
            }
        }
        labelScene.add(label);
        add(labelScene);
        add(keybord);
    }
    private void update() {
        if (symbol == null) {
            label.setText(number);
        } else {
            label.setText(Integer.toString(result) + symbol + number);
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        char input = e.getActionCommand().charAt(0);

        if(input=='C'){
            number = "";
            result = null;
            symbol = null;
            update();
            return;
        }
        if(input == '=') {
            if(!number.isEmpty() && symbol != null && result != null) {
                if(symbol == '+') {
                    result += Integer.parseInt(number);
                    number = String.valueOf(result);
                }else if(symbol == '-') {
                    result -= Integer.parseInt(number);
                    number = String.valueOf(result);
                }else if(symbol == '*') {
                    result *= Integer.parseInt(number);
                    number = String.valueOf(result);
                }else if(symbol == '/') {
                    result /= Integer.parseInt(number);
                    number = String.valueOf(result);
                }else {
                    result = 0;
                }
                number = String.valueOf(result);
                result = null;
                symbol = null;
                update();
                return;
            }
        }
        if(input == '0'){
            number += input;
        }else if (input == '1'){
            number += input;
        }else if (input == '2'){
            number += input;
        }else if (input == '3'){
            number += input;
        }else if (input == '4'){
            number += input;
        }else if (input == '5'){
            number += input;
        }else if (input == '6'){
            number += input;
        }else if (input == '7'){
            number += input;
        }else if (input == '8'){
            number += input;
        }else if (input == '9'){
            number += input;
        }else {
            if(result == null && !number.isEmpty()) {
                symbol = input;
                result = Integer.parseInt(number);
                number = "";
            }
            if(result != null && symbol != null)
                if(!number.isEmpty()) {
                    if (symbol == '+') {
                        result += Integer.parseInt(number);
                    } else if (symbol == '-') {
                        result -= Integer.parseInt(number);
                    } else if (symbol == '*') {
                        result *= Integer.parseInt(number);
                    } else if (symbol == '/') {
                        result /= Integer.parseInt(number);
                    } else {
                        result = 0;
                    }
                }
                number = "";
            symbol = input;
        }
        update();
    }
}
