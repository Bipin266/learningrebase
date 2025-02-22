package advancejava;

import java.util.List;

public class StreamAPI {
	List<Integer> num;

	public static void main(String[] args) {
		StreamAPI start=new StreamAPI();
		start.add(10);

	}
	
	public void add(int number) {
		for(int i=1;i<=number;i++) {
			if(i%2==0) 
			{num.add(i);}
			
		}
	}
	

}

