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

import javax.swing.LayoutStyle.ComponentPlacement;

import tool.BiaoDaShi;
import daoimpl.UserJieKouImpl;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AltrexiugaiMiMa extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField username;
	private JTextField oldmima;
	private JTextField newmima;
	private JTextField quemima;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AltrexiugaiMiMa dialog = new AltrexiugaiMiMa();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AltrexiugaiMiMa() {
		setFont(new Font("Dialog", Font.PLAIN, 14));
		setTitle("\u5BC6\u7801\u4FEE\u6539");
		setModal(true);
		setBounds(100, 100, 555, 344);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		JLabel lblNewLabel = new JLabel("\u7528\u6237\u540D:");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 17));
		lblNewLabel.setToolTipText("");
		JLabel lblNewLabel_1 = new JLabel("\u8001\u5BC6\u7801:");
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 17));
		JLabel lblNewLabel_2 = new JLabel("\u65B0\u5BC6\u7801:");
		lblNewLabel_2.setFont(new Font("宋体", Font.PLAIN, 17));
		JLabel lblNewLabel_3 = new JLabel("\u786E\u8BA4\u5BC6\u7801:");
		lblNewLabel_3.setFont(new Font("宋体", Font.PLAIN, 17));
		username = new JTextField();
		username.setEditable(false);
		username.setFont(new Font("宋体", Font.PLAIN, 17));
		username.setColumns(10);
		oldmima = new JTextField();
		oldmima.setFont(new Font("宋体", Font.PLAIN, 17));
		oldmima.setColumns(10);
		newmima = new JTextField();
		newmima.setFont(new Font("宋体", Font.PLAIN, 17));
		newmima.setColumns(10);
		quemima = new JTextField();
		quemima.setFont(new Font("宋体", Font.PLAIN, 17));
		quemima.setColumns(10);
		this.setLocationRelativeTo(null);
		JButton btnNewButton = new JButton("\u786E\u8BA4\u4FEE\u6539");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xiugaiactionPerformed();
			}
		});
		username.setText(DengLu.user.getUlogin());
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 15));
		JButton btnNewButton_1 = new JButton("\u91CD\u7F6E");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chongzhiactionPerformed();
			}
		});
		btnNewButton_1.setFont(new Font("宋体", Font.PLAIN, 15));
		JButton btnNewButton_2 = new JButton("\u8FD4\u56DE");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fanhuiactionPerformed();
			}
		});
		btnNewButton_2.setFont(new Font("宋体", Font.PLAIN, 15));
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(70)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel)
								.addComponent(lblNewLabel_1)
								.addComponent(lblNewLabel_2)
								.addComponent(lblNewLabel_3))
							.addGap(29)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(quemima, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
								.addComponent(newmima)
								.addComponent(oldmima)
								.addComponent(username)))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(btnNewButton)
							.addGap(46)
							.addComponent(btnNewButton_1)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnNewButton_2)))
					.addContainerGap(93, Short.MAX_VALUE))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(30)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(username, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(oldmima, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(32)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2)
						.addComponent(newmima, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(quemima, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(30)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_1)
						.addComponent(btnNewButton)
						.addComponent(btnNewButton_2))
					.addContainerGap(42, Short.MAX_VALUE))
		);
		contentPanel.setLayout(gl_contentPanel);
	}
	public void chong(){
    	oldmima.setText("");
    	newmima.setText("");
    	quemima.setText("");
    }
	//重置接口事件实现
    protected void chongzhiactionPerformed() {
		chong();	
	}
	//用户修改密码
		protected void xiugaiactionPerformed() {
			long a = DengLu.user.getUid();
			String aa = DengLu.user.getUpassword();
			String aaa = newmima.getText();
			String aaaa = quemima.getText();
			String aaaaa = oldmima.getText();
			boolean b = aaaaa.equals(aaa);
			boolean bb =  BiaoDaShi.mima(aaa);
			boolean bbb = aaa.equals(aaaa);
			boolean bbbb = aaaaa.equals(DengLu.user.getUpassword());
			if(bb == false || bbb == false|| b == true ||bbbb == false){
				JOptionPane.showMessageDialog(null, "密码格式错误或者两次密码不一致 或者 新密码和老密码一样 或者 您输入的旧密码有问题！！！");
				chong();
			}
			else
			{
				UserJieKouImpl ii = new UserJieKouImpl();
				boolean dd = ii.useralter(a,aaa);
				if(dd == true){
					JOptionPane.showMessageDialog(null, "修改成功！！！");
					DengLu.user.setUpassword(aaa);
					dispose();
					
				}
				else{
					JOptionPane.showMessageDialog(null, "修改失败！！！");
				}
			}
			
			
		}
		//返回
		protected void fanhuiactionPerformed() {
			dispose();
			
		}

}
