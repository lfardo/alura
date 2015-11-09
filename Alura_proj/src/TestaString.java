public class TestaString {

	public static void main(String[] args) {
		String s = "fj11";
		String novaS = s.replaceAll("1", "2");
		System.out.println(novaS);
		
		
		String inteira = "abcdefghijklmnopqrstuvxyz";
		String procura = "abc";
		
		if (inteira.contains(procura)){
			System.out.println("Esta dentro");
		}
		
		String comEspaco = "   Testando String com espaços em brancos nas pontas     ";
		String semEspaco = comEspaco.trim();
		System.out.println(semEspaco);
		
		if (!comEspaco.isEmpty()) {
			System.out.println("comEspaco não está vazia");
		}
		
		System.out.println("semEspaco possui " + semEspaco.length() + " caracteres");
	}

}