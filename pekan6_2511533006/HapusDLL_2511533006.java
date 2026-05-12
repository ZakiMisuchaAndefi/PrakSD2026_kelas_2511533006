package pekan6_2511533006;

public class HapusDLL_2511533006 {
	// fungsi menghapus node awal
	public static NodeDLL_2511533006 delHead_3006(NodeDLL_2511533006 head_3006) {
		if (head_3006 == null) {
			return null;
		}
		head_3006 = head_3006.next_3006;
		if (head_3006 != null) {
			head_3006.prev_3006 = null;
		}
		return head_3006;
	}
	// fungsi  menghapus di akhir
	public static NodeDLL_2511533006 delLast_3006(NodeDLL_2511533006 head_3006) {
		if (head_3006 == null) {
			return null;
		}
		if (head_3006.next_3006 == null) {
			return null;
		}
		NodeDLL_2511533006 curr = head_3006;
		while (curr.next_3006 != null) {
			curr = curr.next_3006;
		}
		// update pointer previous node
		if (curr.prev_3006 != null) {
			curr.prev_3006.next_3006 = null;
		}
		return head_3006;
	}
	// fungsi menghapus node posisi tertentu
	public static NodeDLL_2511533006 delPos_3006(NodeDLL_2511533006 head_3006, int pos_3006) {
	    if (head_3006 == null) {
	        return head_3006;
	    }
	    NodeDLL_2511533006 curr = head_3006;
	    for (int i = 1; curr != null && i < pos_3006; ++i) {
	        curr = curr.next_3006;
	    }
	    if (curr == null) {
	        return head_3006;
	    }
	    if (curr.prev_3006 != null) {
	        curr.prev_3006.next_3006 = curr.next_3006;
	    }
	    if (curr.next_3006 != null) {          // ← DIPERBAIKI: next bukan prev
	        curr.next_3006.prev_3006 = curr.prev_3006;
	    }
	    if (head_3006 == curr) {
	        head_3006 = curr.next_3006;
	    }
	    return head_3006;
	}
		// fungsi mencetak DLL
		public static void printList_3006(NodeDLL_2511533006 head_3006) {
			NodeDLL_2511533006 curr = head_3006;
			while (curr != null) {
				System.out.print(curr.data_3006 + " ");
				curr = curr.next_3006;
			}
			System.out.println();
		}
		public static void main (String[] args) {
			// buat sebuah DLL
			NodeDLL_2511533006 head_3006 = new NodeDLL_2511533006(1);
			head_3006.next_3006 = new NodeDLL_2511533006(2);
			head_3006.next_3006.prev_3006 = head_3006;
			head_3006.next_3006.next_3006 = new NodeDLL_2511533006(3);
			head_3006.next_3006.next_3006.prev_3006 = head_3006.next_3006;
			head_3006.next_3006.next_3006.next_3006 = new NodeDLL_2511533006(4);
			head_3006.next_3006.next_3006.next_3006.prev_3006 = head_3006.next_3006.next_3006;
			head_3006.next_3006.next_3006.next_3006.next_3006 = new NodeDLL_2511533006(5);
			head_3006.next_3006.next_3006.next_3006.next_3006.prev_3006 =	head_3006.next_3006.next_3006.next_3006;
			
			System.out.print("DLL Awal: ");
			printList_3006(head_3006);
			
			System.out.print("Setelah head dihapus ");
			head_3006 = delHead_3006(head_3006);
			printList_3006(head_3006);
			
			System.out.print("Setelah Node terakhir dihapus ");
			head_3006 = delLast_3006(head_3006);
			printList_3006(head_3006);
			
			System.out.print("menghapus node ke 2: ");
			head_3006 = delPos_3006(head_3006, 2);
			
			printList_3006(head_3006);
		}

}
