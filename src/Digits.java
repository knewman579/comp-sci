import java.util.ArrayList;

public class Digits {

	private ArrayList <Integer> digitList;
	
	public Digits (int num){
		digitList = new ArrayList<Integer>();
		if (num == 0){
			digitList.add(num);
		}else{
			while (num > 0){
				int temp = num%10;
				digitList.add(0,temp);
				num /= 10;
			}
		}
		
		System.out.println(digitList);
	}
	
	public boolean isStrictlyIncreasing(){
		for (int i = 0; i < digitList.size() - 1; i++)
			if (digitList.get(i + 1) < digitList.get(i))
				return false;
		return true;
	}
}
