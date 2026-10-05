import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Evento implements ActionListener {

    private JLabel lbl;
    private JTextField txtNombre;

    public Evento(JLabel lbl, JTextField txtNombre) {
        this.lbl = lbl;
        this.txtNombre = txtNombre;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        String nombre = txtNombre.getText();

        lbl.setText("Hola " + nombre + " !");
    }
}
