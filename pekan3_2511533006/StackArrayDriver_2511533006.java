package pekan3_2511533006;

public class StackArrayDriver_2511533006 {
	public static void main(String[] args) {
		StackArray_2511533006 s = new StackArray_2511533006();
		s.push_2511533006(10);
		s.push_2511533006(20);
		s.push_2511533006(30);
		System.out.println(s.pop_2511533006() + " dikeluarkan dari stack");
		System.out.println("Elemen teratas adalah :" + s.peek_2511533006());
		System.out.print("Elemen pada stack: ");
		s.print();
	}
}
