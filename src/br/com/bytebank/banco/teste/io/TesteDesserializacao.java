package br.com.bytebank.banco.teste.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import br.com.bytebank.banco.modelo.Conta;

public class TesteDesserializacao {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cc.bin"));
		
		Conta conta = (Conta) ois.readObject();
		
		System.out.println(conta.getSaldo());
		System.out.println(conta.getTitular().getNome());
		System.out.println(conta);
		
		ois.close();

	}

}
