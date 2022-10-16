package TugasKuliah;

import java.util.Scanner;

public class TugasNumerik {
  
  public static int factorial(int angka){
    if (angka == 1 || angka == 0){
      return 1;
    }else {
      return angka * factorial(angka-1);
    }

  }

  public static void main(String[] args) {
    System.out.println("====== Mesin Pencari Nilai Factorial ========");
    Scanner scanner = new Scanner(System.in);
    System.out.print("Masukan angka yang akan dicari : ");
    int input = scanner.nextInt();
    System.out.println("hasil factorial : "+factorial(input));
    System.out.println("========== terimakasih =========");

  }
}
