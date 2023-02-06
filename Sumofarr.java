import java.util.Scanner;
public class Sumofarr{
 public static void main(String[] args) {
 	
 	Scanner sc=new Scanner(System.in);
 	System.out.println("Enter no of elements in array:");
 	int x=sc.nextInt();
 	int arr[]=new int[x];

 	System.out.println("Enter array elements:");
 		
 	for(int i=0;i<x;i++)
{
	 arr[i]=sc.nextInt();

}
int sum=0;
for(int i=0;i<x;i++){
	sum+=arr[i];
}
System.out.println("Sum of the elements of array is");
System.out.println(sum);


}
}
