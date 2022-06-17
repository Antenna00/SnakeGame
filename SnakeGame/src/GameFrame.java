import javax.swing.JFrame;

public class GameFrame extends JFrame{
	
	GameFrame(){
		this.add(new GamePanel());
		this.setTitle("Game");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack(); //set the frame size automatically by taking in its components.
		this.setVisible(true);
		this.setLocationRelativeTo(null);

		

		
	}
}
