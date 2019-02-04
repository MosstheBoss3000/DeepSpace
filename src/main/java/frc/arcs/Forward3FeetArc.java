package frc.arcs;

import com.team319.follower.SrxMotionProfile;
import com.team319.follower.SrxTrajectory;

public class Forward3FeetArc extends SrxTrajectory {
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (1.63,3.79,0.00)
	// (4.63,3.79,0.00)
	
    public Forward3FeetArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public Forward3FeetArc(boolean flipped) {
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
				{280.850,122.109,10.000,0.000},
				{293.332,124.822,10.000,0.000},
				{306.086,127.536,10.000,0.000},
				{319.111,130.249,10.000,0.000},
				{332.407,132.963,10.000,0.000},
				{345.975,135.676,10.000,0.000},
				{359.814,138.390,10.000,0.000},
				{373.924,141.103,10.000,0.000},
				{388.306,143.817,10.000,0.000},
				{402.959,146.531,10.000,0.000},
				{417.883,149.244,10.000,0.000},
				{433.079,151.958,10.000,0.000},
				{448.546,154.671,10.000,0.000},
				{464.285,157.385,10.000,0.000},
				{480.294,160.098,10.000,0.000},
				{496.576,162.812,10.000,0.000},
				{512.857,162.812,10.000,0.000},
				{529.138,162.812,10.000,0.000},
				{545.419,162.812,10.000,0.000},
				{561.700,162.812,10.000,0.000},
				{577.981,162.812,10.000,0.000},
				{594.263,162.812,10.000,0.000},
				{610.544,162.812,10.000,0.000},
				{626.825,162.812,10.000,0.000},
				{643.106,162.812,10.000,0.000},
				{659.387,162.812,10.000,0.000},
				{675.669,162.812,10.000,0.000},
				{691.950,162.812,10.000,0.000},
				{708.231,162.812,10.000,0.000},
				{724.512,162.812,10.000,0.000},
				{740.793,162.812,10.000,0.000},
				{757.074,162.812,10.000,0.000},
				{773.356,162.812,10.000,0.000},
				{789.637,162.812,10.000,0.000},
				{805.918,162.812,10.000,0.000},
				{822.199,162.812,10.000,0.000},
				{838.480,162.812,10.000,0.000},
				{854.761,162.812,10.000,0.000},
				{871.043,162.812,10.000,0.000},
				{887.324,162.812,10.000,0.000},
				{903.605,162.812,10.000,0.000},
				{919.886,162.812,10.000,0.000},
				{936.167,162.812,10.000,0.000},
				{952.448,162.812,10.000,0.000},
				{968.730,162.812,10.000,0.000},
				{985.011,162.812,10.000,0.000},
				{1001.292,162.812,10.000,0.000},
				{1017.573,162.812,10.000,0.000},
				{1033.854,162.812,10.000,0.000},
				{1050.135,162.812,10.000,0.000},
				{1066.417,162.812,10.000,0.000},
				{1082.698,162.812,10.000,0.000},
				{1098.979,162.812,10.000,0.000},
				{1115.260,162.812,10.000,0.000},
				{1131.541,162.812,10.000,0.000},
				{1147.822,162.812,10.000,0.000},
				{1163.832,160.098,10.000,0.000},
				{1179.571,157.385,10.000,0.000},
				{1195.038,154.671,10.000,0.000},
				{1210.234,151.958,10.000,0.000},
				{1225.158,149.244,10.000,0.000},
				{1239.811,146.531,10.000,0.000},
				{1254.193,143.817,10.000,0.000},
				{1268.303,141.103,10.000,0.000},
				{1282.142,138.390,10.000,0.000},
				{1295.710,135.676,10.000,0.000},
				{1309.006,132.963,10.000,0.000},
				{1322.031,130.249,10.000,0.000},
				{1334.784,127.536,10.000,0.000},
				{1347.267,124.822,10.000,0.000},
				{1359.478,122.109,10.000,0.000},
				{1371.417,119.395,10.000,0.000},
				{1383.085,116.682,10.000,0.000},
				{1394.482,113.968,10.000,0.000},
				{1405.608,111.255,10.000,0.000},
				{1416.462,108.541,10.000,0.000},
				{1427.044,105.828,10.000,0.000},
				{1437.356,103.114,10.000,0.000},
				{1447.396,100.401,10.000,0.000},
				{1457.165,97.687,10.000,0.000},
				{1466.662,94.973,10.000,0.000},
				{1475.888,92.260,10.000,0.000},
				{1484.843,89.546,10.000,0.000},
				{1493.526,86.833,10.000,0.000},
				{1501.938,84.119,10.000,0.000},
				{1510.078,81.406,10.000,0.000},
				{1517.948,78.692,10.000,0.000},
				{1525.546,75.979,10.000,0.000},
				{1532.872,73.265,10.000,0.000},
				{1539.927,70.552,10.000,0.000},
				{1546.711,67.838,10.000,0.000},
				{1553.223,65.125,10.000,0.000},
				{1559.465,62.411,10.000,0.000},
				{1565.434,59.698,10.000,0.000},
				{1571.133,56.984,10.000,0.000},
				{1576.560,54.271,10.000,0.000},
				{1581.716,51.557,10.000,0.000},
				{1586.600,48.844,10.000,0.000},
				{1591.213,46.130,10.000,0.000},
				{1595.555,43.416,10.000,0.000},
				{1599.625,40.703,10.000,0.000},
				{1603.424,37.989,10.000,0.000},
				{1606.951,35.276,10.000,0.000},
				{1610.208,32.562,10.000,0.000},
				{1613.192,29.849,10.000,0.000},
				{1615.906,27.135,10.000,0.000},
				{1618.348,24.422,10.000,0.000},
				{1620.519,21.708,10.000,0.000},
				{1622.418,18.995,10.000,0.000},
				{1624.047,16.281,10.000,0.000},
				{1625.403,13.568,10.000,0.000},
				{1626.489,10.854,10.000,0.000},
				{1627.303,8.141,10.000,0.000},
				{1627.846,5.427,10.000,0.000}		};

}