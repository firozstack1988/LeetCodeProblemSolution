package ArrayOperation;

public class ArrayString {
	static void rearrangeString(String arr[]) {
		String s1="";
		String s2[]=new String[arr.length];
		for(int i=0;i<arr.length;i++) {
			if(arr[i].endsWith("1")) {
				s2[0]="green";
			}
			else if(arr[i].endsWith("2")) {
				s2[1]="white";
			}
			else if(arr[i].endsWith("3")) {
				s2[2]="blue";
			}
			else if(arr[i].endsWith("4")) {
				s2[3]="red";
			}
			else if(arr[i].endsWith("5")) {
				s2[4]="black";
			}
		}
		for(int j=0;j<s2.length;j++) {
			System.out.print(s2[j]+" ");
		}
	 		 
	} 
	 
	public static void main(String ar[]) {
		String arr[]= {"blue3","white2","red4","green1","black5"};
		rearrangeString(arr);
	}

}
