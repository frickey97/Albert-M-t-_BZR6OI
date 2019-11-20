package NegyedikFeladat;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class IdoAtalakito extends JFrame implements ActionListener{
    JLabel jlabel_1x1;
    JLabel jlabel_1x2;
    JLabel jlabel_1x3;
    JLabel jlabel_1x4;
    JLabel jlabel_2x1;
    JLabel jlabel_2x2;
    JLabel jlabel_2x3;
    JLabel jlabel_2x4;
    JLabel jlabel_3x1;
    JLabel jlabel_3x2;
    JLabel jlabel_3x3;
    JLabel jlabel_3x4;
    JTextField jtf_1x1;
    JTextField jtf_1x2;
    JTextField jtf_1x3;
    JTextField jtf_1x4;
    JTextField jtf_2x1;
    JTextField jtf_2x2;
    JTextField jtf_2x3;
    JTextField jtf_2x4;
    JTextField jtf_3x1;
    JTextField jtf_3x2;
    JTextField jtf_3x3;
    JTextField jtf_3x4;
    JButton jb;
    JPanel p1;
    JPanel p2;
    JPanel p3;
    JPanel p4;

    public IdoAtalakito(String title){
        super(title);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.jlabel_1x1 = new JLabel("nap");
        this.jlabel_1x2 = new JLabel("óra");
        this.jlabel_1x3 = new JLabel("perc");
        this.jlabel_1x4 = new JLabel("másodperc");
        this.jlabel_2x1 = new JLabel("nap");
        this.jlabel_2x2 = new JLabel("óra");
        this.jlabel_2x3 = new JLabel("perc");
        this.jlabel_2x4 = new JLabel("másodperc");
        this.jlabel_3x1 = new JLabel("nap");
        this.jlabel_3x2 = new JLabel("óra");
        this.jlabel_3x3 = new JLabel("perc");
        this.jlabel_3x4 = new JLabel("másodperc");
        this.jtf_1x1 = new JTextField(4);
        this.jtf_1x2 = new JTextField(4);
        this.jtf_1x3 = new JTextField(4);
        this.jtf_1x4 = new JTextField(4);
        this.jtf_2x1 = new JTextField(4);
        this.jtf_2x2 = new JTextField(4);
        this.jtf_2x3 = new JTextField(4);
        this.jtf_2x4 = new JTextField(4);
        this.jtf_3x1 = new JTextField(4);
        this.jtf_3x2 = new JTextField(4);
        this.jtf_3x3 = new JTextField(4);
        this.jtf_3x4 = new JTextField(4);
        this.jb = new JButton("Számol");
        jb.addActionListener(this);
        this.p1 = new JPanel();
        this.p2 = new JPanel();
        this.p3 = new JPanel();
        this.p4 = new JPanel();
        GridLayout gr1 = new GridLayout(2,8);
        GridLayout gr2 = new GridLayout(1,1);
        GridLayout gr3 = new GridLayout(1,8);
        GridLayout gr4 = new GridLayout(3,1);
        p1.setLayout(gr1);
        p2.setLayout(gr2);
        p3.setLayout(gr3);
        this.setLayout(gr4);
        p1.add(this.jtf_1x1);
        p1.add(this.jlabel_1x1);
        p1.add(this.jtf_1x2);
        p1.add(this.jlabel_1x2);
        p1.add(this.jtf_1x3);
        p1.add(this.jlabel_1x3);
        p1.add(this.jtf_1x4);
        p1.add(this.jlabel_1x4);
        p1.add(this.jtf_2x1);
        p1.add(this.jlabel_2x1);
        p1.add(this.jtf_2x2);
        p1.add(this.jlabel_2x2);
        p1.add(this.jtf_2x3);
        p1.add(this.jlabel_2x3);
        p1.add(this.jtf_2x4);
        p1.add(this.jlabel_2x4);
        p2.add(jb);
        p3.add(this.jtf_3x1);
        p3.add(this.jlabel_3x1);
        p3.add(this.jtf_3x2);
        p3.add(this.jlabel_3x2);
        p3.add(this.jtf_3x3);
        p3.add(this.jlabel_3x3);
        p3.add(this.jtf_3x4);
        p3.add(this.jlabel_3x4);
        
        this.add(p1);
        this.add(p2);
        this.add(p3);
        pack();
    }
    @Override
    public void actionPerformed(ActionEvent e) {  
        String s1=jtf_1x1.getText();  
        String s2=jtf_1x2.getText();
        String s3=jtf_1x3.getText();
        String s4=jtf_1x4.getText();
        String s5=jtf_2x1.getText();
        String s6=jtf_2x2.getText();
        String s7=jtf_2x3.getText();
        String s8=jtf_2x4.getText();
        int szam1=Integer.parseInt(s1);
        int szam2=Integer.parseInt(s2);
        int szam3=Integer.parseInt(s3);  
        int szam4=Integer.parseInt(s4);  
        int szam5=Integer.parseInt(s5);  
        int szam6=Integer.parseInt(s6);  
        int szam7=Integer.parseInt(s7);  
        int szam8=Integer.parseInt(s8);
        int result1 = 0;
        int result2 = 0;
        int result3 = 0;
        int result4 = 0;
        
        if(e.getSource()==jb){
            int tmpmp=0;
            int tmpp=0;
            int tmpo=0;
            result4 = szam4+szam8;
            if(result4>=60){
                result4 -= 60;
                tmpmp++;
            }
            result3 = szam3+szam7+tmpmp;
            if(result3>=60){
                result3 -= 60;
                tmpp++;
            }
            result2 = szam2+szam6+tmpp;
            if(result2>=24){
                result2 -=24;
                tmpo++;
            }
            result1 = szam1+szam5+tmpo;
   
        }  
        String rs1=String.valueOf(result1);
        String rs2=String.valueOf(result2);
        String rs3=String.valueOf(result3);
        String rs4=String.valueOf(result4);
        jtf_3x1.setText(rs1);
        jtf_3x2.setText(rs2);
        jtf_3x3.setText(rs3);
        jtf_3x4.setText(rs4);
    }  

    
    public static void main(String[] args) {
        IdoAtalakito ido= new IdoAtalakito("IdoAtalakito");
    }

    
    
}
