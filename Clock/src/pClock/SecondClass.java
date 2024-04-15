package pClock;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class SecondClass {
	int sec, hold;
	String string;
	SecondClass(){
		sec = 0;
		string = "0"+sec;
	}
	
	public void drawS(Graphics g){
		g.setColor(Color.BLUE);
		g.setFont(new Font("",Font.PLAIN,50));
		g.drawString(":"+string, 455, 280);
	}
	
	public void moveS(){
		if(sec >= 0 && sec <60){
		
			sec += 1;
			
			if(sec == 60){
				sec = 0;
				hold =60;
			}
			
			if(sec < 10){
				string = "0"+sec;
			}else{
				string = ""+sec;
			}
			
		}
		
	}
	
	public int getsec(){
		return sec;
	}
}
