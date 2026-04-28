package pekan4_2511533006;

import java.util.*;

public class IterasiQueue_2511533006 {

	public static void main(String[] args) {
		Queue<String> q_3006 = new LinkedList<>();
		
		q_3006.add("Praktikum");
		q_3006.add("Struktur");
		q_3006.add("Data");
		q_3006.add("Algoritma");
		Iterator<String> iterator = q_3006.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}
}
