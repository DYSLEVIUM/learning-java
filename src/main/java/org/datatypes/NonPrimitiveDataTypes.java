package org.datatypes;

public class NonPrimitiveDataTypes {
  public static void main(String[] args) {
    String str1 = "askdjalskdja"; // string will reuse the same object
    System.out.println(str1);

    str1 = "altjwlrq";
//    str1[0] = 'd'; // error
    System.out.println(str1);

    for (int i = 0; i < str1.length(); i++) {
      System.out.println(str1.charAt(i));
    }

    String str2 = new String("lasdjlasdjlasd"); // with new, everytime we call it, it creates a new object
    System.out.println(str2);

    int arr[];
    arr = new int[2];
    arr[0] = 0;
    arr[1] = 1;
    System.out.println(arr[1]);

    Integer[] arr2 = new Integer[10];
//    arr2={1,2,3,4,5,6,7,8,9,0}; // error
    System.out.println(arr2);

    Integer[] arr3 = {1,2,3,4,5,6,7,8,9,0};
    System.out.println(arr3); // doesn't give the first element, but the memory hash code

    Integer arr4[] = new Integer[3];
    arr4[0] = 0;
    arr4[1] = 1;
    arr4[2] = 2;
    System.out.println(arr4[1]);

    // smaller boxes fit in bigger boxes
//    int x = (long)10L; // invalid
    long t = (long) ((int)10); // valid
  }
}
