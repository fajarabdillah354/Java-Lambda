package Lambda.Collection;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaCollectionApp {


  public static void main(String[] args) {
    //withMap();
    withIterable();
  }

  public static void withMap(){
    /***
     * lambda with collection map
     * use method forEach and BiConsumer Class because there are two generic paramater for accept two data (key and value)
     *
     ***/
    Map<String,Integer> date = new HashMap<>();
    date.put("fajar",21);
    date.put("ari",25);
    date.put("ujeh",20);
    date.put("siti",19);

    //dengan foreach biasa
    System.out.println("====== dengan foreach biasa ======");
    for (var value : date.entrySet()){
      System.out.println(value.getKey()+" : "+value.getValue());
    }


    System.out.println("====== dengan anoymous class ======");
    //dengan anonymous class
    date.forEach(new BiConsumer<String, Integer>() {
      @Override
      public void accept(String key, Integer value) {
        System.out.println(key+":"+value);
      }
    });


    System.out.println("===== dengan menggunakan lambda =======");
    //dengan menggunakan lambda
    date.forEach((key, value) -> System.out.println(key+":"+value));

  }


  public static void withCollectionRemoveIf(){
    /***
    Lambda with CollectionRemoveIF
     * we can use removeIf method and Class Predicate for a param
     *
     ***/
    List<String> list = new ArrayList<>();
    list.addAll(List.of("fajar","johnlennon","Kelyraleora"));
    

    //dengan anonymous class
    list.removeIf(new Predicate<String>() {
      @Override
      public boolean test(String value) {
        return value.length() > 5;
      }
    });
    System.out.println(list);

    //denga lambda
    list.removeIf(value -> value.length() > 5);
    System.out.println(list);
  }


  public static void withIterable(){

    /*
    ***** Lambda dengan Collection Iterable *****
    * kita dapat menerima data dengan menggunakan forEach lalu parameternya kita akses ke Consumer
    * Class Consumer hanya digunakan untuk menerima data
     */
    Iterable<String> list = List.of("fajar","andi","rere","julianto");

    //dengan Anonymous Class
    list.forEach(new Consumer<String>() {
      @Override
      public void accept(String value) {
        System.out.println(value);
      }
    });

    //dengan Lambda Expresion
    list.forEach(value -> System.out.println(value));


    //dengan method reference Expresion
    list.forEach(System.out::println);
  }


}
