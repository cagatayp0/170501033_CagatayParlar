package ozdekur;

import java.util.ArrayList;

public class Elter extends Person {

    private ArrayList<Student> Kinder;

    public Elter(String Vorname, String Nachname, String Email) {
        this.Vorname = Vorname;
        this.Nachname = Nachname;
        this.Email = Email;
    }

    public ArrayList<Student> getKinder() {
        return Kinder;
    }

    public void setKinder(ArrayList<Student> Kinder) {
        this.Kinder = Kinder;
    }

    @Override
    public String getVorname() {
        return Vorname;
    }

    @Override
    public void setVorname(String Vorname) {
        this.Vorname = Vorname;
    }

    @Override
    public String getNachname() {
        return Nachname;
    }

    @Override
    public void setNachname(String Nachname) {
        this.Nachname = Nachname;
    }

    @Override
    public String getEmail() {
        return Email;
    }

    @Override
    public void setEmail(String Email) {
        this.Email = Email;
    }

}
