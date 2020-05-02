package play;


<<<<<<< HEAD:Game/src/play/MainPanel.java
=======
//package Game;

>>>>>>> 2ca964fe9636b530e612ee062a612bee9cb8ef43:Game/src/MainPanel.java
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainPanel extends JPanel {
    JButton btn,btn2,btn3;
    JLabel paneltitle;
    MainFrame mf;
    String str;
<<<<<<< HEAD:Game/src/play/MainPanel.java
    
    int iii = 0;
    public MainPanel(MainFrame m,String s){

=======
 

    public MainPanel(MainFrame m,String s){
    	
>>>>>>> 2ca964fe9636b530e612ee062a612bee9cb8ef43:Game/src/MainPanel.java
        mf = m;
        str = s;
        this.setName("mp");
        this.setLayout(null);
<<<<<<< HEAD:Game/src/play/MainPanel.java
        this.setSize(400, 200);

      //write///////////////
        
       // if(iii == 0) {
        mf.setBounds(0, 0, 1000, 600);
        ImageIcon i = new ImageIcon("src/game/violet.jpg");
        ImageIcon resized = PictureBuilder.resizeIcon(i,1000, 600);
        JLabel l = new JLabel(i);
    	mf.add(l);
    	mf.setVisible(true);
    	iii = 1;
      //  }
        
       
        /////////////////////

=======
        this.setSize(1000, 600);
>>>>>>> 2ca964fe9636b530e612ee062a612bee9cb8ef43:Game/src/MainPanel.java
        //ここ変えると文字の表示と位置選択////////////////////////////////////
        paneltitle = new JLabel("これは"
                +getClass().getCanonicalName()+"クラスのパネルです");
        paneltitle.setBounds(0, 5, 400, 40);
        //////////////////////////////////////////////////////////////////////
        this.add(paneltitle);
        
        mf.setBounds(0, 0, 1000, 600);
        ImageIcon i = new ImageIcon("g1.jpg");
        ImageIcon resized = PictureBuilder.resizeIcon(i,1000, 600);
        JLabel l = new JLabel(resized);
    	mf.add(l);
    	mf.setVisible(true);
    	

        // ボタン追加//////////////////////////////////////////////////////////
        btn = new JButton("SubPanelに移動");
        btn.setBounds(20, 50, 150, 40);
        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                pc(mf.PanelNames[1]);
            }
        });
        this.add(btn);
        btn2 = new JButton("SubPanel2に移動");
        btn2.setBounds(20, 100, 150, 40);
        btn2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                pc(mf.PanelNames[2]);
            }
        });
        this.add(btn2);
        btn3 = new JButton("SubPanel3に移動");
        btn3.setBounds(200, 100, 150, 40);
        btn3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                pc(mf.PanelNames[3]);
            }
        });
        this.add(btn3);
        /////////////////////////////////////////////////////////////////////////

        //h - 色相成分,s - 色の彩度,b - 色の明度/////////////////////////////////
<<<<<<< HEAD:Game/src/play/MainPanel.java
       // this.setBackground(Color.getHSBColor(65, 0.7f, 0.9f));
        /////////////////////////////////////////////////////////////////////////

=======
       // this.setBackground(new Color(0, 0, 255));
        /////////////////////////////////////////////////////////////////////////
        
        this.setVisible(true);
>>>>>>> 2ca964fe9636b530e612ee062a612bee9cb8ef43:Game/src/MainPanel.java

    }
    public void pc(String str){
        mf.PanelChange((JPanel)this, str);
    }
   
}