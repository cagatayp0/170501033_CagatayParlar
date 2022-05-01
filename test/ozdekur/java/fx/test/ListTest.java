package ozdekur.java.fx.test;

import java.sql.SQLException;
import java.util.List;
import ozdekur.Student;
import ozdekur.StudentManager;

public class ListTest {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        StudentManager manager = new StudentManager();
        List<Student> studentList = manager.list();
        for (Student student : studentList) {
            System.out.println(student.getVorname()
                    + " " + student.getNachname()
                    + " " + student.getMatrikelnummer());
        }
    }
}
