package game;



import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Title extends JPanel {
	
    JButton btn,btn2;
    JLabel paneltitle;
    MainFrame mf;
    String str;

    Image bgi;

    public Title(MainFrame m,String s){

        mf = m;
        str = s;
        this.setName("mp");
        this.setLayout(null);
        this.setSize(1000, 600);

      //背景///////////////////////////////////////////////////////////////
        bgi = Toolkit.getDefaultToolkit().createImage("violet.jpg");
        setOpaque(false);
      //////////////////////////////////////////////////////////////////////

/* image = ok, button = not ver
        ImageIcon i = new ImageIcon("src/game/violet.jpg");
        ImageIcon resized = PictureBuilder.resizeIcon(i,1000, 600);
        JLabel l = new JLabel(resized);
        l.setbounds()
        l.setLocation(0,0);
    	this.add(l);
    	this.setVisible(true);
*/

        /////////////////////

      //ここ変えると文字の表示と位置選択////////////////////////////////////
        paneltitle = new JLabel("タイトル");
        paneltitle.setBounds(350, -30, 400, 300);
        paneltitle.setFont(new Font("MS ゴシック",Font.BOLD,55));
        //////////////////////////////////////////////////////////////////////
        this.add(paneltitle);

        // ボタン追加//////////////////////////////////////////////////////////
        btn = new JButton("EASY");
       
        btn.setBounds(350, 250, 300, 100);
        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                pc(mf.PanelNames[1]);
            }
        });

        this.add(btn);
        btn2 = new JButton("SubPanel2に移動");
        btn2.setBounds(350, 400, 300, 100);
        btn2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                pc(mf.PanelNames[2]);
            }
        });
        this.add(btn2);
     
        /////////////////////////////////////////////////////////////////////////

        //h - 色相成分,s - 色の彩度,b - 色の明度/////////////////////////////////
       // this.setBackground(Color.getHSBColor(65, 0.7f, 0.9f));
        /////////////////////////////////////////////////////////////////////////

    }
    public void pc(String str){
        mf.PanelChange((JPanel)this, str);
    }

    public void paint(Graphics g) {
    	g.drawImage(bgi, 0, 0, this); // 背景イメージを描画
    	super.paint(g); // 子供コンポーネントの描画等、上位クラスで実現している表示内容の描画
    	}
    	}