package ozdekur;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentManager {

    public boolean insert(Student student) throws ClassNotFoundException, SQLException {
        Connection connection = DatabaseUtilities.getConnection();
        
        String sql = "insert into student (Number, Name, Surname) values (?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, student.getMatrikelnummer());
        statement.setString(2, student.getVorname());
        statement.setString(3, student.getNachname());
        int affected = statement.executeUpdate();

        connection.close();
        return affected == 1;
    }
    
        public Student find(String number) throws ClassNotFoundException, SQLException {
        Student student = null;
        Connection connection = DatabaseUtilities.getConnection();
        String sql = "select * from student where Number=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, number);
        ResultSet resultset = statement.executeQuery();

        if (resultset.next()) {
            student = new Student();
            student.setVorname(resultset.getString("Name"));
            student.setNachname(resultset.getString("Nachname"));
            student.setMatrikelnummer(resultset.getString("Number"));
        }
        connection.close();
        return student;
    }
    
}
