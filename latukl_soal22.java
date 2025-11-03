import java.util.Scanner;
public class latukl_soal22 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

         //SOAL 2 DI SOAL SEDANG - volume tabung
        System.out.print("\nMasukan jari-jari : ");
        double r = input.nextDouble();
        System.out.print("Masukan tinggi : ");
        double t = input.nextDouble();
        double volume = volumeTabung(r, t);
        System.out.println("Volume tabung adalah : " + volume);
        input.close();
    }
   
    static double volumeTabung(double jariJari, double tinggi) {
        return Math.PI * jariJari * jariJari * tinggi;
    }

}