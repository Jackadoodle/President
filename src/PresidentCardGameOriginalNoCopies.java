import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import java.applet.Applet;
public class PresidentCardGameOriginalNoCopies {
	
	public Card[] generateDeck() {
		Card[]deck = new Card [52];
		char[]suits= {'s','c','h','d'};
		for(int i=0;i<4;i++) {
			for(int x=1;x<14;x++) {
				Card c = new Card(x,suits[i]);
				deck[i*13+(x-1)] = c;
			}
		}
		
		return deck;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
