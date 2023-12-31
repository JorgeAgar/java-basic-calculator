import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ResultPanel extends JPanel{

    public static JLabel resultLabel;
    public static JLabel littleLabel;

    ResultPanel(){

        this.setPreferredSize(new Dimension(350, 150));
        this.setLayout(new BorderLayout());
        this.setBackground(new Color(30, 30, 30));
        
        resultLabel = new JLabel("0");
        littleLabel = new JLabel("");
        resultLabel.setForeground(new Color(240, 240, 240));
        resultLabel.setFont(new Font("Monospace", Font.BOLD, 45));
        littleLabel.setForeground(Color.GRAY);
        littleLabel.setFont(new Font("Monospace", Font.BOLD, 20));

        this.add(resultLabel, BorderLayout.CENTER);
        this.add(littleLabel, BorderLayout.SOUTH);
        this.setVisible(true);
    }
}