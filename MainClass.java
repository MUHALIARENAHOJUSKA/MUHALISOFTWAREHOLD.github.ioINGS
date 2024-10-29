import java.awt.Component;

import javax.swing.JFrame;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    JFrame obj = new JFrame();
    GamePlay gamePlay = new GamePlay();
    obj.setBounds(10, 10, 700, 600);
    
    
    obj.setTitle("BRICK BREAKER GAME BY MUHALI AJ ");
    obj.setResizable(false);
    obj.setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    obj.add(gamePlay);
    
	}

	private static void setDefaultCloseOperation(int exitOnClose) {
		// TODO Auto-generated method stub
		
	}

}
