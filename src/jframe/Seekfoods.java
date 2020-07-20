package jframe;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import java.awt.Font;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.LayoutStyle.ComponentPlacement;

import daoimpl.GoodsdaoImpl;
import vo.Goods;
import vo.User;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Seekfoods extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblNewLabel;
	private JTable table;
	private Goods goods = new Goods(); 
	private GoodsdaoImpl aa = new GoodsdaoImpl();
	private List<User> list = new ArrayList<User>();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Seekfoods dialog = new Seekfoods();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Seekfoods() {
		setModal(true);
		setTitle("\u8BF7\u9009\u62E9\u60A8\u60F3\u8D2D\u4E70\u7684\u5546\u54C1");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			lblNewLabel = new JLabel("\u5546\u54C1\u5217\u8868");
			lblNewLabel.setFont(new Font("宋体", Font.BOLD, 15));
		}
		JScrollPane scrollPane = new JScrollPane();
		JButton btnNewButton = new JButton("\u67E5\u8BE2");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chaactionPerformed();
			}
		});
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 16));
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(160)
					.addComponent(lblNewLabel)
					.addContainerGap(200, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_contentPanel.createSequentialGroup()
					.addContainerGap(37, Short.MAX_VALUE)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 377, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(167)
					.addComponent(btnNewButton)
					.addContainerGap(192, Short.MAX_VALUE))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addGap(18)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
					.addGap(27)
					.addComponent(btnNewButton)
					.addContainerGap(30, Short.MAX_VALUE))
		);
		{
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"\u5546\u54C1\u5E8F\u53F7", "\u5546\u54C1\u540D", "\u5546\u54C1\u4EF7\u683C", "\u5546\u54C1\u63CF\u8FF0"
				}
			) {
				Class[] columnTypes = new Class[] {
					Long.class, String.class, Integer.class, String.class
				};
				public Class getColumnClass(int columnIndex) {
					return columnTypes[columnIndex];
				}
			});
			scrollPane.setViewportView(table);
		}
		contentPanel.setLayout(gl_contentPanel);
		Chux();
	}
	//查询方法
	public void Chux(){
		DefaultTableModel model = (DefaultTableModel)table.getModel();
		model.setRowCount(0);
		List<Goods> list = aa.selInventory1();
		for(Goods goods2 : list){
			Vector v = new Vector();
			v.add(goods2.getGid());
			v.add(goods2.getGname());
			v.add(goods2.getGprice());
			v.add(goods2.getGdescribe());
			model.addRow(v);
		}
		
		
	}
   //查询（调用查询方法）
	protected void chaactionPerformed() {
		Chux();
		
	}

}
