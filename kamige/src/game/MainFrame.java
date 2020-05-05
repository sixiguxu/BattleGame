package game;


import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame{

	// 画面のインスタンス作成, 追加した画面をここでインスタンス化////////////////
    public String[] PanelNames = {"mp","Sub1"};
    Title mp = new Title(this,PanelNames[0]);
    Battle sp = new Battle(this, PanelNames[1]);


    /////////////////////////////////////////////////////////////////////////////

    public MainFrame(){

    	// 1つ目画面表示、残りを非表示、サイズ位置設定, 追加した画面を非表示/////
    	this.add(mp); mp.setVisible(true);

        this.add(sp); sp.setVisible(false);

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
            mp = (Title)jp;
            mp.setVisible(false);
        }else if(name==PanelNames[1]){
            sp = (Battle)jp;
            sp.setVisible(false);
        }
        if(str==PanelNames[0]){
            mp.setVisible(true);
        }else if(str==PanelNames[1]){
            sp.setVisible(true);
        }
        ///////////////////////////////////////////////////////////////////////////////
    }
}

