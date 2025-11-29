import java.util.Scanner;

public class FuelStop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yanacaqSeviyyesi=20; //başlanğıc yanacaq səviyyəsi

        while(true) { //sonsuz dövr
            //cari yanacaq səviyyəsini çap edirik
            System.out.println("Cari yanacaq səviyyəsi: "+yanacaqSeviyyesi);

            //sürücüdən yanacaq miqdarını soruşuruq
            System.out.print("Neçə litr yanacaq əlavə etdiniz? ");
            int elaveLitr=scanner.nextInt();

            //yanacaq səviyyəsini artırırıq
            yanacaqSeviyyesi+=elaveLitr;

            //yoxlayırıq ki, hədəfə çatıb-çatmadığını
            if (yanacaqSeviyyesi >= 80) {
                System.out.println("Yanacaq hədəfə çatdı. Səfərə davam!");
                break; //dövrü dayandırırıq
            } else {
                System.out.println("Yanacaq yenə də azdır. Növbəti məntəqəyə gedirik...");
            }
        }

        scanner.close();
    }
}
