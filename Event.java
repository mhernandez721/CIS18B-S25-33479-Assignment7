package application;

import java.time.LocalDate;

//Simple class to represent an event
public class Event {
 public String title;
 public LocalDate date;
 public String description;

 // Constructor to create event objects fast
 public Event(String title, LocalDate date, String description) {
     this.title = title;
     this.date = date;
     this.description = description;
 }

 // this shows up in the ListView

 public String toString() {
     return title + " (" + date + ")";
 }
}
