import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ResultPanel extends JPanel{

    public static JLabel resultLabel;
    public static JLabel littleLabel;

    ResultPanel(){
        //this.setBounds(0, 0, 350, 150);
        this.setPreferredSize(new Dimension(350, 150));
        this.setLayout(new BorderLayout());
        this.setBackground(Color.LIGHT_GRAY);
        
        resultLabel = new JLabel("0");
        littleLabel = new JLabel("little label");

        this.add(resultLabel, BorderLayout.CENTER);
        this.add(littleLabel, BorderLayout.SOUTH);
        this.setVisible(true);
    }
}