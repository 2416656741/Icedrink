package jframe;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;








import daoimpl.UserInfoDaoLpml;
import daoimpl.MoneyJieKouIpml;
import daoimpl.UserJieKouImpl;
import tool.BiaoDaShi;
import vo.Money;
import vo.User;
import vo.UserInfo;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.List;
import java.util.Vector;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class DengLu extends JFrame {

	private JPanel contentPane;
	private JTextField usernametxt;
	private JPasswordField userpasswordtxt;
	static public  User user ;      //��̬�û���
	public User user1;
	public List<User> list1;
	public static Money usermoney;  //��̬Ǯ����
	public static UserInfo userinfo;  //��̬�û���Ϣ��
	public MoneyJieKouIpml app = new MoneyJieKouIpml();
	public UserInfoDaoLpml aii = new UserInfoDaoLpml();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DengLu frame = new DengLu();
					frame.setVisible(true);
					frame.setResizable(false);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DengLu() {
		setTitle("\u51B7\u996E\u767B\u5F55\u7CFB\u7EDF");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 386);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 204));
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		usernametxt = new JTextField();
		usernametxt.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\u7528\u6237\u540D:");
		lblNewLabel.setFont(new Font("����", Font.PLAIN, 15));
		
		JLabel lblNewLabel_1 = new JLabel("\u51B7\u996E\u6B22\u8FCE\u4F60");
		lblNewLabel_1.setFont(new Font("΢���ź�", Font.PLAIN, 24));
		
		JLabel label = new JLabel("");
		
		JLabel lblNewLabel_2 = new JLabel("\u5BC6\u7801\uFF1A");
		lblNewLabel_2.setFont(new Font("����", Font.PLAIN, 15));
		
		
		JButton btnNewButton = new JButton("\u767B\u5F55");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logoinactionPerformed(e);
				
			}
		});
		this.setLocationRelativeTo(null);
		userpasswordtxt = new JPasswordField();
		userpasswordtxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyText(e.getKeyCode()).compareToIgnoreCase("Enter")==0) 
				{ 
					btnNewButton.doClick();
				}
			}
		});
		
		JButton btnNewButton_1 = new JButton("\u91CD\u7F6E");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chongzhiactionPerformed(e);
			}
		});
		
		JButton btnNewButton_2 = new JButton("\u6CE8\u518C");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				zhuceactionPerformed(e);
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(161)
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(73)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnNewButton)
									.addPreferredGap(ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
									.addComponent(btnNewButton_2)
									.addGap(47)
									.addComponent(btnNewButton_1))
								.addComponent(label)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_2))
									.addGap(35)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(usernametxt, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
										.addComponent(userpasswordtxt, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))))))
					.addContainerGap(122, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(48)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(usernametxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(43)
					.addComponent(label)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(userpasswordtxt, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
					.addComponent(btnNewButton_1)
						.addComponent(btnNewButton_2))
					.addGap(41))
		);
		contentPane.setLayout(gl_contentPane);
	}
	//���÷���

		public void chongzhi(){
			usernametxt.setText("");
			userpasswordtxt.setText("");	
		}
    //ע��
	protected void zhuceactionPerformed(ActionEvent e) {
		Register pp = new Register();
		pp.setVisible(true);
		
	}
   //���ýӿ�ʵ��
	protected void chongzhiactionPerformed(ActionEvent e) {
		chongzhi();
		
	}
	
	//��¼ģ��
	protected void logoinactionPerformed(ActionEvent e) {
		String a = usernametxt.getText();
		String b = userpasswordtxt.getText();
		boolean aa = BiaoDaShi.yonghuming(a);
		boolean bb = BiaoDaShi.mima(b);
		if(aa == false || bb == false )//�ж������ʽ����
		{
			JOptionPane.showMessageDialog(null, "�û����������ʽ���󣡣���");
			chongzhi();
		}
		else
		{
		    user1 = new User();
		    user1.setUlogin(a);
		    user1.setUpassword(b);
 		    UserJieKouImpl dd = new UserJieKouImpl();
 		    
		    list1 =dd.userSeek(user1);
		    if(list1.size()!=0){       //�ж��û��б��Ƿ�Ϊ��
			    if(list1.size()== 1)   //�ж��û��б��Ƿ�Ϊ1
			    {
				    for (User user1 : list1)
				    {
				    	user = new User();
					    user.setUid(user1.getUid());             //
					    user.setUlogin(user1.getUlogin());       //������д����̬����user��
					    user.setUpassword(user1.getUpassword());
					    user.setUlimit(user1.getUlimit());
					    if(user.getUlimit()==1){                  //�ж�Ȩ�� Ȩ��Ϊ1���û���ʱ ����Ǯ������Ϣ��
						    dispose();
						    JFrame yonghujframe = new Yonghu();
						    yonghujframe.setVisible(true);
						    yonghujframe.setResizable(false);
						    yonghujframe.setLocationRelativeTo(null);
						    Money qwe = app.moneyseek(user.getUid());
						    UserInfo wer = aii.UserInfoseek(user.getUid());
						    if(qwe == null){                     //�ж�Ǯ���û��Ƿ�ӵ�� ��ӵ������
						    	 long yt = 0;
						    	 app.moneyinsert(user.getUid());	
						    	 usermoney = new Money();
							     usermoney.setUid(user.getUid());
							     usermoney.setBalance(yt);
						    }
						    else{
						        usermoney = new Money();
						        usermoney.setUid(user.getUid());
						        usermoney.setBalance(qwe.getBalance());
						    }
						    if(wer == null){                         //�ж��û���Ϣ�Ƿ�ӵ�� ��ӵ�������
						    	userinfo = new UserInfo();
						    	long bbn = 10000000000l;
						    	aii.UserInfoinsert(user.getUid());
						    	userinfo.setUid(user.getUid());
						    	userinfo.setUname("��һ");
						    	userinfo.setUsex("��");
						    	userinfo.setUphone(bbn);
						    	userinfo.setUemail("1@qq.com");
						    }
						    else{
						    	userinfo = new UserInfo();
						    	userinfo.setUid(user.getUid());
						    	userinfo.setUname(wer.getUname());
						    	userinfo.setUsex(wer.getUsex());
						    	userinfo.setUphone(wer.getUphone());
						    	userinfo.setUemail(wer.getUemail());    	
						    }
					      }
					    else 
					    {
						    dispose();
						    JFrame guanliyuanjframe = new GuanLiYuan();
						    guanliyuanjframe.setVisible(true);
					    }
				     }
			    }
			    else
			    {
				
			    }
		    }
		    else
		    {
		    	JOptionPane.showMessageDialog(null, "�û�����������󣡣���");
		    	chongzhi();		
		    }		
		}
	}	
}


