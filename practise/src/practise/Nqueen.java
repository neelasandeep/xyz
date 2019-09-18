package practise;
//import java.util.BitSet;
import java.util.Scanner;
public class Nqueen {
//	static int d1[]=new int[100];
//	static int d2[]=new int[100];
//
//	
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);System.out.println("enter n value");
//		int n=sc.nextInt();
//		int q[][]=new int[n][n];
//		 int col[]=new int[n];
//	
//		long ans=0;
//		ans=queen(col,q,0,n,ans);
//  System.out.println(ans);
//  sc.close();
//	}
//	public static long queen(int col[],int a[][],int r,int n,long ans) {
//		
//		if(r==n) {
////			for(int i=0;i<n;i++) {
////			
////				for(int j=0;j<n;j++) {
////					System.out.print(a[i][j]);
////				}
////				System.out.println();
////			}
////			System.out.println("----------");	
//			ans++;
//			return  ans;
//		}
//			for(int i=0;i<n;i++) {
//			if(!(col[i]==1) && !(d1[r-i+n-1]==1)&& !(d2[r+i]==1)) {
//				col[i]=d1[r-i+n-1]=d2[r+i]=1;
//				a[r][i]=1;
//				ans=queen(col,a,r+1,n,ans);
//				col[i]=d1[r-i+n-1]=d2[r+i]=0;
//				a[r][i]=0;
//			}
//			}
//		return ans;
//	}
//	
//
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value");
		int n=sc.nextInt();
		String a[][]= new String[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++)
			a[i][j]="_ ";
		}
		int ans=0;
	   ans= solveQueen(a,0,n,ans);
	   System.out.println(ans); 
	   sc.close();
	}
	public static int solveQueen(String[][] a,int i,int n,int ans) {
		if(i==n) {
		for(int row=0;row<n;row++) {
			for(int col=0;col<n;col++) {
				System.out.print(a[row][col]);
			}
			System.out.println();
		}
		
			ans++;
			System.out.println("-----------"+ ans+"---------");
		return ans;	
		}
		for(int j=0;j<n;j++) {
			if(issafe(a,i,j,n)) {
				a[i][j]="Q";
			ans=	solveQueen(a,i+1,n,ans);
					
			
				
			}
			a[i][j]="_ ";
		}
		return ans;
	}
	public static boolean issafe(String[][] a,int i,int j,int n) {
	 for(int row=0;row<i;row++) {
		 if(a[row][j].equals("Q")) {
			 return false;
		 }
	 }
	 ///left diagonal checking
		 int x=i;
		 int y=j;
		 while(x>=0&&y>=0) {
			 if(a[x][y].equals("Q")) {
				 return false;
			 }
			 x--;
			 y--;
		 }
		///right diagonal checking
		  x=i;
		 y=j;
	while(x>=0&&y<n) {
				if(a[x][y].equals("Q")) {
					return false;
				}	
				x--;
				y++;
				}
		
		return true;
	}
}
//


/*
package practise;
import java.util.BitSet;
import java.util.Scanner;
public class Nqueen {
	static BitSet d1=new BitSet(100);
static 	BitSet d2=new BitSet(100);
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);System.out.println("enter n value");
		int n=sc.nextInt();
		int q[][]=new int[n][n];
		 BitSet col=new BitSet(n);
		long ans=0;
		ans=queen(col,q,0,n,ans);
  System.out.println(ans);
  sc.close();
	}
	public static long queen(BitSet col,int a[][],int r,int n,long ans) {
		
		if(r==n) {
//			for(int i=0;i<n;i++) {
//			
//				for(int j=0;j<n;j++) {
//					System.out.print(a[i][j]);
//				}
//				System.out.println();
//			}
//			System.out.println("----------");	
			ans++;
			return  ans;
		}
			for(int i=0;i<n;i++) {
			if(!(col.get(i)) && !(d1.get(r-i+n-1))&& !(d2.get(r+i))) {
				//col[i]=d1[r-i+n-1]=d2[r+i]=0;
				col.set(i,true);d1.set(r-i+n-1,true);d2.set(r+i,true);
				a[r][i]=1;
				ans=queen(col,a,r+1,n,ans);
				col.set(i,false);d1.set(r-i+n-1,false);d2.set(r+i,false);
				//col[i]=d1[r-i+n-1]=d2[r+i]=0;
				a[r][i]=0;
			}
			}
		return ans;
	}
	

}

 * */
