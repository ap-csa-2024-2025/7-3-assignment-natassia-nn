import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Feel free to test code here
    ArrayList<String> foo - new ArrayList<String>();
    foo.add("A");
    foo.add("B");
    foo.add("C");
    foo.add("D");
    foo.add("E");
    foo.add("F");
    System.out.println("main - ArrayList before shiftLeft: " + foo);
    shiftLeft(foo);
    System.out.println("main - ArrayList after shiftLeft: " + foo);

  }

  public static void shiftLeft(ArrayList<String> arr)
  {
    System.out.println("func - ArrayList before doing anything: " + arr);
    String front = arr.remove(0);
    System.out.println("func - ArrayList after removing element at index 0: 
    " + arr);
    arr.add(front);
    System.out.println("func - ArrayList after appending the front element: " + arr);
  }

  public static printStatistics(final ArrayList<Integer> arr)
  {
    
  }
}
