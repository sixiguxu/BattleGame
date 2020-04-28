import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class TaskRegisterPanel extends JPanel{

    MainFrame mainFrame;

    //panel作成
    TaskRegisterPanel(MainFrame mf,String  name){
        mainFrame = mf;
        this.setName(name);

        //[中略]

        //ボタン配置
        JPanel buttonPanel = new JPanel();
        JButton createButton = new JButton("新規作成");
        createButton.setPreferredSize(new Dimension(100,50));
        createButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                panelChangeToRegister(mainFrame.PanelNames[1]);
            }
        });
        buttonPanel.add(createButton);

        JButton editButton = new JButton("タスクを編集");
        editButton.setPreferredSize(new Dimension(100,50));
        editButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //ボタンを押したとき選択中の要素をdtoにセット
                TaskDto task = setTaskDtoFromSelectedString();
                if(!isNotSelectedError){
                    panelChangeToEdit(mainFrame.PanelNames[2], task);
                }
            }
        });
        buttonPanel.add(editButton);
    }

    public void panelChangeToRegister(String toPanelName){
        mainFrame.showRegisterPanel((JPanel)this);
    }

    public void panelChangeToEdit(String toPanelName, TaskDto task){
        mainFrame.showEditPanel((JPanel)this, task);
    }
}


