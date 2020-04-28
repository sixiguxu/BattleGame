// import java.awt.Dimension;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

// import java.awt.event.ActionListener.actionPerformed();



public class FrameA extends JPanel implements ActionListener{


    Main main;

    //panel作成
    FrameA(Main mf,String  name){
        main = mf;
       this.setName(name);
        
        
       JPanel buttonPanel = new JPanel();
       JButton createButton = new JButton("新規作成");
       createButton.setPreferredSize(new Dimension(100,50));
       createButton.addActionListener(this);
      // public void actionPerformed(ActionEvent e){
       //        panelChangeToFrameB(main.PanelNames[1]);
      //     }
       add("Center", buttonPanel);
       
      // buttonPanel.add(createButton);
       setVisible(true);

    }


    	public void actionPerformed(ActionEvent e){
        //ボタンを押したとき選択中の要素をdtoにセット
    	panelChangeToFrameB(main.PanelNames[1]);

        }


    public void panelChangeToFrameB(String toPanelName){
        main.showFrameB((JPanel)this);
    }


}
