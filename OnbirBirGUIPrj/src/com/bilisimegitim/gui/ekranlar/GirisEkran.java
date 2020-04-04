package com.bilisimegitim.gui.ekranlar;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GirisEkran extends JFrame {

	private JPanel contentPane;
	private JTextField adTF;
	private JPasswordField sifrePF;

	

	/**
	 * Create the frame.
	 */
	public GirisEkran() {
		setTitle("Giris Ekrani");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 531, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Kullanici Adi :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(12, 75, 116, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Sifre             :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(12, 144, 91, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("GIRIS EKRANI");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(0, 29, 501, 33);
		contentPane.add(lblNewLabel_2);
		
		adTF = new JTextField();
		adTF.setBounds(108, 75, 116, 22);
		contentPane.add(adTF);
		adTF.setColumns(10);
		
		sifrePF = new JPasswordField();
		sifrePF.setBounds(108, 142, 116, 22);
		contentPane.add(sifrePF);
		
		JLabel sonucLabel = new JLabel("");
		sonucLabel.setHorizontalAlignment(SwingConstants.CENTER);
		sonucLabel.setBounds(12, 215, 212, 25);
		contentPane.add(sonucLabel);
		
		JButton btnNewButton = new JButton("GIRIS");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(adTF.getText().equalsIgnoreCase("bora") && sifrePF.getText().equalsIgnoreCase("1234"))
				{
					//sonucLabel.setText("Giris Basarili");
					//sonucLabel.setForeground(Color.red); //mesaji renkli göstermek icin
					//sonucLabel.setText("Kullanici adi veya sifre hatali");
					
					MenuEkran menuEkran = new MenuEkran();
					
					menuEkran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ekranin kosesindeki carpiya basinca kapanmasi icin
					menuEkran.setSize(450, 300); // Ekranin Boyunu veririz
					menuEkran.setLocationRelativeTo(null);//Ekranin Ortasinda Cikmasi Icin
					menuEkran.setVisible(true); // Ekrani Göstermek icin
					setVisible(false); // Giris Ekran Kendisini kapatiyor
					
				}
				else 
				{
					sonucLabel.setForeground(Color.red);
					sonucLabel.setText("Kullanici Adi veya Sifre Hatali");
					
				}
				// Giris Yaptiktan sonra kullanici adi ve sifre alaninin silinmesi icin bu islem adimlari yapilir.
				adTF.setText(""); 
				sifrePF.setText("");

			

				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(216, 177, 97, 25);
		contentPane.add(btnNewButton);
		getRootPane().setDefaultButton(btnNewButton); // Kullanici adi ve sifre girdikten sonra Entere basmak icin kullaniriz
		
	}
}
