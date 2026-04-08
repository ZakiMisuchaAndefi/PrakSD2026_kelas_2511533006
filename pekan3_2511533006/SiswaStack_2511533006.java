package pekan3_2511533006;
import java.util.*;

class Siswa_2511533006 {
	String nama;
	int nim;
	
	public Siswa_2511533006(String nama, int nim) {
		this.nama = nama;
		this.nim = nim;
	}
		
	@Override
	public String toString() {
		return "Nim: " + nim + "Nama: " + nama;
	}
}
public class SiswaStack_2511533006 {
	private ArrayList<Siswa_2511533006> stack;
	
	public SiswaStack_2511533006() {
		stack = new ArrayList<>();
	}
	
	public void push(Siswa_2511533006 mhs) {
		stack.add(mhs);
	}
	
	public Siswa_2511533006 pop() {
		if (!isEmpty()) {
			return stack.remove(stack.size() -1);
		}
		return null;
	}
	
	public Siswa_2511533006 peek() {
		if (!isEmpty()) {
			return stack.get(stack.size() -1);
		}
		return null;
	}
	
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	public void tampilkanSiswa() {
		for (int i = stack.size() - 1; i >=  0; i--) {
			System.out.println(stack.get(i));
		}
	}
	public static void main(String[] args) {
		SiswaStack_2511533006 studentStack = new SiswaStack_2511533006();
		
		Siswa_2511533006 mhs1 = new Siswa_2511533006("Ali", 1);
		Siswa_2511533006 mhs2 = new Siswa_2511533006("Boby", 2);
		Siswa_2511533006 mhs3 = new Siswa_2511533006("Charles", 3);
		
		studentStack.push(mhs1);
		studentStack.push(mhs2);
		studentStack.push(mhs3);
		
		System.out.println("Siswa di dalam stack:");
		studentStack.tampilkanSiswa();
		
		System.out.println("siswa teratas" + studentStack.peek());
		System.out.println("mengeluarkan siswa teratas dari stack: " + studentStack.pop());
		System.out.println("daftar siswa setelah di pop :");
		studentStack.tampilkanSiswa();
	}
}
