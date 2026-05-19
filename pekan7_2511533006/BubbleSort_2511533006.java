package pekan7_2511533006;

public class BubbleSort_2511533006 {
    public static void bubbleSort_2511533006(int[] arr_3006) {
        int n = arr_3006.length;
        for (int i_3006 = 0; i_3006 < n; i_3006++) {
            for (int j_3006 = 0; j_3006 < n - i_3006 - 1; j_3006++) {
                if (arr_3006[j_3006] > arr_3006[j_3006 + 1]) {
                    int temp = arr_3006[j_3006];
                    arr_3006[j_3006] = arr_3006[j_3006+ 1];
                    arr_3006[j_3006 + 1] = temp;
                    // System.out.println("data:"+arr[j]+" "+arr[j+1]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr_3006[] = { 23, 78, 45, 8, 32, 56, 1 };
        int n = arr_3006.length;
        System.out.print("array yang belum terurut:");
        for (int i_3006 = 0; i_3006 < n; i_3006++)
            System.out.print(arr_3006[i_3006] + " ");
        System.out.println("");
        bubbleSort_2511533006(arr_3006);
        System.out.print("array yang terurut menggunakan BubleSort:");
        for (int i_3006 = 0; i_3006 < n; i_3006++)
            System.out.print(arr_3006[i_3006] + " ");
        System.out.println("");
    }
}