package pekan7_2511533006;

public class SelectionSort_2511533006 {
	public static void selectionSort_2511533006(int [] arr_3006) {
		int n = arr_3006.length;
		for (int i = 0; i < n; i++) {
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (arr_3006[j] < arr_3006[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr_3006[i];
			arr_3006[i] = arr_3006[minIndex];
			arr_3006[minIndex] = temp;
		}
	}
	public static void main(String[] args) {
		int arr_3006[] = { 23, 78, 45, 8, 32, 56, 1 };
		int n = arr_3006.length;
		System.out.printf("array yang belum terurut:\n");
		for (int i = 0; i < n; i++)
			System.out.print(arr_3006[i] + " ");
		System.out.println("");
		selectionSort_2511533006(arr_3006);
		System.out.printf("array yang terurut:/n");
		for (int i = 0; i < n; i++)
			System.out.print(arr_3006[i] + " ");
		System.out.println("");
	}

}
