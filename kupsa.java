import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class kupsa extends JFrame {
	public Font font=new Font("Helvetica", Font.BOLD, 38);
	public Font font1=new Font("Helvetica", Font.BOLD, 26);
	JButton zamknij, s1, s2, s3, s4, s5, s6, s7, s8, s9;
	JLabel tekst = new JLabel("KUP SAMOG£OSKÊ");
	JLabel cena = new JLabel("Cena: 10");
	public void samogloski(){
		ActionListener s= new ActionListener(){
			public void actionPerformed(ActionEvent arg1){
				if(arg1.getSource() == s1){
					dispose();
					
					for(int o=0; o<kategoria.wyraz.length; o++){
						if (kategoria.wyraz[o] == 'A'){
							Start.tablica[o] ="A";
							
							}
				}
					Start.punkty -=10;
					wybierz.ods();}
				else if(arg1.getSource() == s2){
					dispose();
					
					for(int o=0; o<kategoria.wyraz.length; o++){
						if (kategoria.wyraz[o] == '¥'){
							Start.tablica[o] ="¥";
							wybierz.ods();
							}}
					Start.punkty -=10;
					wybierz.ods();}
				else if(arg1.getSource() == s3){
					dispose();
					for(int o=0; o<kategoria.wyraz.length; o++){
						if (kategoria.wyraz[o] == 'E'){
							Start.tablica[o] ="E";
							
							}}Start.punkty -=10;
							wybierz.ods();}
				else if(arg1.getSource() == s4){
					dispose();
					for(int o=0; o<kategoria.wyraz.length; o++){
						if (kategoria.wyraz[o] == 'Ê'){
							Start.tablica[o] ="Ê";
							
							}}Start.punkty -=10;
							wybierz.ods();}
				else if(arg1.getSource() == s5){
					dispose();
					for(int o=0; o<kategoria.wyraz.length; o++){
						if (kategoria.wyraz[o] == 'I'){
							Start.tablica[o] ="I";
							
							}}Start.punkty -=10;
							wybierz.ods();}
				else if(arg1.getSource() == s6){
					dispose();
					for(int o=0; o<kategoria.wyraz.length; o++){
						if (kategoria.wyraz[o] == 'O'){
							Start.tablica[o] ="O";
							
							}}Start.punkty -=10;
							wybierz.ods();}
				else if(arg1.getSource() == s7){
					dispose();
					for(int o=0; o<kategoria.wyraz.length; o++){
						if (kategoria.wyraz[o] == 'Ó'){
							Start.tablica[o] ="Ó";
							
							}}Start.punkty -=10;
							wybierz.ods();}
				else if(arg1.getSource() == s8){
					dispose();
					for(int o=0; o<kategoria.wyraz.length; o++){
						if (kategoria.wyraz[o] == 'U'){
							Start.tablica[o] ="U";
							
							}}Start.punkty -=10;
							wybierz.ods();}
				else if(arg1.getSource() == s9){
					dispose();
					for(int o=0; o<kategoria.wyraz.length; o++){
						if (kategoria.wyraz[o] == 'Y'){
							Start.tablica[o] ="Y";
							
							}}Start.punkty -=10;
							wybierz.ods();}
			}
		};
		s1 = new JButton("A");
		s2 = new JButton("¥");
		s3 = new JButton("E");
		s4 = new JButton("Ê");
		s5 = new JButton("I");
		s6 = new JButton("O");
		s7 = new JButton("Ó");
		s8 = new JButton("U");
		s9 = new JButton("Y");
		s1.setBounds(getWidth()-430 , getHeight()-330, 50, 42);
		s2.setBounds(getWidth()-330 , getHeight()-330, 50, 42);
		s3.setBounds(getWidth()-230 , getHeight()-330, 50, 42);
		s4.setBounds(getWidth()-130 , getHeight()-330, 50, 42);
		s5.setBounds(getWidth()-430 , getHeight()-230, 50, 42);
		s6.setBounds(getWidth()-330 , getHeight()-230, 50, 42);
		s7.setBounds(getWidth()-230 , getHeight()-230, 50, 42);
		s8.setBounds(getWidth()-130 , getHeight()-230, 50, 42);
		s9.setBounds(getWidth()-280 , getHeight()-280, 50, 42);
		s1.addActionListener(s);
		s2.addActionListener(s);
		s3.addActionListener(s);
		s4.addActionListener(s);
		s5.addActionListener(s);
		s6.addActionListener(s);
		s7.addActionListener(s);
		s8.addActionListener(s);
		s9.addActionListener(s);
		add(s1);
		add(s2);
		add(s3);
		add(s4);
		add(s5);
		add(s6);
		add(s7);
		add(s8);
		add(s9);
	}
	public kupsa(){
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Kup Samog³oskê");
		setLayout(null);
		ActionListener a= new ActionListener(){
			public void actionPerformed(ActionEvent arg1){
				if(arg1.getSource() == zamknij)
					dispose();
			}
		};
		tekst.setFont(font);
		cena.setFont(font1);
		tekst.setBounds(getWidth()/6 , getHeight()-450, 400, 42);
		cena.setBounds(getWidth()/3 , getHeight()-400, 200, 42);
		zamknij = new JButton("Zamknij");
		zamknij.setBounds(getWidth()/3 , getHeight()-120, 100, 42);
		zamknij.addActionListener(a);
		add(tekst);
		add(cena);
		add(zamknij);
		samogloski();

	}
	public static void main(String[] args){
		new kupsa();
	}

}
