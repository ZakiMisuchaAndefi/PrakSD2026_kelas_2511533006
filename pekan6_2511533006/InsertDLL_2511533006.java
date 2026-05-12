package pekan6_2511533006;

public class InsertDLL_2511533006 {
	// menambahkan node di awal DLL
	static NodeDLL_2511533006 insertBegin_3006(NodeDLL_2511533006 head_3006, int data_3006) {
		// buat node baru
		NodeDLL_2511533006 new_node_3006 = new NodeDLL_2511533006(data_3006);
		// jadikan pointer next nya head
		new_node_3006.next_3006 = head_3006;
		// jadikan pointer prev ke new_node
		if (head_3006 != null) {
			head_3006.prev_3006 = new_node_3006;
		}
		return new_node_3006;
	}
	// Fungsi menambahkan node di akhir
public static NodeDLL_2511533006 insertEnd_3006(NodeDLL_2511533006 head_3006, int newData_3006) {
	// buat node baru
	NodeDLL_2511533006 newNode_3006 = new NodeDLL_2511533006(newData_3006);
	// jika dll null jadikan head
	if (head_3006 == null) {
		head_3006 = newNode_3006;
	}
	else {
		NodeDLL_2511533006 curr = head_3006;
		while (curr.next_3006 != null) {
			curr = curr.next_3006;
		}
		curr.next_3006 = newNode_3006;
		newNode_3006.prev_3006 = curr;
	}
	return head_3006;
}
	// fungsi menambahkan node di posisi tertentu
public static NodeDLL_2511533006 insertAtPosition_3006(NodeDLL_2511533006 head_3006, int pos_3006, int new_data_3006) {
	NodeDLL_2511533006 new_node_3006 = new NodeDLL_2511533006(new_data_3006);
	if (pos_3006 == 1) {
		new_node_3006.next_3006 = head_3006;
		if (head_3006 != null) {
			head_3006.prev_3006 = new_node_3006;
		}
		head_3006 = new_node_3006;
		return head_3006;
	}
	NodeDLL_2511533006 curr = head_3006;
	for (int i = 1; i < pos_3006 - 1 && curr != null; ++i) {
		curr = curr.next_3006;
	}
	if (curr == null) {
		System.out.println("Posisi tidak ada");
		return head_3006;
	}
	new_node_3006.prev_3006 = curr;
	new_node_3006.next_3006 = curr.next_3006;
	curr.next_3006 = new_node_3006;
	if (new_node_3006.next_3006 != null) {
		new_node_3006.next_3006.prev_3006 = new_node_3006;
	}
	return head_3006;
}
public static void printList_3006(NodeDLL_2511533006 head_3006) {
	NodeDLL_2511533006 curr = head_3006;
	while (curr != null) {
		System.out.print(curr.data_3006 + " <-> ");
		curr = curr.next_3006;
	}
	System.out.println();
}
	public static void main(String[] args) {
	// membuat dll
	NodeDLL_2511533006 head_3006 = new NodeDLL_2511533006(2);
	head_3006.next_3006 = new NodeDLL_2511533006(3);
	head_3006.next_3006.prev_3006 = head_3006;
	head_3006.next_3006.next_3006 = new NodeDLL_2511533006(5);
	head_3006.next_3006.next_3006.prev_3006 = head_3006.next_3006;
	// cetak DLL awal
	System.out.print("DLL Awal: ");
	printList_3006(head_3006);
	// tambah 1 di awal
	head_3006 = insertBegin_3006(head_3006, 1);
	System.out.print(
			"simpul 1 ditambah di awal:");
	printList_3006(head_3006);
	// tambah 6 di akhir
	System.out.print(
			"simpul 6 ditambah di akhir: ");
	int data_3006 = 6;
	head_3006 = insertEnd_3006(head_3006, data_3006);
	printList_3006(head_3006);
	// menambah node 4 di posisi 4
	System.out.print("tambah node 4 di posisi 4: ");
	int pos_3006 = 4;
	head_3006 = insertAtPosition_3006(head_3006, pos_3006, 4);
	printList_3006(head_3006);
}

}
