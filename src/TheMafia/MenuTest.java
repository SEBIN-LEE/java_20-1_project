package TheMafia;
import javax.swing.*;

public class MenuTest extends JFrame {

	MenuTest(){
		setTitle("Menu ����");
		createMenu(); // Create menu
		setSize(250, 200);
		setVisible(true);
	}
	
	void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu screenMenu = new JMenu("���丮");
		
		screenMenu.add(new JMenuItem("�����Ȳ"));
		screenMenu.add(new JMenuItem("�б��� ����"));
		screenMenu.add(new JMenuItem("�����ι�"));
		screenMenu.addSeparator();
		screenMenu.add(new JMenuItem("Exit"));
		
		mb.add(screenMenu);
		mb.add(new JMenu("����"));
		mb.add(new JMenu("����"));
		mb.add(new JMenu("����"));
		setJMenuBar(mb);
	}


}
