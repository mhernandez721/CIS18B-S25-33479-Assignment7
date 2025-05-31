package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;

public class EventListController {
    public ListView<Event> eventList;

    public static ObservableList<Event> events = FXCollections.observableArrayList();

    public void initialize() {
        // List is set when screen is loaded
        eventList.setItems(events);
    }

    public void openAddEvent() throws Exception {
        // Switch to Add Event screen
        MainApp.changeScene("AddEventView.fxml");
    }
}
