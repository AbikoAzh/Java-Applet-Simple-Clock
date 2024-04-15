package pClock;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class HourClass {
		
		int hou ;
		boolean chk;
		String string;
		MinuteClass secclass;
		
		HourClass(){
			chk =false;
			hou = 0;
			string = "0"+hou;
			secclass = new MinuteClass();
			
		}
		
		public void drawH(Graphics g){
			g.setColor(Color.BLUE);
			g.setFont(new Font("",Font.PLAIN,120));
			g.drawString(string+":", 150, 280);
		}
		
		public void moveH(MinuteClass m){
			System.out.println("minute get ## "+m.getmin() );
			int minute = m.getmin(); 
			
			if (minute ==59){
				chk = true;
			}
			if( m.getmin()==59 && hou <60){
				
				if(chk){
					hou += 1;
					chk = false;
				}
				
				
				if(hou == 60){
					hou = 0;
				}
				
				if(hou < 10){
					string = "0"+hou;
				}else{
					string = ""+hou;
				}
				
				System.out.println("hour get ## " + hou );
			}
		}
}
