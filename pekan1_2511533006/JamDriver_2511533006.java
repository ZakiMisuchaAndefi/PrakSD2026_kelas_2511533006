package pekan1_2511533006;

public class JamDriver_2511533006 {

	public static void main(String[] args) {
		Jam_2511533006 a = new Jam_2511533006(23,59,50);
		Jam_2511533006 b = new Jam_2511533006(0,0,15);
		System.out.println("a        =" + a);
		System.out.println("b        =" + b);
		System.out.println("ab       =" + a.plus(b));
		System.out.println("next 20s =" + Jam_2511533006.durasiDetik(a,b));
		System.out.println("a.compareTo(b) =" + a.compareTo(b));
		// TODO Auto-generated method stub

	}

}
