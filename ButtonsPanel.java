import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JButton;

public class ButtonsPanel extends JPanel implements ActionListener, KeyListener{
    
    JButton number0;
    JButton number1;
    JButton number2;
    JButton number3;
    JButton number4;
    JButton number5;
    JButton number6;
    JButton number7;
    JButton number8;
    JButton number9;
    JButton plus;
    JButton minus;
    JButton multiply;
    JButton divide;
    JButton mod;
    JButton equals;
    JButton comma;
    JButton switchSign;
    JButton delete;
    JButton clear;

    boolean clearCEMode;
    
    ButtonsPanel(){

        this.setBackground(Color.GRAY);
        this.setLayout(new GridLayout(5, 4));
        this.setFocusable(true);
        this.addKeyListener(this);

        setupButtons();
        addButtons();

        this.setVisible(true);

        clearCEMode = false;
    }

    public void setupButtons(){

        number0 = new JButton("0");
        number0.setFocusable(false);
        number0.addActionListener(this);
        number0.setBackground(Color.BLACK);
        number0.setForeground(Color.WHITE);
        number0.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 1));
        number0.setFont(new Font("Monospace", Font.BOLD, 30));

        number1 = new JButton("1");
        number1.setFocusable(false);
        number1.addActionListener(this);
        number1.setBackground(Color.BLACK);
        number1.setForeground(Color.WHITE);
        number1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 1));
        number1.setFont(new Font("Monospace", Font.BOLD, 30));

        number2 = new JButton("2");
        number2.setFocusable(false);
        number2.addActionListener(this);
        number2.setBackground(Color.BLACK);
        number2.setForeground(Color.WHITE);
        number2.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 1));
        number2.setFont(new Font("Monospace", Font.BOLD, 30));

        number3 = new JButton("3");
        number3.setFocusable(false);
        number3.addActionListener(this);
        number3.setBackground(Color.BLACK);
        number3.setForeground(Color.WHITE);
        number3.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 1));
        number3.setFont(new Font("Monospace", Font.BOLD, 30));

        number4 = new JButton("4");
        number4.setFocusable(false);
        number4.addActionListener(this);
        number4.setBackground(Color.BLACK);
        number4.setForeground(Color.WHITE);
        number4.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 1));
        number4.setFont(new Font("Monospace", Font.BOLD, 30));

        number5 = new JButton("5");
        number5.setFocusable(false);
        number5.addActionListener(this);
        number5.setBackground(Color.BLACK);
        number5.setForeground(Color.WHITE);
        number5.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 1));
        number5.setFont(new Font("Monospace", Font.BOLD, 30));

        number6 = new JButton("6");
        number6.setFocusable(false);
        number6.addActionListener(this);
        number6.setBackground(Color.BLACK);
        number6.setForeground(Color.WHITE);
        number6.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 1));
        number6.setFont(new Font("Monospace", Font.BOLD, 30));

        number7 = new JButton("7");
        number7.setFocusable(false);
        number7.addActionListener(this);
        number7.setBackground(Color.BLACK);
        number7.setForeground(Color.WHITE);
        number7.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 1));
        number7.setFont(new Font("Monospace", Font.BOLD, 30));

        number8 = new JButton("8");
        number8.setFocusable(false);
        number8.addActionListener(this);
        number8.setBackground(Color.BLACK);
        number8.setForeground(Color.WHITE);
        number8.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 1));
        number8.setFont(new Font("Monospace", Font.BOLD, 30));

        number9 = new JButton("9");
        number9.setFocusable(false);
        number9.addActionListener(this);
        number9.setBackground(Color.BLACK);
        number9.setForeground(Color.WHITE);
        number9.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 1));
        number9.setFont(new Font("Monospace", Font.BOLD, 30));

        plus = new JButton("+");
        plus.setFocusable(false);
        plus.addActionListener(this);
        plus.setBackground(Color.DARK_GRAY);
        plus.setForeground(Color.WHITE);
        plus.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        plus.setFont(new Font("Monospace", Font.BOLD, 30));

        minus = new JButton("-");
        minus.setFocusable(false);
        minus.addActionListener(this);
        minus.setBackground(Color.DARK_GRAY);
        minus.setForeground(Color.WHITE);
        minus.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        minus.setFont(new Font("Monospace", Font.BOLD, 30));

        multiply = new JButton("*");
        multiply.setFocusable(false);
        multiply.addActionListener(this);
        multiply.setBackground(Color.DARK_GRAY);
        multiply.setForeground(Color.WHITE);
        multiply.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        multiply.setFont(new Font("Monospace", Font.BOLD, 30));

        divide = new JButton("/");
        divide.setFocusable(false);
        divide.addActionListener(this);
        divide.setBackground(Color.DARK_GRAY);
        divide.setForeground(Color.WHITE);
        divide.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        divide.setFont(new Font("Monospace", Font.BOLD, 30));

        mod = new JButton("mod");
        mod.setFocusable(false);
        mod.addActionListener(this);
        mod.setBackground(Color.DARK_GRAY);
        mod.setForeground(Color.WHITE);
        mod.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        mod.setFont(new Font("Monospace", Font.BOLD, 30));

        equals = new JButton("=");
        equals.setFocusable(false);
        equals.addActionListener(this);
        equals.setBackground(new Color(0, 0, 150));
        equals.setForeground(Color.WHITE);
        equals.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        equals.setFont(new Font("Monospace", Font.BOLD, 30));

        comma = new JButton(".");
        comma.setFocusable(false);
        comma.addActionListener(this);
        comma.setBackground(Color.DARK_GRAY);
        comma.setForeground(Color.WHITE);
        comma.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        comma.setFont(new Font("Monospace", Font.BOLD, 30));

        switchSign = new JButton("+/-");
        switchSign.setFocusable(false);
        switchSign.addActionListener(this);
        switchSign.setBackground(Color.DARK_GRAY);
        switchSign.setForeground(Color.WHITE);
        switchSign.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        switchSign.setFont(new Font("Monospace", Font.BOLD, 30));

        delete = new JButton("Del");
        delete.setFocusable(false);
        delete.addActionListener(this);
        delete.setBackground(Color.DARK_GRAY);
        delete.setForeground(Color.WHITE);
        delete.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        delete.setFont(new Font("Monospace", Font.BOLD, 30));

        clear = new JButton("C");
        clear.setFocusable(false);
        clear.addActionListener(this);
        clear.setBackground(Color.DARK_GRAY);
        clear.setForeground(Color.WHITE);
        clear.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        clear.setFont(new Font("Monospace", Font.BOLD, 30));
    }

    public void addButtons(){

        this.add(switchSign);
        this.add(mod);
        this.add(clear);
        this.add(delete);
        this.add(number7);
        this.add(number8);
        this.add(number9);
        this.add(divide);
        this.add(number4);
        this.add(number5);
        this.add(number6);
        this.add(multiply);
        this.add(number1);
        this.add(number2);
        this.add(number3);
        this.add(minus);
        this.add(comma);
        this.add(number0);
        this.add(equals);
        this.add(plus);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == number0){
            if(ResultPanel.resultLabel.getText().equals("0")){
                ResultPanel.resultLabel.setText("0");
            } else{
                ResultPanel.resultLabel.setText(ResultPanel.resultLabel.getText() + "0");
            }
            clearCEMode = true;
            clear.setText("CE");
            
        } else if(e.getSource() == number1){
            if(ResultPanel.resultLabel.getText().equals("0")){
                ResultPanel.resultLabel.setText("1");
            } else{
                ResultPanel.resultLabel.setText(ResultPanel.resultLabel.getText() + "1");
            }
            clearCEMode = true;
            clear.setText("CE");

        } else if(e.getSource() == number2){
            if(ResultPanel.resultLabel.getText().equals("0")){
                ResultPanel.resultLabel.setText("2");
            } else{
                ResultPanel.resultLabel.setText(ResultPanel.resultLabel.getText() + "2");
            }
            clearCEMode = true;
            clear.setText("CE");

        } else if(e.getSource() == number3){
            if(ResultPanel.resultLabel.getText().equals("0")){
                ResultPanel.resultLabel.setText("3");
            } else{
                ResultPanel.resultLabel.setText(ResultPanel.resultLabel.getText() + "3");
            }
            clearCEMode = true;
            clear.setText("CE");

        } else if(e.getSource() == number4){
            if(ResultPanel.resultLabel.getText().equals("0")){
                ResultPanel.resultLabel.setText("4");
            } else{
                ResultPanel.resultLabel.setText(ResultPanel.resultLabel.getText() + "4");
            }
            clearCEMode = true;
            clear.setText("CE");

        } else if(e.getSource() == number5){
            if(ResultPanel.resultLabel.getText().equals("0")){
                ResultPanel.resultLabel.setText("5");
            } else{
                ResultPanel.resultLabel.setText(ResultPanel.resultLabel.getText() + "5");
            }
            clearCEMode = true;
            clear.setText("CE");

        } else if(e.getSource() == number6){
            if(ResultPanel.resultLabel.getText().equals("0")){
                ResultPanel.resultLabel.setText("6");
            } else{
                ResultPanel.resultLabel.setText(ResultPanel.resultLabel.getText() + "6");
            }
            clearCEMode = true;
            clear.setText("CE");

        } else if(e.getSource() == number7){
            if(ResultPanel.resultLabel.getText().equals("0")){
                ResultPanel.resultLabel.setText("7");
            } else{
                ResultPanel.resultLabel.setText(ResultPanel.resultLabel.getText() + "7");
            }
            clearCEMode = true;
            clear.setText("CE");

        } else if(e.getSource() == number8){
            if(ResultPanel.resultLabel.getText().equals("0")){
                ResultPanel.resultLabel.setText("8");
            } else{
                ResultPanel.resultLabel.setText(ResultPanel.resultLabel.getText() + "8");
            }
            clearCEMode = true;
            clear.setText("CE");

        } else if(e.getSource() == number9){
            if(ResultPanel.resultLabel.getText().equals("0")){
                ResultPanel.resultLabel.setText("9");
            } else{
                ResultPanel.resultLabel.setText(ResultPanel.resultLabel.getText() + "9");
            }
            clearCEMode = true;
            clear.setText("CE");

        } else if(e.getSource() == plus){
            Core.saveA();
            Core.operation = Core.SUM;
            ResultPanel.resultLabel.setText("0");
            if(Core.aIsInteger) {ResultPanel.littleLabel.setText(Long.toString(Core.longA) + " + ");}
            else {ResultPanel.littleLabel.setText(Double.toString(Core.a) + " + ");}
            clearCEMode = true;
            clear.setText("CE");

        } else if(e.getSource() == minus){
            Core.saveA();
            Core.operation = Core.SUBTRACT;
            ResultPanel.resultLabel.setText("0");
            if(Core.aIsInteger) {ResultPanel.littleLabel.setText(Long.toString(Core.longA) + " - ");}
            else {ResultPanel.littleLabel.setText(Double.toString(Core.a) + " - ");}
            clearCEMode = true;
            clear.setText("CE");

        } else if(e.getSource() == multiply){
            Core.saveA();
            Core.operation = Core.MULTIPLY;
            ResultPanel.resultLabel.setText("0");
            if(Core.aIsInteger) {ResultPanel.littleLabel.setText(Long.toString(Core.longA) + " * ");}
            else {ResultPanel.littleLabel.setText(Double.toString(Core.a) + " * ");}
            clearCEMode = true;
            clear.setText("CE");

        } else if(e.getSource() == divide){
            Core.saveA();
            Core.operation = Core.DIVIDE;
            ResultPanel.resultLabel.setText("0");
            if(Core.aIsInteger) {ResultPanel.littleLabel.setText(Long.toString(Core.longA) + " / ");}
            else {ResultPanel.littleLabel.setText(Double.toString(Core.a) + " / ");}
            clearCEMode = true;
            clear.setText("CE");

        } else if(e.getSource() == mod){
            Core.saveA();
            Core.operation = Core.MOD;
            ResultPanel.resultLabel.setText("0");
            if(Core.aIsInteger) {ResultPanel.littleLabel.setText(Long.toString(Core.longA) + " mod ");}
            else {ResultPanel.littleLabel.setText(Double.toString(Core.a) + " mod ");}
            clearCEMode = true;
            clear.setText("CE");

        } else if(e.getSource() == equals){
            Core.saveB();
            ResultPanel.resultLabel.setText(Core.calculate());
            if(Core.bIsInteger) {ResultPanel.littleLabel.setText(ResultPanel.littleLabel.getText() + Long.toString(Core.longB) + " =");}
            else {ResultPanel.littleLabel.setText(ResultPanel.littleLabel.getText() + Double.toString(Core.b) + " =");}
            clearCEMode = false;
            clear.setText("C");

        } else if(e.getSource() == comma){
            if(!ResultPanel.resultLabel.getText().contains(".")) {ResultPanel.resultLabel.setText(ResultPanel.resultLabel.getText() + ".");}
            clearCEMode = true;
            clear.setText("CE");

        } else if(e.getSource() == switchSign){
            if(ResultPanel.resultLabel.getText().charAt(0) == '-'){
                ResultPanel.resultLabel.setText(ResultPanel.resultLabel.getText().substring(1));
            } else{
                ResultPanel.resultLabel.setText("-" + ResultPanel.resultLabel.getText());
            }
            clearCEMode = true;
            clear.setText("CE");

        } else if(e.getSource() == delete){
            if(!ResultPanel.resultLabel.getText().isEmpty()) {ResultPanel.resultLabel.setText(ResultPanel.resultLabel.getText().substring(0, ResultPanel.resultLabel.getText().length()-1));}

        } else if(e.getSource() == clear){
            if(!clearCEMode){
                ResultPanel.littleLabel.setText("");
            } else{
                clearCEMode = false;
                clear.setText("C");
            }
            ResultPanel.resultLabel.setText("0");
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()){
            case KeyEvent.VK_0: case KeyEvent.VK_NUMPAD0:
                if(ResultPanel.resultLabel.getText().equals("0")){
                    ResultPanel.resultLabel.setText("0");
                } else{
                    ResultPanel.resultLabel.setText(ResultPanel.resultLabel.getText() + "0");
                }
                clearCEMode = true;
                clear.setText("CE");
                break;

            case KeyEvent.VK_1: case KeyEvent.VK_NUMPAD1:
                if(ResultPanel.resultLabel.getText().equals("0")){
                    ResultPanel.resultLabel.setText("1");
                } else{
                    ResultPanel.resultLabel.setText(ResultPanel.resultLabel.getText() + "1");
                }
                clearCEMode = true;
                clear.setText("CE");
                break;

            case KeyEvent.VK_2: case KeyEvent.VK_NUMPAD2:
                if(ResultPanel.resultLabel.getText().equals("0")){
                    ResultPanel.resultLabel.setText("2");
                } else{
                    ResultPanel.resultLabel.setText(ResultPanel.resultLabel.getText() + "2");
                }
                clearCEMode = true;
                clear.setText("CE");
                break;

            case KeyEvent.VK_3: case KeyEvent.VK_NUMPAD3:
                if(ResultPanel.resultLabel.getText().equals("0")){
                    ResultPanel.resultLabel.setText("3");
                } else{
                    ResultPanel.resultLabel.setText(ResultPanel.resultLabel.getText() + "3");
                }
                clearCEMode = true;
                clear.setText("CE");
                break;

            case KeyEvent.VK_4: case KeyEvent.VK_NUMPAD4:
                if(ResultPanel.resultLabel.getText().equals("0")){
                    ResultPanel.resultLabel.setText("4");
                } else{
                    ResultPanel.resultLabel.setText(ResultPanel.resultLabel.getText() + "4");
                }
                clearCEMode = true;
                clear.setText("CE");
                break;

            case KeyEvent.VK_5: case KeyEvent.VK_NUMPAD5:
                if(ResultPanel.resultLabel.getText().equals("0")){
                    ResultPanel.resultLabel.setText("5");
                } else{
                    ResultPanel.resultLabel.setText(ResultPanel.resultLabel.getText() + "5");
                }
                clearCEMode = true;
                clear.setText("CE");
                break;

            case KeyEvent.VK_6: case KeyEvent.VK_NUMPAD6:
                if(ResultPanel.resultLabel.getText().equals("0")){
                    ResultPanel.resultLabel.setText("6");
                } else{
                    ResultPanel.resultLabel.setText(ResultPanel.resultLabel.getText() + "6");
                }
                clearCEMode = true;
                clear.setText("CE");
                break;

            case KeyEvent.VK_7: case KeyEvent.VK_NUMPAD7:
                if(ResultPanel.resultLabel.getText().equals("0")){
                    ResultPanel.resultLabel.setText("7");
                } else{
                    ResultPanel.resultLabel.setText(ResultPanel.resultLabel.getText() + "7");
                }
                clearCEMode = true;
                clear.setText("CE");
                break;

            case KeyEvent.VK_8: case KeyEvent.VK_NUMPAD8:
                if(ResultPanel.resultLabel.getText().equals("0")){
                    ResultPanel.resultLabel.setText("8");
                } else{
                    ResultPanel.resultLabel.setText(ResultPanel.resultLabel.getText() + "8");
                }
                clearCEMode = true;
                clear.setText("CE");
                break;

            case KeyEvent.VK_9: case KeyEvent.VK_NUMPAD9:
                if(ResultPanel.resultLabel.getText().equals("0")){
                    ResultPanel.resultLabel.setText("9");
                } else{
                    ResultPanel.resultLabel.setText(ResultPanel.resultLabel.getText() + "9");
                }
                clearCEMode = true;
                clear.setText("CE");
                break;

            case KeyEvent.VK_PLUS: case KeyEvent.VK_ADD:
                Core.saveA();
                Core.operation = Core.SUM;
                ResultPanel.resultLabel.setText("0");
                if(Core.aIsInteger) {ResultPanel.littleLabel.setText(Long.toString(Core.longA) + " + ");}
                else {ResultPanel.littleLabel.setText(Double.toString(Core.a) + " + ");}
                clearCEMode = true;
                clear.setText("CE");
                break;

            case KeyEvent.VK_MINUS: case KeyEvent.VK_SUBTRACT:
                Core.saveA();
                Core.operation = Core.SUBTRACT;
                ResultPanel.resultLabel.setText("0");
                if(Core.aIsInteger) {ResultPanel.littleLabel.setText(Long.toString(Core.longA) + " - ");}
                else {ResultPanel.littleLabel.setText(Double.toString(Core.a) + " - ");}
                clearCEMode = true;
                clear.setText("CE");
                break;

            case KeyEvent.VK_ASTERISK: case KeyEvent.VK_MULTIPLY:
                Core.saveA();
                Core.operation = Core.MULTIPLY;
                ResultPanel.resultLabel.setText("0");
                if(Core.aIsInteger) {ResultPanel.littleLabel.setText(Long.toString(Core.longA) + " * ");}
                else {ResultPanel.littleLabel.setText(Double.toString(Core.a) + " * ");}
                clearCEMode = true;
                clear.setText("CE");
                break;

            case KeyEvent.VK_SLASH: case KeyEvent.VK_DIVIDE:
                Core.saveA();
                Core.operation = Core.DIVIDE;
                ResultPanel.resultLabel.setText("0");
                if(Core.aIsInteger) {ResultPanel.littleLabel.setText(Long.toString(Core.longA) + " / ");}
                else {ResultPanel.littleLabel.setText(Double.toString(Core.a) + " / ");}
                clearCEMode = true;
                clear.setText("CE");
                break;

            case KeyEvent.VK_ENTER: case KeyEvent.VK_EQUALS:
                Core.saveB();
                ResultPanel.resultLabel.setText(Core.calculate());
                if(Core.bIsInteger) {ResultPanel.littleLabel.setText(ResultPanel.littleLabel.getText() + Long.toString(Core.longB) + " =");}
                else {ResultPanel.littleLabel.setText(ResultPanel.littleLabel.getText() + Double.toString(Core.b) + " =");}
                clearCEMode = false;
                clear.setText("C");
                break;

            case KeyEvent.VK_PERIOD: case KeyEvent.VK_COMMA: case KeyEvent.VK_DECIMAL:
                if(!ResultPanel.resultLabel.getText().contains(".")) {ResultPanel.resultLabel.setText(ResultPanel.resultLabel.getText() + ".");}
                clearCEMode = true;
                clear.setText("CE");
                break;

            case KeyEvent.VK_BACK_SPACE: case KeyEvent.VK_DELETE:
                if(!ResultPanel.resultLabel.getText().isEmpty()) {ResultPanel.resultLabel.setText(ResultPanel.resultLabel.getText().substring(0, ResultPanel.resultLabel.getText().length()-1));}
                break;

            default:
                System.out.println(e.getKeyCode() + KeyEvent.getKeyText(e.getKeyCode()));
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }    
}
