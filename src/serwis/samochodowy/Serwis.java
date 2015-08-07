/*
 * Created by JFormDesigner on Fri Aug 07 07:19:37 CEST 2015
 */

package serwis.samochodowy;

import java.awt.event.*;
import java.beans.*;
import javax.swing.*;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

import com.jgoodies.forms.factories.*;
import com.jgoodies.forms.layout.*;

import sun.swing.MenuItemLayoutHelper.ColumnAlignment;

/**
 * @author Adam Piotr
 */
public class Serwis extends JPanel {
	public Serwis() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Adam Piotr
		label1 = new JLabel();
		panel1 = new JPanel();
		label2 = new JLabel();
		textField1 = new JTextField();
		label3 = new JLabel();
		button1 = new JButton();
		label7 = new JLabel();
		label4 = new JLabel();
		textField3 = new JTextField();
		scrollPane1 = new JScrollPane();
		table1 = new JTable();
		label5 = new JLabel();
		textField4 = new JTextField();
		label6 = new JLabel();
		textField5 = new JTextField();

		//======== this ========

		// JFormDesigner evaluation mark
		setBorder(new javax.swing.border.CompoundBorder(
			new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
				"JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
				javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
				java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

		setLayout(new FormLayout(
			"337dlu, center:3dlu",
			"13dlu, 3*($lgap, default)"));

		//---- label1 ----
		label1.setText("                                                                     Samochody");
		add(label1, CC.xy(1, 1));

		//======== panel1 ========
		{
			panel1.setLayout(new FormLayout(
				"62dlu, $lcgap, 77dlu, 10*($lcgap, default), $lcgap, 0dlu",
				"4*(default, $lgap), default"));

			//---- label2 ----
			label2.setText("Nr Rejestracyjny:");
			panel1.add(label2, CC.xy(1, 1));
			panel1.add(textField1, CC.xy(3, 1));

			//---- label3 ----
			label3.setText("Dane Klienta");
			panel1.add(label3, CC.xy(1, 3));

			//---- button1 ----
			button1.setText("Wybierz");
			panel1.add(button1, CC.xy(3, 3));

			//---- label7 ----
			label7.setText("         Serwis");
			panel1.add(label7, CC.xy(19, 3));

			//---- label4 ----
			label4.setText("Imie:");
			panel1.add(label4, CC.xy(1, 5));
			panel1.add(textField3, CC.xy(3, 5));

			//======== scrollPane1 ========
			{
				scrollPane1.setViewportView(table1);
			}
			panel1.add(scrollPane1, CC.xywh(13, 5, 11, 5));

			//---- label5 ----
			label5.setText("Nazwisko:");
			panel1.add(label5, CC.xy(1, 7));
			panel1.add(textField4, CC.xy(3, 7));

			//---- label6 ----
			label6.setText("Numer Telefonu:");
			panel1.add(label6, CC.xy(1, 9));
			panel1.add(textField5, CC.xy(3, 9));
		}
		add(panel1, CC.xy(1, 3));
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
		
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Adam Piotr
	private JLabel label1;
	private JPanel panel1;
	private JLabel label2;
	private JTextField textField1;
	private JLabel label3;
	private JButton button1;
	private JLabel label7;
	private JLabel label4;
	private JTextField textField3;
	private JScrollPane scrollPane1;
	private JTable table1;
	private JLabel label5;
	private JTextField textField4;
	private JLabel label6;
	private JTextField textField5;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
