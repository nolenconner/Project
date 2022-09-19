package parkFactor;


public class parkFactor {
	public static double parkFactor(double pf) {
		double pfValue = 0;
		if(pf > 100 && pf > 0) {
			pfValue = (pf - 100) / 100;
			
		}
		
		if (pf < 100 && pf > 0) {
			pfValue = (pf - 100) / 100;
			
		}
		
		return pfValue;
		
				
		
	}

}
