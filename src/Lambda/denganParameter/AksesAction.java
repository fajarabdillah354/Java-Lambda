package Lambda.denganParameter;


public class AksesAction {
  /*
  dibawah ini adalah contoh Lambda yang tidak menggunakan block
   */
  public static void main(String[] args) {
    Action action = new Action() {
      @Override
      public String intro(String name) {
        return "Hello my name is "+name;
      }
    };
    System.out.println(action.intro("ujeh"));

    //cara membuat lambda
    Action action1 = (String name) -> "nice to meet you "+name;
    System.out.println(action1.intro("ujhe"));

    //dengan tanpa menuliskan tipe datanya
    Action action2 = (name) -> "NICE TO MEET YOU "+name;
    System.out.println(action2.intro("ujhe"));

    //dengan mengubah variabel yang ada di dalam parameter
    Action action3 = value -> "Hallo "+value;//bisa juga memberi dalam kurung untuk variable valuenya
    System.out.println(action3.intro("ujhe"));

  }
}
