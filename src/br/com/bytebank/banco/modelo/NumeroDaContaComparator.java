package br.com.bytebank.banco.modelo;

import java.util.Comparator;

public class NumeroDaContaComparator implements Comparator<Conta> { //compara a lista de contas (<contas>)

	@Override
	public int compare(Conta c1, Conta c2) { //Metodo que compara o numero das contas
		
		//Pode usar assim: 
//		if(c1.getNumero() < c2.getNumero()) { //condição que devolve -1 se a primeira conta comparada for menor do que a segunda
//			return -1;
//		}else if(c1.getNumero() > c2.getNumero()) { //condição que devolve 1 se a primeira conta comparada for maior do que a segunda
//			return 1;
//		}
//		return 0;
		
		//OOOU
		
		//Pode usar assim:
//		return Integer.compare(c1.getNumero(), c2.getNumero());
		
		//OOOOU
		
		//Pode usar assim:
		return c1.getNumero() - c2.getNumero();
	}  
}
