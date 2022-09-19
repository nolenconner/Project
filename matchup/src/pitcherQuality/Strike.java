package pitcherQuality;

public class Strike {
	
	public static double k(double so){
		double kValue = 0;
		
		if (so >= 10) {
            kValue = 33;
        }

        if (so < 10 && so >= 9) {
            kValue = 28.2;

        }

        if (so < 9 && so >= 8.2) {
            kValue = 23.5;

        }

        if (so < 8.2 && so >= 7.7) {
            kValue = 18.8;

        }

        if (so < 7.7 && so >= 7) {
            kValue = 14.1;

        }

        if (so < 7 && so >= 6) {
            kValue = 9.4;

        }

        if (so < 5) {
            kValue = 4.7;

        }
        
        return kValue;
		
	}
	
	public static double csw(double csw1) {
		double cswValue = 0;
		if (csw1 >= 42) {
            cswValue = 33;
        }

        if (csw1 < 42 && csw1 >= 38) {
            cswValue = 28.2;

        }

        if (csw1 < 38 && csw1 >= 34) {
            cswValue = 23.5;

        }

        if (csw1 < 34 && csw1 >= 30) {
            cswValue = 18.8;

        }

        if (csw1 <= 30 && csw1 >= 28) {
            cswValue = 14.1;

        }

        if (csw1 <= 28 && csw1 >= 24) {
            cswValue = 9.4;

        }

        if (csw1 < 24) {
            cswValue = 4.7;

        }
        
        return cswValue;
		
	}
	
	

}
