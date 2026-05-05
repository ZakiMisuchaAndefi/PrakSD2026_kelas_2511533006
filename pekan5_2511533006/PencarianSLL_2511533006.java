package pekan5_2511533006;

public class PencarianSLL_2511533006 {
	static boolean searchKey_2511533006(NodeSLL_2511533006 head_3006, int key_3006) {
		NodeSLL_2511533006 curr = head_3006;
		while (curr != null) {
			if (curr.data_3006 == key_3006)
				return true;
			curr = curr.next_3006;  }
		return false; }
	public static void  traversal_3006(NodeSLL_2511533006 head_3006) {
		// mulai dari head
		NodeSLL_2511533006 curr = head_3006;
		// telusuri sampai pointer null
		while (curr != null ) {
			System.out.print(" " + curr.data_3006);
			curr = curr.next_3006; }
	System.out.println(); }
	public static void main(String[] args) {
		NodeSLL_2511533006 head_3006 = new NodeSLL_2511533006(14);
		head_3006.next_3006 = new NodeSLL_2511533006(21);
		head_3006.next_3006.next_3006 = new NodeSLL_2511533006(13);
		head_3006.next_3006.next_3006.next_3006 = new NodeSLL_2511533006(30);
		head_3006.next_3006.next_3006.next_3006.next_3006 = new NodeSLL_2511533006(10);
		System.out.print("Penelusuran SLL : ");
		traversal_3006(head_3006);
		// data yang akan dicari
		int key_3006 = 30;
		System.out.print("cari data " +key_3006+ " = ");
		if (searchKey_2511533006(head_3006, key_3006))
			System.out.print("ketemu");
		else
			System.out.print("tidak ada");

	}

}
