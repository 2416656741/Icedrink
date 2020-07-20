package jframe;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Seekuserinfo extends JFrame {

	private JPanel contentPane;
	private JTextField xinmgingtxt;
	private JTextField xingbietxt;
	private JTextField dianhuatxt;
	private JTextField youxiangtxt;
	private JTextField tixingtxt1;
	private JTextField tixingtxt2;
	private JTextField tixintxt3;
	private JTextField tixingtxt4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Seekuserinfo frame = new Seekuserinfo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Seekuserinfo() {
		setTitle("\u7528\u6237\u4FE1\u606F\u67E5\u8BE2\u754C\u9762");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 593, 344);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("\u59D3\u540D\uFF1A");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 18));
		
		xinmgingtxt = new JTextField();
		xinmgingtxt.setFont(new Font("宋体", Font.PLAIN, 18));
		xinmgingtxt.setEditable(false);
		xinmgingtxt.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\u6027\u522B\uFF1A");
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 18));
		
		xingbietxt = new JTextField();
		xingbietxt.setFont(new Font("宋体", Font.PLAIN, 18));
		xingbietxt.setEditable(false);
		xingbietxt.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\u7535\u8BDD\uFF1A");
		lblNewLabel_2.setFont(new Font("宋体", Font.PLAIN, 18));
		
		dianhuatxt = new JTextField();
		dianhuatxt.setFont(new Font("宋体", Font.PLAIN, 18));
		dianhuatxt.setEditable(false);
		dianhuatxt.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("\u90AE\u7BB1\uFF1A");
		lblNewLabel_3.setFont(new Font("宋体", Font.PLAIN, 18));
		
		youxiangtxt = new JTextField();
		youxiangtxt.setFont(new Font("宋体", Font.PLAIN, 18));
		youxiangtxt.setEditable(false);
		youxiangtxt.setColumns(10);
		
		tixingtxt1 = new JTextField();
		tixingtxt1.setEditable(false);
		tixingtxt1.setFont(new Font("宋体", Font.PLAIN, 15));
		tixingtxt1.setColumns(10);
		
		tixingtxt2 = new JTextField();
		tixingtxt2.setFont(new Font("宋体", Font.PLAIN, 15));
		tixingtxt2.setEditable(false);
		tixingtxt2.setColumns(10);
		
		tixintxt3 = new JTextField();
		tixintxt3.setFont(new Font("宋体", Font.PLAIN, 15));
		tixintxt3.setEditable(false);
		tixintxt3.setColumns(10);
		
		tixingtxt4 = new JTextField();
		tixingtxt4.setFont(new Font("宋体", Font.PLAIN, 15));
		tixingtxt4.setEditable(false);
		tixingtxt4.setColumns(10);
		this.setLocationRelativeTo(null);
		JButton btnNewButton = new JButton("\u67E5\u8BE2");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chaxunactionPerformed();
			}
		});
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 17));
		
		JButton btnNewButton_1 = new JButton("\u8FD4\u56DE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fanhuiactionPerformed();
			}
		});
		btnNewButton_1.setFont(new Font("宋体", Font.PLAIN, 17));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(41)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel)
						.addComponent(lblNewLabel_1)
						.addComponent(lblNewLabel_2)
						.addComponent(lblNewLabel_3))
					.addGap(44)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(dianhuatxt)
						.addComponent(xingbietxt)
						.addComponent(xinmgingtxt, GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
						.addComponent(youxiangtxt, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE))
					.addGap(31)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(tixingtxt1, GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
						.addComponent(tixintxt3, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
						.addComponent(tixingtxt2, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
						.addComponent(tixingtxt4, GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(92)
					.addComponent(btnNewButton)
					.addGap(112)
					.addComponent(btnNewButton_1)
					.addContainerGap(225, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(21)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(xinmgingtxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(tixingtxt1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(xingbietxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(tixingtxt2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(21)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(dianhuatxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(tixintxt3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(20)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(youxiangtxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(tixingtxt4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_1)
						.addComponent(btnNewButton))
					.addContainerGap(31, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
    //返回功能
	protected void fanhuiactionPerformed() {
		dispose();
		
	}
   //查询功能
	protected void chaxunactionPerformed() {
		String a = "张一";
		String aa = "男";
		long  aaa = 10000000000l;
		String aaa1 = null;
		aaa1 = Long.toString(aaa);
		String aaaa ="1@qq.com";
		xinmgingtxt.setText(DengLu.userinfo.getUname());
		boolean b = a.equals(DengLu.userinfo.getUname());
		if(b == true ){
			tixingtxt1.setText("姓名为初始值,请修改!");	
		}
		xingbietxt.setText(DengLu.userinfo.getUsex());
		boolean bb = aa.equals(DengLu.userinfo.getUsex());
		if(bb == true){
			tixingtxt2.setText("性别为初始值,请修改!");
		}
		dianhuatxt.setText(DengLu.userinfo.getUphone().toString());
		boolean bbb = aaa1.equals(Long.toString(DengLu.userinfo.getUphone()));
		if(bbb == true){
			tixintxt3.setText("电话为初始值,请修改!");
		}
		youxiangtxt.setText(DengLu.userinfo.getUemail());
		boolean bbbb = aaaa.equals(DengLu.userinfo.getUemail());
		if(bbbb == true){
			tixingtxt4.setText("邮箱为初始值,请修改!");
		}	
	}
}
