import java.awt.BorderLayout;

import javax.swing.JFrame;

public class CalculatorFrame extends JFrame{

    CalculatorFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(350, 500);
        this.setLayout(new BorderLayout());
        this.setResizable(false);

        this.add(new ResultPanel(), BorderLayout.NORTH);
        this.add(new ButtonsPanel(), BorderLayout.CENTER);

        this.setVisible(true);
    }
}