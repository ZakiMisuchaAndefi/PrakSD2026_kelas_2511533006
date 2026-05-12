package pekan6_2511533006;

public class PenelusuranDLL_2511533006 {
	// fungsi penelusuran maju
	static void forwardTraversal_3006(NodeDLL_2511533006 head_3006) {
		// memulai penelusuran dari head
		NodeDLL_2511533006 curr = head_3006;
		// lanjutkan sampai akhir
		while (curr != null) {
			// print data
			System.out.print(curr.data_3006 + " <->");
			// pindah ke node berikutnya
			curr = curr.next_3006;
		}
		// print spasi
		System.out.println();
	}
	// fungsi penelusuran mundur
	static void backwardTraversal_3006(NodeDLL_2511533006 tail_3006) {
		// mulai dari akhir
		NodeDLL_2511533006 curr = tail_3006;
		// lanjut sampai head
		while (curr != null) {
			// cetak data
			System.out.print(curr.data_3006 + " <-> ");
			// pindah ke node sebelumnya
			curr = curr.prev_3006;
		}
		// cetak spasi
		System.out.println();
	}
	public static void main(String[] args) {
		// cetak DLL
		NodeDLL_2511533006 head_3006 = new NodeDLL_2511533006(1);
		NodeDLL_2511533006 second_3006 = new NodeDLL_2511533006(2);
		NodeDLL_2511533006 third_3006 = new NodeDLL_2511533006(3);
		
		head_3006.next_3006 = second_3006;
		second_3006.prev_3006 = head_3006;
		second_3006.next_3006 = third_3006;
		third_3006.prev_3006 = second_3006;
		
		System.out.println("Penelusuran maju:");
		forwardTraversal_3006(head_3006);
		
		System.out.println("Penelusuran mundur:");
		backwardTraversal_3006(third_3006);
	}

}
