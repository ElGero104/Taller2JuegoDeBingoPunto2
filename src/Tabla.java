import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class Tabla {
    private int indiceSeleccionado;
    public static void mostrar(int indiceSeleccionado, JTable tblTabla, DefaultTableModel [] modelTabla) {
        if (indiceSeleccionado >= 0) {
            tblTabla.setModel(modelTabla[indiceSeleccionado]);   
            System.out.println("Cambiando a modelo índice: " + indiceSeleccionado);
            
        }
    }
}
