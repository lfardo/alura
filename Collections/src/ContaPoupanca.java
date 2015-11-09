import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

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
	public int compareTo(ContaPoupanca outra) {
		int comparacao = this.getNome().compareTo(outra.getNome());
	
		if (comparacao < 0) 
			return -1;
		if (comparacao > 0)
			return 1;
		return 0;
	}

	public static void main(String[] args) {
		List<ContaPoupanca> lista = new LinkedList<ContaPoupanca>();
		
		Random random = new Random();
		for (int i =0; i<10; i++) {
		ContaPoupanca c1 = new ContaPoupanca(random.nextInt(), random.nextInt()+"rw2384yufbds");
			lista.add(c1);
		}

		System.out.println(lista);

	}
}
