import javax.swing.JFrame;

public class ej1 extends JFrame{
	
	public static final long serialVersionUID = 1L;
	
	
	public ej1() {
	
		this.setTitle("vENTANA PARA EXIT");
		this.setSize(300,302);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//this.setVisible(true);
		}
	public static void main(String[] args) {
		ej1 mainWindow = new ej1();
		mainWindow.setVisible(true);
	}
}
