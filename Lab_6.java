/** Heading  **********************************************/
/*	Your name: Sarah Meyer
		Class block: G				Date Started:1/1
		Lab Number: 6
		Title: Searching...
		Purpose: Write a program that performs a linear search and a binary search on various arrays, and use the Arrays class.
*/
import java.util.Scanner;
import java.util.Arrays;

public class Lab_6{

  private Scanner input;
  
  public Lab_6(boolean testing){}

  public Lab_6(){
    //setup Scanner
    input = new Scanner(System.in);

    //linear search
    System.out.println("Linear Search:\n");
    int[] array = setUpArray25();
    System.out.print("Original array of 25 elements:");
    displayArray(array);

    for (var i=0; i<2; i++){
      System.out.print("\nWhat entry? ");
      linearSearch(array, input.nextInt());
    }

    //binary search
    System.out.print("\nBinary Search:\n\n Original array of 25 elements: ");
    displayArray(array);
    System.out.print("\nSorted array of 25 elements:");
    Arrays.sort(array);
    displayArray(array);

    //built-in binary search
    System.out.println("\nBuilt-in Binary Search:");
    for (var i=0; i<2; i++){
      System.out.print("\nWhat entry? ");
      int location=Arrays.binarySearch(array, input.nextInt());
      if (location>0)
      System.out.print("  status: found at index "+location+".");
      else
      System.out.print("  status: not found.");
    }

    System.out.println("\n\nMy Iterative Binary Search:");
    for (var i=0; i<2; i++){
      System.out.print("\nWhat entry? ");
      iterBinSearch(array, input.nextInt());
    }
    
    System.out.println("\n\nMy Recursive Binary Search:");
    for (var i=0; i<2; i++){
      System.out.print("\nWhat entry? ");
      recBinSearch(array, input.nextInt(), 0, array.length);
    }

  }

  public void displayArray(int array[]){
    for(var i = 0;i<array.length;i++){
      if((i%10==0))
        System.out.println();
      System.out.format("%3d", array[i]);
    }
    System.out.println();
  }

  public int[] setUpArray(){
    int[] array = new int[(int)(Math.random()*31+20)];
    for(var i = 0;i<array.length;i++)
      array[i]=(int)(Math.random()*100);
    return array;
  }

  public int[] setUpArray25(){
    int[] array = new int[25];
    for(var i = 0;i<array.length;i++)
      array[i]=(int)(Math.random()*100);
    return array;
  }

  public int linearSearch(int[] array, int num){
    int i = 0, location =-1;
    if(array[i]==num)
        location = i;
    while(array[i]!=num && i<array.length-1){
      i++;
      if(array[i]==num)
        location = i;
    }
    System.out.println("  status: found at index "+location+" after "+(i+1)+" probes.");
    return i+1;
  }

  public int recBinSearch(int[] array, int num, int min, int max){
    int probes=0;
    if (max >= min){
      probes++;
      int mid = (min+max) / 2;
      if (array[mid] == num){
        System.out.print("  status: found at index "+mid);
      }else if (array[mid] > num){
        probes=probes+recBinSearch(array, num, min, mid - 1);
      }else{
        probes=probes+recBinSearch(array, num, mid + 1, max);
      }
    }else{
      System.out.print("  status: not found");
    }
    if(max-min==array.length){
      System.out.print(" after "+probes+" probes.");
    }
    return probes;
  }
  
  public int iterBinSearch(int[] array, int num){
    int min = 0, max = array.length - 1, location=-1,mid = (min+max)/2, probes=0;
    while ((min <= max)&&(location==-1)) {
      probes++;
      mid = (min+max)/2;
      if (array[mid] == num)
        location = mid;
      else if (array[mid] < num)
        min = mid + 1;
      else
        max = mid - 1;
    }

    if (location!=-1)
      System.out.print("  status: found at index "+location+" after "+probes+" probes.");
    else
      System.out.print("  status: not found after "+probes+" probes.");
    
    return probes;
  }
}