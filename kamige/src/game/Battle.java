package game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class Battle extends JPanel {
    
	Image bgi;
	
    public Battle(MainFrame m,String s){
    	
    	//背景///////////////////////////////////////////////////////////////
        bgi = Toolkit.getDefaultToolkit().createImage("violet.jpg");
        setOpaque(false);
      //////////////////////////////////////////////////////////////////////

    }
    
    public void paint(Graphics g) {
    	g.drawImage(bgi, 0, 0, this); // 背景イメージを描画
    	super.paint(g); // 子供コンポーネントの描画等、上位クラスで実現している表示内容の描画
    	}

}
