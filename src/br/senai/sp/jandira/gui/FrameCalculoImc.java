package br.senai.sp.jandira.gui;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrameCalculoImc {
	
	public String titulo;
	public int largura;
	public int altura;
	public String teste;
	
	public void criarTela() {
		
		JFrame tela = new JFrame();
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		
		// Obter a instância do painel de conteúdo (Container)
		Container painel = tela.getContentPane();
		
		// Criar os componentes da tela e colocar no painel (Container)
		JLabel labelImc = new JLabel();
		labelImc.setText("IMC");
		labelImc.setBounds(30, 0, 30, 30);
		
		JLabel labelNome = new JLabel();
		labelNome.setText("Nome:");
		labelNome.setBounds(30, 40, 100, 30);
		
		JTextField textFieldNome = new JTextField();
		textFieldNome.setBounds(30, 70, 300, 30);
		
		JLabel labelPeso = new JLabel();
		labelPeso.setText("Peso:");
		labelPeso.setBounds(30, 110, 100, 30);
		
		JTextField textFieldPeso = new JTextField();
		textFieldPeso.setBounds(30, 140, 150, 30);
		
		JLabel labelAltura = new JLabel();
		labelAltura.setText("Altura:");
		labelAltura.setBounds(30, 180, 100, 30);
		
		JTextField textFieldAltura = new JTextField();
		textFieldAltura.setBounds(30, 210, 150, 30);
		
		JLabel labelDataNascimento = new JLabel();
		labelDataNascimento.setText("Data Nasc.:");
		labelDataNascimento.setBounds(30, 250, 100, 30);
		
		JTextField textFieldDataNascimento = new JTextField();
		textFieldDataNascimento.setBounds(30, 280, 150, 30);
		
		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(220, 280, 150, 30);
		
		JLabel labelResultadoImc = new JLabel();
		labelResultadoImc.setText("Seu IMC ...");
		labelResultadoImc.setBounds(30, 320, 300, 30);
		
		JLabel labelStatusImc = new JLabel();
		labelStatusImc.setText("Seu Status IMC ...");
		labelStatusImc.setBounds(30, 360, 300, 30);
		
		
		// Adicionar componentes ao painel (Container)
		painel.add(labelImc);
		painel.add(buttonCalcular);
		painel.add(labelNome);
		painel.add(textFieldNome);
		painel.add(labelPeso);
		painel.add(textFieldPeso);
		painel.add(labelAltura);
		painel.add(textFieldAltura);
		painel.add(labelDataNascimento);
		painel.add(textFieldDataNascimento);
		painel.add(labelResultadoImc);
		painel.add(labelStatusImc);
		
		tela.setVisible(true);
		
	}

}
