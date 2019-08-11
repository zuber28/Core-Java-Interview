package interview;

import java.util.Scanner;

public class BinarySearchInJava {

	public static void main(String[] args) {
		
		
		int arr[]={10,25,45,50,54,62,78,80,90};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be Search");
		int searchItem=80;
		
		int firstIndex=0;
		int lastIndex=arr.length-1;
		int middleIndex=(firstIndex+lastIndex) / 2;
		
		while(lastIndex<=firstIndex)
		{
			if(arr[middleIndex]==searchItem)
				System.out.println("Your are Searching at Middle "+searchItem+" Which is at Index "+middleIndex);
			
			else if(arr[middleIndex]<searchItem)
				firstIndex=middleIndex+1;
			else
				lastIndex=middleIndex-1;
			
			middleIndex=(firstIndex+lastIndex) / 2;
			
		}
		System.out.println("Your are Searching "+searchItem+" Which is at Index "+middleIndex);
		
		

	}

}