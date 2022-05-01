package ozdekur.java.fx.test;

import java.sql.SQLException;
import ozdekur.StudentManager;

public class DeleteTest {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        StudentManager manager = new StudentManager();
        System.out.println(manager.delete("123453122"));
        System.out.println(manager.delete("111111111"));
    }
}
