import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class LibraryApp {
    private JFrame frame;
    private JTable table;

    // Create a list to store the books
    private List<String> books = new ArrayList<>();

    // Create a list to store the non-book items
    private List<String> nonBookItems = new ArrayList<>();

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LibraryApp window = new LibraryApp();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public LibraryApp() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Show the home screen
        showHomeScreen();
    }

    private void showHomeScreen() {
        JPanel panel = new JPanel();
        frame.getContentPane().add(panel, BorderLayout.CENTER);

        JButton btnBooks = new JButton("Books");
        btnBooks.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Create a new panel with more buttons
                JPanel booksPanel = new JPanel();
                booksPanel.setLayout(new BoxLayout(booksPanel, BoxLayout.Y_AXIS));

                // Add a search field
                JTextField searchField = new JTextField();
                booksPanel.add(searchField);

                // Add a button for searching books
                JButton btnSearch = new JButton("Search Books");
                btnSearch.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Create a dialog for entering the search text
                        String searchText = JOptionPane.showInputDialog(frame, "Enter the book name:");

                        // Convert the search text to lower case
                        searchText = searchText.toLowerCase();

                        // Add your code for searching books
                        for (String book : books) {
                            // Convert the book data to lower case before comparing
                            if (book.toLowerCase().contains(searchText)) {
                                JOptionPane.showMessageDialog(frame, "Book found: " + book);
                                return;
                            }
                        }
                        JOptionPane.showMessageDialog(frame, "Book not found: " + searchText);
                    }
                });
                booksPanel.add(btnSearch);

                // Add a button for adding a new book
                JButton btnAddNewBook = new JButton("Add New Book");
                btnAddNewBook.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Create a dialog for adding a new book
                        JDialog addBookDialog = new JDialog(frame, "Add New Book", true);
                        addBookDialog.setLayout(new GridLayout(0, 2));

                        // Add text fields for entering book details
                        addBookDialog.add(new JLabel("Book Name:"));
                        JTextField bookNameField = new JTextField();
                        addBookDialog.add(bookNameField);

                        addBookDialog.add(new JLabel("Author:"));
                        JTextField authorField = new JTextField();
                        addBookDialog.add(authorField);

                        addBookDialog.add(new JLabel("Book Genre:"));
                        JTextField bookGenreField = new JTextField();
                        addBookDialog.add(bookGenreField);

                        // Add a button to submit the new book
                        JButton submitButton = new JButton("Submit");
                        submitButton.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                // Add the new book to the list
                                String newBook = bookNameField.getText() + ", " + authorField.getText() + ", " + bookGenreField.getText();
                                books.add(newBook);

                                // Close the dialog
                                addBookDialog.dispose();
                            }
                        });
                        addBookDialog.add(submitButton);

                        // Show the dialog
                        addBookDialog.pack();
                        addBookDialog.setVisible(true);
                    }
                });
                booksPanel.add(btnAddNewBook);

                // Add a button for removing a book
                JButton btnRemoveBook = new JButton("Remove Book");
                btnRemoveBook.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Create a dialog for entering the book name
                        String bookName = JOptionPane.showInputDialog(frame, "Enter the book name to remove:");

                        // Convert the book name to lower case
                        bookName = bookName.toLowerCase();

                        // Add your code for removing books
                        String finalBookName = bookName;
                        books.removeIf(book -> book.toLowerCase().contains(finalBookName));
                    }
                });
                booksPanel.add(btnRemoveBook);

                JButton btnReturn = new JButton("Return");
                btnReturn.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Remove the current panel
                        frame.getContentPane().removeAll();

                        // Show the home screen
                        showHomeScreen();

                        // Refresh the frame
                        frame.revalidate();
                        frame.repaint();
                    }
                });
                booksPanel.add(btnReturn);

                // Replace the current panel with the new one
                frame.getContentPane().removeAll();
                frame.getContentPane().add(booksPanel, BorderLayout.CENTER);
                frame.revalidate();
                frame.repaint();
            }
        });
        panel.add(btnBooks);

        JButton btnNonBookItems = new JButton("Non-Books Items");
        btnNonBookItems.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Create a new panel with more buttons
                JPanel nonBooksPanel = new JPanel();
                nonBooksPanel.setLayout(new BoxLayout(nonBooksPanel, BoxLayout.Y_AXIS));

                // Add a search field
                JTextField searchField = new JTextField();
                nonBooksPanel.add(searchField);

                // Add a button for searching non-book items
                JButton btnSearch = new JButton("Search Non-Books Items");
                btnSearch.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Create a dialog for entering the search text
                        String searchText = JOptionPane.showInputDialog(frame, "Enter the non-book item name:");

                        // Convert the search text to lower case
                        searchText = searchText.toLowerCase();

                        // Add your code for searching non-book items
                        for (String item : nonBookItems) {
                            // Convert the item data to lower case before comparing
                            if (item.toLowerCase().contains(searchText)) {
                                JOptionPane.showMessageDialog(frame, "Item found: " + item);
                                return;
                            }
                        }
                        JOptionPane.showMessageDialog(frame, "Item not found: " + searchText);
                    }
                });
                nonBooksPanel.add(btnSearch);

                // Add a button for adding a new non-book item
                JButton btnAddNewItem = new JButton("Add New Item");
                btnAddNewItem.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Create a dialog for adding a new non-book item
                        String newItem = JOptionPane.showInputDialog(frame, "Enter the new non-book item name:");

                        // Add the new item to the list
                        nonBookItems.add(newItem);
                    }
                });
                nonBooksPanel.add(btnAddNewItem);

                // Add a button for removing a non-book item
                JButton btnRemoveItem = new JButton("Remove Item");
                btnRemoveItem.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Create a dialog for entering the item name
                        String itemName = JOptionPane.showInputDialog(frame, "Enter the non-book item name to remove:");

                        // Convert the item name to lower case
                        itemName = itemName.toLowerCase();

                        // Add your code for removing non-book items
                        String finalItemName = itemName;
                        nonBookItems.removeIf(item -> item.toLowerCase().contains(finalItemName));
                    }
                });
                nonBooksPanel.add(btnRemoveItem);

                JButton btnReturn = new JButton("Return");
                btnReturn.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Remove the current panel
                        frame.getContentPane().removeAll();

                        // Show the home screen
                        showHomeScreen();

                        // Refresh the frame
                        frame.revalidate();
                        frame.repaint();
                    }
                });
                nonBooksPanel.add(btnReturn);

                // Replace the current panel with the new one
                frame.getContentPane().removeAll();
                frame.getContentPane().add(nonBooksPanel, BorderLayout.CENTER);
                frame.revalidate();
                frame.repaint();
            }
        });
        panel.add(btnNonBookItems);

        JButton btnRooms = new JButton("Rooms");
        btnRooms.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Create a new panel with more buttons
                JPanel roomsPanel = new JPanel();

                // Add buttons for each room
                for (int i = 1; i <= 4; i++) {
                    JButton btnRoom = new JButton("Room " + i);
                    btnRoom.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            // Add your code for showing the room
                            JOptionPane.showMessageDialog(frame, btnRoom.getText() + " clicked.");
                        }
                    });
                    roomsPanel.add(btnRoom);
                }

                JButton btnReturn = new JButton("Return");
                btnReturn.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Remove the current panel
                        frame.getContentPane().removeAll();

                        // Show the home screen
                        showHomeScreen();

                        // Refresh the frame
                        frame.revalidate();
                        frame.repaint();
                    }
                });
                roomsPanel.add(btnReturn);

                // Replace the current panel with the new one
                frame.getContentPane().removeAll();
                frame.getContentPane().add(roomsPanel, BorderLayout.CENTER);
                frame.revalidate();
                frame.repaint();
            }
        });
        panel.add(btnRooms);

        frame.revalidate();
        frame.repaint();
    }
}
