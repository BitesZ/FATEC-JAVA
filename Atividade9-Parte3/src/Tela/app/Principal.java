package Tela.app;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.ScrollPane;
import java.awt.Panel;
import java.awt.Label;
import java.awt.Font;
import javax.swing.JList;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	ArrayList<Integer> numeros = new ArrayList<>();
	private JTextField inputNum;

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
		setTitle("Atividade 9 - Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 494, 356);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label labelResultado = new Label("Resultado:");
		labelResultado.setVisible(false);
		
		JLabel labelMedia = new JLabel("");
		labelMedia.setVisible(false);
		labelMedia.setFont(new Font("Tahoma", Font.BOLD, 34));
		labelMedia.setBounds(236, 91, 152, 41);
		contentPane.add(labelMedia);
		labelResultado.setFont(new Font("Dialog", Font.BOLD, 23));
		labelResultado.setBounds(236, 52, 152, 22);
		contentPane.add(labelResultado);
		
		List list = new List();
		list.setBounds(10, 52, 110, 255);
		contentPane.add(list);
		
		JLabel labelNumero = new JLabel("Número: ");
		labelNumero.setBounds(10, 11, 55, 14);
		contentPane.add(labelNumero);
		
		inputNum = new JTextField();
		inputNum.setBounds(62, 8, 86, 20);
		contentPane.add(inputNum);
		inputNum.setColumns(10);
		
		JButton buttonAddNum = new JButton("Adicionar Número");
		buttonAddNum.setToolTipText("Adiciona um número para o calculo da média");
		buttonAddNum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inputNumText = inputNum.getText();
				int num = Integer.parseInt(inputNumText);
				
				labelMedia.setVisible(false);
				labelResultado.setVisible(false);
				
				numeros.add(num);
				list.add(inputNumText);
				
				inputNum.setText("");
			}
		});
		buttonAddNum.setBounds(158, 7, 145, 23);
		contentPane.add(buttonAddNum);
		
		JButton buttonCalcMed = new JButton("Calcular a média");
		buttonCalcMed.setToolTipText("Calcula a média dos números inseridos");
		buttonCalcMed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double media = CalculadoraNumeros.calcularMedia(numeros);
					labelResultado.setVisible(true);
					labelMedia.setVisible(true);
					labelMedia.setText(media+"");
					System.out.println(media);
				}
				catch (IllegalArgumentException e1) {
					System.err.println("Erro: "+ e1.getMessage());
				}
				catch (Exception e1) {
					System.err.println("Erro inesperado: "+ e1.getMessage());
				}
			}
		});
		buttonCalcMed.setBounds(313, 7, 145, 23);
		contentPane.add(buttonCalcMed);
		
		JButton buttonResetarMedia = new JButton("RESETAR");
		buttonResetarMedia.setToolTipText("Apaga os números inseridos");
		buttonResetarMedia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelResultado.setVisible(false);
				labelMedia.setVisible(false);
				numeros.clear();
				list.removeAll();
			}
		});
		buttonResetarMedia.setBounds(236, 284, 152, 23);
		contentPane.add(buttonResetarMedia);
		
		Label labelListaNum = new Label("Números Inseridos ");
		labelListaNum.setFont(new Font("Dialog", Font.BOLD, 12));
		labelListaNum.setBounds(10, 31, 110, 22);
		contentPane.add(labelListaNum);
	}
}
