package com.example.data2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;


public class HelloController implements Initializable {

    @FXML
    public TextField count;
    @FXML
    public TextField namebook;
    @FXML
    public ImageView myImageView;
    @FXML
    private TextField idField;
    @FXML
    private TextField titleField;
    @FXML
    private TextField authorField;
    @FXML
    private TextField yearField;
    @FXML
    private TextField pagesField;
    @FXML
    private Button insertButton;
    @FXML
    private Button updateButton;
    @FXML
    private Button deleteButton;
    @FXML
    private Button restButton;
    @FXML
    private TableView<Books> TableView;
    @FXML
    private TableColumn<Books, Integer> idColumn;
    @FXML
    private TableColumn<Books, String> titleColumn;
    @FXML
    private TableColumn<Books, String> authorColumn;
    @FXML
    private TableColumn<Books, Integer> yearColumn;
    @FXML
    private TableColumn<Books, Integer> pagesColumn;
    @FXML
    private TableView<Books> TableView2;
    @FXML
    private TableColumn<Books, Integer> idColumn2;
    @FXML
    private TableColumn<Books, String> titleColumn2;
    @FXML
    private TableColumn<Books, String> authorColumn2;
    @FXML
    private TableColumn<Books, Integer> yearColumn2;
    @FXML
    private TableColumn<Books, Integer> pagesColumn2;


    @FXML
    private void insertButton() {
        String query = "insert into books values("+idField.getText()+",'"+titleField.getText()+"','"+authorField.getText()+"',"+yearField.getText()+","+pagesField.getText()+")";
        executeQuery(query);
        showBooks();
    }
    @FXML
    private void updateButton() {
        String query = "UPDATE books SET Title='"+titleField.getText()+"',Author='"+authorField.getText()+"',Year="+yearField.getText()+",Pages="+pagesField.getText()+" WHERE ID="+idField.getText()+"";
        executeQuery(query);
        showBooks();
    }

    @FXML
    private void deleteButton() {
        String query = "DELETE FROM books WHERE ID="+idField.getText()+"";
        executeQuery(query);
        showBooks();
    }

    @FXML
    public void countButton(ActionEvent actionEvent) {
        countButton1();
    }

    @FXML
    public void restButton(ActionEvent actionEvent) {

        idField.setText(null);
        titleField.setText(null);
        authorField.setText(null);
        yearField.setText(null);
        pagesField.setText(null);
        count.setText(null);
        namebook.setText(null);

    }
    @FXML
    public void exitButton(ActionEvent actionEvent) {
        System.exit(1);
    }
    public Connection getConnection() {
        Connection connection = null;
        String host="localhost";
        String port="5432";
        String db_name="mahdi";
        String username="postgres";
        String password="password";
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://"+host+":"+port+"/"+db_name+"", ""+username+"", ""+password+"");
            return connection;
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public void executeQuery(String query) {
        Connection connection = getConnection();
        Statement st;
        try {
            st = connection.createStatement();
            st.executeUpdate(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ObservableList<Books> getBooksList(){
        ObservableList<Books> booksList = FXCollections.observableArrayList();
        Connection connection = getConnection();
        String query = "SELECT * FROM books ";
        Statement st;
        ResultSet rs;

        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);
            Books books;
            while(rs.next()) {
                books = new Books(rs.getInt("Id"),rs.getString("Title"),rs.getString("Author"),rs.getInt("Year"),rs.getInt("Pages"));
                booksList.add(books);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return booksList;
    }

    public void showBooks() {
        ObservableList<Books> list = getBooksList();

        idColumn.setCellValueFactory(new PropertyValueFactory<Books,Integer>("id"));
        titleColumn.setCellValueFactory(new PropertyValueFactory<Books,String>("title"));
        authorColumn.setCellValueFactory(new PropertyValueFactory<Books,String>("author"));
        yearColumn.setCellValueFactory(new PropertyValueFactory<Books,Integer>("year"));
        pagesColumn.setCellValueFactory(new PropertyValueFactory<Books,Integer>("pages"));
        TableView.setItems(list);
    }


    public int countButton1( ) {

        Connection connection = getConnection();
        String query = "SELECT Count(*) FROM books ";
        Statement st;
        ResultSet rs=null ;

        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);
            while(rs.next()) {
              count.setText(String.valueOf(rs.getInt(1)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Integer.parseInt(count.getText());
    }

    public ObservableList<Books> getBooksList2(){
        ObservableList<Books> booksList = FXCollections.observableArrayList();
        Connection connection = getConnection();
        String query = "SELECT * FROM books Where title ilike "+"'%" + namebook.getText()+"%'";
        Statement st;
        ResultSet rs;

        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);
            Books books;
            while(rs.next()) {
                books = new Books(rs.getInt("Id"),rs.getString("Title"),rs.getString("Author"),rs.getInt("Year"),rs.getInt("Pages"));
                booksList.add(books);
            }
        } catch (Exception e) {

        }
        return booksList;
    }

    public void showBooks2() {

        ObservableList<Books> list = getBooksList2();

        //idColumn2.setCellValueFactory(new PropertyValueFactory<Books,Integer>("id"));
        titleColumn2.setCellValueFactory(new PropertyValueFactory<Books,String>("title"));
        authorColumn2.setCellValueFactory(new PropertyValueFactory<Books,String>("author"));
        //yearColumn2.setCellValueFactory(new PropertyValueFactory<Books,Integer>("year"));
        //pagesColumn2.setCellValueFactory(new PropertyValueFactory<Books,Integer>("pages"));
        TableView2.setItems(list);
    }

    public void nameBookButton(ActionEvent actionEvent) {
        showBooks2();
    }

    public ObservableList<Books> getBooksList3(){
        ObservableList<Books> booksList = FXCollections.observableArrayList();
        Connection connection = getConnection();
        String query = "SELECT * FROM books ";
        Statement st;
        ResultSet rs;

        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);
            Books books;
            while(rs.next()) {
                books = new Books(rs.getInt("Id"),rs.getString("Title"),rs.getString("Author"),rs.getInt("Year"),rs.getInt("Pages"));
                booksList.add(books);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return booksList;
    }
    public void showBooks3() {

        ObservableList<Books> list = getBooksList();

       // idColumn2.setCellValueFactory(new PropertyValueFactory<Books,Integer>("id"));
        titleColumn2.setCellValueFactory(new PropertyValueFactory<Books,String>("title"));
        authorColumn2.setCellValueFactory(new PropertyValueFactory<Books,String>("author"));
        //yearColumn2.setCellValueFactory(new PropertyValueFactory<Books,Integer>("year"));
        //pagesColumn2.setCellValueFactory(new PropertyValueFactory<Books,Integer>("pages"));
        TableView2.setItems(list);
    }


    public void showAllBooks(ActionEvent actionEvent) {
        showBooks3();

    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Image image=new Image("C:\\Users\\user1\\Downloads\\factory_method_end\\DATA2\\src\\main\\resources\\com\\example\\data2\\book6.png");
        myImageView.setImage(image);

    }
}

