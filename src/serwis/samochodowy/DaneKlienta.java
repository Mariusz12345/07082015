/*
 * Created by JFormDesigner on Fri Aug 07 09:08:57 CEST 2015
 */

package serwis.samochodowy;

import javax.swing.*;
import com.jgoodies.forms.factories.*;
import com.jgoodies.forms.layout.*;

/**
 * @author Adam Piotr
 */
public class DaneKlienta extends JPanel {
	public DaneKlienta() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Adam Piotr
		label1 = new JLabel();
		textField1 = new JTextField();
		label2 = new JLabel();
		textField2 = new JTextField();
		label3 = new JLabel();
		textField3 = new JTextField();
		button1 = new JButton();

		//======== this ========

		// JFormDesigner evaluation mark
		setBorder(new javax.swing.border.CompoundBorder(
			new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
				"JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
				javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
				java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

		setLayout(new FormLayout(
			"30dlu, $lcgap, 44dlu, $lcgap, default, $lcgap, 38dlu, $lcgap, 105dlu",
			"default, $lgap, 15dlu, 4*($lgap, default)"));

		//---- label1 ----
		label1.setText("Imie:");
		add(label1, CC.xy(3, 3));
		add(textField1, CC.xy(7, 3));

		//---- label2 ----
		label2.setText("Nazwisko:");
		add(label2, CC.xy(3, 5));
		add(textField2, CC.xy(7, 5));

		//---- label3 ----
		label3.setText("Nr Telefonu:");
		add(label3, CC.xy(3, 7));
		add(textField3, CC.xy(7, 7));

		//---- button1 ----
		button1.setText("Powr\u00f3t");
		add(button1, CC.xy(9, 9));
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Adam Piotr
	private JLabel label1;
	private JTextField textField1;
	private JLabel label2;
	private JTextField textField2;
	private JLabel label3;
	private JTextField textField3;
	private JButton button1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
