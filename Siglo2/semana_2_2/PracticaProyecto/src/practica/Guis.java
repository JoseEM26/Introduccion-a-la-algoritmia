package practica;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import codigo.Asistencia;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Guis extends JFrame {

    private JPanel contentPane;
    private JTextArea txtS;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Guis frame = new Guis();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Guis() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 77, 398, 173);
        contentPane.add(scrollPane);
        
        txtS = new JTextArea();
        scrollPane.setViewportView(txtS);
        
        JButton btn = new JButton("New button");
        btn.setBounds(157, 22, 89, 23);
        contentPane.add(btn);
        
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Asistencia a = new Asistencia(1111, "Jose Angel", 10, 20);
                
                a.setThoras(a.gethoras()+5);
                a.setTarifa(a.getTarifa()*0.90);
                
                Lista(a);
                
                
                
               
            }
        });
    }
    
    void Imprimir(String s) {
        txtS.append(s + "\n");
    }
    
    void Lista(Asistencia x) {
        Imprimir("Sueldo Bruto"+ x.SueldoBruto());
        Imprimir("DEscuento"+ x.Descuento());
        Imprimir("Sueldo Neto"+ x.SueldoNeto());
    }
}
