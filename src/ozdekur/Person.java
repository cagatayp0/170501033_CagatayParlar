package ozdekur;

abstract public class Person {

    protected String Vorname;
    protected String Nachname;
    protected String Id;
    protected String Email;
    protected int Alter;
    protected String Geschlect;

    public Person(String Vorname, String Nachname, String Id, String Email, int Alter, String Geschlect) {
        this.Vorname = Vorname;
        this.Nachname = Nachname;
        this.Id = Id;
        this.Email = Email;
        this.Alter = Alter;
        this.Geschlect = Geschlect;
    }

    public Person(String Vorname, String Nachname, String Id, String Email, int Alter) {
        this.Vorname = Vorname;
        this.Nachname = Nachname;
        this.Id = Id;
        this.Email = Email;
        this.Alter = Alter;
    }

    public Person() {

    }

    public String getVorname() {
        return Vorname;
    }

    public void setVorname(String Vorname) {
        this.Vorname = Vorname;
    }

    public String getNachname() {
        return Nachname;
    }

    public void setNachname(String Nachname) {
        this.Nachname = Nachname;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getAlter() {
        return Alter;
    }

    public void setAlter(int Alter) {
        this.Alter = Alter;
    }

    public String getGeschlect() {
        return Geschlect;
    }

    public void setGeschlect(String Geschlect) {
        this.Geschlect = Geschlect;
    }
    
    public boolean checkId(String s) {
        for (Character c : s.toCharArray()) {
            if (Character.isDigit(c) && s.length()==11) {
                return true;
            }
        }
        return false;
    }

}
