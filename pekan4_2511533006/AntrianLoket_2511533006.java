package pekan4_2511533006;

import java.util.*;

public class AntrianLoket_2511533006 {
    private String[] queue;
    private int front;
    private int rear;
    private int max;

    public AntrianLoket_2511533006(int max) {
        this.max = max;
        queue = new String[max];
        front = -1;
        rear = -1;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return rear == max - 1;
    }

    public void enqueue(String nama) {
        if (isFull()) {
            System.out.println("Antrian penuh! Tidak dapat menambahkan pelanggan.");
        } else {
            if (front == -1) front = 0;
            rear++;
            queue[rear] = nama;
            System.out.println("Data berhasil ditambahkan ke antrian");
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong! Tidak ada pelanggan yang dilayani.");
        } else {
            String dilayani = queue[front];
            // Geser elemen ke depan
            for (int i = front; i < rear; i++) {
                queue[i] = queue[i + 1];
            }
            queue[rear] = null;
            rear--;
            if (rear < front) {
                front = -1;
                rear = -1;
            }
            System.out.println(dilayani + " telah dilayani");
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Isi antrian:");
            for (int i = front; i <= rear; i++) {
                System.out.println((i - front + 1) + ". " + queue[i]);
            }
        }
    }

    public void Reverse() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        int kiri = front;
        int kanan = rear;
        while (kiri < kanan) {
            String temp = queue[kiri];
            queue[kiri] = queue[kanan];
            queue[kanan] = temp;
            kiri++;
            kanan--;
        }
        System.out.println("Isi antrian:");
        for (int i = front; i <= rear; i++) {
            System.out.println((i - front + 1) + ". " + queue[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AntrianLoket_2511533006 antrian = new AntrianLoket_2511533006(10);
        int pilihan;

        do {
            System.out.println("\n=== PROGRAM ANTRIAN LOKET ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Hapus Antrian");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Reverse");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama pelanggan: ");
                    String nama = scanner.nextLine();
                    antrian.enqueue(nama);
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    antrian.display();
                    break;
                case 4:
                    antrian.Reverse();
                    break;
                case 5:
                    System.out.println("Program selesai");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);

        scanner.close();
    }
}