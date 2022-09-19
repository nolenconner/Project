package matchup;

import java.text.DecimalFormat;
import pitcherQuality.Fip;
import pitcherQuality.Strike;
import pitcherQuality.Predict;
import hitterQuality.wrc;
import pitchMatchup.pitchMatchup;
import parkFactor.parkFactor;


public class MatchupRunner {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("This pitcher is a " + ((Fip.fipPoints(2.59)) + (((Strike.csw(34)) + (Strike.k(34))) / 2) + (Predict.siera(2.63))) + " out of 99 on the pitcher qaulity scale.");
        System.out.println("This hitter is a " + wrc.wrc(140) + " out of 99 on the hitter quality scale.");				
	    System.out.println("This hitter is a " + wrc.wrcRight(100) + " out of 99 on the hitter quality scale vs righties.");
	    System.out.println("This hitter is a " + wrc.wrcLeft(140) + " out of 99 on the hitter quality scale vs lefties.");
	    System.out.println("This hiiter would have a " + ((pitchMatchup.fourSeamMatchup(350, 450, 35)) +(pitchMatchup.sliderMatchup(350, 450, 35)) + (pitchMatchup.changeupMatchup(350, 450, 30))) + " OPS if he only faced this pitcher in a league average enviorment.");
        System.out.println("This hitter is a " + df.format(((wrc.wrc(140)) + ((wrc.wrc(140)) * parkFactor.parkFactor(90)))) + " out of 99 in coors field.");
        System.out.println("This hitter is a " + df.format(((wrc.wrc(140)) + ((wrc.wrc(140)) * parkFactor.parkFactor(110)))) + " out of 99 in coors field.");

	}


}
