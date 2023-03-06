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
import java.sql.Statement;

import static com.example.hotel.DBConnection.getConnection;

public class AdminController {
    @FXML
    public TextField hotelname;
    @FXML
    public TextField hotelroom_id;
    @FXML
    public TextField Hotlecountry;
    @FXML
    public TextField Roomcost;
    @FXML
    public TextField Roomavailbal;
    @FXML
    public TextField ResHotel_id;
    @FXML
    public TextField Res_room_id;
    @FXML
    public TextField Res_start;
    @FXML
    public TextField Hotale_id;
    @FXML
    public TextField Room_id;
    @FXML
    public Label Reservation_id;
    @FXML
    public TextField Res_End;
    @FXML
    public Button insert1;
    @FXML
    public Button update1;
    @FXML
    public Button delete1;
    @FXML
    public Button insert2;
    @FXML
    public Button update2;
    @FXML
    public Button delete2;
    @FXML
    public Button insert3;
    @FXML
    public Button update3;
    @FXML
    public Button delete3;
    @FXML
    public TextField ress_id;
    @FXML
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
    public TableView TableView3;
    @FXML
    public TableColumn<Reservation,Integer> idColumn3;
    @FXML
    public TableColumn<Reservation,Integer> hotel_idColumn;
    @FXML
    public TableColumn<Reservation,Integer> room_idColumn;
    @FXML
    public TableColumn<Reservation, String> startDay;
    @FXML
    public TableColumn<Reservation,String> endDaYColumn;
    @FXML
    public Button ShowResss;
    @FXML
    public TableColumn<User,Integer> user_id;
    @FXML
    public TableColumn<User,Integer> room_id;
    @FXML
    public TableColumn<User,Integer> hotel_id;
    @FXML
    public TableColumn<User,String> first_name;
    @FXML
    public TableColumn<User,String> last_name;
    @FXML
    public TableColumn<User,String> phone;
    @FXML
    public TableColumn<User,String> country;
    @FXML
    public TableView TableViwe4;
    @FXML
    public TextField RoomsResrrvedtext;
    @FXML
    public TextField RoomsnotResrrvedtext;
    @FXML
    public Button RoomsResrrved1;
    @FXML
    public Button RoomsnotResrrved1;
    @FXML
    public Button homepage;


    public void insert1(ActionEvent actionEvent) {
        String query = "insert into Hotel(hotel_name,room_id,country) values("+"'"+hotelname.getText()+"'"+",'"+hotelroom_id.getText()+"','"+Hotlecountry.getText()+"'"+")";
        executeQuery(query);

    }

    public void update1(ActionEvent actionEvent) {
        String query = "UPDATE Hotel SET hotel_name='"+hotelname.getText()+"',room_id="+hotelroom_id.getText()+",country='"+Hotlecountry.getText()+"' WHERE hotel_id="+Hotale_id.getText()+"";
        executeQuery(query);
    }

    public void delete1(ActionEvent actionEvent) {
        String query = "DELETE FROM Hotel WHERE hotel_id="+Hotale_id.getText()+"";
        executeQuery(query);
    }

    public void insert2(ActionEvent actionEvent) {
        String query = "insert into Room(cost,available) values("+Roomcost.getText()+","+Roomavailbal.getText()+")";
        executeQuery(query);
    }


    public void update2(ActionEvent actionEvent) {
        String query = "UPDATE Room SET cost="+Roomcost.getText()+","+"available="+Roomavailbal.getText()+" WHERE room_id="+Room_id.getText()+"";
        executeQuery(query);

    }

    public void delete2(ActionEvent actionEvent) {
        String query = "DELETE FROM Room WHERE room_id="+Room_id.getText()+"";
        executeQuery(query);
    }

    public void insert3(ActionEvent actionEvent) {
        String query = "insert into Reservation (hotel_id,room_id,startDay,endDay) values ("+ResHotel_id.getText()+","+Res_room_id.getText()+","+"'"+Res_start.getText()+"'"+","+"'"+Res_End.getText()+"'"+")";
        executeQuery(query);
    }

