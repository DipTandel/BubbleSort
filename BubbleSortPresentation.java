//BubbleSortPresentation
//ICS4U1, Dip Tandel
//Jan 12, 2022
//All arrays created using numbergenerator.org wesbite, numbers between 0 to 100 and duplicates allowed
//appzaza.com list randomizer used to randomize list

public class BubbleSortPresentation {
  public static int global = 0;

  public static void main(String args[]) {
    //Create Arrays
    int[] arr5 = { 59, 95, 99, 13, 75 }; //5 element array
    int[] arr25 = {
      94,
      1,
      28,
      28,
      93,
      66,
      88,
      35,
      41,
      92,
      47,
      3,
      43,
      2,
      65,
      31,
      3,
      18,
      30,
      57,
      10,
      98,
      4,
      74,
      86,
    }; //25 element array
    int[] arr100 = {
      84,
      32,
      95,
      45,
      77,
      4,
      21,
      32,
      96,
      91,
      100,
      52,
      5,
      79,
      96,
      50,
      93,
      17,
      68,
      68,
      74,
      44,
      79,
      19,
      73,
      37,
      86,
      84,
      21,
      93,
      69,
      75,
      22,
      36,
      14,
      43,
      80,
      63,
      67,
      51,
      69,
      22,
      6,
      98,
      59,
      3,
      72,
      46,
      82,
      17,
      49,
      57,
      49,
      40,
      48,
      8,
      65,
      8,
      100,
      76,
      7,
      38,
      54,
      6,
      78,
      61,
      21,
      56,
      99,
      30,
      33,
      83,
      2,
      31,
      42,
      94,
      1,
      77,
      51,
      64,
      39,
      86,
      62,
      63,
      63,
      21,
      82,
      79,
      55,
      39,
      69,
      89,
      57,
      35,
      99,
      92,
      5,
      51,
      91,
      2,
    }; //100 element array

    //Print Arrays
    System.out.print("Original 5 element array: ");
    for (int i = 0; i < arr5.length; i++) {
      System.out.print(arr5[i] + ",");
    }
    System.out.println();

    System.out.print("Original 25 element array: ");
    for (int i = 0; i < arr25.length; i++) {
      System.out.print(arr25[i] + ",");
    }
    System.out.println();

    System.out.print("Original 100 element array: ");
    for (int i = 0; i < arr100.length; i++) {
      System.out.print(arr100[i] + ",");
    }
    System.out.println();

    //Sort and Print Sorted Arrays

    sort(arr5);
    System.out.println("Sorted 5 element array: ");
    for (int i = 0; i < arr5.length; i++) {
      System.out.print(arr5[i] + ",");
    }
    System.out.println("\n" + global + " comparisons made");
    System.out.println();

    sort(arr25);
    System.out.println("Sorted 25 element array: ");
    for (int i = 0; i < arr25.length; i++) {
      System.out.print(arr25[i] + ",");
    }
    System.out.println("\n" + global + " comparisons made");
    System.out.println();

    sort(arr100);
    System.out.println("Sorted 100 element array: ");
    for (int i = 0; i < arr100.length; i++) {
      System.out.print(arr100[i] + ",");
    }
    System.out.println("\n" + global + " comparisons made");
    System.out.println();
  }

  public static void sort(int arr[]) {
    global = 0;
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) { //continues to sift through array until the array is sorted
        global++;
        if (arr[j] > arr[j + 1]) { //if the following values in the array are smaller, they are swapped (because least to greatest)
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }
}
