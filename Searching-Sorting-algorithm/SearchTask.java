package ForkJoinTaskExample;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class SearchTask extends RecursiveTask<Integer>{
	        int arr[];
			int low;
			int high;
			int searchEle;
	
			public SearchTask(int[] arr, int low, int high, int searchEle) {
				this.arr = arr;
				this.low = low;
				this.high = high;
				this.searchEle = searchEle;
			}
	@Override
	protected Integer compute() {
		int size=high-low+1; 
		if(size>3) {
			int mid=(low+high)/2;
			SearchTask Task11=new SearchTask(arr,low,mid,searchEle);
			SearchTask Task12=new SearchTask(arr,mid+1,high,searchEle);
			Task11.fork();
			Task12.fork();
			int result=Task11.join()+Task12.join();
			return result;
		}
		return process();
	}
	 
	protected Integer process() {
		 int count=0;
		 for(int i=low;i<=high;i++) {
			 if(arr[i]==searchEle) {
				 count++;
			 }
		 }
		
		return count;
	}

	public static void main(String ar[]) {
		System.out.println(Thread.currentThread());
		int arr[]= {6,1,2,4,7,8,6,12,14,15,6,18,23,6};
		int low=0;
		int high=arr.length-1;
		int searchEle=6;
		ForkJoinPool pool=ForkJoinPool.commonPool();
		SearchTask task=new SearchTask(arr,low,high,searchEle);
		int result=pool.invoke(task);
		System.out.print(result);
	}
}
