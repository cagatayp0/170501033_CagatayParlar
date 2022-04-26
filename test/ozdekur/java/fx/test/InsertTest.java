package ozdekur.java.fx.test;

import java.sql.SQLException;
import ozdekur.Student;
import ozdekur.StudentManager;

public class InsertTest {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Student s1 = new Student("Frank", "Mustermann", "123421022");
        StudentManager manager = new StudentManager();
        boolean inserted = manager.insert(s1);
        System.out.println("Inserted: " + inserted);
    }
}
