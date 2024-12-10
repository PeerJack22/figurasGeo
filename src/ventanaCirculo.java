import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ventanaCirculo extends JFrame{
    private JPanel circuloPanel;
    private JTextField textField1;
    private JButton mostrarResultadosButton;
    private JLabel lbArea;
    private JLabel lbPerimetro;

    public ventanaCirculo(){
        setTitle("Ventana Rectangulo");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(640, 480);
        add(circuloPanel);
        mostrarResultadosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double n1 = Double.parseDouble(textField1.getText());
                lbArea.setText(String.valueOf(Math.PI*(n1*n1)));
                lbPerimetro.setText(String.valueOf(2*Math.PI*n1));
            }
        });
    }
}
