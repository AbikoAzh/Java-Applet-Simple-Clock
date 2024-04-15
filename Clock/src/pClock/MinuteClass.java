package pClock;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class MinuteClass {
	
	int min ,mhold;
	String string;
	SecondClass secclass;
	
	MinuteClass(){
		min = 0;
		string = "0"+min;
		secclass = new SecondClass();
	}
	
	public void drawM(Graphics g){
		g.setColor(Color.BLUE);
		g.setFont(new Font("",Font.PLAIN,120));
		g.drawString(string, 320, 280);
	}
	
	public void moveM(SecondClass s){
		
		if(s.hold == 60 && s.getsec() ==0 && min <60){
			
			min += 1;
			
			if(min == 60){
				min = 0;
			}
			
			if(min < 10){
				string = "0"+min;
			}else{
				string = ""+min;
			}
			
			System.out.println("minute get ## "+min );
		}
	}
	
	public int getmin(){
		return min;
	}
}
