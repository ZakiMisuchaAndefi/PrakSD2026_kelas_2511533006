package pekan5_2511533006;
public class HapusSLL_2511533006 {
	// fungsi untuk menghapus head
	public static NodeSLL_2511533006 deleteHead_2511533006(NodeSLL_2511533006 head_3006) {
		// jika SLL kosong
		if (head_3006 == null)
			return null;
		// pindahkan head ke node berikutnya
		head_3006 = head_3006.next_3006;
		// return head baru
		return head_3006;  }
	// fungsi menghapus node terakhir SLL
	public static NodeSLL_2511533006 removeLastNode_2511533006(NodeSLL_2511533006 head_3006) {
		// jika list kosong, return null
		if (head_3006 == null) {
			return null;
		}
		// jika list satu node, hapus node dan return null
		if (head_3006.next_3006 == null) {
			return null;
		}
		// temukan node terakhir ke dua
		NodeSLL_2511533006 secondLast_3006 = head_3006;
		while (secondLast_3006.next_3006.next_3006 != null) {
			secondLast_3006 = secondLast_3006.next_3006;
		}
		// hapus node terakhir
		secondLast_3006.next_3006 = null;
		return head_3006; }
	// fungsi menghapus node di posisi tertentu
	public static NodeSLL_2511533006 deleteNode_2511533006(NodeSLL_2511533006 head_3006, int position_3006) {
		NodeSLL_2511533006 temp = head_3006;
		NodeSLL_2511533006 prev = null;
		// jika linkedlist null
		if (temp == null)
			return head_3006;
		// kasus 1 : head dihapus
		if (position_3006 == 1) {
			head_3006 = temp.next_3006;
			return head_3006; }
		// kasus 2: menghapus node di tengah
		// telusuri ke node yang dihapus
		for (int i = 1; temp != null && i < position_3006; i++) {
			prev = temp;
			temp = temp.next_3006; }
		// jika ditemukan, hapus node
		if (temp !=null) {
			prev.next_3006 = temp.next_3006;
		} else {
			System.out.println("Data tidak ada"); }
			return head_3006; }
		// fungsi mencetak SLL
		public static void printList_2511533006 (NodeSLL_2511533006 head_3006) {
			NodeSLL_2511533006 curr = head_3006;
			while (curr.next_3006 !=null) {
				System.out.print(curr.data_3006+"-->");
						curr = curr.next_3006;
			}
				if (curr.next_3006 == null) {
						System.out.print(curr.data_3006);
				}
				System.out.println();
		}
		// kelas main
		public static void main (String[] args) {
			// buat sll 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
			NodeSLL_2511533006 head_3006 = new NodeSLL_2511533006(1);
			head_3006.next_3006 = new NodeSLL_2511533006(2);
			head_3006.next_3006.next_3006 = new NodeSLL_2511533006(3);
			head_3006.next_3006.next_3006.next_3006 = new NodeSLL_2511533006(4);
			head_3006.next_3006.next_3006.next_3006.next_3006 = new NodeSLL_2511533006(5);
			head_3006.next_3006.next_3006.next_3006.next_3006.next_3006 = new NodeSLL_2511533006(6);
			// checklist awal
			System.out.println("list awal: ");
			printList_2511533006(head_3006);
			// hapus node terakhir
			head_3006 = removeLastNode_2511533006(head_3006);
			System.out.println("List setelah simpul terakhir di hapus: " );
			printList_2511533006(head_3006);
			// Deleting node at position 2
			int position_3006 = 2;
			head_3006 = deleteNode_2511533006(head_3006, position_3006);
			// Print list after position
			System.out.println("List setelah posisi 2 dihapus");;
			printList_2511533006(head_3006);
			
		}
	}
	


