package JavaPractice;

public class ArrayJava {
	
	String [] cars = {"tata","Mahindra","Jeep"};
	
	
	//static method to find the Maximum number in an Array
	
	public static int findMax(int[] arr)
	{
		
		 int max = arr[0];

	        // Loop through the array to find the maximum value
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > max) {
	                max = arr[i]; // Update max if the current element is greater
	            }
	        }

	        // Return the maximum value
	        return max;
	}
	
	//Completed

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] cars = {"tata","Mahindra","Jeep"};
		
		//looping over the Array to print the Array details.
		
		for(int i=0;i<cars.length;i++)
		{
		//System.out.println("Elements of the Array are: \n "+cars[i]);
		}
		
		//Lets change the one of the elements of 
		
		cars[0]="Volvo";
		
		for(int i=0;i<cars.length;i++)
		{
		//System.out.println("Elements of the Array after Modification: \n"+cars[i]);
		}
		
	    //Looping differently and printing the elements
		
		for (String i : cars) {
		  //System.out.println("Looping differently and printing array elements \n"+i);
		}
		
		
		// An array storing different ages
		int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};

		float avg, sum = 0;

		// Get the length of the array
		int length = ages.length;

		// Loop through the elements of the array
		for (int age : ages) {
		  sum += age;
		}

		// Calculate the average by dividing the sum by the length
		avg = sum / length;

		// Print the average
		//System.out.println("The average age is: " + avg);
		
		//Lets find the highest number in the array program.
		
		int[] num= {100,2,3,4,5};
	
		System.out.println("The maximum number in an array is :" +findMax(num));

	}

}
