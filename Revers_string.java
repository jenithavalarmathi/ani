import java.util.*;
import java.io.*;
public class Revers_string{
  public static void main(String args[])throws IOException{
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String str;
    int i;
    System.out.println("Enter the string:");
    str=br.readLine();
        char[] ch= str.toCharArray();
    for (i =str.length()-1 ; i >=0; i-- ) {
           //char c = str.charAt( i );
                //int j = (int) c;
                    System.out.print(ch[i]);
    }
  }
}
