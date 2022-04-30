package ozdekur.java.fx.test;

import java.sql.SQLException;
import ozdekur.Student;
import ozdekur.StudentManager;

public class FindTest {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        StudentManager manager = new StudentManager();
        Student s1 = manager.find("175502302");
        if (s1 != null) {
            System.out.println(s1.getVorname() + s1.getNachname()
                    + s1.getMatrikelnummer());
        }

        Student s2 = manager.find("123421022");
        if (s2 != null) {
            System.out.println(s2.getVorname() + " " +  s2.getNachname()
                    + " " + s2.getMatrikelnummer());
        }
    }
}
