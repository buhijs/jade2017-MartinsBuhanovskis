package search;

public class Search {
	
	/**
	 * Find the first occurrence of x in sorted array a.
	 * @param x value to find
	 * @param a array sorted in increasing order (a[0] <= a[1] <= ... <= a[n-1])
	 * @return lowest i such that a[i]==x, or -1 if x not found in a.
	 */
	public static int find(int x, int[] a) {
		//call binarySearch
		return binarySearch(x,a,0,a.length-1);
	} 
	

	public static int binarySearch(int x, int[] a, int start, int end) {

		int mid = (start+end) / 2;
	    
		if (start == end && x!=a[mid]) {
	        return -1;
	      }
			if (x < a[mid] && mid > 0) {
				return binarySearch(x,a,start,mid-1);/*not a but left half of a */
			} else if (x > a[mid] && mid < a.length-1) {
				return binarySearch(x,a,mid+1,end);/*not a but right half of a */
			} else {
				return mid; // because x == a[mid], i.e. we found it!
			}
	}
}
