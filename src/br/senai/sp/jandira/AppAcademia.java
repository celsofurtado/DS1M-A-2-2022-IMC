package br.senai.sp.jandira;

import java.time.LocalDate;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.gui.FrameCalculoImc;
import br.senai.sp.jandira.model.Cliente;

public class AppAcademia {
	
	public static void main(String[] args) {
		
		FrameCalculoImc tela = new FrameCalculoImc();
		tela.titulo = "Calculadora IMC";
		tela.altura = 600;
		tela.largura = 600;
		tela.criarTela();
		
//		FrameCalculoImc tela2 = new FrameCalculoImc();
//		tela2.titulo = "Turma DS1M-A";
//		tela2.largura = 200;
//		tela2.altura = 100;
//		tela2.criarTela();
		
		Cliente ana = new Cliente();
		Cliente pedro = new Cliente();
		
		System.out.println(ana);
		System.out.println(pedro);
				
		ana.nome = "Ana Maria Brega";
		ana.dataDeNascimento = LocalDate.of(1950, 6, 21);
		ana.peso = 90;
		ana.altura = 1.68;
		double xx = ana.getImc();
		System.out.println(xx);
		String teste = ana.getStatus();
		//JOptionPane.showMessageDialog(null, teste);
		
		pedro.nome = "Pedro Dias";
		pedro.dataDeNascimento = LocalDate.of(2002, 2, 28);
		
		
	}

}
