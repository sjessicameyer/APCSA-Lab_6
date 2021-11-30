/** Heading  **********************************************/
/*	Your name:
		Class block: 				Date Started:
		Lab Number:
		Title:
		Purpose:
*/
 

public class Lab_6{


  public Lab_6(){
    int[] array = setUpArray();
    displayArray(array);
  }

  public void displayArray(int array[]){
    for(var i = 0;i<array.length;i++){
      if((i%10==0))
        System.out.println();
      System.out.format("%3d", array[i]);
    }
  }

  public int[] setUpArray(){
    int[] array = new int[(int)(Math.random()*31+20)];
    for(var i = 0;i<array.length;i++)
      array[i]=(int)(Math.random()*100);
    return array;
  }
}