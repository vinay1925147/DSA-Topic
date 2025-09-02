import java.util.*;

public class Problem2 {
  int[] sum_Target(int arr[], int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      int diff = target - arr[i];
      if (map.containsKey(diff)) {
        System.out.println(i + " " + map.get(diff));
        return new int[] { i, map.get(diff) };
      }
      map.put(arr[i], i);
    }
    return new int[] {};
  }

  int removeDuplicate(int arr[]) {
    HashSet<Integer> set = new HashSet<>();
    for (int i = 0; i < arr.length; i++) {
      set.add(arr[i]);
    }
    // System.out.println(set.size());
    return set.size();
  }

  List<Integer> findUI(int arr1[], int arr2[]) {
    HashSet<Integer> set = new HashSet<>();
    // union
    // for(int i=0;i<arr1.length;i++){ //set -> 7,3,9
    // set.add(arr1[i]);
    // }
    // for(int j=0;j<arr2.length;j++){ //set -> 7,3,9,6,2,4
    // set.add(arr2[j]);
    // }
    // System.out.println("Union element is :"+set);

    // set.clear();
    // inetersection

    for (int i = 0; i < arr1.length; i++) {
      set.add(arr1[i]);
    }
    int count = 0;
    List<Integer> list = new ArrayList<>();
    for (int j = 0; j < arr2.length; j++) {
      if (set.contains(arr2[j])) {
        // count++;
        list.add(arr2[j]);
        set.remove(arr2[j]);
        //
        // return false;
      }

    }
    return list;
    // return true;
    // System.out.println("count of intersection element is:"+count);
  }

  public void sortString_Latter(String str) {
    TreeMap<Character, Integer> map = new TreeMap<>();
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      map.put(ch, map.getOrDefault(ch, 0) + 1);
    }
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (!map.isEmpty()) {
        if (map.get(ch) == 1) {
          System.out.println(ch);
          map.remove(ch);
        } else
          map.put(ch, map.get(ch) - 1);
      }
    }
    System.out.println();
  }

  char findMap(String str) {
    TreeMap<Character, Integer> map = new TreeMap<>();
    for (int j = 0; j < str.length(); j++) {
      char ch = str.charAt(j);
      map.put(ch, map.getOrDefault(ch, 0) + 1);
    }
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (map.get(ch) == 1)
        return ch;

    }
    return '$';
  }

  public static void main(String args[]) {
    int arr1[] = { 1, 2, 3, 4, 5 };
    int arr2[] = { 10, 10, 20, 20, 30, 10 };
    int arr[] = { 3, 2, 4, 5, 6 };
    Problem2 obj = new Problem2();

    System.out.println(obj.removeDuplicate(arr2));
    // System.out.println( obj.findUI(arr1,arr2));
    // System.out.println( obj.sum_Target(arr, 9));
    // obj.sortString_Latter("cccaaa");
    String str = "ccaaa";
    // System.out.println(obj.findMap(str));

  }
}
