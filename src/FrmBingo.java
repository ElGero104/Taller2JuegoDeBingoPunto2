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
    private Tabla tabla;
    private DefaultTableModel [] modelTabla;
    private JTable tblTabla;
    private JComboBox cmbTablas;

    public FrmBingo() {
        setTitle("Juego de Bingo");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        String [] encabezados = {"B", "I", "N", "G", "O"};
        String [] jugadores = {"Jugador 1", "Jugador 2", "Jugador 3", "Jugador 4", "Jugador 5"};
        
        JTable tblBingo = new JTable();
        JScrollPane scrollPane = new JScrollPane(tblBingo);
        scrollPane.setBounds(50, 50, 200, 350);
        add(scrollPane);
        DefaultTableModel model = new DefaultTableModel(encabezados, 0);
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

        
        cmbTablas=new JComboBox();
        cmbTablas.setBounds(scrollPane.getWidth()+jLabel2.getWidth(), 175, 325, 30);
        add(cmbTablas);
        

        tblTabla = new JTable();
        JScrollPane scrollPaneTabla = new JScrollPane(tblTabla);
        modelTabla = new DefaultTableModel[jugadores.length];
        for (int i = 0; i < jugadores.length; i++) {
            modelTabla[i] = new DefaultTableModel(encabezados, 0);
            cmbTablas.addItem(jugadores[i]);
            modelTabla[i].addRow(new Object[]{"J"+(i+1), "I"+(i+1), "N"+(i+1), "G"+(i+1), "O"+(i+1)});
        }
        tblTabla.setModel(modelTabla[0]);
        scrollPaneTabla.setBounds(100+scrollPane.getWidth(), 225, 400, 100);
        add(scrollPaneTabla);

        cmbTablas.addActionListener(e -> {
            tabla.mostrar(cmbTablas.getSelectedIndex(), tblTabla, modelTabla);    
        });

        
         
    }
    
}
