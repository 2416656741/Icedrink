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
import vo.UserInfo;
import daoimpl.UserInfoDaoLpml;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Alterxiugaixinxi extends JDialog {
	private JTextField xingmingtxt;
	private JTextField xingbietxt;
	private JTextField dianhuatxt;
	private JTextField youxiangtxt;
	public  UserInfo  userinfo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Alterxiugaixinxi dialog = new Alterxiugaixinxi();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Alterxiugaixinxi() {
		setTitle("\u4FEE\u6539\u7528\u6237\u4FE1\u606F");
		setModal(true);
		setAlwaysOnTop(true);
		setBounds(100, 100, 532, 341);
		JLabel lblNewLabel = new JLabel("\u59D3\u540D\uFF1A");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 17));
		JLabel lblNewLabel_1 = new JLabel("\u6027\u522B\uFF1A");
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 17));
		JLabel lblNewLabel_2 = new JLabel("\u7535\u8BDD\uFF1A");
		lblNewLabel_2.setFont(new Font("宋体", Font.PLAIN, 17));
		JLabel lblNewLabel_3 = new JLabel("\u90AE\u7BB1\uFF1A");
		lblNewLabel_3.setFont(new Font("宋体", Font.PLAIN, 17));
		xingmingtxt = new JTextField();
		xingmingtxt.setFont(new Font("宋体", Font.PLAIN, 17));
		xingmingtxt.setColumns(10);
		xingbietxt = new JTextField();
		xingbietxt.setFont(new Font("宋体", Font.PLAIN, 17));
		xingbietxt.setColumns(10);
		dianhuatxt = new JTextField();
		dianhuatxt.setFont(new Font("宋体", Font.PLAIN, 17));
		dianhuatxt.setColumns(10);
		youxiangtxt = new JTextField();
		youxiangtxt.setFont(new Font("宋体", Font.PLAIN, 17));
		youxiangtxt.setColumns(10);
		JButton btnNewButton = new JButton("\u786E\u8BA4\u4FEE\u6539");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xiufaiactionPerformed();
			}
		});
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 15));
		JButton btnNewButton_1 = new JButton("\u5237\u65B0");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				shuaxinactionPerformed();
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
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(50)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnNewButton)
							.addGap(54)
							.addComponent(btnNewButton_1)
							.addGap(41)
							.addComponent(btnNewButton_2))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel)
								.addComponent(lblNewLabel_1)
								.addComponent(lblNewLabel_2)
								.addComponent(lblNewLabel_3))
							.addGap(61)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(dianhuatxt)
								.addComponent(xingmingtxt)
								.addComponent(youxiangtxt, GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
								.addComponent(xingbietxt))))
					.addContainerGap(92, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(36)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(xingmingtxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel_1)
							.addGap(30)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_2)
								.addComponent(dianhuatxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addComponent(xingbietxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(30)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(youxiangtxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnNewButton_1)
						.addComponent(btnNewButton_2))
					.addGap(28))
		);
		getContentPane().setLayout(groupLayout);
	}
	// 返回功能
		protected void fanhuiactionPerformed() {
			dispose();	
		}
	//刷新功能
		public void shuaxin(){
			xingmingtxt.setText(DengLu.userinfo.getUname());
			xingbietxt.setText(DengLu.userinfo.getUsex());
			dianhuatxt.setText(DengLu.userinfo.getUphone().toString());
			youxiangtxt.setText(DengLu.userinfo.getUemail());	
		}
		//刷新事件的实现
	    protected void shuaxinactionPerformed() {
			shuaxin();
		}
	    //修改用户信息
		protected void xiufaiactionPerformed() {
			userinfo = new UserInfo();
			String a = xingmingtxt.getText();
			String as = xingbietxt.getText();
			String asd = dianhuatxt.getText();
			String asdf  = youxiangtxt.getText();
			boolean d = BiaoDaShi.shoujihao(asd);
			boolean dd = BiaoDaShi.youxiang(asdf);
			if(d == false || dd == false){
				JOptionPane.showMessageDialog(null, "邮箱或者电话号格式有问题！！！");
			}
			else
			{
				UserInfoDaoLpml sd = new UserInfoDaoLpml();
				userinfo.setUid(DengLu.userinfo.getUid());
				userinfo.setUname(a);
				userinfo.setUsex(as);
				userinfo.setUphone(Long.valueOf(asd));
				userinfo.setUemail(asdf);
				boolean  poi = sd.UserInfoalter(userinfo);
				if(poi == true){
					JOptionPane.showMessageDialog(null, "修改成功");
					DengLu.userinfo.setUid(userinfo.getUid());
					DengLu.userinfo.setUname(userinfo.getUname());
					DengLu.userinfo.setUsex(userinfo.getUsex());
					DengLu.userinfo.setUphone(userinfo.getUphone());
					DengLu.userinfo.setUemail(userinfo.getUemail());
					shuaxin();
				}
				else{
					JOptionPane.showMessageDialog(null, "修改失败");
				}		
			}
			
			
		}

}
