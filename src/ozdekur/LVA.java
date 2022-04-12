package ozdekur;

import java.util.ArrayList;

public class LVA {
    private String Name;
    private String Code;
    private String Klassenzimmer;
    
    private ArrayList<Student> Studenten = new ArrayList<>();
    private ArrayList<Pruefung> Pruefungen = new ArrayList<>();
    
    public LVA(String Name, String Code, String Klassenzimmer){
        this.Name = Name;
        this.Code = Code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public String getKlassenzimmer() {
        return Klassenzimmer;
    }

    public void setKlassenzimmer(String Klassenzimmer) {
        this.Klassenzimmer = Klassenzimmer;
    }

    public ArrayList<Student> getStudenten() {
        return Studenten;
    }

    public void setStudenten(ArrayList<Student> Studenten) {
        this.Studenten = Studenten;
    }

    public ArrayList<Pruefung> getPruefungen() {
        return Pruefungen;
    }

    public void setPruefungen(ArrayList<Pruefung> Pruefungen) {
        this.Pruefungen = Pruefungen;
    }
       
}
