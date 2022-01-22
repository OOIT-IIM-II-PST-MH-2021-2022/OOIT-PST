package dialogs;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DlgRectangle extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldHeight;
	private JTextField textFieldWidth;
	private boolean cancel;
	
	public JTextField getTextFieldHeight() {
		return textFieldHeight;
	}

	public JTextField getTextFieldWidth() {
		return textFieldWidth;
	}

	public boolean isCancel() {
		return cancel;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgRectangle dialog = new DlgRectangle();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgRectangle() {
		setBounds(100, 100, 450, 300);
		setModal(true);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0};
		gbl_contentPanel.rowHeights = new int[]{0};
		gbl_contentPanel.columnWeights = new double[]{0.0};
		gbl_contentPanel.rowWeights = new double[]{0.0};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblNewLabel = new JLabel("Enter rectangle data");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
			GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
			gbc_lblNewLabel.gridwidth = 6;
			gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel.gridx = 0;
			gbc_lblNewLabel.gridy = 0;
			contentPanel.add(lblNewLabel, gbc_lblNewLabel);
		}{
			JLabel lblHeight = new JLabel("Height");
			lblHeight.setFont(new Font("Tahoma", Font.BOLD, 20));
			GridBagConstraints gbc_lblHeight = new GridBagConstraints();
			gbc_lblHeight.insets = new Insets(0, 0, 5, 5);
			gbc_lblHeight.gridx = 3;
			gbc_lblHeight.gridy = 2;
			contentPanel.add(lblHeight, gbc_lblHeight);
		}
		{
			textFieldHeight = new JTextField();
			textFieldHeight.setHorizontalAlignment(SwingConstants.CENTER);
			textFieldHeight.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent arg0) {
					char c = arg0.getKeyChar();
					if(c < '0' || c > '9' || c == KeyEvent.VK_SPACE) {
						arg0.consume();
					}
				}
			});
			textFieldHeight.setFont(new Font("Tahoma", Font.PLAIN, 20));
			GridBagConstraints gbc_textFieldHeight = new GridBagConstraints();
			gbc_textFieldHeight.insets = new Insets(0, 0, 5, 0);
			gbc_textFieldHeight.fill = GridBagConstraints.HORIZONTAL;
			gbc_textFieldHeight.gridx = 5;
			gbc_textFieldHeight.gridy = 2;
			contentPanel.add(textFieldHeight, gbc_textFieldHeight);
			textFieldHeight.setColumns(10);
		}
		{
			JLabel lblWidth = new JLabel("Width");
			lblWidth.setFont(new Font("Tahoma", Font.BOLD, 20));
			GridBagConstraints gbc_lblWidth = new GridBagConstraints();
			gbc_lblWidth.insets = new Insets(0, 0, 0, 5);
			gbc_lblWidth.gridx = 3;
			gbc_lblWidth.gridy = 4;
			contentPanel.add(lblWidth, gbc_lblWidth);
		}
		{
			textFieldWidth = new JTextField();
			textFieldWidth.setHorizontalAlignment(SwingConstants.CENTER);
			textFieldWidth.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent arg0) {
					char c = arg0.getKeyChar();
					if(c < '0' || c > '9' || c == KeyEvent.VK_SPACE) {
						arg0.consume();
					}
				}
			});
			textFieldWidth.setFont(new Font("Tahoma", Font.PLAIN, 20));
			GridBagConstraints gbc_textFieldWidth = new GridBagConstraints();
			gbc_textFieldWidth.fill = GridBagConstraints.HORIZONTAL;
			gbc_textFieldWidth.gridx = 5;
			gbc_textFieldWidth.gridy = 4;
			contentPanel.add(textFieldWidth, gbc_textFieldWidth);
			textFieldWidth.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						try {
							Integer.parseInt(textFieldHeight.getText());
							Integer.parseInt(textFieldWidth.getText());
							dispose();
						} catch (NumberFormatException e) {
							JOptionPane.showMessageDialog(null, "Height and width have to be numbers", "Blank text fields", JOptionPane.ERROR_MESSAGE);
						}
						
					}
				});
				okButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						cancel = true;
						dispose();
					}
				});
				cancelButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	
}