    public void update3(ActionEvent actionEvent) {
        String query = "UPDATE Reservation SET hotel_id="+ResHotel_id.getText()+",room_id="+Res_room_id.getText()+",startDay='"+Res_start.getText()+"',endDay='"+Res_End.getText()+"' WHERE reservation_id="+ress_id.getText()+"";
        executeQuery(query);
    }

    public void delete3(ActionEvent actionEvent) {
        String query = "DELETE FROM Reservation WHERE reservation_id="+ress_id.getText()+"";
        executeQuery(query);
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

    public ObservableList<Reservation> geReservationList(){

        ObservableList<Reservation> reservationList = FXCollections.observableArrayList();
        Connection connection = getConnection();
        String query = "SELECT * FROM Reservation ";
        Statement st;
        ResultSet rs;

        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);
            Reservation reservation;

            while(rs.next()) {
                reservation = new Reservation(rs.getInt("reservation_id"),rs.getInt("hotel_id"),rs.getInt("room_id"),rs.getString("startDay"),rs.getString("endDaY"));
                reservationList.add(reservation);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return reservationList;
    }

    public void showReservation(ActionEvent actionEvent) {

        ObservableList<Reservation> list3 = geReservationList();
        idColumn3.setCellValueFactory(new PropertyValueFactory<Reservation,Integer>("reservation_id"));
        hotel_idColumn.setCellValueFactory(new PropertyValueFactory<Reservation,Integer>("hotel_id"));
        room_idColumn.setCellValueFactory(new PropertyValueFactory<Reservation,Integer>("room_id"));
        startDay.setCellValueFactory(new PropertyValueFactory<Reservation,String>("startDay"));
        endDaYColumn.setCellValueFactory(new PropertyValueFactory<Reservation,String>("endDaY"));
        TableView3.setItems(list3);
    }

    public ObservableList<User> getUserList(){

        ObservableList<User> userList = FXCollections.observableArrayList();
        Connection connection = getConnection();
        String query = "SELECT * from USER";
        Statement st;
        ResultSet rs;

        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);
            User user;

            while(rs.next()) {
                user = new User(rs.getInt("user_id"),rs.getInt("room_id"),rs.getInt("hotel_id"),rs.getString("first_name"),rs.getString("last_name"),rs.getString("phone"),rs.getString("country"));
                userList.add(user);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userList;
    }



    public void users(ActionEvent actionEvent) {

        ObservableList<User> list3 = getUserList();
        user_id.setCellValueFactory(new PropertyValueFactory<User,Integer>("user_id"));
        room_id.setCellValueFactory(new PropertyValueFactory<User,Integer>("room_id"));
        hotel_id.setCellValueFactory(new PropertyValueFactory<User,Integer>("hotel_id"));
        first_name.setCellValueFactory(new PropertyValueFactory<User,String>("first_name"));
        last_name.setCellValueFactory(new PropertyValueFactory<User,String>("last_name"));
        phone.setCellValueFactory(new PropertyValueFactory<User,String>("phone"));
        country.setCellValueFactory(new PropertyValueFactory<User,String>("country"));
        TableViwe4.setItems(list3);
    }

    public int roomsResrrved(ActionEvent actionEvent) {

        Connection connection = getConnection();
        String query = "SELECT count(*) FROM ROOM where available=true ";
        Statement st;
        ResultSet rs=null ;

        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);
            while(rs.next()) {
                RoomsResrrvedtext.setText(String.valueOf(rs.getInt(1)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Integer.parseInt(RoomsResrrvedtext.getText());
    }




    public int roomsnotResrrved(ActionEvent actionEvent) {

        Connection connection = getConnection();
        String query = "SELECT count(*) FROM ROOM where available=false ";
        Statement st;
        ResultSet rs=null ;

        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);
            while(rs.next()) {
                RoomsnotResrrvedtext.setText(String.valueOf(rs.getInt(1)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Integer.parseInt(RoomsnotResrrvedtext.getText());
    }

    public void homepage(ActionEvent actionEvent) {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginPage.fxml"));
            Stage stage = (Stage) homepage.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        }catch (IOException io){
            io.printStackTrace();
        }
    }
}
