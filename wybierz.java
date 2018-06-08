import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import javax.swing.*;

public class wybierz extends JFrame {
	public Font font=new Font("Helvetica", Font.BOLD, 32);
	JLabel wybor = new JLabel("WYBIERZ SPÓ£G£OSKÊ");
	boolean d, d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,d11,d12,d13,d14,d15,d16,d17,d18,d19,d20,d21,d22,d23,d24;
	public static void ods(){
		Start.l1.setText(Start.tablica[0]);
		Start.l2.setText(Start.tablica[1]);
		Start.l3.setText(Start.tablica[2]);
		Start.l4.setText(Start.tablica[3]);
		Start.l5.setText(Start.tablica[4]);
		Start.l6.setText(Start.tablica[5]);
		Start.l7.setText(Start.tablica[6]);
		Start.l8.setText(Start.tablica[7]);
		Start.l9.setText(Start.tablica[8]);
		Start.l10.setText(Start.tablica[9]);
		Start.punkt.setText("PUNKTY: " + Integer.toString(Start.punkty));
		String teksta = null;
		//for(int i=0; i<kategoria.wyraz.length; i++)
		//teksta.replaceAll(teksta, Start.tablica[i]);
		//System.out.println(teksta);
		//if(Start.tekst.equals(Start.tekst))
		// new  wygrana();
	}
	public void dodaj(){
		switch(Start.a){
		case 1: Start.punkty =0;	break;
		case 2: Start.punkty +=40;	break;
		case 3: Start.punkty +=100;	break;
		case 4: Start.punkty +=50;	break;
		case 5: Start.punkty +=400;	break;
		case 6: Start.punkty +=300;	break;
		case 7: Start.punkty +=200;	break;
		case 8: Start.punkty +=100; break;
		}
	}
	public void czybylo(){
		d1 = true;
		d2 = true;
		d3 = true;
		d4 = true;
		d5 = true;
		d6 = true;
		d7 = true;
		d8 = true;
		d9 = true;
		d10 = true;
		d11= true;
		d12 = true;
		d13 = true;
		d14 = true;
		d15 = true;
		d16 = true;
		d17 = true;
		d18 = true;
		d19 = true;
		d20 = true;
		d21 = true;
		d22 = true;
		d23 = true;
		d24 = true;
	}
	
