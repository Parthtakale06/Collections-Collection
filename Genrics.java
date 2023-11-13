
package collection;

import java.util.Scanner;
import java.util.*;

public class launch_class4  {
    public static void main(String[] args) {
        
 ArrayList a1= new ArrayList();

 a1.add(5);

 a1.add(56);

 a1.add(15);


 //printing a ArrayList
 System.out.println(a1);




 //sort function implementation
 Collections.sort(a1);

 System.out.println(a1);




 //binary Search Operation
int num=0;

Scanner sc = new Scanner(System.in);
System.out.println("enter the value of num");
num = sc.nextInt();

  int  index =Collections.binarySearch(a1, num);


  if(index <0){
    System.out.println("the element not found");
  }

else{
    
  System.out.println("the inex of the ele is "+index);
}

//rotate method (use to rotate the arrayList from an given index )

Collections.rotate(a1, 1);

System.out.println(a1);


    }
}














