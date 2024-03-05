import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Przedmiot przedmiot1 = new Przedmiot("angielski",2);
        System.out.println(przedmiot1);

        Przedmiot przedmiot2 = new Przedmiot("matematyka",3);
        System.out.println(przedmiot2);

        Student student1 = new Student("Anna","Nowak",18,2);
        System.out.println(student1);

        Student student2 = new Student("Szymon","Żak",22,1);
        System.out.println(student2);


    }
}