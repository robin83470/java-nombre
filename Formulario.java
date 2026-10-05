import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Formulario extends JFrame {

    private JLabel lbl;
    private JButton btn;
    private JTextField txtNombre;

    public Formulario() {

        this.setBounds(20, 50, 600, 400);

        this.setDefaultCloseOperation(
            JFrame.EXIT_ON_CLOSE
        );

        this.getContentPane().setLayout(null);

        // Label
        lbl = new JLabel("Escribe tu nombre:");
        lbl.setBounds(10, 10, 200, 40);
        this.getContentPane().add(lbl);

        // Campo de texto
        txtNombre = new JTextField();
        txtNombre.setBounds(10, 50, 200, 30);
        this.getContentPane().add(txtNombre);

        // Button
        btn = new JButton("Saludar");
        btn.setBounds(10, 100, 100, 40);
        this.getContentPane().add(btn);

        // Evento
        Evento e = new Evento(lbl, txtNombre);

        btn.addActionListener(e);
    }
}