
public class SortAndSearch {
	
	//todo: Write a method bubbleSrt which gets an integer array as input and which sorts this array according to the bubblesort algorithm
	//If you don't know how bubblesort works you can read it here: http://www.pkirs.utep.edu/CIS3355/Tutorials/chapter9/tutorial9A/bubblesort.htm
	//Now write another method binSrch. This method again receives an integer array as input together with another integer n.
	//First, it sorts this array by using the bubblSrt method. Then, it searches for n.
	//You can look up the binary search algorithm here: https://www.khanacademy.org/computing/computer-science/algorithms/binary-search/a/binary-search

	public static void main(String[] args) {
	      int a[] = { 9, 2, -6, -9, 4, 12, 15 };
	      System.out.println("Before  Sorting");

	      for(int i = 0; i < a.length; i++) {
	         System.out.print(a[i] + " ");
	      }
	      System.out.println();
	      bubbleSort(a);
	      System.out.println("After  Sorting");

	      for(int i = 0; i < a.length; i++) {
	         System.out.print(a[i] + " ");
			}
			
			// NOTE: there is no call to binSrch
	   }
	
	
		public  static void bubbleSort(int[] a) {
		      int n = a.length;	// NOTE: indentation is a little bit off from here
		      int temp = 0;

		      for(int i = 0; i < n; i++) {
		         for(int j=1; j < (n-i); j++) {
		            if(a[j-1] > a[j]) {
		               temp = a[j-1];
		               a[j-1] = a[j];
		               a[j] = temp;
		            }
		         }
		      }
		   }
		
           public static int binSrch(int arr[], int a, int b, int c){	// NOTE: the implementation is correct, but a little bit more speaking names would be nice
				
	        if (b>=a) 
	        { 
	            int middle = a + (b - a)/2; 
	   
	      
	            if (arr[middle] == c) 
	               return middle; 
	   
	         
	            if (arr[middle] > c) 
	               return binSrch(arr, a, middle-1, c); 
	   
	            return binSrch(arr, middle+1, b, c); 
	        } 
	  
	        return -1; 
	    }
	
		}
