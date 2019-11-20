package OtodikFeladat;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Szamologep extends JFrame implements ActionListener{
    
    static double a=0,result=0;
    JTextField jtf;
    JButton empty;
    JButton backspace;
    JButton ce;
    JButton c;
    JButton mc;
    JButton n7;
    JButton n8;
    JButton n9;
    JButton per;
    JButton sqrt;
    JButton mr;
    JButton n4;
    JButton n5;
    JButton n6;
    JButton csillag;
    JButton szazalek;
    JButton ms;
    JButton n1;
    JButton n2;
    JButton n3;
    JButton minusz;
    JButton egyperix;
    JButton mplus;
    JButton n0;
    JButton plusminus;
    JButton dot;
    JButton plusz;
    JButton egyenlo;
    JPanel p1;
    JPanel p2;
    JPanel p3;
    JPanel p4;
    ArrayList<Double> lista;
    
    public Szamologep(String title) throws HeadlessException {
        super(title);
        lista = new ArrayList<>();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jtf = new JTextField(50);
        empty= new JButton("");
        backspace= new JButton("<html><body><font color=#FF0000>BACKSPACE</font></body></html>");
        ce= new JButton("<html><body><font color=#FF0000>CE</font></body></html>");
        c =new JButton("<html><body><font color=#FF0000>C</font></body></html>");
        mc =new JButton("<html><body><font color=#FF0000>MC</font></body></html>");
        n7 =new JButton("7");
        n8=new JButton("8");
        n9=new JButton("9");
        per=new JButton("<html><body><font color=#FF0000>/</font></body></html>");
        sqrt=new JButton("sqrt");
        mr=new JButton("<html><body><font color=#FF0000>MR</font></body></html>");
        n4=new JButton("4");
        n5=new JButton("5");
        n6=new JButton("6");
        csillag=new JButton("<html><body><font color=#FF0000>*</font></body></html>");
        szazalek=new JButton("%");
        ms=new JButton("<html><body><font color=#FF0000>MS</font></body></html>");
        n1=new JButton("1");
        n2=new JButton("2");
        n3=new JButton("3");
        minusz=new JButton("<html><body><font color=#FF0000>-</font></body></html>");
        egyperix=new JButton("1/x");
        mplus=new JButton("<html><body><font color=#FF0000>M+</font></body></html>");
        n0=new JButton("0");
        plusminus=new JButton("+/-");
        dot=new JButton(".");
        plusz=new JButton("<html><body><font color=#FF0000>+</font></body></html>");
        egyenlo=new JButton("<html><body><font color=#FF0000>=</font></body></html>");
        n1.addActionListener(this);
        n2.addActionListener(this);
	    n3.addActionListener(this);
	    n4.addActionListener(this);
	    n5.addActionListener(this);
	    n6.addActionListener(this);
	    n7.addActionListener(this);
	    n8.addActionListener(this);
	    n9.addActionListener(this);
	    n0.addActionListener(this);
	    plusz.addActionListener(this);
        egyenlo.addActionListener(this);
        c.addActionListener(this);
        ce.addActionListener(this);
        this.p1 = new JPanel();
        this.p2 = new JPanel();
        this.p3 = new JPanel();
        this.p4 = new JPanel();
        GridLayout gr1 = new GridLayout(1,1);
        GridLayout gr2 = new GridLayout(1,4);
        GridLayout gr3 = new GridLayout(4,6);
        GridLayout gr4 = new GridLayout(3,1);
        p1.setLayout(gr1);
        p2.setLayout(gr2);
        p3.setLayout(gr3);
        this.setLayout(gr4);
        p1.add(this.jtf);
        p2.add(this.empty);
        p2.add(this.backspace);
        p2.add(this.ce);
        p2.add(this.c);
        p3.add(this.mc);
        p3.add(this.n7);
        p3.add(this.n8);
        p3.add(this.n9);
        p3.add(this.per);
        p3.add(this.sqrt);
        p3.add(this.mr);
        p3.add(this.n4);
        p3.add(this.n5);
        p3.add(this.n6);
        p3.add(this.csillag);
        p3.add(this.szazalek);
        p3.add(this.ms);
        p3.add(this.n1);
        p3.add(this.n2);
        p3.add(this.n3);
        p3.add(this.minusz);
        p3.add(this.egyperix);
        p3.add(this.mplus);
        p3.add(this.n0);
        p3.add(this.plusminus);
        p3.add(this.dot);
        p3.add(this.plusz);
        p3.add(this.egyenlo);
        this.add(p1);
        this.add(p2);
        this.add(p3);
        pack();
    }

    
    @Override
 public void actionPerformed(ActionEvent e)
	{           
		if(e.getSource()==n1)
			jtf.setText(jtf.getText().concat("1"));
		
		if(e.getSource()==n2)
			jtf.setText(jtf.getText().concat("2"));
		
		if(e.getSource()==n3)
			jtf.setText(jtf.getText().concat("3"));
		
		if(e.getSource()==n4)
			jtf.setText(jtf.getText().concat("4"));
		
		if(e.getSource()==n5)
			jtf.setText(jtf.getText().concat("5"));
		
		if(e.getSource()==n6)
			jtf.setText(jtf.getText().concat("6"));
		
		if(e.getSource()==n7)
			jtf.setText(jtf.getText().concat("7"));
		
		if(e.getSource()==n8)
			jtf.setText(jtf.getText().concat("8"));
		
		if(e.getSource()==n9)
			jtf.setText(jtf.getText().concat("9"));
		
		if(e.getSource()==n0)
			jtf.setText(jtf.getText().concat("0"));
		
		
		if(e.getSource()==plusz)
		{
		} 
		
		
		if(e.getSource()==egyenlo)
		{
		}
		
		if(e.getSource()==c){
                }
                
                if(e.getSource()==ce){
                }
	}

    public static void main(String[] args) {
        Szamologep szg= new Szamologep("Szamologep");
    }
    
}
