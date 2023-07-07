package sub2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class ComponentsTest {

	private JFrame frame;
	private JTextField txtUid;
	private JTextField txtHp;
	private JTextField txtName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentsTest window = new ComponentsTest();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ComponentsTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 537);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btn1 = new JButton("확인");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int answer =JOptionPane.showConfirmDialog(null, "버튼3 클릭...","확인대화상자",JOptionPane.YES_NO_OPTION);
				
				if(answer == 0) {
					System.out.println("YES 클릭...");
				}else {
					System.out.println("NO 클릭...");
				}
			}
		});
		btn1.setFont(new Font("굴림", Font.PLAIN, 12));
		btn1.setBounds(12, 179, 73, 23);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("종료");
		btn2.setFont(new Font("Gulim", Font.PLAIN, 12));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "종료하시겠습니까?");
			}
		});
		btn2.setBounds(182, 179, 73, 23);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("뒤로");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼1 클릭...");
			}
		});
		btn3.setFont(new Font("굴림", Font.PLAIN, 12));
		btn3.setBounds(97, 179, 73, 23);
		frame.getContentPane().add(btn3);
		
		JLabel lblNewLabel = new JLabel("TextField 실습");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 12));
		lblNewLabel.setBounds(12, 32, 141, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("아이디");
		lblNewLabel_1.setBounds(12, 57, 57, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("이름");
		lblNewLabel_2.setBounds(12, 82, 57, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("휴대폰");
		lblNewLabel_3.setBounds(12, 110, 57, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		txtUid = new JTextField();
		txtUid.setBounds(51, 54, 87, 21);
		frame.getContentPane().add(txtUid);
		txtUid.setColumns(10);
		
		txtHp = new JTextField();
		txtHp.setColumns(10);
		txtHp.setBounds(51, 107, 87, 21);
		frame.getContentPane().add(txtHp);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(51, 79, 87, 21);
		frame.getContentPane().add(txtName);
		
		JLabel lbUid = new JLabel("결과:");
		lbUid.setBounds(235, 57, 187, 15);
		frame.getContentPane().add(lbUid);
		
		JLabel lbName = new JLabel("결과:");
		lbName.setBounds(235, 82, 187, 15);
		frame.getContentPane().add(lbName);
		
		JLabel lbHp = new JLabel("결과:");
		lbHp.setBounds(235, 110, 187, 15);
		frame.getContentPane().add(lbHp);
		
		
		JButton btnUid = new JButton("확인");
		btnUid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String uid = txtUid.getText();
				
				lbUid.setText("결과: "+uid);
			}
		});
		btnUid.setBounds(150, 53, 73, 23);
		frame.getContentPane().add(btnUid);
		
		JButton btnName = new JButton("확인");
		btnName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name = txtName.getText();
				lbName.setText("결과: "+name);
			}
		});
		btnName.setBounds(150, 78, 73, 23);
		frame.getContentPane().add(btnName);
		
		JButton btnHp = new JButton("확인");
		btnHp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String hp = txtHp.getText();
				lbHp.setText("결과: "+hp);
			}
		});
		btnHp.setBounds(150, 106, 73, 23);
		frame.getContentPane().add(btnHp);
		
		
		JLabel lblBotton = new JLabel("Botton 실습");
		lblBotton.setFont(new Font("굴림", Font.BOLD, 12));
		lblBotton.setBounds(12, 154, 141, 15);
		frame.getContentPane().add(lblBotton);
		
		JLabel lblNewLabel_5 = new JLabel("Component Test");
		lblNewLabel_5.setFont(new Font("굴림", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(12, 10, 158, 15);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_4 = new JLabel("CheckBox 실습");
		lblNewLabel_4.setFont(new Font("굴림", Font.BOLD, 12));
		lblNewLabel_4.setBounds(12, 234, 181, 15);
		frame.getContentPane().add(lblNewLabel_4);
		
		JCheckBox chk1 = new JCheckBox("사과");
		chk1.setBounds(8, 252, 61, 23);
		frame.getContentPane().add(chk1);
		
		JCheckBox chk2 = new JCheckBox("딸기");
		chk2.setBounds(73, 252, 61, 23);
		frame.getContentPane().add(chk2);
		
		JCheckBox chk3 = new JCheckBox("포도");
		chk3.setBounds(138, 252, 61, 23);
		frame.getContentPane().add(chk3);
		
		JCheckBox chk4 = new JCheckBox("수박");
		chk4.setBounds(203, 252, 61, 23);
		frame.getContentPane().add(chk4);
		
		JCheckBox chk5 = new JCheckBox("참외");
		chk5.setBounds(268, 252, 61, 23);
		frame.getContentPane().add(chk5);
		
		JLabel lbChkFruit = new JLabel("선택한 과일:");
		lbChkFruit.setBounds(12, 281, 288, 15);
		frame.getContentPane().add(lbChkFruit);
		
		JButton btnChkFruit = new JButton("확인");
		btnChkFruit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<String> fruits = new ArrayList<>();
				
				if(chk1.isSelected()) {
					
					fruits.add(chk1.getText());
					
				}
				if(chk2.isSelected()) {
					
					fruits.add(chk2.getText());
					
				}
				if(chk3.isSelected()) {
					
					fruits.add(chk3.getText());
					
				}
				
				if(chk4.isSelected()) {
	
					fruits.add(chk4.getText());
	
				}
				if(chk5.isSelected()) {
					
					fruits.add(chk5.getText());
	
				}

				lbChkFruit.setText("선택한 과일: "+ fruits);
				
			}
		});
		btnChkFruit.setBounds(340, 252, 73, 23);
		frame.getContentPane().add(btnChkFruit);
		
		
	}
}
