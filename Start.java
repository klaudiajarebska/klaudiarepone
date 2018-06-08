import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import javax.rmi.CORBA.Stub;
import javax.swing.*;
public class Start extends JFrame {
//Do okna start
Font font=new Font("Monotype Corsiva", Font.BOLD, 38);
Font font1=new Font("Monotype Corsiva", Font.BOLD, 28);
JLabel powitanie, okno0;
JLabel background1 = new JLabel(new ImageIcon("tlo.png"));
static String tekst;
static String plik = "WYNIKI.txt";
JLabel propo = new JLabel("Propozycja:");
JLabel tytul = new JLabel("Odgadujesz has≥o");
JButton start, ranking, zasady, sprawdz;
static JTextField imie;
JTextField haslouz;
JPanel panel1;
//Do okna glowne
static JLabel l1, l2, l3, l4, l5,l6,l7,l8,l9,l10, haslo,kat,ty,ty1,ty2,ty3,ty4, ty5, ty6, ty7, punkt,ra, osoby, osoby1, osoby2, osoby3, osoby4;
JButton zak, kup, odgaduj;
static JButton sa1, sa2, sa3, sa4, sa5, sa6, sa7, sa8, sa9, sa10, sa11, sa12, sa13, sa14, sa15, sa16, sa17, sa18, sa19, sa20, sa21, sa22, sa23, sa24, koniec, koniec1;
static JPanel panel2, stan1,stan2,stan3,stan4,stan5,stan6,stan7,stan8, panelw, panel3, panelr, panelz;
static int a;
static String [] tablica= {"_","_","_","_","_","_","_","_","_","_"};
String [] osob = new String[5];
String [] pomoc = new String[5];
static int punkty = 0;
public void losowanie(){
	Random random = new Random();
	a = random.nextInt(8)+1;
}
public void zasady(){
	
	panelz = new JPanel();
	panelz.setPreferredSize(new Dimension(800,500));
	panelz.setLayout(null);
	panelz.setVisible(true);
	panelz.setBackground(getBackground());
	JLabel nagluwek1 = new JLabel("Zasady");
	JLabel tekst1 = new JLabel("1) G≥ownym celem gry jest zdobycie jak najwiÍkszej iloúci punktÛw przez gracza.");
	JLabel tekst2 = new JLabel("2) Gracz musi wpisaÊ imiÍ aby zaczπÊ rozgrywkÍ.");
	JLabel tekst3 = new JLabel("3) Gracz moøe dokupiÊ samog≥oskÍ. Cena za samog≥oskÍ wynosi 10pkt i jest pobierana raz niezaleønie od iloúci tej samog≥oski w haúle.");
	JLabel tekst4 = new JLabel("4) Gracz przed rozpoczÍciem rozgrywki losuje iloúÊ punktÛw mu naleønych za kaødπ odgadniÍtπ literÍ.");
	JLabel tekst5 = new JLabel("5) Moølie jest rÛwnieø wylosowanie bankruta, co oznacza øe punktacja jest zerowana oraz gracz przegrywa");
	JLabel tekst6 = new JLabel("6) Gracz moøe wybieraÊ spÛ≥g≥oski. B≥Ídnie moøna wybraÊ 10 liter. Po tej iloúci gracz przegrywa.");
	JLabel tekst7 = new JLabel("7) Gracz w dowolnym momencie moøe odgadywaÊ has≥o. Poprawne odgadniÍcie has≥a skutkuje wygranπ. ");
	JLabel tekst8 = new JLabel("8) Kategorie sπ losowane automatycznie. Kategorii jest 6 i sπ one nastÍpujπce:");
	JLabel tekst9 = new JLabel("ZwierzÍta, Przybory codziennego uøytku, Jedzenie, Miasta Polski, Roúliny, Zawody");
	JLabel tekst10 = new JLabel("9) Jeúli gracz wygra≥ i zdoby≥ odpowiedniπ iloúÊ punktÛw zostaje zapisany w rankingu.");
	koniec1 = new JButton("POWR”T");
	nagluwek1.setBounds(getWidth()/3 ,getHeight()/10 , 800, 42);
	tekst1.setBounds(getWidth()/60 ,getHeight()-400 , 800, 42);
	tekst2.setBounds(getWidth()/60 ,getHeight()-380 ,800, 42);
	tekst3.setBounds(getWidth()/60,getHeight()-360 , 800, 42);
	tekst4.setBounds(getWidth()/60,getHeight()-340 , 800, 42);
	tekst5.setBounds(getWidth()/60,getHeight()-320 , 800, 42);
	tekst6.setBounds(getWidth()/60,getHeight()-300 , 800, 42);
	tekst7.setBounds(getWidth()/60,getHeight()-280 , 800, 42);
	tekst8.setBounds(getWidth()/60,getHeight()-260 , 800, 42);
	tekst9.setBounds(getWidth()/10,getHeight()-240 , 800, 42);
	tekst10.setBounds(getWidth()/60,getHeight()-220 , 800, 42);
	nagluwek1.setFont(font);
	panelz.add(nagluwek1);
	panelz.add(tekst1);
	panelz.add(tekst2);
	panelz.add(tekst3);
	panelz.add(tekst4);
	panelz.add(tekst5);
	panelz.add(tekst6);
	panelz.add(tekst7);
	panelz.add(tekst8);
	panelz.add(tekst9);
	panelz.add(tekst10);
	ActionListener akcja = new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
			if(arg0.getSource() == koniec1 ){
				panelz.setVisible(false);
				remove(panelz);
				panel1.setVisible(true);
				add(panel1);
			}
		}
	};
	koniec1.setBounds(getWidth()/3, getHeight()-160, 100, 40);
	panelz.add(koniec1);
	koniec1.addActionListener(akcja);
}
public void ranking() throws FileNotFoundException{
	panelr = new JPanel();
	panelr.setPreferredSize(new Dimension(800,500));
	panelr.setLayout(null);
	panelr.setVisible(true);
	panelr.setBackground(getBackground());
	ActionListener akcja = new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
			if(arg0.getSource() == koniec ){
				panelr.setVisible(false);
				remove(panelr);
				panel1.setVisible(true);
				add(panel1);
			}
		}
	};
	ra = new JLabel("RANKING");
	koniec = new JButton("PowrÛt");
	ra.setFont(font);
	ra.setBounds(getWidth()/3, getHeight()/8, 400, 42);
	panelr.add(ra);
	koniec.setBounds(getWidth()/3, getHeight()-160, 100, 40);
	panelr.add(koniec);
	koniec.addActionListener(akcja);
	osoby = new JLabel();
	osoby1 = new JLabel();
	osoby2 = new JLabel();
	osoby3= new JLabel();
	osoby4 = new JLabel();
	File file = new File("wyniki.txt");
	Scanner in = new Scanner(file);
	for(int i=0; i<4; i++)
		osob[i] = in.nextLine();

		
		osoby.setText(osob[0]);
		osoby1.setText(osob[1]);
		osoby2.setText(osob[2]);
		osoby3.setText(osob[2]);
		osoby4.setText(osob[3]);

	osoby.setBounds(getWidth()-780, getHeight()-400, 600, 42);
	osoby1.setBounds(getWidth()-780, getHeight()-350, 600, 42);
	osoby2.setBounds(getWidth()-780, getHeight()-300, 600, 42);
	osoby3.setBounds(getWidth()-780, getHeight()-250, 600, 42);
	osoby4.setBounds(getWidth()-780, getHeight()-200, 600, 42);
	osoby.setFont(font1); osoby1.setFont(font1); osoby2.setFont(font1); osoby3.setFont(font1); osoby4.setFont(font1);
	panelr.add(osoby);
	panelr.add(osoby1);
	panelr.add(osoby2);
	panelr.add(osoby3);
	panelr.add(osoby4);
}
public void wybor(){
	panelw = new JPanel();
	panelw.setPreferredSize(new Dimension(500,500));
	panelw.setLayout(null);
	panelw.setVisible(true);
	panelw.setBackground(getBackground());
	sa1 = new JButton("B");
	sa2 = new JButton("C");
	sa3 = new JButton("∆");
	sa4 = new JButton("D");
	sa5 = new JButton("F");
	sa6 = new JButton("G");
	sa7 = new JButton("H");
	sa8 = new JButton("J");
	sa9 = new JButton("K");
	sa10 = new JButton("L");
	sa11 = new JButton("£");
	sa12 = new JButton("M");
	sa13 = new JButton("N");
	sa14 = new JButton("—");
	sa15 = new JButton("P");
	sa16 = new JButton("R");
	sa17 = new JButton("S");
	sa18 = new JButton("å");
	sa19 = new JButton("T");
	sa20 = new JButton("W");
	sa21 = new JButton("X");
	sa22 = new JButton("Z");
	sa23 = new JButton("è");
	sa24 = new JButton("Ø");
	sa1.setBounds(getWidth()-760 , getHeight()-430, 50, 42);
	sa2.setBounds(getWidth()-690 , getHeight()-430, 50, 42);
	sa3.setBounds(getWidth()-620 , getHeight()-430, 50, 42);
	sa4.setBounds(getWidth()-550 , getHeight()-430, 50, 42);
	sa5.setBounds(getWidth()-480 , getHeight()-430, 50, 42);
	sa6.setBounds(getWidth()-410 , getHeight()-430, 50, 42);
	sa7.setBounds(getWidth()-760 , getHeight()-330, 50, 42);
	sa8.setBounds(getWidth()-690 , getHeight()-330, 50, 42);
	sa9.setBounds(getWidth()-620 , getHeight()-330, 50, 42);
	sa10.setBounds(getWidth()-550 , getHeight()-330, 50, 42);
	sa11.setBounds(getWidth()-480 , getHeight()-330, 50, 42);
	sa12.setBounds(getWidth()-410 , getHeight()-330, 50, 42);
	sa13.setBounds(getWidth()-760 , getHeight()-230, 50, 42);
	sa14.setBounds(getWidth()-690 , getHeight()-230, 50, 42);
	sa15.setBounds(getWidth()-620 , getHeight()-230, 50, 42);
	sa16.setBounds(getWidth()-550 , getHeight()-230, 50, 42);
	sa17.setBounds(getWidth()-480 , getHeight()-230, 50, 42);
	sa18.setBounds(getWidth()-410 , getHeight()-230, 50, 42);
	sa19.setBounds(getWidth()-760 , getHeight()-130, 50, 42);
	sa20.setBounds(getWidth()-690 , getHeight()-130, 50, 42);
	sa21.setBounds(getWidth()-620 , getHeight()-130, 50, 42);
	sa22.setBounds(getWidth()-550 , getHeight()-130, 50, 42);
	sa23.setBounds(getWidth()-480 , getHeight()-130, 50, 42);
	sa24.setBounds(getWidth()-410 , getHeight()-130, 50, 42);
	panelw.add(sa1);
	panelw.add(sa2);
	panelw.add(sa3);
	panelw.add(sa4);
	panelw.add(sa5);
	panelw.add(sa6);
	panelw.add(sa7);
	panelw.add(sa8);
	panelw.add(sa9);
	panelw.add(sa10);
	panelw.add(sa11);
	panelw.add(sa12);
	panelw.add(sa13);
	panelw.add(sa14);
	panelw.add(sa15);
	panelw.add(sa16);
	panelw.add(sa17);
	panelw.add(sa18);
	panelw.add(sa19);
	panelw.add(sa20);
	panelw.add(sa21);
	panelw.add(sa22);
	panelw.add(sa23);
	panelw.add(sa24);
}
public void menu(){
	
	//Menu
	//JMenuBar
	JMenuBar menu = new JMenuBar();
	//JMenu
	JMenu Plik = new JMenu ("Gra");
	JMenu Okno = new JMenu ("Informacje");
	//JMenuItem
	JMenuItem PlikItem1 = new JMenuItem("Nowa");
	JMenuItem PlikItem2 = new JMenuItem("Ranking");
	JMenuItem PlikItem3 = new JMenuItem("Zamknij");
	JMenuItem OknoItem1 = new JMenuItem("O Grze");
	JMenuItem OknoItem2 = new JMenuItem("TwÛrcy");
	Plik.add(PlikItem1);
	Plik.add(PlikItem2);
	Plik.addSeparator();
	Plik.add(PlikItem3);
	Okno.add(OknoItem1);
	Okno.add(OknoItem2);
	ActionListener a= new ActionListener(){
		public void actionPerformed(ActionEvent arg){
			System.out.println(arg.getActionCommand());
			String cmd = arg.getActionCommand();
			if(arg.getActionCommand().equals("Zamknij"))
				dispose();
			//if(arg.getActionCommand().equals("TwÛrcy"))
				//JOptionPane.showMessageDialog(this, "hello " + cmd,"Blee",JOptionPane.INFORMATION_MESSAGE);
	}
};

	menu.add(Plik);
	menu.add(Okno);
	setJMenuBar(menu);
	PlikItem1.addActionListener(a);
	PlikItem2.addActionListener(a);
	PlikItem3.addActionListener(a);
	OknoItem1.addActionListener(a);
	OknoItem2.addActionListener(a);
	//koniec menu

}
public void bla(){
	stan1.setVisible(false);
	remove(stan1);
	stan2.setVisible(false);
	remove(stan2);
	stan3.setVisible(false);
	remove(stan3);
	stan4.setVisible(false);
	remove(stan4);
	stan5.setVisible(false);
	remove(stan5);
	stan6.setVisible(false);
	remove(stan6);
	stan7.setVisible(false);
	remove(stan7);
	stan8.setVisible(false);
	remove(stan8);
}
public void glowne() throws FileNotFoundException{
	//akcja glowna
	wybor();
ActionListener glowna= new ActionListener(){
	public void actionPerformed(ActionEvent arg){
		System.out.println(arg.getActionCommand());
		if(arg.getActionCommand().equals("zamknij"))
			dispose();
		if(arg.getSource() == zak){
			losowanie();
			new wybierz();
			if(a==1){
				bla();
				stan1.setVisible(true);
				panel2.add(stan1);
			}
			else if(a==2){
				bla();
				stan2.setVisible(true);
				panel2.add(stan2);
			}
			else if(a==3){
				bla();
				stan3.setVisible(true);
				panel2.add(stan3);
			}
			else if(a==4){
				bla();
				stan4.setVisible(true);
				panel2.add(stan4);
			}
			else if(a==5){
				bla();
				stan5.setVisible(true);
				panel2.add(stan5);
			}
			else if(a==6){
				bla();
				stan6.setVisible(true);
				panel2.add(stan6);
				
			}
			else if(a==7){
				bla();
				stan7.setVisible(true);
				panel2.add(stan7);
			}
			else if(a==8){
				bla();
				stan8.setVisible(true);
				panel2.add(stan8);
			}
		}
		if(arg.getSource() == kup){
			new kupsa();
		}
		if(arg.getSource() == odgaduj){
			odgadywanie();
		}					
	}
};
//deklaracja komponentÛw
for(int k = 0; k<10; k++){
	if(k>=kategoria.wyraz.length)
	tablica[k] = " ";
	else tablica[k]="_";}
System.out.println(kategoria.wyraz);
punkt = new JLabel("PUNKTY: " + Integer.toString(punkty));
l1 = new JLabel(tablica[0]);
l2 = new JLabel(tablica[1]);
l3 = new JLabel(tablica[2]);
l4 = new JLabel(tablica[3]);
l5 = new JLabel(tablica[4]);
l6 = new JLabel(tablica[5]);
l7 = new JLabel(tablica[6]);
l8 = new JLabel(tablica[7]);
l9 = new JLabel(tablica[8]);
l10 = new JLabel(tablica[9]);
haslo = new JLabel("HAS£O:");
kat= new JLabel("Kategoria:");
zak = new JButton("ZakrÍÊ");
kup = new JButton("Kup Samog≥oskÍ");
odgaduj = new JButton("Odgaduj has≥o");
ty = new JLabel();
ty1 = new JLabel();
ty2 = new JLabel();
ty3 = new JLabel();
ty4 = new JLabel();
ty5 = new JLabel();
ty6 = new JLabel();
ty7 = new JLabel();
stan1 = new JPanel();
stan2 = new JPanel();
stan3 = new JPanel();
stan4 = new JPanel();
stan5 = new JPanel();
stan6 = new JPanel();
stan7 = new JPanel();
stan8 = new JPanel();
panel2 = new JPanel();
//ustawianie rozmiaru i ustawienia komponentÛw
haslo.setBounds(getWidth()-680 ,getHeight()/8 , 200, 42);
l1.setBounds(getWidth()-520 ,getHeight()/8 , 50, 42);
l2.setBounds(getWidth()-480 ,getHeight()/8 , 50, 42);
l3.setBounds(getWidth()-440 ,getHeight()/8 , 50, 42);
l4.setBounds(getWidth()-400 ,getHeight()/8 , 50, 42);
l5.setBounds(getWidth()-360 ,getHeight()/8 , 50, 42);
l6.setBounds(getWidth()-320 ,getHeight()/8 , 50, 42);
l7.setBounds(getWidth()-280 ,getHeight()/8 , 50, 42);
l8.setBounds(getWidth()-240 ,getHeight()/8 , 50, 42);
l9.setBounds(getWidth()-200 ,getHeight()/8 , 50, 42);
l10.setBounds(getWidth()-160 ,getHeight()/8 , 50, 42);
kat.setBounds(getWidth()-580 ,getHeight()/5 , 200, 42);
zak.setBounds(getWidth()-400 ,getHeight()-300 , 200, 42);
kup.setBounds(getWidth()-520 ,getHeight()-200 , 200, 42);
kategoria.katq.setBounds(getWidth()-380,getHeight()/5 , 300, 42);
odgaduj.setBounds(getWidth()-280 ,getHeight()-200 , 200, 42);
stan1.setBounds(getWidth()/12, getHeight()-350, 200, 200);
stan2.setBounds(getWidth()/12, getHeight()-350, 200, 200);
stan3.setBounds(getWidth()/12, getHeight()-350, 200, 200);
stan4.setBounds(getWidth()/12, getHeight()-350, 200, 200);
stan5.setBounds(getWidth()/12, getHeight()-350, 200, 200);
stan6.setBounds(getWidth()/12, getHeight()-350, 200, 200);
stan7.setBounds(getWidth()/12, getHeight()-350, 200, 200);
stan8.setBounds(getWidth()/12, getHeight()-350, 200, 200);
punkt.setBounds(getWidth()-780, getHeight()-100, 300, 42);
panel2.setPreferredSize(new Dimension(800,500));
//inne ustawienia komponentÛw
haslo.setFont(font);
l1.setFont(font);
l2.setFont(font);
l3.setFont(font);
l4.setFont(font);
l5.setFont(font);
l6.setFont(font);
l7.setFont(font);
l8.setFont(font);
l9.setFont(font);
l10.setFont(font);
kat.setFont(font);
punkt.setFont(font1);
kategoria.katq.setFont(font);
zak.addActionListener(glowna);
kup.addActionListener(glowna);
odgaduj.addActionListener(glowna);
ty.setIcon(new ImageIcon(getClass().getResource("stan1.png")));
ty1.setIcon(new ImageIcon(getClass().getResource("stan2.png"))); 
ty2.setIcon(new ImageIcon(getClass().getResource("stan3.png")));
ty3.setIcon(new ImageIcon(getClass().getResource("stan4.png")));
ty4.setIcon(new ImageIcon(getClass().getResource("stan5.png")));
ty5.setIcon(new ImageIcon(getClass().getResource("stan6.png")));
ty6.setIcon(new ImageIcon(getClass().getResource("stan7.png")));
ty7.setIcon(new ImageIcon(getClass().getResource("stan8.png")));
stan1.setVisible(true);
stan1.setBackground(getBackground());
stan2.setVisible(true);
stan2.setBackground(getBackground());
stan3.setVisible(true);
stan3.setBackground(getBackground());
stan4.setVisible(true);
stan4.setBackground(getBackground());
stan5.setVisible(true);
stan5.setBackground(getBackground());
stan6.setVisible(true);
stan6.setBackground(getBackground());
stan7.setVisible(true);
stan7.setBackground(getBackground());
stan8.setVisible(true);
stan8.setBackground(getBackground());
panel2.setLayout(null);
panel2.setVisible(true);
panel2.setBackground(getBackground());
//dodawanie komponentÛw
panel2.add(haslo);
panel2.add(l1);
panel2.add(l2);
panel2.add(l3);
panel2.add(l4);
panel2.add(l5);
panel2.add(l6);
panel2.add(l7);
panel2.add(l8);
panel2.add(l9);
panel2.add(l10);
panel2.add(kat);
panel2.add(kategoria.katq);
panel2.add(zak);
panel2.add(kup);
panel2.add(odgaduj);
stan1.add(ty);
stan2.add(ty1);
stan3.add(ty2);
stan4.add(ty3);
stan5.add(ty4);
stan6.add(ty5);
stan7.add(ty6);
stan8.add(ty7);
panel2.add(stan1);
panel2.add(punkt);
kategoria.czytannie();
}

