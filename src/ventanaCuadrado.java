import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ventanaCuadrado extends JFrame{
    public JPanel cuadradoPanel;
    private JTextField textField1;
    private JButton mostrarResultadosButton;
    private JLabel lbArea;
    private JLabel lbPerimetro;

    public ventanaCuadrado() {
        setTitle("Ventana Cuadrado");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Solo cerrar esta ventana
        setSize(640, 480);
        add(cuadradoPanel);

        mostrarResultadosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double n1 = Double.parseDouble(textField1.getText());
                lbArea.setText(String.valueOf(n1*n1));
                lbPerimetro.setText(String.valueOf(4*n1));
            }
        });
    }
}
