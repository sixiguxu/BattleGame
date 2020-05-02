package play;


//package Game;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame{
    
	// 画面のインスタンス作成, 追加した画面をここでインスタンス化////////////////
    public String[] PanelNames = {"mp","Sub1","Sub2","Sub3"};
    MainPanel mp = new MainPanel(this,PanelNames[0]);
    SubPanel sp = new SubPanel(this, PanelNames[1]);
    SubPanel sp2 = new SubPanel(this,PanelNames[2]);
    SubSubPanel sp3 = new SubSubPanel(this,PanelNames[3]);
    /////////////////////////////////////////////////////////////////////////////

    public MainFrame(){
    	
    	// 1つ目画面表示、残りを非表示、サイズ位置設定, 追加した画面を非表示/////
    	this.add(mp); mp.setVisible(true);
        
        this.add(sp); sp.setVisible(false);
        this.add(sp2); sp2.setVisible(false);
        this.add(sp3); sp3.setVisible(false);
        this.setBounds(100, 100, 1000, 600);
        /////////////////////////////////////////////////////////////////////////
    }
    public static void main(String[] args) {
        
    	MainFrame mf = new MainFrame();
        mf.setDefaultCloseOperation(EXIT_ON_CLOSE);
        mf.setVisible(true);
    }
    public void PanelChange(JPanel jp, String str){
       
        System.out.println(jp.getName());
        String name = jp.getName();
        
        //追加した画面をここに追加////////////////////////////////////////////////
        if(name==PanelNames[0]){
            mp = (MainPanel)jp;
            mp.setVisible(false);
        }else if(name==PanelNames[1]){
            sp = (SubPanel)jp;
            sp.setVisible(false);
        }else if(name==PanelNames[2]){
            sp2 = (SubPanel)jp;
            sp2.setVisible(false);
        }else if(name==PanelNames[3]){
            sp3 = (SubSubPanel)jp;
            sp3.setVisible(false);
        }
        if(str==PanelNames[0]){
            mp.setVisible(true);
        }else if(str==PanelNames[1]){
            sp.setVisible(true);
        }else if(str==PanelNames[2]){
            sp2.setVisible(true);
        }else if(str==PanelNames[3]){
            sp3.setVisible(true);
        }
        ///////////////////////////////////////////////////////////////////////////////
    }
}

