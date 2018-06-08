import java.awt.Font;
import java.awt.event.*;
import java.io.FileNotFoundException;

import javax.swing.*;

public class wygrana extends JFrame{
	public Font font=new Font("Helvetica", Font.BOLD, 26);
	JLabel graty = new JLabel("Gratulacje, Uda³o Ci siê!");
	JLabel imie = new JLabel(Start.imie.getText() + " Wygra³eœ!");
	JLabel udana = new JLabel("Zdoby³eœ " + Start.punkty + " punktów!");
	JButton powt, zamknij;
public wygrana(){
	setSize(500,500);
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setTitle("Gratulacje! Wygra³eœ!");
	setLayout(null);
	ActionListener e = new ActionListener(){
		public void actionPerformed(ActionEvent arg){
			if(arg.getSource()==powt){
				dispose();
				try {
					new Start();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
			}
			else if(arg.getSource() ==zamknij)
				dispose();
		}
	};
	graty.setFont(font);
	imie.setFont(font);
	udana.setFont(font);
	graty.setBounds(getWidth()/15 , getHeight()-480, 400, 42);
	imie.setBounds(getWidth()/5 , getHeight()-400, 400, 42);
	udana.setBounds(getWidth()/15 , getHeight()-300, 400, 42);
	add(graty);
	add(imie);
	add(udana);
	powt = new JButton("Jeszcze raz");
	zamknij = new JButton("Zamknij");
	powt.setBounds(getWidth()-450 , getHeight()-100, 200, 42);
	zamknij.setBounds(getWidth()-200 , getHeight()-100, 100, 42);
	powt.addActionListener(e);
	zamknij.addActionListener(e);
	add(powt);
	add(zamknij);
}
public static void main(String[] args){
	new wygrana();
}
}
