package pitcherQuality;

public class Fip {
	

	public static double fipPoints(double fip) {
		double fipValue = 0;
		
		if (fip <= 2.9) {
            fipValue = 33;
        }
		
		if (fip > 2.9 && fip <= 3.25) {
            fipValue = 28.2;

        }

        if (fip > 3.25 && fip <= 3.75) {
            fipValue = 23.5;

        }

        if (fip > 3.75 && fip <= 3.9) {
            fipValue = 18.8;

        }

        if (fip > 3.9 && fip <= 4.2) {
            fipValue = 14.1;

        }

        if (fip > 4.2 && fip <= 4.5) {
            fipValue = 9.4;

        }

        if (fip > 4.5) {
            fipValue = 4.7;

        }
        
        return fipValue;
	}
	
	
}


