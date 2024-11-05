package SimpleCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends  JFrame{
    private JTextField tfA;
    private JComboBox cbOpe;
    private JTextField tfB;
    private JTextField tfOutput;
    private JPanel pMAIN;
    private JButton btnCom;

    SimpleCalculator(){

        btnCom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {




                if(cbOpe.getSelectedItem() == "+"){
                   int total= Integer.parseInt(tfA.getText())+Integer.parseInt(tfB.getText());
                   tfOutput.setText(String.valueOf(total));
                } else if (cbOpe.getSelectedItem() =="-") {
                    int total= Integer.parseInt(tfA.getText())-Integer.parseInt(tfB.getText());
                    tfOutput.setText(String.valueOf(total));
                }else if (cbOpe.getSelectedItem() =="/"){
                    int total= Integer.parseInt(tfA.getText())/Integer.parseInt(tfB.getText());
                    tfOutput.setText(String.valueOf(total));
                }else if (cbOpe.getSelectedItem() =="*"){
                    int total= Integer.parseInt(tfA.getText())*Integer.parseInt(tfB.getText());
                    tfOutput.setText(String.valueOf(total));
                }

            }
        });

    }
    public static void main(String[] args) {
        SimpleCalculator app = new SimpleCalculator();
        app.setContentPane(app.pMAIN);
        app.setTitle("Simple Calculator");
        app.setSize(600,300);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
    }
}
