import java.util.*;  
public class Diff {

  public void Diff(int[] a, int[] b) {
       HashSet<Integer> result = new HashSet<>();
      Arrays.sort(b);
    
      for (int elem : a) {
        if (Arrays.binarySearch(b, elem) < 0)
          result.add(elem);
      }
    int[] arr = new int[result.size()];
    int i = 0;
    for (int elem : result) {
      arr[i++] = elem;
    }
    System.out.println(arr);
    
  }


 public static void main(String args[]) {
     
      Diff d = new Diff();
       d.Diff({1, 2,3,6,9,10},{2,5,10,3});
     
     
     
    }



}