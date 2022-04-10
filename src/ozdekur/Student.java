package ozdekur;

import java.util.ArrayList;

public class Student extends Person {

    private String Matrikelnummer;
    private Double Gesamtnote;
    private ArrayList<LVA> LVAs;
    private ArrayList<Double> Noten;
    private ArrayList<Elter> Eltern;

    public Student(String Vorname, String Nachname, String Id, String Email, int Alter, String Geschlect, String Matrikelnummer) {
        super(Vorname, Nachname, Id, Email, Alter, Geschlect);
        this.Matrikelnummer = Matrikelnummer;
    }

    public String getMatrikelnummer() {
        return Matrikelnummer;
    }

    public void setMatrikelnummer(String Matrikelnummer) {
        this.Matrikelnummer = Matrikelnummer;
    }

    public Double getGesamtnote() {
        return Gesamtnote;
    }

    public void setGesamtnote(Double Gesamtnote) {
        this.Gesamtnote = Gesamtnote;
    }

    public ArrayList<LVA> getLVAs() {
        return LVAs;
    }

    public void setLVAs(ArrayList<LVA> LVAs) {
        this.LVAs = LVAs;
    }

    public ArrayList<Double> getNoten() {
        return Noten;
    }

    public void setNoten(ArrayList<Double> Noten) {
        this.Noten = Noten;
    }

    public ArrayList<Elter> getEltern() {
        return Eltern;
    }

    public void setEltern(ArrayList<Elter> Eltern) {
        this.Eltern = Eltern;
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
    public String getId() {
        return Id;
    }

    @Override
    public void setId(String Id) {
        this.Id = Id;
    }

    @Override
    public String getEmail() {
        return Email;
    }

    @Override
    public void setEmail(String Email) {
        this.Email = Email;
    }

    @Override
    public int getAlter() {
        return Alter;
    }

    @Override
    public void setAlter(int Alter) {
        this.Alter = Alter;
    }

    @Override
    public String getGeschlect() {
        return Geschlect;
    }

    @Override
    public void setGeschlect(String Geschlect) {
        this.Geschlect = Geschlect;
    }

}
