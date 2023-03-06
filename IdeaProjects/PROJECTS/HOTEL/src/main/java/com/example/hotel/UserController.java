package com.example.hotel;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static com.example.hotel.DBConnection.getConnection;

public class UserController {

    @FXML
    public TextField fname;
    @FXML
    public TextField lname;
    @FXML
    public TextField phone;
    @FXML
    public TextField country;
    @FXML
    public TextField roomReser;
    @FXML
    public Button insertButton;
    @FXML
    public TextField hotel_id;
    public TableView TableView1;
    @FXML
    public TableColumn<Hotel,Integer> idColumn;
    @FXML
    public TableColumn<Hotel,String> nameColumn;
    @FXML
    public TableColumn<Hotel,Integer> roomColumn;
    @FXML
    public TableColumn<Hotel,String> countryColumn;
    @FXML
    public Button Show;
    @FXML
    public TableView TableView2;
    @FXML
    public TableColumn<Room,Integer> idColumn1;
    @FXML
    public TableColumn<Room,Double> costColumn;
    @FXML
    public TableColumn<Room,Boolean> availableColumn;
    @FXML
    public Button ShowRoom;
    @FXML
    public Button homepage;
    @FXML
    public Label mass2;
    @FXML
    public Label mass3;

    public void insertButton(ActionEvent actionEvent) {
            String query = "insert into User(room_id,hotel_id,first_name,last_name,phone,country) values("+roomReser.getText()+","+hotel_id.getText()+",'"+fname.getText()+"'"+",'"+lname.getText()+"'"+",'"+phone.getText()+"'"+",'"+country.getText()+"'"+")";
            executeQuery(query);
            mass2.setText("your data has been saved successfully.");
            mass3.setText(" we will contact you as soon as possible...");

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

    public ObservableList<Hotel> getHotelList(){

        ObservableList<Hotel> hotelList = FXCollections.observableArrayList();
        Connection connection = getConnection();
        String query = "SELECT * FROM Hotel ";
        Statement st;
        ResultSet rs;

        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);
            Hotel hotel;

            while(rs.next()) {
                hotel = new Hotel(rs.getInt("hotel_id"),rs.getString("hotel_name"),rs.getInt("room_id"),rs.getString("country"));
                hotelList.add(hotel);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hotelList;
    }

    public ObservableList<Room> getRoomList(){

        ObservableList<Room> roomList = FXCollections.observableArrayList();
        Connection connection = getConnection();
        String query = "SELECT * FROM ROOM ";
        Statement st;
        ResultSet rs;

        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);
            Room room;

            while(rs.next()) {
                room = new Room(rs.getInt("room_id"),rs.getDouble("cost"),rs.getBoolean("available"));
                roomList.add(room);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return roomList;
    }

    public void showInfo(ActionEvent actionEvent) {

        ObservableList<Hotel> list = getHotelList();
        idColumn.setCellValueFactory(new PropertyValueFactory<Hotel,Integer>("hotel_id"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<Hotel,String>("hotel_name"));
        roomColumn.setCellValueFactory(new PropertyValueFactory<Hotel,Integer>("room_id"));
        countryColumn.setCellValueFactory(new PropertyValueFactory<Hotel,String>("country"));

        TableView1.setItems(list);
    }

    public void showRoom(ActionEvent actionEvent) {
        ObservableList<Room> list2 = getRoomList();
        idColumn1.setCellValueFactory(new PropertyValueFactory<Room,Integer>("room_id"));
        costColumn.setCellValueFactory(new PropertyValueFactory<Room,Double>("cost"));
        availableColumn.setCellValueFactory(new PropertyValueFactory<Room,Boolean>("available"));
        TableView2.setItems(list2);

    }

    public void homepage(ActionEvent actionEvent) {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginPage.fxml"));
            Stage stage = (Stage) homepage.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        }catch (IOException io){
            io.printStackTrace();
        }    }
    }

