import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame{

	public String[] PanelNames = {"A","B"};//この名前でパネルの指定をする

	 //各種パネルを作成
    FrameA frameA = new FrameA(this, PanelNames[0]);
    FrameB frameB = new FrameB(this, PanelNames[1]);


	    public Main(){
	    	
	        this.add(frameA);	//this省略可、thisはmainFrame
	        frameA.setVisible(true);  //MainPanelを表示

	        this.add(frameB);
	        frameB.setVisible(false);	//非表示

	        this.setBounds(100, 100, 400, 300);//フレームサイズ位置設定
	    }


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	     Main main = new Main();
	        main.setDefaultCloseOperation(EXIT_ON_CLOSE);
	        main.setVisible(true);

	}

	 public void reloadPage(String reloadPanelName){
	        if(reloadPanelName == PanelNames[0]){
	            this.remove(this.frameA);	//remove「削除」
	            FrameA frameA = new FrameA(this,PanelNames[0]);
	            this.add(frameA);
	        }
	        else if(reloadPanelName == PanelNames[1]){
	            this.remove(this.frameB);
	            FrameB frameB = new FrameB(this,PanelNames[1]);
	            this.add(frameB);
	        }

	    }

	 public void showFrameA(JPanel nowPanel){
	        nowPanel.setVisible(false);
	        frameA.setVisible(true);
	    }

	    //タスク登録パネルを表示
	    public void showFrameB(JPanel nowPanel){
	        nowPanel.setVisible(false);
	        frameB.setVisible(true);
	    }

}
