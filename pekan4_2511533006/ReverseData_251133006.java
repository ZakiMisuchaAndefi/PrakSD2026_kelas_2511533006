package pekan4_2511533006;
import java.util.*;
public class ReverseData_251133006 {
	public static void main(String[] args) {
		Queue<Integer> q_3006 = new LinkedList<Integer>();
		q_3006.add(1);
		q_3006.add(2);
		q_3006.add(3); // [1, 2, 3]
		System.out.println("sebelum reverse" + q_3006);
		Stack<Integer> s_3006 = new Stack<Integer>();
		while (!q_3006.isEmpty()) { // Q -> S
			s_3006.push(q_3006.remove());
		}
		while (!s_3006.empty()) { // S -> Q
			q_3006.add(s_3006.pop());
		}
		System.out.println("sesudah reverse=" + q_3006); // [3, 2, 1]
	}
}
