package Lambda.OpsionalClass;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

public class OpsionalApp {
  public static void main(String[] args) {
    sayHello(null);//jika sudah menggunakan Optional<T> maka tidak akan menyebabkan error
    sayHello("ujeh");

  }

  /*
  ini jika tidak menggunakan Opsional Class,maka hasil running akan menghasilkan NullpointerException

  public static void sayHello(String name){
    String upper = name.toUpperCase();
    System.out.println("HELLO"+upper);
  }

   */
  public static void sayHello(String name){
    /***

     * method map digunakan untuk merubah atau transformasi pada Optional yang kita beri method ofNurable(kita dapat mengubahnya
     * method ifPresent digunakan untuk mengecek ada atau tidak value dari parameter yang menyebabkan null,jika ada akan di print
     * method orElse digunakan untuk mengganti value yang menyebabkan error dengan sesuatu yang dapat kita setting sendiri
     * method isPresent mengecek apakah null atau tidak,dia akan mengembalikan nilai boolean
     * method Optional<T> mengembalikan nilai kosong/null menjadi opsional
     **/
   Optional<String> optional = Optional.ofNullable(name);
   Optional<String> optionalUpper = optional.map(String::toUpperCase);

   optionalUpper.ifPresent(value -> System.out.println("Hello "+value));

   /*
   contoh menggunakan method orElse,ini akan pertama dieksekusi karna di MAINnya kita panggil nilai yang null
    */
   Optional<String> opsi = Optional.ofNullable(name);
   String get = opsi.orElse("is null");
    System.out.println(get);

    /*
    jika 1 baris jika menggunakan method reference


    Optional.ofNullable(name).map(String::toUpperCase).ifPresent(System.out::println);

     */
  }

}
