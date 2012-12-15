import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.JLabel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextPane;


public class NewCrisis extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			NewCrisis dialog = new NewCrisis();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public NewCrisis() {
		setTitle("New Crisis");
		setBounds(100, 100, 488, 288);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.WEST);
		contentPanel.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("max(5dlu;default)"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(39dlu;pref)"),
				ColumnSpec.decode("30px:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("86px:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("93px:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("77px:grow"),
				ColumnSpec.decode("37px"),},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("50px:grow"),
				RowSpec.decode("32px"),
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("36px"),}));
		
		JLabel lblNewLabel = new JLabel("Label");
		contentPanel.add(lblNewLabel, "3, 2, left, fill");
		
		textField_1 = new JTextField();
		contentPanel.add(textField_1, "4, 2, 7, 1, fill, default");
		textField_1.setColumns(10);
		
		JLabel lblType = new JLabel("Type");
		contentPanel.add(lblType, "3, 4, left, default");
		
		JComboBox comboBox = new JComboBox();
		contentPanel.add(comboBox, "4, 4, 7, 1, fill, default");
		
		JLabel lblPlace = new JLabel("Place");
		contentPanel.add(lblPlace, "3, 6, left, fill");
		
		textField = new JTextField();
		contentPanel.add(textField, "4, 6, 7, 1, fill, default");
		textField.setColumns(10);
		
		JLabel lblState = new JLabel("State");
		contentPanel.add(lblState, "3, 7, left, default");
		
		JComboBox comboBox_1 = new JComboBox();
		contentPanel.add(comboBox_1, "4, 7, 7, 1, fill, default");
		
		JLabel lblOtherInfos = new JLabel("Other infos");
		contentPanel.add(lblOtherInfos, "3, 9, left, default");
		
		JTextPane textPane = new JTextPane();
		contentPanel.add(textPane, "4, 9, 7, 2, fill, fill");
		
		JButton btnCancel = new JButton("Cancel");
		contentPanel.add(btnCancel, "6, 12");
		
		JButton btnOk = new JButton("OK");
		contentPanel.add(btnOk, "8, 12");
	}

}
