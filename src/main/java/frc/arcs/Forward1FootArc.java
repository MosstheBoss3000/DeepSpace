package frc.arcs;

import com.team319.follower.SrxMotionProfile;
import com.team319.follower.SrxTrajectory;

public class Forward1FootArc extends SrxTrajectory {
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (1.63,3.79,0.00)
	// (2.63,3.79,0.00)
	
    public Forward1FootArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public Forward1FootArc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{0.000,0.000,10.000,0.000},
				{0.271,2.714,10.000,0.000},
				{0.814,5.427,10.000,0.000},
				{1.628,8.141,10.000,0.000},
				{2.714,10.854,10.000,0.000},
				{4.070,13.568,10.000,0.000},
				{5.698,16.281,10.000,0.000},
				{7.598,18.995,10.000,0.000},
				{9.769,21.708,10.000,0.000},
				{12.211,24.422,10.000,0.000},
				{14.924,27.135,10.000,0.000},
				{17.909,29.849,10.000,0.000},
				{21.166,32.562,10.000,0.000},
				{24.693,35.276,10.000,0.000},
				{28.492,37.989,10.000,0.000},
				{32.562,40.703,10.000,0.000},
				{36.904,43.416,10.000,0.000},
				{41.517,46.130,10.000,0.000},
				{46.401,48.844,10.000,0.000},
				{51.557,51.557,10.000,0.000},
				{56.984,54.271,10.000,0.000},
				{62.682,56.984,10.000,0.000},
				{68.652,59.698,10.000,0.000},
				{74.893,62.411,10.000,0.000},
				{81.406,65.125,10.000,0.000},
				{88.190,67.838,10.000,0.000},
				{95.245,70.552,10.000,0.000},
				{102.571,73.265,10.000,0.000},
				{110.169,75.979,10.000,0.000},
				{118.038,78.692,10.000,0.000},
				{126.179,81.406,10.000,0.000},
				{134.591,84.119,10.000,0.000},
				{143.274,86.833,10.000,0.000},
				{152.229,89.546,10.000,0.000},
				{161.455,92.260,10.000,0.000},
				{170.952,94.973,10.000,0.000},
				{180.721,97.687,10.000,0.000},
				{190.761,100.401,10.000,0.000},
				{201.072,103.114,10.000,0.000},
				{211.655,105.828,10.000,0.000},
				{222.509,108.541,10.000,0.000},
				{233.635,111.255,10.000,0.000},
				{245.032,113.968,10.000,0.000},
				{256.700,116.682,10.000,0.000},
				{268.639,119.395,10.000,0.000},
				{280.775,121.353,10.000,0.000},
				{292.638,118.639,10.000,0.000},
				{304.231,115.926,10.000,0.000},
				{315.552,113.212,10.000,0.000},
				{326.602,110.499,10.000,0.000},
				{337.381,107.785,10.000,0.000},
				{347.888,105.071,10.000,0.000},
				{358.124,102.358,10.000,0.000},
				{368.088,99.644,10.000,0.000},
				{377.781,96.931,10.000,0.000},
				{387.203,94.217,10.000,0.000},
				{396.353,91.504,10.000,0.000},
				{405.232,88.790,10.000,0.000},
				{413.840,86.077,10.000,0.000},
				{422.176,83.363,10.000,0.000},
				{430.241,80.650,10.000,0.000},
				{438.035,77.936,10.000,0.000},
				{445.557,75.223,10.000,0.000},
				{452.808,72.509,10.000,0.000},
				{459.788,69.796,10.000,0.000},
				{466.496,67.082,10.000,0.000},
				{472.933,64.369,10.000,0.000},
				{479.098,61.655,10.000,0.000},
				{484.992,58.942,10.000,0.000},
				{490.615,56.228,10.000,0.000},
				{495.967,53.514,10.000,0.000},
				{501.047,50.801,10.000,0.000},
				{505.855,48.087,10.000,0.000},
				{510.393,45.374,10.000,0.000},
				{514.659,42.660,10.000,0.000},
				{518.653,39.947,10.000,0.000},
				{522.377,37.233,10.000,0.000},
				{525.829,34.520,10.000,0.000},
				{529.009,31.806,10.000,0.000},
				{531.919,29.093,10.000,0.000},
				{534.557,26.379,10.000,0.000},
				{536.923,23.666,10.000,0.000},
				{539.018,20.952,10.000,0.000},
				{540.842,18.239,10.000,0.000},
				{542.395,15.525,10.000,0.000},
				{543.676,12.812,10.000,0.000},
				{544.686,10.098,10.000,0.000},
				{545.424,7.384,10.000,0.000},
				{545.891,4.671,10.000,0.000}		};

}