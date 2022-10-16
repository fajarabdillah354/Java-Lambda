package Lambda.denganTanpaParameter;

public class AksesSimpleAction {
  public static void main(String[] args) {
    SimpleAction simpleAction = new SimpleAction() {
      @Override//JIKA TIDAK MENGGUNAKAN LAMBDA
      public String Action() {
        return "fajar abdillah ahmad";
      }
    };
    System.out.println(simpleAction.Action());


    SimpleAction simpleAction1 = () -> "Fajar abdillah ahmad";
    System.out.println(simpleAction1.Action());
  }

}