public void sprawdzenie() throws IOException{
	tekst = haslouz.getText();
		if(kategoria.zdanie.equals(tekst)){
			new wygrana();
			zapisz();}
		else new przegrana();
}
public void odgadywanie(){
	ActionListener spr= new ActionListener(){
		public void actionPerformed(ActionEvent arg2){
			if(arg2.getSource() == sprawdz){
				dispose();
				try {
					sprawdzenie();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
				
		}
	};
	panel3 = new JPanel();
	panel3.setPreferredSize(new Dimension(800,500));
	panel3.setLayout(null);
	panel3.setVisible(true);
	panel3.setBackground(getBackground());
	haslouz= new JTextField();
	sprawdz = new JButton("SPRAWDè");
	sprawdz.setBounds(getWidth()-480 ,getHeight()-150 , 100, 42);
	sprawdz.addActionListener(spr);
	tytul.setFont(font);
	tytul.setBounds(getWidth()-550 ,getHeight()/30 , 400, 42);
	haslouz.setBounds(getWidth()-480 ,getHeight()/4 , 300, 42); 
	propo.setFont(font1);
	propo.setBounds(getWidth()-640 ,getHeight()/4 , 400, 42);
	panel3.add(tytul);
	panel3.add(haslo);
	panel3.add(l1);
	panel3.add(l2);
	panel3.add(l3);
	panel3.add(l4);
	panel3.add(l5);
	panel3.add(l6);
	panel3.add(l7);
	panel3.add(l8);
	panel3.add(l9);
	panel3.add(l10);
	panel3.add(propo);
	panel3.add(haslouz);
	panel3.add(sprawdz);
	panel2.setVisible(false);
	add(panel3);
}
public Start() throws FileNotFoundException{
		//Podstawowe ustawienia okna
				setSize(800,500);
				setVisible(true);    
				panel1.add(background1); 
				panel1.setVisible(true);  
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//akcja komponentÛw
				ActionListener akcja= new ActionListener(){
					public void actionPerformed(ActionEvent arg){
						if(arg.getSource() == start){
							panel1.setVisible(false);
							remove(panel1);
							add(panel2);
						}
						if(arg.getSource() == zasady){
							panel1.setVisible(false);
							remove(panel1);
							panelz.setVisible(true);
							add(panelz);
						}
						if(arg.getSource() == ranking){
							panel1.setVisible(false);
							remove(panel1);
							panelr.setVisible(true);
							add(panelr);
						}					
					}
				};
		//deklaracja komponentÛw
				start = new JButton("START");
				powitanie = new JLabel("WITAJ W KOLE FORTUNY");
				okno0 = new JLabel("Wpisz swojÍ imiÍ:");
				panel1 = new JPanel();
				imie = new JTextField();
				zasady = new JButton("Poznaj zasady!");
				ranking = new JButton("Ranking");
				
		//ustawianie rozmiaru i ustawienia komponentÛw
				powitanie.setBounds(getWidth()/5 ,getHeight()/10 , 540, 42);
				start.setBounds(getWidth()-500 , getHeight()/2, 100, 42);
				okno0.setBounds(getWidth()/12, getHeight()/3, 440, 42);
				imie.setBounds(getWidth()/2 ,getHeight()/3 , 140, 42);
				zasady.setBounds(getWidth() - 220 , getHeight()-120, 150, 42);
				ranking.setBounds(getWidth() - 750 , getHeight()-120, 100, 42);
				panel1.setPreferredSize(new Dimension(800,500));
		//inne ustawienia komponentÛw
				powitanie.setFont(font);
				okno0.setFont(font1);
				start.addActionListener(akcja);
				zasady.addActionListener(akcja);
				ranking.addActionListener(akcja);
				panel1.setLayout(null);
				panel1.setVisible(true);
				panel1.setBackground(getBackground());
		//dodawanie komponentÛw
				panel1.add(powitanie);
				panel1.add(start);
				panel1.add(okno0);
				panel1.add(imie);
				panel1.add(zasady);
				panel1.add(ranking);
				add(panel1);
				menu();
				glowne();
				ranking();
				zasady();
	}
	
public static void zapisz() throws IOException{
	FileWriter fileWritter = new FileWriter(plik,true);
    BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
    	bufferWritter.write("Gracz "+ imie.getText() +" zdoby≥ " + Integer.toString(punkty) + " PunktÛw");
    bufferWritter.close(); 
}

public static void main(String[] args){
		SwingUtilities.invokeLater( new Runnable(){
			public void run(){
				try {
					kategoria.czytannie();
					new Start();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
			}
		}
				);
	}

}
