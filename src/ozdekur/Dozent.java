package ozdekur;

import java.util.ArrayList;

public class Dozent extends Person {

    private ArrayList<LVA> GeleseneLVA;

    public Dozent(String Vorname, String Nachname, String Id, String Email, int Alter, String Geschlect) {
        super(Vorname, Nachname, Id, Email, Alter, Geschlect);
    }

    public Dozent(String Vorname, String Nachname, String Id, String Email) {
        this.Vorname = Vorname;
        this.Nachname = Nachname;
        this.Id = Id;
        this.Email = Email;
    }

    public Dozent(String Vorname, String Nachname, String Id) {
        this.Vorname = Vorname;
        this.Nachname = Nachname;
        this.Id = Id;
    }

    public Dozent() {
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

    public ArrayList<LVA> getGeleseneLVA() {
        return GeleseneLVA;
    }

    public void setGeleseneLVA(ArrayList<LVA> GeleseneLVA) {
        this.GeleseneLVA = GeleseneLVA;
    }

}
