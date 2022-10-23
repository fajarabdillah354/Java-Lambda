package Lambda.MethodReference;

import Lambda.denganParameter.AksesAction;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceApp {


  public static void main(String[] args) {
    /*
     Method reference dengan Object Static
     */
    Predicate<String> predicate = StringUtil::isLower;//mengakses Class StringUtil

    System.out.println(predicate.test("FAJAR ABDILLAH AHMAD"));
    System.out.println(predicate.test("fajar abdillah ahmad"));

    /*
    Method reference dengan Parameter
     */
    //Method reference di parameter
    Function<String,Integer> integerFunction = String::length;//Kita bisa menuliskan Tipe datanya dengan syarat mempunyai method sendiri
    System.out.println(integerFunction.apply("fajar abdillah ahmad"));

  }


  /*
  Method reference dengan non static(ini hanya bisa diakses di class lain)
   */
  public void run(){
    /*
    jika yang diakses didalem object itu sendiri kita hanya cukup menggunakan THIS,tapi jika object itu diluar class nya maka mengguanakan var objectnya
     */
    StringUtil util = new StringUtil();
    Predicate<String> stringPredicate = util::isUpper;//Mengakses dengan object lain
    Predicate<String> predicate = this::isUpper;//mengakses method di object sendiri


    System.out.println(predicate.test("fajar"));
    System.out.println(predicate.test("UJEH"));





  }




  public boolean isUpper(String value){
    for (var c : value.toCharArray()){
      if (!Character.isUpperCase(c)){
        return false;
      }
    }
    return true;
  }


}
