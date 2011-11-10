import Values.*;

public class Start {
	public static void main(String[] args){
		GenerateValues val = new GenerateValues();
		long timeStart, timeEnd;
		try{
			Thread.sleep(3000);
		}catch(InterruptedException e){
			
		}
		
		val.setValues(4000000, 2);
		timeStart = System.currentTimeMillis();
		val.sortIt();
		timeEnd = System.currentTimeMillis();
		System.out.println((timeEnd - timeStart) + " mSec bei " + Integer.MAX_VALUE + " verschiedene Values");
		for(int i = 30; i < 65; ++i){
			System.out.print(val.getFieldValue(i) + " ");
		}
	}
}
