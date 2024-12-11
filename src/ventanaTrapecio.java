import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ventanaTrapecio extends JFrame {

    private JPanel trapecioPanel;
    private JButton mostrarResultadosButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JLabel lbArea;
    private JLabel lbPerimetro;

    public ventanaTrapecio() {
        setTitle("Ventana Trapecio");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(640, 480);
        add(trapecioPanel);
        mostrarResultadosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double n1 = Double.parseDouble(textField1.getText());
                Double n2 = Double.parseDouble(textField2.getText());
                Double n3 = Double.parseDouble(textField3.getText());
                Double n4 = Double.parseDouble(textField4.getText());
                Double n5 = Double.parseDouble(textField5.getText());
                lbArea.setText(String.valueOf(((n2*n3)/2)*n1));
                lbPerimetro.setText(String.valueOf(n2+n3+n4+n5));
            }
        });
    }
}
