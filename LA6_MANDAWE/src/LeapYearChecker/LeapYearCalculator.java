package LeapYearChecker;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearCalculator extends  JFrame{
    private JTextField tfYEAR;
    private JPanel pMAIN;
    private JButton btnCHECK;
    LeapYearCalculator(){
        btnCHECK.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                int year=Integer.parseInt(tfYEAR.getText());
                if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                    JOptionPane.showMessageDialog(null,"LEAP YEAR");
                }else{
                    JOptionPane.showMessageDialog(null,"NOT LEAP YEAR");
                }
            }
        });
    }
    public static void main(String[] args) {
        LeapYearCalculator app = new LeapYearCalculator();
        app.setContentPane(app.pMAIN);
        app.setTitle("Leap Year Checker");
        app.setSize(300,200);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
    }
}
