package ozdekur.java.fx.test;

import java.sql.SQLException;
import ozdekur.Student;
import ozdekur.StudentManager;

public class InsertTest {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Student s1 = new Student("Frank", "Mustermann", "12345678456",
                "frank@mail.com", 21, "Male", "175501546");
        StudentManager manager = new StudentManager();
        boolean inserted = manager.insert(s1);
        System.out.println("Inserted: " + inserted);
    }
}
