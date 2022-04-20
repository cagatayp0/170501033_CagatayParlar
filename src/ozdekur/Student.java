package ozdekur;

import java.util.ArrayList;

public class Student extends Person {

    private String Matrikelnummer;
    private Double Gesamtnote;
    
    private ArrayList<LVA> LVAs = new ArrayList<>();
    private ArrayList<Double> Noten = new ArrayList<>();
    private ArrayList<Elter> Eltern = new ArrayList<>();

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
    
        // the method below checks if the student number consists of digits and has a length of 9
    public boolean checkMatrikelNummer(String s) {
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c) && s.length() == 9) {
                return true;
            }
        }
        System.out.println("False student id entered");
        return false;
    }
    
    // Lists the courses that enrolled by student. Database connection will be included later
    public void listLVA() {
        for (LVA lva : LVAs) {
            System.out.println(lva.getName());
        }
    }
    
    public boolean checkLVA(String code) {
        for (LVA lva : LVAs) {
            if (code.equals(lva.getCode())) {
                return true;
            }
        }
        return false;
    }
    
}