	public void spo(){
		ActionListener sp= new ActionListener(){
			public void actionPerformed(ActionEvent arg1){
				if(arg1.getSource() == Start.sa1){
					dispose();
					Start.sa1.setVisible(false);
					for(int o=0; o<kategoria.wyraz.length; o++){
						if (kategoria.wyraz[o] == 'B'  && d1==false){
							Start.tablica[o] ="B";
							dodaj();
							}
						ods();
							}czybylo();
				}
				else if(arg1.getSource() == Start.sa2){
					dispose();
					Start.sa2.setVisible(false);
					for(int o=0; o<kategoria.wyraz.length; o++){
						if (kategoria.wyraz[o] == 'C' && d2==false){
							Start.tablica[o] ="C";
							dodaj();}ods();
							}czybylo();
					
				}
				else if(arg1.getSource() == Start.sa3){
					dispose();
					Start.sa3.setVisible(false);
					for(int o=0; o<kategoria.wyraz.length; o++){
						if (kategoria.wyraz[o] == 'Æ' && d3==false){
							Start.tablica[o] ="Æ";
							dodaj();}ods();
							}czybylo();}
				else if(arg1.getSource() == Start.sa4){
					dispose();
					Start.sa4.setVisible(false);
					for(int o=0; o<kategoria.wyraz.length; o++){
						if (kategoria.wyraz[o] == 'D' && d4==false){
							Start.tablica[o] ="D";
							dodaj();}ods();
							}czybylo();}
				else if(arg1.getSource() == Start.sa5){
					dispose();
					Start.sa5.setVisible(false);
					for(int o=0; o<kategoria.wyraz.length; o++){
						if (kategoria.wyraz[o] == 'F' && d5==false){
							Start.tablica[o] ="F";
							dodaj();}ods();
							}czybylo();}
				else if(arg1.getSource() == Start.sa6){
					dispose();
					Start.sa6.setVisible(false);
					for(int o=0; o<kategoria.wyraz.length; o++){
						if (kategoria.wyraz[o] == 'G' && d6==false){
							Start.tablica[o] ="G";
							dodaj();}ods();
							}czybylo();}
				else if(arg1.getSource() == Start.sa7){
					dispose();
					Start.sa7.setVisible(false);
					for(int o=0; o<kategoria.wyraz.length; o++){
						if (kategoria.wyraz[o] == 'H' && d7==false){
							Start.tablica[o] ="H";
							dodaj();}ods();
							}czybylo();}
				else if(arg1.getSource() == Start.sa8){
					dispose();
					Start.sa8.setVisible(false);
					for(int o=0; o<kategoria.wyraz.length; o++){
						if (kategoria.wyraz[o] == 'J' && d8==false){
							Start.tablica[o] ="J";
							dodaj();}ods();
							}czybylo();}
				else if(arg1.getSource() == Start.sa9){
					dispose();
					Start.sa9.setVisible(false);
					for(int o=0; o<kategoria.wyraz.length; o++){
						if (kategoria.wyraz[o] == 'K' && d9==false){
							Start.tablica[o] ="K";
							dodaj();}ods();
							}czybylo();}
				else if(arg1.getSource() == Start.sa10){
					dispose();
					Start.sa10.setVisible(false);
					for(int o=0; o<kategoria.wyraz.length; o++){
						if (kategoria.wyraz[o] == 'L' && d10==false){
							Start.tablica[o] ="L";
							dodaj();}ods();
							}czybylo();}
				else if(arg1.getSource() == Start.sa11){
					dispose();
					Start.sa11.setVisible(false);
					for(int o=0; o<kategoria.wyraz.length; o++){
						if (kategoria.wyraz[o] == '£' && d11==false){
							Start.tablica[o] ="£";
							dodaj();}ods();
							}czybylo();}
				else if(arg1.getSource() == Start.sa12){
					dispose();
					Start.sa12.setVisible(false);
					for(int o=0; o<kategoria.wyraz.length; o++){
						if (kategoria.wyraz[o] == 'M' && d12==false){
							Start.tablica[o] ="M";
							dodaj();}ods();}
					czybylo();}
				else if(arg1.getSource() == Start.sa13){
					dispose();
					Start.sa13.setVisible(false);
					for(int o=0; o<kategoria.wyraz.length; o++){
						if (kategoria.wyraz[o] == 'N' && d13==false){
							Start.tablica[o] ="N";
							dodaj();}ods();
							}czybylo();}
				else if(arg1.getSource() == Start.sa14){
					dispose();
					Start.sa14.setVisible(false);
					for(int o=0; o<kategoria.wyraz.length; o++){
						if (kategoria.wyraz[o] == 'Ñ' && d14==false){
							Start.tablica[o] ="Ñ";
							dodaj();}ods();
							}czybylo();}
				else if(arg1.getSource() == Start.sa15){
					dispose();
					Start.sa15.setVisible(false);
					for(int o=0; o<kategoria.wyraz.length; o++){
						if (kategoria.wyraz[o] == 'P' && d15==false){
							Start.tablica[o] ="P";
							dodaj();}ods();
							}czybylo();}
				else if(arg1.getSource() == Start.sa16){
					dispose();
					Start.sa16.setVisible(false);
					for(int o=0; o<kategoria.wyraz.length; o++){
						if (kategoria.wyraz[o] == 'R' && d16==false){
							Start.tablica[o] ="R";
							dodaj();}ods();
							}czybylo();}
				else if(arg1.getSource() == Start.sa17){
					dispose();
					Start.sa17.setVisible(false);
					for(int o=0; o<kategoria.wyraz.length; o++){
						if (kategoria.wyraz[o] == 'S' && d17==false){
							Start.tablica[o] ="S";
							dodaj();}ods();
							}czybylo();}
				else if(arg1.getSource() == Start.sa18){
					dispose();
					Start.sa18.setVisible(false);
					for(int o=0; o<kategoria.wyraz.length; o++){
						if (kategoria.wyraz[o] == 'Œ' && d18==false){
							Start.tablica[o] ="Œ";
							dodaj();}ods();
							}czybylo();}
				else if(arg1.getSource() == Start.sa19){
					dispose();
					Start.sa19.setVisible(false);
					for(int o=0; o<kategoria.wyraz.length; o++){
						if (kategoria.wyraz[o] == 'T' && d19==false){
							Start.tablica[o] ="T";
							dodaj();}ods();
							}czybylo();}
				else if(arg1.getSource() == Start.sa20){
					dispose();
					Start.sa20.setVisible(false);
					for(int o=0; o<kategoria.wyraz.length; o++){
						if (kategoria.wyraz[o] == 'W' && d20==false){
							Start.tablica[o] ="W";
							dodaj();}ods();
							}czybylo();}
				else if(arg1.getSource() == Start.sa21){
					dispose();
					Start.sa21.setVisible(false);
					for(int o=0; o<kategoria.wyraz.length; o++){
						if (kategoria.wyraz[o] == 'X' && d21==false){
							Start.tablica[o] ="X";
							dodaj();}ods();
							}czybylo();}
				else if(arg1.getSource() == Start.sa22){
					dispose();
					Start.sa22.setVisible(false);
					for(int o=0; o<kategoria.wyraz.length; o++){
						if (kategoria.wyraz[o] == 'Z' && d22==false){
							Start.tablica[o] ="Z";
							dodaj();}ods();
							}czybylo();}
				else if(arg1.getSource() == Start.sa23){
					dispose();
					Start.sa23.setVisible(false);
					for(int o=0; o<kategoria.wyraz.length; o++){
						if (kategoria.wyraz[o] == '' && d23==false){
							Start.tablica[o] ="";
							dodaj();}ods();
							}czybylo();}
				else if(arg1.getSource() == Start.sa24){
					dispose();
					Start.sa24.setVisible(false);
					for(int o=0; o<kategoria.wyraz.length; o++){
						if (kategoria.wyraz[o] == '¯' && d24==false){
							Start.tablica[o] ="¯";
							dodaj();}ods();
							}czybylo();}
			}
		};
		
		Start.sa1.addActionListener(sp);
		Start.sa2.addActionListener(sp);
		Start.sa3.addActionListener(sp);
		Start.sa4.addActionListener(sp);
		Start.sa5.addActionListener(sp);
		Start.sa6.addActionListener(sp);
		Start.sa7.addActionListener(sp);
		Start.sa8.addActionListener(sp);
		Start.sa9.addActionListener(sp);
		Start.sa10.addActionListener(sp);
		Start.sa11.addActionListener(sp);
		Start.sa12.addActionListener(sp);
		Start.sa13.addActionListener(sp);
		Start.sa14.addActionListener(sp);
		Start.sa15.addActionListener(sp);
		Start.sa16.addActionListener(sp);
		Start.sa17.addActionListener(sp);
		Start.sa18.addActionListener(sp);
		Start.sa19.addActionListener(sp);
		Start.sa20.addActionListener(sp);
		Start.sa21.addActionListener(sp);
		Start.sa22.addActionListener(sp);
		Start.sa23.addActionListener(sp);
		Start.sa24.addActionListener(sp);
	}
	
	public wybierz(){
		setSize(500,500);
		setVisible(true);
		//setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Odgadujesz Has³o");
		//Start.panelw.setBounds(getWidth()-600,getHeight()-500, 500, 500);
		add(Start.panelw);
		wybor.setFont(font);
		wybor.setBounds(getWidth()-400,getHeight()-480, 400, 42);
		Start.panelw.add(wybor);
		spo();
	}
	public static void main(String[] args){
		new wybierz();
		
		
	}

}
