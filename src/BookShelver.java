import java.util.Scanner;

public class BookShelver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //istifadəçidən kitab sayını soruşuruq
        System.out.print("Rəfə qoyulacaq kitab sayını daxil edin: ");
        int kitabSayi = scanner.nextInt();

        //for dövrü ilə hər kitab üçün mesaj çap edirik
        for (int i=1; i<=kitabSayi; i++){
            System.out.println("Kitab # " + i + ": Rəfə qoyuldu və nömrələndi.");
        }

        //umumi mesaj
        System.out.println("Bütün " + kitabSayi + " kitab rəfə yerləşdirildi.");

        scanner.close();
    }
}
