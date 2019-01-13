package arrays;
import java.util.Random;
public class _00_ArrayCheatSheet {	
	static int s;
	static int d;
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] Globglogabgalab = {"1","2","3","4","5"};
		//2. print the third element in the array
		System.out.println(Globglogabgalab[2]);
		//3. set the third element to a different value
		Globglogabgalab[2]=(Globglogabgalab[0]);
		//4. print the third element again
		System.out.println(Globglogabgalab[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i<Globglogabgalab.length; i++) {
			System.out.println(Globglogabgalab[i]);
		}
		
		//6. make an array of 50 integers
		int[] int0 = new int [50];
		Random rand = new Random();
	
		//7. use a for loop to make every value of the integer array a random number
		for (int a = 1; a < int0.length; a++) {
			int0[a]=rand.nextInt(Integer.MAX_VALUE);
			if(int0[a]<int0[a-1]) {
		s = int0[a];
		}
		}
		//8. without printing the entire array, print only the smallest number in the array
		System.out.println(s);
		//9 print the entire array to see if step 8 was correct
		System.out.println(int0);

		//10. print the largest number in the array.

for (int a = 1; a < int0.length; a++) {
	int0[a]=rand.nextInt(Integer.MAX_VALUE);
	if(int0[a]>int0[a-1]) {
d = int0[a];
}
}
System.out.println(d);
	}
	}
