package pekan7_2511533006;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

public class InsertionSortGUI_2511533006 extends JFrame {
	    private static final long serialVersionUID = 1L;
	    private int[] array_3006;
	    private JLabel[] labelArray_3006;
	    private JButton stepButton_3006, resetButton_3006, setButton_3006;
	    private JTextField inputField_3006;
	    private JPanel panelArray_3006;
	    private JTextArea stepArea_3006;

	    private int i = 1, j;
	    private boolean sorting_3006 = false;
	    private int stepCount_3006 = 1;	

	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	    public InsertionSortGUI_2511533006() {
	        setTitle("Insertion Sort Langkah per Langkah");
	        setSize(750, 400);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(null);
	        setLayout(new BorderLayout());

	        // Panel input
	        JPanel inputPanel = new JPanel(new FlowLayout());
	        inputField_3006 = new JTextField(30);
	        setButton_3006 = new JButton("Set Array");
	        inputPanel.add(new JLabel("Masukkan angka (pisahkan dengan koma):"));
	        inputPanel.add(inputField_3006);
	        inputPanel.add(setButton_3006);

	        // Panel array visual
	        panelArray_3006 = new JPanel();
	        panelArray_3006.setLayout(new FlowLayout());

	        // Panel kontrol
	        JPanel controlPanel = new JPanel();
	        stepButton_3006 = new JButton("Langkah Selanjutnya");
	        resetButton_3006 = new JButton("Reset");
	        stepButton_3006.setEnabled(false);
	        controlPanel.add(stepButton_3006);
	        controlPanel.add(resetButton_3006);
	        
	     // Area teks untuk log langkah-langkah
	        stepArea_3006 = new JTextArea(8, 60);
	        stepArea_3006.setEditable(false);
	        stepArea_3006.setFont(new Font("Monospaced", Font.PLAIN, 14));
	        JScrollPane scrollPane = new JScrollPane(stepArea_3006);

	        // Tambahkan panel ke frame
	        add(inputPanel, BorderLayout.NORTH);
	        add(panelArray_3006, BorderLayout.CENTER);
	        add(controlPanel, BorderLayout.SOUTH);
	        add(scrollPane, BorderLayout.EAST);

	        // Event Set Array
	        setButton_3006.addActionListener(e -> setArrayFromInput_3006());

	        // Event Langkah Selanjutnya
	        stepButton_3006.addActionListener(e -> performStep());

	        // Event Reset
	        resetButton_3006.addActionListener(e -> reset());
		
	    }
	    private void setArrayFromInput_3006() {
	        String text = inputField_3006.getText().trim();
	        if (text.isEmpty()) return;
	        String[] parts = text.split(",");
	        array_3006 = new int[parts.length];
	        try {
	            for (int k = 0; k < parts.length; k++) {
	                array_3006[k] = Integer.parseInt(parts[k].trim());
	            }
	        } catch (NumberFormatException e) {
	            JOptionPane.showMessageDialog(this, "Masukkan hanya angka yang dipisahkan "
	                    + "dengan koma!", "Error", JOptionPane.ERROR_MESSAGE);
	            return;
	        }
	        i = 1;
	        stepCount_3006 = 1;
	        sorting_3006 = true;
	        stepButton_3006.setEnabled(true);
	        stepArea_3006.setText("");
	        panelArray_3006.removeAll();
	        labelArray_3006 = new JLabel[array_3006.length];
	        for (int k = 0; k < array_3006.length; k++) {
	            labelArray_3006[k] = new JLabel(String.valueOf(array_3006[k]));
	            labelArray_3006[k].setFont(new Font("Arial", Font.BOLD, 24));
	            labelArray_3006[k].setBorder(BorderFactory.createLineBorder(Color.BLACK));
	            labelArray_3006[k].setPreferredSize(new Dimension(50, 50));
	            labelArray_3006[k].setHorizontalAlignment(SwingConstants.CENTER);
	            panelArray_3006.add(labelArray_3006[k]);
	        }
	        panelArray_3006.revalidate();
	        panelArray_3006.repaint();
	    }
	    private void performStep() {
	        if (i < array_3006.length && sorting_3006) {
	            int key = array_3006[i];
	            j = i - 1;

	            StringBuilder stepLog = new StringBuilder();
	            stepLog.append("Langkah ").append(stepCount_3006).
	            append(": Memasukkan ").append(key).append("\n");

	            while (j >= 0 && array_3006[j] > key) {
	                array_3006[j + 1] = array_3006[j];
	                j--;
	            }
	            array_3006[j + 1] = key;

	            updateLabels();
	            stepLog.append("Hasil: ").append(arrayToString(array_3006)).append("\n\n");
	            stepArea_3006.append(stepLog.toString());

	            i++;
	            stepCount_3006++;

	            if (i == array_3006.length) { 
	                sorting_3006 = false;
	                stepButton_3006.setEnabled(false);
	                JOptionPane.showMessageDialog(this, "Sorting selesai!");
	        }
	        }
	    }
	            private void updateLabels() {
	                for (int k = 0; k < array_3006.length; k++) {
	                    labelArray_3006[k].setText(String.valueOf(array_3006[k]));
	                }
	            }

	            private void reset() {
	                inputField_3006.setText("");
	                panelArray_3006.removeAll();
	                panelArray_3006.revalidate();
	                panelArray_3006.repaint();
	                stepArea_3006.setText("");
	                stepButton_3006.setEnabled(false);
	                sorting_3006 = false;
	                i = 1;
	                stepCount_3006 = 1;
	            }

	            private String arrayToString(int[] arr_3006) {
	                StringBuilder sb = new StringBuilder();
	                for (int k = 0; k < arr_3006.length; k++) {
	                    sb.append(arr_3006[k]);
	                    if (k < arr_3006.length - 1) sb.append(", ");
	                }
	                return sb.toString();
	            }

	            public static void main(String[] args) {
	                SwingUtilities.invokeLater(() -> {
	                    InsertionSortGUI_2511533006 gui = new InsertionSortGUI_2511533006();
	                    gui.setVisible(true);
	                });
	            }
	        }
	        
