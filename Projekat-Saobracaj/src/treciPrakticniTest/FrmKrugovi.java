package treciPrakticniTest;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import geometry.Circle;
import geometry.Point;

import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.JList;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrmKrugovi extends JFrame {

	private JPanel contentPane;
	private DefaultListModel<Circle> dlm = new DefaultListModel<Circle>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmKrugovi frame = new FrmKrugovi();
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
	public FrmKrugovi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panelNorth = new JPanel();
		contentPane.add(panelNorth, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Krugovi");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panelNorth.add(lblNewLabel);
		
		JPanel panelSouth = new JPanel();
		contentPane.add(panelSouth, BorderLayout.SOUTH);
		
		JLabel lblBrojac = new JLabel("Krugova na listi:");
		panelSouth.add(lblBrojac);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		JList<Circle> list = new JList<Circle>();
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				if(arg0.getButton() == MouseEvent.BUTTON3) {
					DlgKrug dlg = new DlgKrug();
					dlg.setVisible(true);
					if(dlg.getCheck() == 3) {
						Circle c1 = new Circle(new Point(-1,-1), Integer.parseInt(dlg.getTextField().getText()));
						dlm.addElement(c1);
						lblBrojac.setText("Krugova u listi: " + dlm.getSize());
					}
					
				}
			}
		});
		list.setModel(dlm);
		list.setBackground(Color.GRAY);
		scrollPane.setViewportView(list);
	}

}
