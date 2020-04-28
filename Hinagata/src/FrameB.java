import java.awt.event.ActionEvent;

import javax.swing.JPanel;



public class FrameB extends JPanel{


    Main main;

    //panel作成
    FrameB(Main mf,String  name){
        main = mf;
        this.setName(name);


    }


    public void actionPerformed(ActionEvent e){
        //ボタンを押したとき選択中の要素をdtoにセット
    	panelChangeToFrameA(main.PanelNames[0]);

        }


    public void panelChangeToFrameA(String toPanelName){
        main.showFrameA((JPanel)this);
    }


}
