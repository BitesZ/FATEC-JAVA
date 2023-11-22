package tela.app;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField inputNome;
	private ArrayList<String> produtos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setTitle("Atividade 9 - Cadastro de produtos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(10, 36, 414, 215);
		contentPane.add(textArea);
		textArea.append("Bem-vindo(a)\n");
		
		inputNome = new JTextField();
		inputNome.setBounds(129, 10, 196, 20);
		contentPane.add(inputNome);
		inputNome.setColumns(10);
		
		JLabel labelNome = new JLabel("Nome do produto:");
		labelNome.setFont(new Font("Tahoma", Font.PLAIN, 13));
		labelNome.setBounds(10, 11, 109, 17);
		contentPane.add(labelNome);
		
		
		JButton buttonEnviar = new JButton("New button");
		buttonEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (produtos == null)  {
					produtos = new ArrayList<>();
				}
				String nome = inputNome.getText();
				produtos.add(nome);
				textArea.setText("");
				textArea.append("Lista de produtos: \n");
				for (String produto : produtos) {
					textArea.append(produto+"\n");
				}
				
			}
		});
		buttonEnviar.setBounds(335, 9, 89, 23);
		contentPane.add(buttonEnviar);
	}
}
