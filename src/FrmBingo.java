import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;


public class FrmBingo extends JFrame {
    public FrmBingo() {
        setTitle("Juego de Bingo");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        String [] encabezados = {"B", "I", "N", "G", "O"};

        String [][] resultado = new String[5][6];
        for (int i = 0; i < 56; i++) {
            for (int j = 0; j < 6; j++) {
                resultado[i][j] = "Valor " + i + "," + j;
            }
        }
        
        JTable tblBingo = new JTable();
        JScrollPane scrollPane = new JScrollPane(tblBingo);
        scrollPane.setBounds(50, 50, 200, 350);
        add(scrollPane);
        DefaultTableModel model = new DefaultTableModel(resultado, encabezados);
        tblBingo.setModel(model);

        JButton btnIniciar = new JButton("Iniciar");
        btnIniciar.setBounds(100+scrollPane.getWidth(), 50, 100, 30);
        add(btnIniciar);

        JButton btnSacarBalota=new JButton("Sacar Balota");
        btnSacarBalota.setBounds(100+scrollPane.getWidth(), 110, 150, 30);
        btnSacarBalota.setEnabled(false);
        add(btnSacarBalota);

        JLabel jLabel1= new JLabel("Total Tablas");
        jLabel1.setBounds(175+scrollPane.getWidth()+btnSacarBalota.getWidth(), 50, 150, 30); 
        add(jLabel1);

        JTextField txtTotalTablas=new JTextField();
        txtTotalTablas.setBounds(120+scrollPane.getWidth()+btnSacarBalota.getWidth()+jLabel1.getWidth(), 50, 50, 30);
        add(txtTotalTablas);

        JLabel jLabel2= new JLabel("Tabla");
        jLabel2.setBounds(100+scrollPane.getWidth(), 175, 150, 30);
        add(jLabel2);

        
        JComboBox cmbTablas=new JComboBox();
        cmbTablas.setBounds(scrollPane.getWidth()+jLabel2.getWidth(), 175, 325, 30);
        add(cmbTablas);
        for (String letra : encabezados) {
            cmbTablas.addItem(letra);
        }
        
        

        JTable tblTabla = new JTable();
        JScrollPane scrollPaneTabla = new JScrollPane(tblTabla);
        scrollPaneTabla.setBounds(100+scrollPane.getWidth(), 225, 370, 175);
        add(scrollPaneTabla);
        tblTabla.setModel(model);
    }
    
}
