package ozdekur;

import java.util.Date;

public class Pruefung {

    private Date Datum;
    private String PruefungsName;

    public Pruefung(Date Datum, String PruefungsName) {
        this.Datum = Datum;
        this.PruefungsName = PruefungsName;
    }

    public Date getDatum() {
        return Datum;
    }

    public void setDatum(Date Datum) {
        this.Datum = Datum;
    }

    public String getPruefungsName() {
        return PruefungsName;
    }

    public void setPruefungsName(String PruefungsName) {
        this.PruefungsName = PruefungsName;
    }

}
