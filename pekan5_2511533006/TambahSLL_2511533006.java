package pekan5_2511533006;

public class TambahSLL_2511533006 {
	public static NodeSLL_2511533006 insertAtFront(NodeSLL_2511533006 head_3006, int value_3006) {
		NodeSLL_2511533006 new_node_3006 = new NodeSLL_2511533006(value_3006);
		new_node_3006.next_3006 = head_3006;
		return new_node_3006;
	}
	// fungsi menambahkan node di akhir SLL
	public static NodeSLL_2511533006 insertAtEnd(NodeSLL_2511533006 head_3006, int value_3006) {
		// buat sebuah node dengan sebuah nilai
		NodeSLL_2511533006 newNode_3006 = new NodeSLL_2511533006(value_3006);
		//jika list kosong maka node hadi head
		if (head_3006 == null) {
			return newNode_3006;
		}
	// simpan head ke variabel sementara
		NodeSLL_2511533006 last_3006 = head_3006;
		// telusuri ke node akhir
		while (last_3006.next_3006 != null) {
			last_3006 = last_3006.next_3006;
		}
		// ubah pointer
		last_3006.next_3006 = newNode_3006;
		return head_3006;
	}
	static NodeSLL_2511533006 GetNode_3006 (int data_3006) {
		return new NodeSLL_2511533006(data_3006);
	}
	static NodeSLL_2511533006 insertPos_3006(NodeSLL_2511533006 headNode_3006, int position_3006, int value_3006) {
		NodeSLL_2511533006 head_3006 = headNode_3006;
		if (position_3006 < 1) {
			System.out.print("Invalid position");
		}
		if (position_3006 == 1) {
			NodeSLL_2511533006 new_node_3006 = new NodeSLL_2511533006(value_3006);
			new_node_3006.next_3006 = head_3006;
			return new_node_3006;
		} else {
			while (position_3006-- != 0) {
				if (position_3006 == 1) {
					NodeSLL_2511533006 newNode_3006 = GetNode_3006(value_3006);
					newNode_3006.next_3006 = headNode_3006.next_3006;
					headNode_3006.next_3006 = newNode_3006;
					break;
				}
				headNode_3006 = headNode_3006.next_3006;
				
			}
			if (position_3006 != 1)
		System.out.print("Posisi di luar jangkauan"); 
			}
		return head_3006; 	
		}
		public static void printList_2511533006 (NodeSLL_2511533006 head_3006) {
			NodeSLL_2511533006 curr = head_3006;
			while (curr.next_3006 !=null) {
				System.out.print(curr.data_3006+"-->");
				curr = curr.next_3006;
		}
		if (curr.next_3006==null) {
			System.out.print(curr.data_3006);  }
		System.out.println();
		
	}
		public static void main(String[] args) {
			// buat linkedlist 2->3->5->6
			NodeSLL_2511533006 head_3006 = new NodeSLL_2511533006(2);
			head_3006.next_3006 = new NodeSLL_2511533006(3);
			head_3006.next_3006.next_3006 = new NodeSLL_2511533006(5);
			head_3006.next_3006.next_3006.next_3006 = new NodeSLL_2511533006(6);
			// cetak list asli
			System.out.print("Senarai berantai awal");
			printList_2511533006(head_3006);
			// tambahkan node baru di depan
			System.out.print("tambah 1 simpul di depan ");
			int data_3006 = 1;
			head_3006 = insertAtFront(head_3006, data_3006);
			// cek update list
			printList_2511533006(head_3006);
			// tambahkan node batu di belakang
			System.out.print("tambah 1 simpul di belakang ");
			int data2_3006 = 7;
			head_3006 = insertAtEnd(head_3006, data2_3006);
			// cetak update list
			printList_2511533006(head_3006);
			System.out.print("tambah 1 simpul ke data 4: ");
			int data3_3006 = 4;
			int pos_3006=4;
			head_3006 = insertPos_3006(head_3006, pos_3006, data3_3006);
			// cetak update list
			printList_2511533006(head_3006);
			
		}

	}
	

