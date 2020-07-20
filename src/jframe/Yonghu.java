package jframe;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Yonghu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					yonghu frame = new yonghu();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public Yonghu() {
		setTitle("\u51B7\u996E\u8BA2\u9910\u7CFB\u7EDF\u6B22\u8FCE\u60A8");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 618, 406);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("\u7528\u6237\u4E2D\u5FC3");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("\u4FEE\u6539\u5BC6\u7801");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xiugaiactionPerformed();
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_3 = new JMenu("\u4F59\u989D");
		mnNewMenu.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("\u4F59\u989D\u67E5\u8BE2");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 seekyueactionPerformed();
			}
		});
		mnNewMenu_3.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("\u5145\u503C");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				chongzhiactionPerformed();
			}
		});
		mnNewMenu_3.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_4 = new JMenu("\u4E2A\u4EBA\u4FE1\u606F");
		mnNewMenu.add(mnNewMenu_4);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("\u67E5\u8BE2\u4E2A\u4EBA\u4FE1\u606F");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seekxinxiactionPerformed();
			}
		});
		mnNewMenu_4.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("\u4FEE\u6539\u4E2A\u4EBA\u4FE1\u606F");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xactionPerformed();
			}
		});
		mnNewMenu_4.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("\u5207\u6362\u8D26\u53F7");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				qiehuanactionPerformed();
			}
		});
		mnNewMenu.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("\u9000\u51FA");
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tuichuactionPerformed();
			}
		});
		mnNewMenu.add(mntmNewMenuItem_6);
		
		JMenu mnNewMenu_1 = new JMenu("\u8BA2\u5355\u7BA1\u7406");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("\u8BA2\u5355\u67E5\u8BE2");
		mnNewMenu_1.add(mntmNewMenuItem_7);
		
		JMenu mnNewMenu_2 = new JMenu("\u70B9\u9910");
		mnNewMenu_2.setForeground(Color.BLUE);
		mnNewMenu_2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 15));
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("\u67E5\u770B\u6240\u6709\u5546\u54C1");
		mntmNewMenuItem_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chashapinactionPerformed();
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_8);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("\u606D\u559C\u8FDB\u5165");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 41));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(171, Short.MAX_VALUE)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 287, GroupLayout.PREFERRED_SIZE)
					.addGap(134))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(107)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(175, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	//查商品
	protected void chashapinactionPerformed() {
		Seekfoods aa = new Seekfoods();
		aa.setVisible(true);
		
	}
	//修改个人信息
	protected void xactionPerformed() {
		Alterxiugaixinxi aaa = new Alterxiugaixinxi();
		aaa.setVisible(true);
		
	}
	//查询个人信息
	protected void seekxinxiactionPerformed() {
		Seekuserinfo hhh = new Seekuserinfo();
		hhh.setVisible(true);		
	}
	//切换账号
	protected void qiehuanactionPerformed() {
		DengLu sdf = new DengLu();
		dispose();
		sdf.setVisible(true);
		
	}
	//退出
	protected void tuichuactionPerformed() {
		dispose();
		
	}
	//充值
	protected void chongzhiactionPerformed() {
		Invest aa = new Invest();
		aa.setVisible(true);
		
	}
	//查询余额
    protected void seekyueactionPerformed() {
		YuE aa = new YuE();
		aa.setVisible(true);	
	}
    //修改用户密码
	protected void xiugaiactionPerformed() {
		AltrexiugaiMiMa oiu = new AltrexiugaiMiMa();
		oiu.setVisible(true);
		
	}
}
