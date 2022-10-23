package Lambda.LazyParameterApp;

import java.util.function.Supplier;

public class LazyParamApp {


  public static void main(String[] args) {

    /*
    jika kita menggunakan lazy parameter maka hanya yang di butuhkan saja yang di akses
     */
    //testNilai(50,LazyParamApp::getName);//ini menggunakan method reference
    testNilai(50,() -> getName());//ini menggunakan Lambda Lazy
  }

  public static void testNilai(int value, Supplier<String> name){
    if (value > 70){
      System.out.println("Selamat "+name.get()+", anda lulus ujian");
    }else {
      System.out.println("Coba lagi tahun depan yaaa");
    }
  }

  public static String getName(){
    System.out.println("Memanggil method ini");
    return "fajar";
  }






  /*

  ini contoh tidak menggunakan LazyParameter

  public static void main(String[] args) {
    //jika value memenuhi maka var name akan di akses
    cekNilai(80,getName());//akan aman jika valuenya lebih besar dari 80,tapi jika lebih rendah maka field yang ada dalam method getName() akan terpanggil juga
  }

  public static void cekNilai(int value, String name){
    if (value > 80){
      System.out.println("Selamat "+name+", anda telah lulus ujian");
    }else {
      System.out.println("coba lagi tahun depan");
    }
  }

  public static String getName(){
    System.out.println("Method ini telah terpanggil");

    return "fajar abdillah ahmad";
  }


   */
}
