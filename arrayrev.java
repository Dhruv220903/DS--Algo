import java.util.Scanner;
public class arrayrev{
	public static void main(String[] args){
		int arr[]=new int[20];
		int rev[]=new int[20];
		int a,j=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of elements in array:");
		a=sc.nextInt();
		System.out.println("Enter the elements and press enter:");
		for(int i=0;i<a;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Array in reverse order is:"+" ");
		for(int i=a; i>0;i--,j++){
			rev[j]=arr[i-1];
			System.out.println(rev[j]+"");

		}



	}
}