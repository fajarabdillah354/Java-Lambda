package Lambda.MethodReference;

import java.nio.MappedByteBuffer;

public class StringUtil {

  public static boolean isLower(String value){
    for(var c : value.toCharArray()){
      if (Character.isUpperCase(c)){
        return true;
      }
    }
    return false;
  }

  public boolean isUpper(String value){
    for (var g : value.toCharArray()){
      if (!Character.isUpperCase(g)){
        return false;
      }
    }
    return true;
  }

  //mengakses method run yang ada diclass MethodReferenceApp
  public static void main(String[] args) {
    MethodReferenceApp methodReferenceApp = new MethodReferenceApp();
    methodReferenceApp.run();
  }
}
