package pekan7_2511533006;

public class InsertionSort_2511533006 {
	public static void insertionSort_2511533006(int [] arr_3006) {
		int n = arr_3006.length;
		for (int i_3006 = 1; i_3006 < n ; i_3006++) {
			int key = arr_3006 [i_3006];
			int j_3006 = i_3006 - 1;
			while (j_3006 >= 0 && arr_3006[j_3006] > key) {
				arr_3006[j_3006 + 1] = arr_3006[j_3006];
				j_3006--;
			}
			arr_3006[j_3006 + 1] = key; }
		}
		
		public static void main(String[] args ) {
			int arr_3006[] = { 23, 78, 45, 8, 32, 56, 1 };
			int n = arr_3006.length;
			System.out.printf("array yang belum terurut:\n");
			for (int i_3006 = 0; i_3006 < n; i_3006++)
				System.out.print(arr_3006[i_3006] + " ");
			System.out.println("");
			insertionSort_2511533006(arr_3006);
			System.out.printf("array yang terurut:\n");
			for (int i_3006 = 0;  i_3006 < n; i_3006++)
				System.out.print(arr_3006[i_3006] + " ");
			System.out.println("");
		
	}

}
