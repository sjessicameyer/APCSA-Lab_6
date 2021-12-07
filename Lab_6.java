/** Heading  **********************************************/
/*	Your name:
		Class block: 				Date Started:
		Lab Number:
		Title:
		Purpose:
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
    int[] array = setUpArray();
    System.out.print("Original array of 25 elements:");
    displayArray(array);

    for (var i=0; i<2; i++){
      System.out.print("\nWhat entry? ");
      linearSearch(array, input.nextInt());
    }

    //binary search
    System.out.print("\nBinary Search:\n\n Original array of 25 elements: ");
    displayArray(array);
    System.out.print("\nSorted array of 24 elements:");
    Arrays.sort(array);
    displayArray(array);

    //built-in binary search
    System.out.println("\nBuilt-in Binary Search:");
    for (var i=0; i<2; i++){
      System.out.print("\nWhat entry? ");
      System.out.print(Arrays.binarySearch(array, input.nextInt()));
    }

    System.out.println("\nMy iterative Binary Search:");
    for (var i=0; i<2; i++){
      System.out.print("\nWhat entry? ");
      iterBinSearch(array, input.nextInt());
    }

    System.out.println("\nMy Recursive Binary Search:");
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

  public int linearSearch(int[] array, int num){
    //FIX??
    int i = 0, location =-1;
    while(array[i]!=num && i<array.length-1){
      i++;
      if(array[i]==num)
        location = i;
    }
    System.out.print("  status: found at index "+location+" after "+(i+1)+" probes.");
    return i+1;
  }

  public int recBinSearch(int[] array, int num, int min, int max){
    if(true){
      //If you found the num, return!
      System.out.println();
    }if else(true){
      //If all options have been exhausted, return also
      System.out.println();
    }else{
      //Since options remain, recurse with the section of the list which is still a candidate
    }
    return 0;
  }

  public int iterBinSearch(int[] array, int num){
    int min=0, max = array.length, mid= array.length/2, probes=0;
    boolean terminate = false;
    while(array[mid]!=num&&false==terminate){
      if (array[mid]>num){
        max=mid;
        mid=(max-min)/2;
      }
      if (array[mid]<num){
        min=mid;
        mid=(max-min)/2;
      }
      probes++;
      if (max-min==1)
        terminate = true;
    }
    if(array[mid]==num){
      System.out.println("  status: found at index "+mid+" after "+probes+" probes.");
    }else{
      System.out.println("  status: not found after "+probes+" probes.");
    }
    return probes;
  }
}