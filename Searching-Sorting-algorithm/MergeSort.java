package SortingAlgorithm;

  public class MergeSort {
	   static void merge(int arr[],int arr1[],int arr2[]) {
		    
		   int leftsize=arr1.length;
		   int rightsize=arr2.length;
	        
	        int j=0;int i=0;int k=0;
		    while(i<leftsize && j<rightsize) {
		    	if(arr1[i]<=arr2[j]) {
		    		arr[k]=arr1[i];
		    		i++;
		    	}
		    	else {
		    		arr[k]=arr2[j];
		    		j++;
		    	}
		            k++;
		    }
		    while(i<leftsize) {
		    	arr[k]=arr1[i];
		    	i++;
		    	k++;
		    }
		    while(j<rightsize) {
		    	arr[k]=arr2[j];
		    	j++;
		    	k++;
		    }
		 
	    }
	   
	   static void sort(int arr[]) {
		 int len=arr.length;
		   if(len<2) {
			  return;
		  }
		      int mid=len/2;
		      int n1=mid;
			  int n2=len-mid;
			  int arr1[]=new int [n1];
			  int arr2[]=new int[n2];
			    
			    for (int i = 0; i < n1; i++)
		            arr1[i] = arr[i];
			    
		        for (int i = n1; i < len; i++)
		           arr2[i-n1] = arr[i];
		   
			   sort(arr1);
			   sort(arr2);
			   merge(arr,arr1,arr2);
	 
		  
	   }
	   static void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i = 0; i < n; i++)
	        System.out.print(arr[i] + " ");
	           
	    }
	  public static void main(String ar[]) {
		  int arr[]= {2,1,4,5,3,7,6,12,8,11};		 
		   		 
		  sort(arr);
		  printArray( arr);
	}

}
