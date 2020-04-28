import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame{
    public String[] PanelNames = {"main","register","edit"};//この名前でパネルの指定をする

    //各種パネルを作成
    MainPanel mainPanel = new MainPanel(this,PanelNames[0]);
    TaskRegisterPanel taskRegisterPanel = new TaskRegisterPanel(this,PanelNames[1]);
    TaskEditPanel taskEditPanel = new TaskEditPanel(this,PanelNames[2]);

    public MainFrame(){
        this.add(mainPanel);	//this省略可、thisはmainFrame
        mainPanel.setVisible(true);  //MainPanelを表示

        this.add(taskRegisterPanel);
        taskRegisterPanel.setVisible(false);	//他の二つを非表示

        this.add(taskEditPanel);
        taskEditPanel.setVisible(false);	//他の二つを非表示

        this.setBounds(100, 100, 1200, 800);	//フレームサイズ位置設定
    }

    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }

    //ページの再描画用
    //mainPanelはこれをしないと変更が表示に反映されない
    //一応他の二つのパネル分も…
    public void reloadPage(String reloadPanelName){
        if(reloadPanelName == PanelNames[0]){
            this.remove(this.mainPanel);	//remove「削除」
            MainPanel mainPanel = new MainPanel(this,PanelNames[0]);
            this.add(mainPanel);
        }
        else if(reloadPanelName == PanelNames[1]){
            this.remove(this.taskRegisterPanel);
            TaskRegisterPanel taskRegisterPanel = new TaskRegisterPanel(this,PanelNames[1]);
            this.add(taskRegisterPanel);
        }
        else if(reloadPanelName == PanelNames[2]){
            this.remove(this.taskEditPanel);
            TaskEditPanel taskEditPanel = new TaskEditPanel(this,PanelNames[2]);
            this.add(taskEditPanel);
        }
    }

    //パネル遷移メソッド
    //あらかじめ全パネルを作成して表示、非表示を切り替える方式

    //メインパネルを表示
    public void showMainPanel(JPanel nowPanel){
        nowPanel.setVisible(false);
        mainPanel.setVisible(true);
    }

    //タスク登録パネルを表示
    public void showRegisterPanel(JPanel nowPanel){
        nowPanel.setVisible(false);
        taskRegisterPanel.setVisible(true);
    }
    
    //タスク編集パネルを表示
    public void showEditPanel(JPanel nowPanel, TaskDto task){
        nowPanel.setVisible(false);
        //初期文字列を設定
        taskEditPanel.setEditString(task);
        taskEditPanel.setVisible(true);
    }
}
