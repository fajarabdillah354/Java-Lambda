package Lambda.FunctionalInterface;


import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaApp {

  public static void main(String[] args) {
    Consumer<String> consumer = value -> System.out.println(value);{
      consumer.accept("fajar abdillah ahmad");
    };


    Function<String,Integer> function = s -> s.length();
    System.out.println(function.apply("fajar abdillah ahmad"));


    String name = getName();
    Predicate<String> predicate = value -> value.equals(name);
    boolean getName = predicate.test("fajar abdillah ahmad");
    System.out.println(getName);

    Supplier<String> supplier = () -> getName();
    System.out.println(supplier.get());


  }

  public static String getName(){
    return "fajar abdillah ahmad";
  }



}
