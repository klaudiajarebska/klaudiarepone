import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

import javax.swing.*;
public class kategoria extends JFrame {
public static String [] kategorie = {"JEDZENIE", "ROŒLINY", "ROZRYWKA", "ZWIERZÊTA"};
static Random random = new Random();
static int k = random.nextInt(4);
static int linijka = random.nextInt(10)+1;
public static JLabel katq = new JLabel(kategorie[k]);
public static char[] wyraz;
static String zdanie;
static File file;
public static void czytannie()throws FileNotFoundException{
	if(k == 0 )
	file = new File("jedzenie.txt");
	else if(k==1)
	file = new File("rosliny.txt");
	else if(k==2)
	file = new File("rozrywka.txt");
	else if(k==3)
	file = new File("zwierzeta.txt");
	Scanner in = new Scanner(file);
	for(int i=0; i<linijka; i++)
	zdanie = in.nextLine();
	wyraz = zdanie.toCharArray();
}
}
