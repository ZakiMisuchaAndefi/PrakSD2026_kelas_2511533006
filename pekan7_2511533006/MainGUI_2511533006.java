package pekan7_2511533006;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class MainGUI_2511533006 extends JFrame {
    private ArrayList<Mahasiswa_2511533006> listMahasiswa = new ArrayList<>();
    
    private JTextField txtNama, txtNim, txtProdi;
    private JComboBox<String> comboSorting;
    private JTextArea txtVisualisasi;
    private JTable tableMahasiswa;
    private DefaultTableModel tableModel;

    public MainGUI_2511533006() {
        setTitle("Sorting Data Mahasiswa - 2511533006");
        setSize(700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // --- Panel Input ---
        JPanel panelInput = new JPanel(new GridLayout(4, 2, 5, 5));
        panelInput.setBorder(BorderFactory.createTitledBorder("Input Data Mahasiswa"));

        panelInput.add(new JLabel("Nama Mahasiswa:"));
        txtNama = new JTextField();
        panelInput.add(txtNama);

        panelInput.add(new JLabel("NIM:"));
        txtNim = new JTextField();
        panelInput.add(txtNim);

        panelInput.add(new JLabel("Program Studi:"));
        txtProdi = new JTextField();
        panelInput.add(txtProdi);

        JButton btnTambah = new JButton("Tambah Data");
        JButton btnHapus = new JButton("Hapus Data Terakhir");
        panelInput.add(btnTambah);
        panelInput.add(btnHapus);

        // --- Panel Tabel (Data Mahasiswa) ---
        tableModel = new DefaultTableModel(new String[]{"Nama", "NIM", "Program Studi"}, 0);
        tableMahasiswa = new JTable(tableModel);
        JScrollPane scrollTable = new JScrollPane(tableMahasiswa);
        scrollTable.setPreferredSize(new Dimension(650, 150));

        // --- Panel Sorting & Visualisasi ---
        JPanel panelSorting = new JPanel(new BorderLayout());
        JPanel panelKontrolSort = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        String[] algos = {"Insertion Sort", "Selection Sort", "Bubble Sort"};
        comboSorting = new JComboBox<>(algos);
        JButton btnMulaiSort = new JButton("Mulai Sorting");
        
        panelKontrolSort.add(new JLabel("Pilih Algoritma:"));
        panelKontrolSort.add(comboSorting);
        panelKontrolSort.add(btnMulaiSort);

        txtVisualisasi = new JTextArea();
        txtVisualisasi.setEditable(false);
        JScrollPane scrollVisual = new JScrollPane(txtVisualisasi);

        panelSorting.add(panelKontrolSort, BorderLayout.NORTH);
        panelSorting.add(scrollVisual, BorderLayout.CENTER);

        // --- Layout Utama ---
        JPanel panelAtas = new JPanel(new BorderLayout());
        panelAtas.add(panelInput, BorderLayout.NORTH);
        panelAtas.add(scrollTable, BorderLayout.CENTER);

        add(panelAtas, BorderLayout.NORTH);
        add(panelSorting, BorderLayout.CENTER);

        // --- Event Listeners ---
        btnTambah.addActionListener(e -> tambahData_2511533006());
        btnHapus.addActionListener(e -> hapusData_2511533006());
        btnMulaiSort.addActionListener(e -> mulaiSorting_2511533006());
    }

    // Method tambah data mahasiswa via form GUI
    public void tambahData_2511533006() {
        String nama = txtNama.getText().trim();
        String nim = txtNim.getText().trim();
        String prodi = txtProdi.getText().trim();

        if (!nama.isEmpty() && !nim.isEmpty() && !prodi.isEmpty()) {
            listMahasiswa.add(new Mahasiswa_2511533006(nama, nim, prodi));
            refreshTable_2511533006();
            txtNama.setText("");
            txtNim.setText("");
            txtProdi.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Semua field harus diisi!");
        }
    }

    // Method untuk menghapus data terakhir
    public void hapusData_2511533006() {
        if (!listMahasiswa.isEmpty()) {
            listMahasiswa.remove(listMahasiswa.size() - 1);
            refreshTable_2511533006();
        }
    }

    // Method untuk memperbarui tampilan tabel GUI
    public void refreshTable_2511533006() {
        tableModel.setRowCount(0);
        for (Mahasiswa_2511533006 mhs : listMahasiswa) {
            tableModel.addRow(new Object[]{mhs.getNama_2511533006(), mhs.getNim_2511533006(), mhs.getProgramStudi_2511533006()});
        }
    }

    // Method format visualisasi output
    public String getFormatNama_2511533006(ArrayList<Mahasiswa_2511533006> list) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).getNama_2511533006());
            if (i < list.size() - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    // Method pemicu sorting berdasarkan ComboBox
    public void mulaiSorting_2511533006() {
        if (listMahasiswa.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Data mahasiswa masih kosong!");
            return;
        }
        
        ArrayList<Mahasiswa_2511533006> dataSort = new ArrayList<>(listMahasiswa);
        String pilihan = (String) comboSorting.getSelectedItem();
        txtVisualisasi.setText("=== " + pilihan.toUpperCase() + " ===\n");
        System.out.println("=== " + pilihan.toUpperCase() + " ===");

        if (pilihan.equals("Insertion Sort")) {
            insertionSort_2511533006(dataSort);
        } else if (pilihan.equals("Selection Sort")) {
            selectionSort_2511533006(dataSort);
        } else if (pilihan.equals("Bubble Sort")) {
            bubbleSort_2511533006(dataSort);
        }

        listMahasiswa = dataSort;
        refreshTable_2511533006();
        txtVisualisasi.append("\nPengurutan Selesai!");
    }

    // --- IMPLEMENTASI ALGORITMA SORTING ---

    // 1. Insertion Sort
    public void insertionSort_2511533006(ArrayList<Mahasiswa_2511533006> list) {
        for (int i = 1; i < list.size(); i++) {
            Mahasiswa_2511533006 key = list.get(i);
            int j = i - 1;

            while (j >= 0 && list.get(j).getNama_2511533006().compareToIgnoreCase(key.getNama_2511533006()) > 0) {
                list.set(j + 1, list.get(j));
                j = j - 1;
            }
            list.set(j + 1, key);
            
            String step = "Langkah " + i + ": " + getFormatNama_2511533006(list);
            txtVisualisasi.append(step + "\n");
            System.out.println(step);
        }
    }

    // 2. Selection Sort
    public void selectionSort_2511533006(ArrayList<Mahasiswa_2511533006> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).getNama_2511533006().compareToIgnoreCase(list.get(minIdx).getNama_2511533006()) < 0) {
                    minIdx = j;
                }
            }
            Mahasiswa_2511533006 temp = list.get(minIdx);
            list.set(minIdx, list.get(i));
            list.set(i, temp);

            String step = "Pass " + (i + 1) + ": " + getFormatNama_2511533006(list);
            txtVisualisasi.append(step + "\n");
            System.out.println(step);
        }
    }

    // 3. Bubble Sort
    public void bubbleSort_2511533006(ArrayList<Mahasiswa_2511533006> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j).getNama_2511533006().compareToIgnoreCase(list.get(j + 1).getNama_2511533006()) > 0) {
                    Mahasiswa_2511533006 temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
            String step = "Pass " + (i + 1) + ": " + getFormatNama_2511533006(list);
            txtVisualisasi.append(step + "\n");
            System.out.println(step);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainGUI_2511533006().setVisible(true);
        });
    }
}