package pekan4_2511533006;

import java.util.*;

public class IterasiQueue_2511533006 {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
		
		q.add("Praktikum");
		q.add("Struktur");
		q.add("Data");
		q.add("Algoritma");
		Iterator<String> iterator = q.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}
}
