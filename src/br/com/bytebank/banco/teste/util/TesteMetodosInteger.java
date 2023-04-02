package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteMetodosInteger {

	public static void main(String[] args) {
		
		List<Integer> lista = new ArrayList<Integer>();
		
		Integer idadeRef = Integer.valueOf(20);//autoboxing
		int numero = idadeRef.intValue();//unboxing
		
		System.out.println("A: "+idadeRef.intValue());
		
		String s = args[0]; 
		
		Integer inteiro = Integer.valueOf(s);//Transformando String em Inteiro
		
		//int inteiro = Integer.parseInt(s);//Transformando String em Inteiro com parseInt
		
		System.out.println(inteiro);
	}

}
