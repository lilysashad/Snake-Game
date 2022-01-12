import javax.swing.JFrame;

public class GameFrame extends JFrame{

	GameFrame(){
		
		this.add(new GamePanel());
		
		this.setTitle("Snake");

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setResizable(false);
		
		this.pack(); //components will be fit into Jframe
		
		this.setVisible(true);
		
		this.setLocationRelativeTo(null); //centers game onto screen
		
	}
	
}
