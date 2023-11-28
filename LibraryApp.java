import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.ResultSet;
import java.util.Vector;

public class LibraryApp {
    private JFrame frame;
    private JTable table;

    // Create a list to store the books
    private List<String> books = new ArrayList<>();

    // Create a list to store the non-book items
    private List<String> nonBookItems = new ArrayList<>();

    public static void main(String[] args) throws Exception{
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

    // Create the JTable with a DefaultTableModel
    DefaultTableModel model = new DefaultTableModel();
    table = new JTable(model);

    // Add the JTable to a JScrollPane for better display
    JScrollPane scrollPane = new JScrollPane(table);

    // Add the JScrollPane to the frame's content pane
    frame.getContentPane().add(scrollPane, BorderLayout.CENTER);

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
                JButton btnSearchBook = new JButton("Search Books");
                btnSearchBook.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JDialog searchBookDialog = new JDialog(frame, "Search Books", true);
                        searchBookDialog.setLayout(new GridLayout(0, 2));
                        
                        searchBookDialog.add(new JLabel("title:"));
                        JTextField titleField = new JTextField();
                        searchBookDialog.add(titleField);

                        searchBookDialog.add(new JLabel("Book Genre:"));
                        JTextField genreField = new JTextField();
                        searchBookDialog.add(genreField);

                        JButton submitButton = new JButton("Submit");
                        submitButton.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                // Add the new book to the list
                                		try
		                                    {
		                                    String title1 = titleField.getText();
                                            String genre = genreField.getText();
		                                    //'sql5664279@gc127m13.cs.unb.ca'
			                                //"sql5664279.cs.unb.ca"
			                                String url = "jdbc:mysql://54.84.79.252:3306/sql5664279";
			                                Connection connector = DriverManager.getConnection(url,"sql5664279","BD4wVguFkr");
			                                String query = "select * from books where title like ? and genre like ?;";
		                                    PreparedStatement prepSt = connector.prepareStatement(query);
                                            prepSt.setString(1, "%" + title1 + "%");
                                            prepSt.setString(2, "%" + genre + "%");
                                          
                                            
                                            ResultSet rs = prepSt.executeQuery();
                                            DefaultTableModel model = (DefaultTableModel) table.getModel(); 
                                            System.out.printf("%-45s | %-23s |\n", "Title", "Genre");
                                            System.out.println("-------------------------------------------------------------------------");
                                            while (rs.next()) {
                                            System.out.printf("%-45s | %-23s |\n", rs.getString(2), rs.getString(5));
                                            model.addRow(new String[]{rs.getString(2), rs.getString(5)});
                                            }
                                        
                                            connector.close();
		                                    }
		                                    catch(SQLException E){
                                               System.out.println("Database error" + E.getMessage());
                                            }
                                            // Close the dialog
                                searchBookDialog.dispose();
                            }
                        });
                        searchBookDialog.add(submitButton);

                        // Show the dialog
                        searchBookDialog.pack();
                        searchBookDialog.setVisible(true);
                    }
                });
                booksPanel.add(btnSearchBook);

                JButton btnAddNewCopy = new JButton("Add New Copy");
                btnAddNewCopy.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JDialog addBookDialog = new JDialog(frame, "Add New Copy", true);
                        addBookDialog.setLayout(new GridLayout(0, 2));
                        addBookDialog.add(new JLabel("Book ID:"));
                        JTextField bookIDField = new JTextField();
                        addBookDialog.add(bookIDField);
                        JButton submitButton = new JButton("Submit");
                        submitButton.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                // Add the new book to the list
                                		try
		                                    {
		                                    //'sql5664279@gc127m13.cs.unb.ca'
			                                //"sql5664279.cs.unb.ca"
			                                String url = "jdbc:mysql://54.84.79.252:3306/sql5664279";
			                                Connection connector = DriverManager.getConnection(url,"sql5664279","BD4wVguFkr");
			                                String query = "update books set quantity = quantity +1 where bookID = ?;";
		                                    PreparedStatement prepSt = connector.prepareStatement(query);
                                            int bookID  = Integer.parseInt(bookIDField.getText());
                                            prepSt.setInt(1, bookID);
                                            int affectedRows = prepSt.executeUpdate();
                                            if (affectedRows == 0)
                                                System.out.println("Book addition was not successful");
                                            else
                                                System.out.println("Book addition was successful");

            
                                            connector.close();
		                                    }
		                                    catch(SQLException E){
                                               System.out.println("Database error" + E.getMessage());
                                            }
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
                        booksPanel.add(btnAddNewCopy);            
                                
                

                // Add a button for adding a new book
                JButton btnAddNewBook = new JButton("Add New Book");
                btnAddNewBook.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Create a dialog for adding a new book
                        JDialog addBookDialog = new JDialog(frame, "Add New Book", true);
                        addBookDialog.setLayout(new GridLayout(0, 2));
                
                        // Add text fields for entering book details
                        addBookDialog.add(new JLabel("Book ID:"));
                        JTextField bookIDField = new JTextField();
                        addBookDialog.add(bookIDField);

                        addBookDialog.add(new JLabel("title:"));
                        JTextField titleField = new JTextField();
                        addBookDialog.add(titleField);
                
                        addBookDialog.add(new JLabel("Author First Name:"));
                        JTextField authorFNameField = new JTextField();
                        addBookDialog.add(authorFNameField);
                
                        addBookDialog.add(new JLabel("Author Last Name:"));
                        JTextField authorLNameField = new JTextField();
                        addBookDialog.add(authorLNameField);
                
                        addBookDialog.add(new JLabel("Book Genre:"));
                        JTextField genreField = new JTextField();
                        addBookDialog.add(genreField);
                
                        addBookDialog.add(new JLabel("Quantity:"));
                        JTextField quantityField = new JTextField();
                        addBookDialog.add(quantityField);
                
                        addBookDialog.add(new JLabel("Quality:"));
                        JTextField qualityField = new JTextField();
                        addBookDialog.add(qualityField);
                
                        addBookDialog.add(new JLabel("Rating:"));
                        JTextField ratingField = new JTextField();
                        addBookDialog.add(ratingField);
                
                        addBookDialog.add(new JLabel("Release Year:"));
                        JTextField releaseYearField = new JTextField();
                        addBookDialog.add(releaseYearField);
                
                        addBookDialog.add(new JLabel("Publisher/Studio:"));
                        JTextField pubOrStudioField = new JTextField();
                        addBookDialog.add(pubOrStudioField);
                
                        addBookDialog.add(new JLabel("Illustrator:"));
                        JTextField illusField = new JTextField();
                        addBookDialog.add(illusField);
                
                        // Add a button to submit the new book
                        JButton submitButton = new JButton("Submit");
                        submitButton.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                // Validate and parse fields
                                try {
                                    int bookID = Integer.parseInt(bookIDField.getText());
                                    String title1 = titleField.getText();
                                    String authorFName = authorFNameField.getText();
                                    String authorLName = authorLNameField.getText();
                                    String genre = genreField.getText();
                                    int quantity = Integer.parseInt(quantityField.getText());
                                    String quality = qualityField.getText();
                                    int rating = Integer.parseInt(ratingField.getText());
                                    int releaseYear = Integer.parseInt(releaseYearField.getText());
                                    String pubOrStudio = pubOrStudioField.getText();
                                    String illus = illusField.getText();
                
                                    // Add your code to perform further validation or processing
                
                                    // Add the new book to the list
                                    try {
                                        //'sql5664279@gc127m13.cs.unb.ca'
                                        //"sql5664279.cs.unb.ca"
                                        String url = "jdbc:mysql://54.84.79.252:3306/sql5664279";
                                        Connection connector = DriverManager.getConnection(url, "sql5664279", "BD4wVguFkr");
                                        String query = "insert into books values (?, ?, ?, ?, ?, ? ,? , ?, ?, ?, ?);";
                                        PreparedStatement prepSt = connector.prepareStatement(query);
                                        prepSt.setInt(1, bookID);
                                        prepSt.setString(2,title1);
                                        prepSt.setString(3, authorFName);
                                        prepSt.setString(4, authorLName);
                                        prepSt.setString(5, genre);
                                        prepSt.setInt(6, quantity);
                                        prepSt.setString(7, quality);
                                        prepSt.setInt(8, rating);
                                        prepSt.setInt(9, releaseYear);
                                        prepSt.setString(10, pubOrStudio);
                                        prepSt.setString(11, illus);
                
                                        int affectedRows = prepSt.executeUpdate();
                                        if (affectedRows == 0)
                                            System.out.println("Book addition was not successful");
                                        else
                                            System.out.println("Book addition was successful");
                
                                        connector.close();
                                    } catch (SQLException E) {
                                        System.out.println("Database error" + E.getMessage());
                                    }
                                } catch (NumberFormatException ex) {
                                    // Handle the case where parsing to int fails
                                    System.out.println("Invalid input for numeric fields. Please enter valid integers.");
                                }
                
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
                JButton btnRemoveBook = new JButton("Remove Copy");
                btnRemoveBook.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JDialog addBookDialog = new JDialog(frame, "Remove Copy", true);
                        addBookDialog.setLayout(new GridLayout(0, 2));
                        addBookDialog.add(new JLabel("Book ID:"));
                        JTextField bookIDField = new JTextField();
                        addBookDialog.add(bookIDField);
                        JButton submitButton = new JButton("Submit");
                        submitButton.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                // Add the new book to the list
                                		try
		                                    {
		                                    //'sql5664279@gc127m13.cs.unb.ca'
			                                //"sql5664279.cs.unb.ca"
			                                String url = "jdbc:mysql://54.84.79.252:3306/sql5664279";
			                                Connection connector = DriverManager.getConnection(url,"sql5664279","BD4wVguFkr");
			                                String query = "update books set quantity = quantity -1 where bookID = ?;";
		                                    PreparedStatement prepSt = connector.prepareStatement(query);
                                            int bookID  = Integer.parseInt(bookIDField.getText());
                                            prepSt.setInt(1, bookID);
                                            int affectedRows = prepSt.executeUpdate();
                                            if (affectedRows == 0)
                                                System.out.println("Book removal was not successful");
                                            else
                                                System.out.println("Book removal was successful");

            
                                            connector.close();
		                                    }
		                                    catch(SQLException E){
                                               System.out.println("Database error" + E.getMessage());
                                            }
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
                        booksPanel.add(btnRemoveBook);

                JButton btnRemoveBook1 = new JButton("Remove Entire Book");
                btnRemoveBook1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JDialog addBookDialog = new JDialog(frame, "Remove Entire Book", true);
                        addBookDialog.setLayout(new GridLayout(0, 2));
                        addBookDialog.add(new JLabel("Book ID:"));
                        JTextField bookIDField = new JTextField();
                        addBookDialog.add(bookIDField);
                        JButton submitButton = new JButton("Submit");
                        submitButton.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                // Add the new book to the list
                                		try
		                                    {
		                                    //'sql5664279@gc127m13.cs.unb.ca'
			                                //"sql5664279.cs.unb.ca"
			                                String url = "jdbc:mysql://54.84.79.252:3306/sql5664279";
			                                Connection connector = DriverManager.getConnection(url,"sql5664279","BD4wVguFkr");
			                                String query = "delete from books where bookID = ?;";
		                                    PreparedStatement prepSt = connector.prepareStatement(query);
                                            int bookID  = Integer.parseInt(bookIDField.getText());
                                            prepSt.setInt(1, bookID);
                                            int affectedRows = prepSt.executeUpdate();
                                            if (affectedRows == 0)
                                                System.out.println("Book removal was not successful");
                                            else
                                                System.out.println("Book removal was successful");

            
                                            connector.close();
		                                    }
		                                    catch(SQLException E){
                                               System.out.println("Database error" + E.getMessage());
                                            }
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
                        booksPanel.add(btnRemoveBook1);

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

                JButton btnAddNewNonBookCopy = new JButton("Add New Non-Book Copy");
                btnAddNewNonBookCopy.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JDialog addBookDialog = new JDialog(frame, "Add New Non-Book Copy", true);
                        addBookDialog.setLayout(new GridLayout(0, 2));
                        addBookDialog.add(new JLabel("Book ID:"));
                        JTextField bookIDField = new JTextField();
                        addBookDialog.add(bookIDField);
                        JButton submitButton = new JButton("Submit");
                        submitButton.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                // Add the new book to the list
                                		try
		                                    {
		                                    //'sql5664279@gc127m13.cs.unb.ca'
			                                //"sql5664279.cs.unb.ca"
			                                String url = "jdbc:mysql://54.84.79.252:3306/sql5664279";
			                                Connection connector = DriverManager.getConnection(url,"sql5664279","BD4wVguFkr");
			                                String query = "update non_books set quantity = quantity +1 where nonBookID = ?;";
		                                    PreparedStatement prepSt = connector.prepareStatement(query);
                                            int bookID  = Integer.parseInt(bookIDField.getText());
                                            prepSt.setInt(1, bookID);
                                            int affectedRows = prepSt.executeUpdate();
                                            if (affectedRows == 0)
                                                System.out.println("Non-Book addition was not successful");
                                            else
                                                System.out.println("Non-Book addition was successful");

            
                                            connector.close();
		                                    }
		                                    catch(SQLException E){
                                               System.out.println("Database error" + E.getMessage());
                                            }
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
                        nonBooksPanel.add(btnAddNewNonBookCopy); 

                // Add a button for searching non-book items
              

                // Add a button for searching books
                JButton btnSearchNonBook = new JButton("Search Non Books");
                btnSearchNonBook.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JDialog searchNonBookDialog = new JDialog(frame, "Search Non Books", true);
                        searchNonBookDialog.setLayout(new GridLayout(0, 2));
                        
                        searchNonBookDialog.add(new JLabel("title:"));
                        JTextField titleField = new JTextField();
                        searchNonBookDialog.add(titleField);

                        searchNonBookDialog.add(new JLabel("Book Genre:"));
                        JTextField genreField = new JTextField();
                        searchNonBookDialog.add(genreField);

                        JButton submitButton = new JButton("Submit");
                        submitButton.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                // Add the new book to the list
                                		try
		                                    {
		                                    String title1 = titleField.getText();
                                            String genre = genreField.getText();
		                                    //'sql5664279@gc127m13.cs.unb.ca'
			                                //"sql5664279.cs.unb.ca"
			                                String url = "jdbc:mysql://54.84.79.252:3306/sql5664279";
			                                Connection connector = DriverManager.getConnection(url,"sql5664279","BD4wVguFkr");
			                                String query = "select * from non_books where title like ? and genre like ?;";
		                                    PreparedStatement prepSt = connector.prepareStatement(query);
                                            prepSt.setString(1, "%" + title1 + "%");
                                            prepSt.setString(2, "%" + genre + "%");
                                          
                                            
                                            ResultSet rs = prepSt.executeQuery();
                                            DefaultTableModel model = (DefaultTableModel) table.getModel();
                                            System.out.printf("%-30s | %-18s |\n", "Title", "Genre");
                                            System.out.println("-----------------------------------------------------");
                                            while (rs.next()) {
                                            System.out.printf("%-30s | %-18s |\n", rs.getString(2), rs.getString(5));
                                            model.addRow(new String[]{rs.getString(2), rs.getString(5)});
                                            }
                                        
                                            connector.close();
		                                    }
		                                    catch(SQLException E){
                                               System.out.println("Database error" + E.getMessage());
                                            }
                                            // Close the dialog
                                searchNonBookDialog.dispose();
                            }
                        });
                        searchNonBookDialog.add(submitButton);

                        // Show the dialog
                        searchNonBookDialog.pack();
                        searchNonBookDialog.setVisible(true);
                    }
                });
                nonBooksPanel.add(btnSearchNonBook);

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
                JButton btnRemoveItem = new JButton("Remove Non-book Copy");
                btnRemoveItem.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JDialog addBookDialog = new JDialog(frame, "Remove Non-book Copy", true);
                        addBookDialog.setLayout(new GridLayout(0, 2));
                        addBookDialog.add(new JLabel("Non-Book ID:"));
                        JTextField bookIDField = new JTextField();
                        addBookDialog.add(bookIDField);
                        JButton submitButton = new JButton("Submit");
                        submitButton.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                // Add the new book to the list
                                		try
		                                    {
		                                    //'sql5664279@gc127m13.cs.unb.ca'
			                                //"sql5664279.cs.unb.ca"
			                                String url = "jdbc:mysql://54.84.79.252:3306/sql5664279";
			                                Connection connector = DriverManager.getConnection(url,"sql5664279","BD4wVguFkr");
			                                String query = "update non_books set quantity = quantity -1 where nonBookID = ?;";
		                                    PreparedStatement prepSt = connector.prepareStatement(query);
                                            int bookID  = Integer.parseInt(bookIDField.getText());
                                            prepSt.setInt(1, bookID);
                                            int affectedRows = prepSt.executeUpdate();
                                            if (affectedRows == 0)
                                                System.out.println("Non-Book removal was not successful");
                                            else
                                                System.out.println("Non-Book removal was successful");

            
                                            connector.close();
		                                    }
		                                    catch(SQLException E){
                                               System.out.println("Database error" + E.getMessage());
                                            }
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
