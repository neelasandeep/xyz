package practise;

public class Towerf_Of_Hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tower(3, 'A','B','c'); 

	}
	public static void tower(int n, char start,char use,char end) {
		if(n>0){
			
			tower(n-1,start,end,use);
			System.out.println(start+"->"+end);
			tower(n-1,use,start,end);
			
		}
	}
}
