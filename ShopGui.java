package Assignment;

import javax.swing.*;
import java.awt.*;

public class ShopGUI {

    private StockItem currentItem;
    private JTextArea displayArea;

    public ShopGUI() {
        // Main window
        JFrame frame = new JFrame("Car Parts Shop");
        frame.setSize(600, 650);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Item type selector
        JLabel typeLabel = new JLabel("Item Type:");
        String[] types = {"StockItem", "NavSys"};
        JComboBox<String> typeBox = new JComboBox<>(types);

        // Input fields
        JLabel codeLabel = new JLabel("Stock Code:");
        JTextField codeField = new JTextField(10);

        JLabel qtyLabel = new JLabel("Quantity:");
        JTextField qtyField = new JTextField(10);

        JLabel priceLabel = new JLabel("Price:");
        JTextField priceField = new JTextField(10);

        // Buttons
        JButton createBtn = new JButton("Create Stock Item");
        JButton addBtn = new JButton("Add Stock");
        JButton sellBtn = new JButton("Sell Stock");
        JButton priceBtn = new JButton("Change Price");
        JButton displayBtn = new JButton("Display Item");

        // Display area
        displayArea = new JTextArea(15, 50);
        displayArea.setEditable(false);
        JScrollPane scroll = new JScrollPane(displayArea);

        // Button actions
        createBtn.addActionListener(e -> {
            try {
                String code = codeField.getText();
                int qty = Integer.parseInt(qtyField.getText());
                double price = Double.parseDouble(priceField.getText());
                String type = (String) typeBox.getSelectedItem();
                if (type.equals("NavSys")) {
                    currentItem = new NavSys(code, qty, price);
                } else {
                    currentItem = new StockItem(code, qty, price);
                }
                displayArea.setText("Item created!\n\n" + currentItem.toString());
            } catch (Exception ex) {
                displayArea.setText("Error: Please check your inputs.");
            }
        });

        addBtn.addActionListener(e -> {
            if (currentItem == null) {
                displayArea.setText("Please create an item first.");
                return;
            }
            try {
                int qty = Integer.parseInt(qtyField.getText());
                currentItem.addStock(qty);
                displayArea.setText("Stock added!\n\n" + currentItem.toString());
            } catch (Exception ex) {
                displayArea.setText("Error: Please enter a valid quantity.");
            }
        });

        sellBtn.addActionListener(e -> {
            if (currentItem == null) {
                displayArea.setText("Please create an item first.");
                return;
            }
            try {
                int qty = Integer.parseInt(qtyField.getText());
                boolean success = currentItem.sellStock(qty);
                if (success) {
                    displayArea.setText("Stock sold!\n\n" + currentItem.toString());
                } else {
                    displayArea.setText("Not enough stock!\n\n" + currentItem.toString());
                }
            } catch (Exception ex) {
                displayArea.setText("Error: Please enter a valid quantity.");
            }
        });

        priceBtn.addActionListener(e -> {
            if (currentItem == null) {
                displayArea.setText("Please create an item first.");
                return;
            }
            try {
                double price = Double.parseDouble(priceField.getText());
                currentItem.setPrice(price);
                displayArea.setText("Price updated!\n\n" + currentItem.toString());
            } catch (Exception ex) {
                displayArea.setText("Error: Please enter a valid price.");
            }
        });

        displayBtn.addActionListener(e -> {
            if (currentItem == null) {
                displayArea.setText("Please create an item first.");
                return;
            }
            displayArea.setText(currentItem.toString());
        });

        // Add everything to window
        frame.add(typeLabel);
        frame.add(typeBox);
        frame.add(codeLabel);
        frame.add(codeField);
        frame.add(qtyLabel);
        frame.add(qtyField);
        frame.add(priceLabel);
        frame.add(priceField);
        frame.add(createBtn);
        frame.add(addBtn);
        frame.add(sellBtn);
        frame.add(priceBtn);
        frame.add(displayBtn);
        frame.add(scroll);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ShopGUI();
    }
}
