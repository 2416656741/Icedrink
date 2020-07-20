package jframe;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.List;

import javax.swing.LayoutStyle.ComponentPlacement;

import tool.BiaoDaShi;
import vo.User;
import daoimpl.UserJieKouImpl;

public class Register extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField usertxt;
	private JTextField newusertxt;
	private JTextField querennewusertxt;
	public User user11 = new User();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Register dialog = new Register();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Register() {
		setModal(true);
		setTitle("\u7528\u6237\u6CE8\u518C");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		JLabel lblNewLabel = new JLabel("\u7528\u6237\u540D:");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 15));
		JLabel lblNewLabel_1 = new JLabel("\u5BC6\u7801:");
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 15));
		JLabel lblNewLabel_2 = new JLabel("\u786E\u8BA4\u5BC6\u7801\uFF1A");
		lblNewLabel_2.setFont(new Font("宋体", Font.PLAIN, 15));
		JButton btnNewButton = new JButton("\u6CE8\u518C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				zhuceactionPerformed();
			}
		});
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 17));
		JButton btnNewButton_1 = new JButton("\u91CD\u7F6E");
		btnNewButton_1.setFont(new Font("宋体", Font.PLAIN, 17));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chonghziactionPerformed();
				
			}
		});
		this.setLocationRelativeTo(null);
		usertxt = new JTextField();
		usertxt.setFont(new Font("宋体", Font.PLAIN, 15));
		usertxt.setColumns(10);
		newusertxt = new JTextField();
		newusertxt.setFont(new Font("宋体", Font.PLAIN, 15));
		newusertxt.setColumns(10);
		querennewusertxt = new JTextField();
		querennewusertxt.setFont(new Font("宋体", Font.PLAIN, 15));
		querennewusertxt.setColumns(10);
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(60)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel)
								.addComponent(lblNewLabel_1)
								.addComponent(lblNewLabel_2))
							.addGap(41)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(querennewusertxt)
								.addComponent(newusertxt, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
								.addComponent(usertxt)))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(77)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
							.addGap(88)
							.addComponent(btnNewButton_1)))
					.addContainerGap(89, Short.MAX_VALUE))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(37)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(usertxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(newusertxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(30)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(querennewusertxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(48)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnNewButton_1))
					.addContainerGap(48, Short.MAX_VALUE))
		);
		contentPanel.setLayout(gl_contentPanel);
	}
	//重置方法
    public void chongzhi(){
    	usertxt.setText("");
    	newusertxt.setText("");
    	querennewusertxt.setText("");
    }
  //注册业务
	protected void zhuceactionPerformed() 
	{   boolean aaa = false;
		String a =usertxt.getText();
		user11.setUlogin(a);
		String b = newusertxt.getText();
		String c = querennewusertxt.getText();
		boolean aa = BiaoDaShi.yonghuming(a);
		boolean bb = BiaoDaShi.yonghuming(b);
		boolean cc = b.equals(c);
		if(aa == false || bb == false || cc == false)
		{
			JOptionPane.showMessageDialog(null, "用户名或密码格式错误或者两次密码不一致！！！");	
		}
		else
		{
			UserJieKouImpl dd = new UserJieKouImpl();
		    List<User> list1 =dd.userSeek(user11);
		    if(list1.size()!=0)
		    {
		    	JOptionPane.showMessageDialog(null, "用户名已存在！！！");
		    }
		    else
		    {
		    	 user11.setUpassword(b);
		    	 aaa = dd.insertuser(user11);
		    	 if(aaa == true){
		    		 JOptionPane.showMessageDialog(null, "注册成功！！！");
		    		 dispose();
		    	 }
		    	 else{
		    		 JOptionPane.showMessageDialog(null, "注册失败！！！");
		    	 }
		    }
		}
	}
	//重置接口事件实现
     protected void chonghziactionPerformed() {
		
		chongzhi();
	 }
	

}
