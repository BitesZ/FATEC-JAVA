package tela.app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.ButtonGroup;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.TextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField inputNome;
	private JTextField inputIdade;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField inputEmail;
	private JTextField inputTelefone;
	private JTextField inputDatadenasc;
	private JTextField inputCpf;

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
		setTitle("Atividade 9 - Inserção de Dados");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 605, 343);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		inputNome = new JTextField();
		inputNome.setBounds(124, 25, 128, 20);
		contentPane.add(inputNome);
		inputNome.setColumns(10);
		
		inputIdade = new JTextField();
		inputIdade.setBounds(124, 56, 128, 20);
		contentPane.add(inputIdade);
		inputIdade.setColumns(10);
		
		JRadioButton buttonSexoHomem = new JRadioButton("Homem");
		buttonSexoHomem.setToolTipText("");
		buttonGroup.add(buttonSexoHomem);
		buttonSexoHomem.setBounds(124, 83, 109, 23);
		contentPane.add(buttonSexoHomem);
		
		JRadioButton buttonSexoMulher = new JRadioButton("Mulher");
		buttonGroup.add(buttonSexoMulher);
		buttonSexoMulher.setBounds(124, 109, 109, 23);
		contentPane.add(buttonSexoMulher);
		
		inputEmail = new JTextField();
		inputEmail.setToolTipText("");
		inputEmail.setBounds(124, 139, 128, 20);
		contentPane.add(inputEmail);
		inputEmail.setColumns(10);
		
		inputTelefone = new JTextField();
		inputTelefone.setBounds(124, 170, 128, 20);
		contentPane.add(inputTelefone);
		inputTelefone.setColumns(10);
		
		inputCpf = new JTextField();
		inputCpf.setBounds(124, 201, 128, 20);
		contentPane.add(inputCpf);
		inputCpf.setColumns(10);
		
		inputDatadenasc = new JTextField();
		inputDatadenasc.setBounds(124, 232, 128, 20);
		contentPane.add(inputDatadenasc);
		inputDatadenasc.setColumns(10);
		
		JLabel labelIdade = new JLabel("Idade:");
		labelIdade.setBounds(10, 59, 40, 14);
		contentPane.add(labelIdade);
		
		JLabel labelNome = new JLabel("Nome:");
		labelNome.setBounds(10, 28, 40, 14);
		contentPane.add(labelNome);
		
		JLabel labelSexo = new JLabel("Sexo:");
		labelSexo.setBounds(10, 101, 46, 14);
		contentPane.add(labelSexo);
		
		JLabel labelEmail = new JLabel("E-mail:");
		labelEmail.setBounds(10, 142, 46, 14);
		contentPane.add(labelEmail);
		
		JLabel labelTelefone = new JLabel("Telefone:");
		labelTelefone.setBounds(10, 173, 67, 14);
		contentPane.add(labelTelefone);
		
		JLabel labelCpf = new JLabel("CPF:");
		labelCpf.setBounds(10, 203, 46, 14);
		contentPane.add(labelCpf);
		
		JLabel labelDatadenasc = new JLabel("Data de Nascimento:");
		labelDatadenasc.setBounds(10, 235, 104, 14);
		contentPane.add(labelDatadenasc);
		
		JLabel labelSaudacao = new JLabel("Bem-vindo(a), Insira seus dados abaixo:");
		labelSaudacao.setFont(new Font("Tahoma", Font.BOLD, 12));
		labelSaudacao.setBounds(10, 0, 249, 23);
		contentPane.add(labelSaudacao);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(272, 11, 307, 283);
		contentPane.add(textArea);
		
		JButton buttonEnviar = new JButton("Enviar");
		buttonEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome, idade, sexo = null, email, telefone, cpf, datanasc;
				nome = inputNome.getText();
				idade = inputIdade.getText();
				if (buttonSexoHomem.isSelected()) {
					sexo = "Homem";
				}
				else if(buttonSexoMulher.isSelected()) {
					sexo = "Mulher";
				}
				email = inputEmail.getText();
				telefone = inputTelefone.getText();
				cpf = inputCpf.getText();
				datanasc = inputDatadenasc.getText();
				textArea.append("Nome: "+nome+"\n"+"Idade: "+idade+"\n"+"Sexo: "+sexo+"\n"+"E-mail: "+email+"\n"+"Telefone: "+telefone+"\n"+
				"Cpf: "+cpf+"\n"+"Data de nascimento: "+datanasc+"\n");
				
			}
		});
		buttonEnviar.setBounds(85, 263, 89, 36);
		contentPane.add(buttonEnviar);
	}
}
