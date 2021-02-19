
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//fibonacci dizisinde 4000000 a kadar cift sayilarin toplami
		
		double total=0;
		boolean a=true;
		int i=0;
		while(a) {
			if(fibo(i)>4000000)
				a=false;
			else
				i++;
		}
		
		for(int j=0;j<i;j++) {
			if(fibo(j)%2==0)
				total+=fibo(j);
		}
		
		System.out.println("Toplam="+total);
	}
	
	public static int fibo(int x) {
		
		
		if(x==0)
			return 1;
		else if(x==1)
			return 1;
		else if(x>1)
			return fibo(x-1)+fibo(x-2);
		else
			return 0;
		
	}

}
