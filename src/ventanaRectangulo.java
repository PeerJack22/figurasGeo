import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ventanaRectangulo extends JFrame {
    private JPanel rectanguloPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JButton mostrarResultadosButton;
    private JLabel lbArea;
    private JLabel lbPerimetro;

    public ventanaRectangulo() {
        setTitle("Ventana Rectangulo");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Solo cerrar esta ventana
        setSize(640, 480);
        add(rectanguloPanel);
        mostrarResultadosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double n1 = Double.parseDouble(textField1.getText());
                Double n2 = Double.parseDouble(textField2.getText());
                lbArea.setText(String.valueOf(n1*n2));
                lbPerimetro.setText(String.valueOf(2*(n1+n2)));
            }
        });
    }

}
