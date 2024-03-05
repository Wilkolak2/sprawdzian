import java.util.ArrayList;
import java.util.Objects;

public class Student {
    private String imie;
    private String nazwisko;
    private int numerIndeksu;
    private int rokStudiow;
    private ArrayList<Przedmiot> listaPrzedmiotow = new ArrayList<>();

    public Student(String imie, String nazwisko, int numerIndeksu, int rokStudiow) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerIndeksu = numerIndeksu;
        this.rokStudiow = rokStudiow;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getNumerIndeksu() {
        return numerIndeksu;
    }

    public int getRokStudiow() {
        return rokStudiow;
    }


    public String toString(){
        return String.format("%s %s, numer indeksu: %d, rok studiów: %d",imie,nazwisko,numerIndeksu,rokStudiow);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return numerIndeksu == student.numerIndeksu && rokStudiow == student.rokStudiow && listaPrzedmiotow == student.listaPrzedmiotow && Objects.equals(imie, student.imie) && Objects.equals(nazwisko, student.nazwisko);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko, numerIndeksu, rokStudiow, listaPrzedmiotow);
    }


    public void dodajPrzedmiot(Przedmiot przedmiot){
        listaPrzedmiotow.add(przedmiot);
    }


}
