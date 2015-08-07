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

	private void scrollPane1ComponentAdded(ContainerEvent e) {
		
		
	}

	private void scrollPane1ComponentRemoved(ContainerEvent e) {
		// TODO add your code here
	}

	private void scrollPane1PropertyChange(PropertyChangeEvent e) {
		// TODO add your code here
	}
	
	


	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Adam Piotr
		scrollPane1 = new JScrollPane();
		table1 = new JTable();
		panel1 = new JPanel();
		Object[][] dane = {
	            {"Nr rejestraczjnz"},
	            {"Klient"},
	            {"Data ostatniego serwisu"}
	        };
		//======== this ========

		// JFormDesigner evaluation mark
		setBorder(new javax.swing.border.CompoundBorder(
			new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
				"JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
				javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
				java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

		setLayout(new FormLayout(
			"4*(default, $lcgap), default",
			"3*(default, $lgap), default"));

		//======== scrollPane1 ========
		{
			scrollPane1.addContainerListener(new ContainerAdapter() {
				@Override
				public void componentAdded(ContainerEvent e) {
					scrollPane1ComponentAdded(e);
				}
				@Override
				public void componentRemoved(ContainerEvent e) {
					scrollPane1ComponentRemoved(e);
				}
			});
			scrollPane1.addPropertyChangeListener(e -> scrollPane1PropertyChange(e));
			scrollPane1.setViewportView(table1);
		}
		add(scrollPane1, CC.xy(5, 3, CC.CENTER, CC.TOP));

		//======== panel1 ========
		{
			panel1.setLayout(new FormLayout(
				"default",
				"default"));
		}
		add(panel1, CC.xy(7, 5));
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
		
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Adam Piotr
	private JScrollPane scrollPane1;
	private JTable table1;
	private JPanel panel1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
