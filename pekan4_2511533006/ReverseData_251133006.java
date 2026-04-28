package pekan4_2511533006;
import java.util.*;
public class ReverseData_251133006 {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(1);
		q.add(2);
		q.add(3); // [1, 2, 3]
		System.out.println("sebelum reverse" + q);
		Stack<Integer> s = new Stack<Integer>();
		while (!q.isEmpty()) { // Q -> S
			s.push(q.remove());
		}
		while (!s.empty()) { // S -> Q
			q.add(s.pop());
		}
		System.out.println("sesudah reverse=" + q); // [3, 2, 1]
	}
}
