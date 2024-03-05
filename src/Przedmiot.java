import java.util.Objects;

public class Przedmiot {
    private String przedmiot;
    private int liczbaPunktow;

    public Przedmiot(String przedmiot, int liczbaPunktow) {
        this.przedmiot = przedmiot;
        this.liczbaPunktow = liczbaPunktow;
    }

    public Przedmiot(String przedmiot) {
        this.przedmiot = przedmiot;
    }

    public Przedmiot() {
    }


    public String getPrzedmiot() {
        return przedmiot;
    }

    public void setPrzedmiot(String przedmiot) {
        this.przedmiot = przedmiot;
    }

    public int getLiczbaPunktow() {
        return liczbaPunktow;
    }

    public void setLiczbaPunktow(int liczbaPunktow) {
        this.liczbaPunktow = liczbaPunktow;
    }

    @Override
    public String toString() {
        return String.format(przedmiot + " - " + liczbaPunktow);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Przedmiot przedmiot1 = (Przedmiot) o;
        return liczbaPunktow == przedmiot1.liczbaPunktow && Objects.equals(przedmiot, przedmiot1.przedmiot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(przedmiot, liczbaPunktow);

    }
}
