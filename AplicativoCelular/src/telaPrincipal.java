import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.SystemColor;
import javax.swing.border.CompoundBorder;
import javax.swing.JTextField;
import javax.swing.DropMode;
import java.awt.Insets;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Color;

/**
 * 
 */

/**
 * @author Bruno
 *
 */
public class telaPrincipal extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaPrincipal frame = new telaPrincipal();
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
	public telaPrincipal() {
		setTitle("Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JButton btnNewButton = new JButton("New button");
		getContentPane().add(btnNewButton, BorderLayout.WEST);
	
	}

}
