package hitterQuality;

public class wrc {
	public static double wrc(double wrc1){
		double wrcValue = 0;
		
		if (wrc1 >= 160) {
            wrcValue = 99;
        }

        if (wrc1 < 160 && wrc1 >= 140) {
            wrcValue = 84.84;

        }

        if (wrc1 < 140 && wrc1 >= 115) {
            wrcValue = 70.7;

        }

        if (wrc1 < 115 && wrc1 >= 100) {
            wrcValue = 56.56;

        }

        if (wrc1 < 100 && wrc1 >= 80) {
            wrcValue = 42.42;

        }

        if (wrc1 < 80 && wrc1 >= 75) {
            wrcValue = 28.28;

        }

        if (wrc1 < 75) {
            wrcValue = 14.14;

        }
        
        return wrcValue;
		
	}
	
	public static double wrcRight(double wrc1){
		double wrcRightValue = 0;
		
		if (wrc1 >= 160) {
            wrcRightValue = 99;
        }

        if (wrc1 < 160 && wrc1 >= 140) {
            wrcRightValue = 84.84;

        }

        if (wrc1 < 140 && wrc1 >= 115) {
            wrcRightValue = 70.7;

        }

        if (wrc1 < 115 && wrc1 >= 100) {
            wrcRightValue = 56.56;

        }

        if (wrc1 < 100 && wrc1 >= 80) {
            wrcRightValue = 42.42;

        }

        if (wrc1 < 80 && wrc1 >= 75) {
            wrcRightValue = 28.28;

        }

        if (wrc1 < 75) {
            wrcRightValue = 14.14;

        }
        
        return wrcRightValue;
		
	}
	
	public static double wrcLeft(double wrc1){
		double wrcLeftValue = 0;
		
		if (wrc1 >= 160) {
            wrcLeftValue = 99;
        }

        if (wrc1 < 160 && wrc1 >= 140) {
            wrcLeftValue = 84.84;

        }

        if (wrc1 < 140 && wrc1 >= 115) {
            wrcLeftValue = 70.7;

        }

        if (wrc1 < 115 && wrc1 >= 100) {
            wrcLeftValue = 56.56;

        }

        if (wrc1 < 100 && wrc1 >= 80) {
            wrcLeftValue = 42.42;

        }

        if (wrc1 < 80 && wrc1 >= 75) {
            wrcLeftValue = 28.28;

        }

        if (wrc1 < 75) {
            wrcLeftValue = 14.14;

        }
        
        return wrcLeftValue;
		
	}
	
	
	

}
