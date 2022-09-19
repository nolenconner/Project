package pitcherQuality;

public class Predict {
	
	public static double siera(double siera1) {
		double sieraValue = 0;
		if (siera1 <= 2.9) {
            sieraValue = 33;
        }

        if (siera1 > 2.9 && siera1 <= 3.25) {
            sieraValue = 28.2;

        }

        if (siera1 > 3.25 && siera1 <= 3.75) {
            sieraValue = 23.5;

        }

        if (siera1 > 3.75 && siera1 <= 3.9) {
            sieraValue = 18.8;

        }

        if (siera1 > 3.9 && siera1 <= 4.2) {
            sieraValue = 14.1;

        }

        if (siera1 > 4.2 && siera1 <= 4.5) {
            sieraValue = 9.4;

        }

        if (siera1 > 4.5) {
            sieraValue = 4.7;

        }
        
        return sieraValue;
		
	}
	

}
