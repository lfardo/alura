import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class ContaPoupanca implements Comparable<ContaPoupanca> {

	protected int numero;

	protected String nome;

	public ContaPoupanca(int numero, String nome) {
		super();
		this.numero = numero;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "ContaPoupanca [numero=" + numero + ", nome=" + nome + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		return result;
	}
/*
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContaPoupanca other = (ContaPoupanca) obj;
		if (numero != other.numero)
			return false;
		return true;
	}
*/
	@Override
	public int compareTo(ContaPoupanca outra) {
		int comparacao = this.getNome().compareTo(outra.getNome());

		if (comparacao < 0) 
			return -1;
		if (comparacao > 0)
			return 1;
		return 0;
	}

	public static void main(String[] args) {
		Set<ContaPoupanca> lista = new HashSet<ContaPoupanca>();

		ContaPoupanca c1 = new ContaPoupanca(0, "Teste1");
		ContaPoupanca c2 = new ContaPoupanca(1, "Teste2");
		ContaPoupanca c3 = new ContaPoupanca(2, "Teste3");
		ContaPoupanca c4 = new ContaPoupanca(1, "Teste4");
		
		lista.add(c1);
		lista.add(c2);
		lista.add(c3);
		lista.add(c4);
		
		System.out.println("A lista possui: " + lista.size() + " elementos");
		
		System.out.println(lista);

	}
}
