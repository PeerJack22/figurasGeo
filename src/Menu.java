import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu {
    private JButton cuadradoButton;
    private JButton rectánguloButton;
    private JButton círculoButton;
    private JButton triánguloButton;
    private JButton trapecioButton;
    public JPanel mainPanel;


    public Menu() {
        cuadradoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventanaCuadrado nuevaVentana = new ventanaCuadrado();
                nuevaVentana.setVisible(true);
            }
        });
        rectánguloButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventanaRectangulo nuevaVentana = new ventanaRectangulo();
                nuevaVentana.setVisible(true);
            }
        });
        círculoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventanaCirculo nuevaVentana = new ventanaCirculo();
                nuevaVentana.setVisible(true);
            }
        });
    }
}
