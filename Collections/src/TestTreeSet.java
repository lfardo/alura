import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> lista = new TreeSet<Integer>();
		
		for (int i = 1; i <= 1000; i++) {
			lista.add(i);
		}
		
		for (Integer i : lista.descendingSet()) {
            System.out.print(i + " ");
        }
	}
	
}
