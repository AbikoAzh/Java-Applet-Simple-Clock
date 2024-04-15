package pClock;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class MTime extends Applet implements Runnable{

	int Width = 700 , Height =500;
	int hour,minute,second;
	int xmove;
	Thread thread;
	MinuteClass minclass;
	SecondClass secclass;
	HourClass hourclass;
	
	@Override
	public void init() {
		// TODO Auto-generated method stub
		this.resize(Width,Height);
		
		secclass = new SecondClass();
		minclass = new MinuteClass();
		hourclass = new HourClass(); 
		
		thread= new Thread(this);
		thread.start();
		
		xmove =1;
		hour = 11;
		minute = 00;
		second = 00;
		
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
//		g.setColor(Color.BLACK);
//		g.setFont(new Font("",Font.PLAIN,120));
//		g.drawString(String.valueOf(hour)+":", 150, 280);
	
		secclass.drawS(g);
		minclass.drawM(g);
		hourclass.drawH(g);
	}

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(;;){
			secclass.moveS();
			minclass.moveM(secclass);
			hourclass.moveH(minclass);
			repaint();
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
}
