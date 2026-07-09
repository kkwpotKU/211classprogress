package ku.cs.controllers;
// ku.cs.controllers.StudentController

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import ku.cs.models.Student;

public class StudentController {
    @FXML
    private Label idLabel;
    @FXML
    private Label nameLabel;
    @FXML
    private Label scoreLabel;

    @FXML
    public void initialize() {
        Student student = new Student("6810405356", "Pot");
        showStudent(student);
    }

    private void showStudent(Student student) {
        nameLabel.setText(student.getName());
        idLabel.setText(student.getId());
        scoreLabel.setText(String.format("%.2f", student.getScore()));
    }
}
