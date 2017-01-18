import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LoginGUI_Client {
	
	private JFrame frame;
	private JButton btn_login;
	private JLabel lbl_user, lbl_pass;
	private TextField txtfld_user;
	private TextField txtfld_pass;
	
	public LoginGUI_Client() {
		// TODO Auto-generated constructor stub
		
		frame = new JFrame("Messenger");
		frame.setSize(300, 150);
		frame.setLayout(new FlowLayout());
		
		JPanel jPanel = new JPanel(new BorderLayout());
		JPanel jPanel2 = new JPanel(new BorderLayout());
		btn_login = new JButton("login");
		lbl_user = new JLabel("User Name  ");
		lbl_pass = new JLabel("Password   ");
		txtfld_user = new TextField(20);
		txtfld_pass = new TextField(20);
			
		jPanel.add(lbl_user, BorderLayout.WEST );
		jPanel.add(txtfld_user,BorderLayout.CENTER);
		
		frame.add(jPanel);
		
		jPanel2.add(lbl_pass, BorderLayout.WEST);
		jPanel2.add(txtfld_pass, BorderLayout.CENTER);
		
		frame.add(jPanel2);
		
		frame.add(btn_login);

		frame.setVisible(true);		
	}
	
}
