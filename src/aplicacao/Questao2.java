package aplicacao;

import java.util.Scanner;

import dominio.Espetaculo;
import servico.EspetaculoServico;
import servico.ParticipacaoServico;
import servico.ServicoFactory;

public class Questao2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EspetaculoServico espetaculoServico = ServicoFactory.criarEspetaculoServico();
		ParticipacaoServico participacaoServico = ServicoFactory.criarParticipacaoServico();
		
		
		
		Integer op = -1;
			System.out.println("1) Cadastrar um novo espet�culo e as participa��es dele");
			System.out.println("2) Mostrar os dados de um espet�culo (nome, pre�o total e participa��es)");
			System.out.println("Digite uma op��o acima: ");
			op = sc.nextInt();
			String nome;
			
		
			switch(op){
			case 1:
				
				System.out.println("Digite o nome do novo espet�culo: ");
				nome = sc.nextLine();
				Espetaculo e = new Espetaculo(null,nome);
				espetaculoServico.inserirAtualizar(e);
				System.out.println("Espetaculo inserido com sucesso! ");
				
			break;
			case 2:
				System.out.println("ola");
			break;
			}

	}

}
