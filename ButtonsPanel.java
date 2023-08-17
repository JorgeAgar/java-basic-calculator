import java.awt.Color;
/* import java.awt.Dimension;
import java.awt.FlowLayout; */
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JButton;

public class ButtonsPanel extends JPanel implements ActionListener{
    
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
        //this.setBounds(0, 150, 350, 350);
        this.setBackground(Color.GRAY);
        this.setLayout(new GridLayout(5, 4));

        setupButtons();
        addButtons();

        this.setVisible(true);

        clearCEMode = false;
    }

    public void setupButtons(){

        number0 = new JButton("0");
        number0.setFocusable(false);
        number0.addActionListener(this);
        number1 = new JButton("1");
        number1.setFocusable(false);
        number1.addActionListener(this);
        number2 = new JButton("2");
        number2.setFocusable(false);
        number2.addActionListener(this);
        number3 = new JButton("3");
        number3.setFocusable(false);
        number3.addActionListener(this);
        number4 = new JButton("4");
        number4.setFocusable(false);
        number4.addActionListener(this);
        number5 = new JButton("5");
        number5.setFocusable(false);
        number5.addActionListener(this);
        number6 = new JButton("6");
        number6.setFocusable(false);
        number6.addActionListener(this);
        number7 = new JButton("7");
        number7.setFocusable(false);
        number7.addActionListener(this);
        number8 = new JButton("8");
        number8.setFocusable(false);
        number8.addActionListener(this);
        number9 = new JButton("9");
        number9.setFocusable(false);
        number9.addActionListener(this);
        plus = new JButton("+");
        plus.setFocusable(false);
        plus.addActionListener(this);
        minus = new JButton("-");
        minus.setFocusable(false);
        minus.addActionListener(this);
        multiply = new JButton("*");
        multiply.setFocusable(false);
        multiply.addActionListener(this);
        divide = new JButton("/");
        divide.setFocusable(false);
        divide.addActionListener(this);
        mod = new JButton("mod");
        mod.setFocusable(false);
        mod.addActionListener(this);
        equals = new JButton("=");
        equals.setFocusable(false);
        equals.addActionListener(this);
        comma = new JButton(".");
        comma.setFocusable(false);
        comma.addActionListener(this);
        switchSign = new JButton("+/-");
        switchSign.setFocusable(false);
        switchSign.addActionListener(this);
        delete = new JButton("Del");
        delete.setFocusable(false);
        delete.addActionListener(this);
        clear = new JButton("C");
        clear.setFocusable(false);
        clear.addActionListener(this);

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
            Core.a = Double.parseDouble(ResultPanel.resultLabel.getText().trim());
            Core.operation = Core.SUM;
            ResultPanel.resultLabel.setText("0");
            ResultPanel.littleLabel.setText(Double.toString(Core.a) + " + ");
            clearCEMode = true;
            clear.setText("CE");

        } else if(e.getSource() == minus){
            Core.a = Double.parseDouble(ResultPanel.resultLabel.getText().trim());
            Core.operation = Core.SUBTRACT;
            ResultPanel.resultLabel.setText("0");
            ResultPanel.littleLabel.setText(Double.toString(Core.a) + " - ");
            clearCEMode = true;
            clear.setText("CE");

        } else if(e.getSource() == multiply){
            Core.a = Double.parseDouble(ResultPanel.resultLabel.getText().trim());
            Core.operation = Core.MULTIPLY;
            ResultPanel.resultLabel.setText("0");
            ResultPanel.littleLabel.setText(Double.toString(Core.a) + " * ");
            clearCEMode = true;
            clear.setText("CE");

        } else if(e.getSource() == divide){
            Core.a = Double.parseDouble(ResultPanel.resultLabel.getText().trim());
            Core.operation = Core.DIVIDE;
            ResultPanel.resultLabel.setText("0");
            ResultPanel.littleLabel.setText(Double.toString(Core.a) + " / ");
            clearCEMode = true;
            clear.setText("CE");

        } else if(e.getSource() == mod){
            Core.a = Double.parseDouble(ResultPanel.resultLabel.getText().trim());
            Core.operation = Core.MOD;
            ResultPanel.resultLabel.setText("0");
            ResultPanel.littleLabel.setText(Double.toString(Core.a) + " mod ");
            clearCEMode = true;
            clear.setText("CE");

        } else if(e.getSource() == equals){
            Core.b = Double.parseDouble(ResultPanel.resultLabel.getText().trim());
            ResultPanel.resultLabel.setText(Core.calculate());
            ResultPanel.littleLabel.setText(ResultPanel.littleLabel.getText() + Double.toString(Core.b) + " =");
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
            ResultPanel.resultLabel.setText(ResultPanel.resultLabel.getText().substring(0, ResultPanel.resultLabel.getText().length()-1));

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
}
