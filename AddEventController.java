package application;


import javafx.scene.control.*;

public class AddEventController {
    public TextField titleField;     
    public DatePicker datePicker;
    public TextArea descField;

    public void addEvent() throws Exception {
        String title = titleField.getText();
        var date = datePicker.getValue();
        String desc = descField.getText();

        if (title.isEmpty() || date == null) {
            System.out.println("Missing info");
            return;
        }

        Event newEvent = new Event(title, date, desc);
        EventListController.events.add(newEvent);

        MainApp.changeScene("EventListView.fxml");
    }
}
