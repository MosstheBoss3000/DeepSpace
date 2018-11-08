package frc.arcs;

import com.team319.follower.SrxMotionProfile;
import com.team319.follower.SrxTrajectory;

public class TurnScalingArc extends SrxTrajectory {
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (2.00,13.50,0.00)
	// (5.00,16.50,89.99)
	
    public TurnScalingArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public TurnScalingArc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{0.000,0.000,10.000,0.000},
				{15.500,154.995,10.000,0.000},
				{46.499,309.991,10.000,0.000},
				{92.997,464.986,10.000,0.000},
				{154.995,619.982,10.000,0.000},
				{232.493,774.977,10.000,0.000},
				{325.490,929.973,10.000,0.000},
				{433.987,1084.968,10.000,0.000},
				{557.984,1239.963,10.000,0.000},
				{697.479,1394.959,10.000,0.010},
				{852.475,1549.954,10.000,0.010},
				{1022.970,1704.950,10.000,0.010},
				{1208.964,1859.945,10.000,0.020},
				{1410.458,2014.940,10.000,0.030},
				{1627.452,2169.936,10.000,0.030},
				{1859.945,2324.931,10.000,0.040},
				{2107.938,2479.927,10.000,0.060},
				{2371.430,2634.922,10.000,0.070},
				{2650.422,2789.918,10.000,0.090},
				{2944.913,2944.913,10.000,0.110},
				{3254.904,3099.908,10.000,0.130},
				{3580.394,3254.904,10.000,0.160},
				{3921.384,3409.899,10.000,0.190},
				{4277.874,3564.895,10.000,0.230},
				{4649.863,3719.890,10.000,0.270},
				{5037.351,3874.886,10.000,0.320},
				{5440.339,4029.881,10.000,0.370},
				{5858.827,4184.876,10.000,0.430},
				{6292.814,4339.872,10.000,0.490},
				{6742.301,4494.867,10.000,0.570},
				{7207.287,4649.863,10.000,0.650},
				{7687.773,4804.858,10.000,0.730},
				{8183.758,4959.854,10.000,0.830},
				{8695.243,5114.849,10.000,0.940},
				{9222.228,5269.844,10.000,1.060},
				{9764.712,5424.840,10.000,1.180},
				{10322.695,5579.835,10.000,1.320},
				{10896.178,5734.831,10.000,1.480},
				{11477.411,5812.328,10.000,1.640},
				{12058.644,5812.328,10.000,1.810},
				{12639.877,5812.328,10.000,1.990},
				{13221.110,5812.328,10.000,2.180},
				{13802.342,5812.328,10.000,2.390},
				{14383.575,5812.328,10.000,2.600},
				{14964.808,5812.328,10.000,2.820},
				{15546.041,5812.328,10.000,3.050},
				{16127.274,5812.328,10.000,3.290},
				{16708.507,5812.328,10.000,3.540},
				{17289.739,5812.328,10.000,3.800},
				{17870.972,5812.328,10.000,4.070},
				{18452.205,5812.328,10.000,4.350},
				{19033.438,5812.328,10.000,4.650},
				{19614.671,5812.328,10.000,4.960},
				{20195.904,5812.328,10.000,5.270},
				{20777.136,5812.328,10.000,5.610},
				{21358.369,5812.328,10.000,5.950},
				{21939.602,5812.328,10.000,6.310},
				{22520.835,5812.328,10.000,6.680},
				{23102.068,5812.328,10.000,7.060},
				{23683.301,5812.328,10.000,7.460},
				{24264.533,5812.328,10.000,7.870},
				{24845.766,5812.328,10.000,8.300},
				{25426.999,5812.328,10.000,8.740},
				{26008.232,5812.328,10.000,9.200},
				{26589.465,5812.328,10.000,9.670},
				{27170.698,5812.328,10.000,10.160},
				{27751.930,5812.328,10.000,10.670},
				{28333.163,5812.328,10.000,11.190},
				{28914.396,5812.328,10.000,11.740},
				{29495.629,5812.328,10.000,12.300},
				{30076.862,5812.328,10.000,12.880},
				{30658.095,5812.328,10.000,13.480},
				{31239.327,5812.328,10.000,14.100},
				{31820.560,5812.328,10.000,14.740},
				{32401.793,5812.328,10.000,15.400},
				{32983.026,5812.328,10.000,16.080},
				{33564.259,5812.328,10.000,16.780},
				{34145.492,5812.328,10.000,17.510},
				{34726.724,5812.328,10.000,18.260},
				{35307.957,5812.328,10.000,19.030},
				{35889.190,5812.328,10.000,19.820},
				{36470.423,5812.328,10.000,20.640},
				{37051.656,5812.328,10.000,21.480},
				{37632.889,5812.328,10.000,22.340},
				{38214.121,5812.328,10.000,23.230},
				{38795.354,5812.328,10.000,24.150},
				{39376.587,5812.328,10.000,25.080},
				{39957.820,5812.328,10.000,26.040},
				{40539.053,5812.328,10.000,27.030},
				{41120.286,5812.328,10.000,28.040},
				{41701.518,5812.328,10.000,29.060},
				{42282.751,5812.328,10.000,30.120},
				{42863.984,5812.328,10.000,31.190},
				{43445.217,5812.328,10.000,32.280},
				{44026.450,5812.328,10.000,33.390},
				{44607.683,5812.328,10.000,34.520},
				{45188.915,5812.328,10.000,35.670},
				{45770.148,5812.328,10.000,36.830},
				{46351.381,5812.328,10.000,38.000},
				{46932.614,5812.328,10.000,39.190},
				{47513.847,5812.328,10.000,40.380},
				{48095.080,5812.328,10.000,41.590},
				{48676.312,5812.328,10.000,42.800},
				{49257.545,5812.328,10.000,44.010},
				{49838.778,5812.328,10.000,45.220},
				{50420.011,5812.328,10.000,46.440},
				{51001.244,5812.328,10.000,47.650},
				{51582.477,5812.328,10.000,48.860},
				{52163.709,5812.328,10.000,50.060},
				{52744.942,5812.328,10.000,51.250},
				{53326.175,5812.328,10.000,52.430},
				{53907.408,5812.328,10.000,53.600},
				{54488.641,5812.328,10.000,54.760},
				{55069.874,5812.328,10.000,55.900},
				{55651.106,5812.328,10.000,57.020},
				{56232.339,5812.328,10.000,58.120},
				{56813.572,5812.328,10.000,59.210},
				{57394.805,5812.328,10.000,60.270},
				{57976.038,5812.328,10.000,61.320},
				{58557.271,5812.328,10.000,62.340},
				{59138.503,5812.328,10.000,63.340},
				{59719.736,5812.328,10.000,64.310},
				{60300.969,5812.328,10.000,65.260},
				{60882.202,5812.328,10.000,66.190},
				{61463.435,5812.328,10.000,67.090},
				{62044.668,5812.328,10.000,67.970},
				{62625.900,5812.328,10.000,68.830},
				{63207.133,5812.328,10.000,69.660},
				{63788.366,5812.328,10.000,70.470},
				{64369.599,5812.328,10.000,71.260},
				{64950.832,5812.328,10.000,72.020},
				{65532.065,5812.328,10.000,72.760},
				{66113.297,5812.328,10.000,73.470},
				{66694.530,5812.328,10.000,74.170},
				{67275.763,5812.328,10.000,74.840},
				{67856.996,5812.328,10.000,75.500},
				{68438.229,5812.328,10.000,76.130},
				{69019.462,5812.328,10.000,76.740},
				{69600.694,5812.328,10.000,77.330},
				{70181.927,5812.328,10.000,77.900},
				{70763.160,5812.328,10.000,78.460},
				{71344.393,5812.328,10.000,79.000},
				{71925.626,5812.328,10.000,79.510},
				{72506.859,5812.328,10.000,80.010},
				{73088.091,5812.328,10.000,80.500},
				{73669.324,5812.328,10.000,80.970},
				{74250.557,5812.328,10.000,81.420},
				{74831.790,5812.328,10.000,81.850},
				{75413.023,5812.328,10.000,82.280},
				{75994.256,5812.328,10.000,82.680},
				{76575.488,5812.328,10.000,83.070},
				{77156.721,5812.328,10.000,83.450},
				{77737.954,5812.328,10.000,83.820},
				{78319.187,5812.328,10.000,84.170},
				{78900.420,5812.328,10.000,84.510},
				{79481.653,5812.328,10.000,84.840},
				{80062.885,5812.328,10.000,85.150},
				{80644.118,5812.328,10.000,85.450},
				{81225.351,5812.328,10.000,85.740},
				{81806.584,5812.328,10.000,86.020},
				{82387.817,5812.328,10.000,86.290},
				{82969.050,5812.328,10.000,86.550},
				{83550.282,5812.328,10.000,86.790},
				{84131.515,5812.328,10.000,87.030},
				{84712.748,5812.328,10.000,87.260},
				{85293.981,5812.328,10.000,87.470},
				{85875.214,5812.328,10.000,87.680},
				{86456.447,5812.328,10.000,87.880},
				{87037.679,5812.328,10.000,88.060},
				{87618.912,5812.328,10.000,88.240},
				{88200.145,5812.328,10.000,88.410},
				{88781.378,5812.328,10.000,88.570},
				{89362.611,5812.328,10.000,88.720},
				{89928.344,5657.333,10.000,88.860},
				{90478.578,5502.337,10.000,88.990},
				{91013.312,5347.342,10.000,89.100},
				{91532.547,5192.347,10.000,89.210},
				{92036.282,5037.351,10.000,89.300},
				{92524.517,4882.356,10.000,89.390},
				{92997.253,4727.360,10.000,89.470},
				{93454.490,4572.365,10.000,89.540},
				{93896.227,4417.370,10.000,89.600},
				{94322.464,4262.374,10.000,89.660},
				{94733.202,4107.379,10.000,89.710},
				{95128.440,3952.383,10.000,89.750},
				{95508.179,3797.388,10.000,89.790},
				{95872.418,3642.392,10.000,89.830},
				{96221.158,3487.397,10.000,89.860},
				{96554.398,3332.402,10.000,89.880},
				{96872.139,3177.406,10.000,89.910},
				{97174.380,3022.411,10.000,89.920},
				{97461.122,2867.415,10.000,89.940},
				{97732.364,2712.420,10.000,89.950},
				{97988.106,2557.424,10.000,89.960},
				{98228.349,2402.429,10.000,89.970},
				{98453.092,2247.434,10.000,89.980},
				{98662.336,2092.438,10.000,89.980},
				{98856.080,1937.443,10.000,89.990},
				{99034.325,1782.447,10.000,89.990},
				{99197.070,1627.452,10.000,89.990},
				{99344.316,1472.457,10.000,89.990},
				{99476.062,1317.461,10.000,89.990},
				{99592.309,1162.466,10.000,89.990},
				{99693.056,1007.470,10.000,89.990},
				{99778.303,852.475,10.000,89.990},
				{99848.051,697.479,10.000,89.990},
				{99902.299,542.484,10.000,89.990},
				{99941.048,387.489,10.000,89.990}		};

}