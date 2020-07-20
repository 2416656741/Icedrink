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
import javax.swing.LayoutStyle.ComponentPlacement;

import daoimpl.MoneyJieKouIpml;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Invest extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField chongzhitxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Invest dialog = new Invest();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Invest() {
		setModal(true);
		setTitle("\u5145\u503C");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		JLabel lblNewLabel = new JLabel("\u6B22\u8FCE\u5145\u503C");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 33));
		JLabel lblNewLabel_1 = new JLabel("\u5145\u503C\u91D1\u989D:");
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 20));
		chongzhitxt = new JTextField();
		chongzhitxt.setFont(new Font("宋体", Font.PLAIN, 20));
		chongzhitxt.setColumns(10);
		JButton btnNewButton = new JButton("\u786E\u8BA4\u5145\u503C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chongzhiactionPerformed();
			}
		});
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 13));
		JButton btnNewButton_1 = new JButton("\u8FD4\u56DE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fanhuiactionPerformed();
			}
		});
		btnNewButton_1.setFont(new Font("宋体", Font.PLAIN, 13));
		JButton btnNewButton_2 = new JButton("\u91CD\u7F6E");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chongactionPerformed();
			}
		});
		this.setLocationRelativeTo(null);
		btnNewButton_2.setFont(new Font("宋体", Font.PLAIN, 13));
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(57)
							.addComponent(lblNewLabel_1))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(48)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)))
					.addGap(32)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(btnNewButton_2)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnNewButton_1))
						.addComponent(chongzhitxt, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(11, Short.MAX_VALUE))
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(136)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(136, Short.MAX_VALUE))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(18)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
					.addGap(27)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(chongzhitxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_2)
						.addComponent(btnNewButton_1))
					.addGap(44))
		);
		contentPanel.setLayout(gl_contentPanel);
	}
	//返回实现 
    protected void fanhuiactionPerformed() {
		dispose();
		
	}
	//重置方法
		public void chong(){
	    	chongzhitxt.setText("");
	    }
		//重置接口事件实现
		protected void chongactionPerformed() {
			chong();
		}
	//充值实现
		protected void chongzhiactionPerformed() {
			long jieguo = 0;                                      //用来存储计算后的用户余额
			long add = Long.valueOf(chongzhitxt.getText());
			long add1 = DengLu.usermoney.getBalance();
			long aaa1 = DengLu.usermoney.getUid();
			jieguo = add + add1;
			MoneyJieKouIpml aa = new MoneyJieKouIpml();            //创建moneyjiekouIpml接口对象，用来实现修改数据方法
			System.out.println(aaa1);
			System.out.println(jieguo);
			boolean aaa =  aa.moneyalter(aaa1, jieguo);            //返回值判断是否充值成功
			if(aaa == true){
				JOptionPane.showMessageDialog(null, "充值成功！！！");
				DengLu.usermoney.setBalance(jieguo);
				chong();
			}else{
				JOptionPane.showMessageDialog(null, "充值失败！！！");
				chong();
			}
			
			
			
		}

}
