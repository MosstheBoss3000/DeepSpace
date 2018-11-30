package frc.arcs;

import com.team319.follower.SrxMotionProfile;
import com.team319.follower.SrxTrajectory;

public class ExampleArc extends SrxTrajectory {
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (1.63,3.79,0.00)
	// (4.63,3.79,0.00)
	// (9.63,8.79,0.00)
	
    public ExampleArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public ExampleArc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{0.000,0.000,10.000,0.000},
				{0.244,2.439,10.000,0.000},
				{0.732,4.877,10.000,0.000},
				{1.463,7.316,10.000,0.000},
				{2.439,9.754,10.000,0.000},
				{3.658,12.193,10.000,0.000},
				{5.121,14.631,10.000,0.000},
				{6.828,17.070,10.000,0.000},
				{8.779,19.508,10.000,0.000},
				{10.973,21.947,10.000,0.000},
				{13.412,24.385,10.000,0.000},
				{16.094,26.824,10.000,0.000},
				{19.020,29.262,10.000,0.000},
				{22.190,31.701,10.000,0.000},
				{25.604,34.139,10.000,0.000},
				{29.262,36.578,10.000,0.000},
				{33.164,39.016,10.000,0.000},
				{37.309,41.455,10.000,0.000},
				{41.698,43.893,10.000,0.000},
				{46.332,46.332,10.000,0.000},
				{51.209,48.770,10.000,0.000},
				{56.330,51.209,10.000,0.000},
				{61.694,53.647,10.000,0.000},
				{67.303,56.086,10.000,0.000},
				{73.155,58.524,10.000,0.000},
				{79.252,60.963,10.000,0.000},
				{85.592,63.401,10.000,0.000},
				{92.176,65.840,10.000,0.000},
				{99.003,68.278,10.000,0.000},
				{106.075,70.717,10.000,0.000},
				{113.391,73.155,10.000,0.000},
				{120.950,75.594,10.000,0.000},
				{128.753,78.032,10.000,0.000},
				{136.800,80.471,10.000,0.000},
				{145.091,82.909,10.000,0.000},
				{153.626,85.348,10.000,0.000},
				{162.405,87.786,10.000,0.000},
				{171.427,90.225,10.000,0.000},
				{180.693,92.663,10.000,0.000},
				{190.204,95.102,10.000,0.000},
				{199.958,97.540,10.000,0.000},
				{209.956,99.979,10.000,0.000},
				{220.197,102.417,10.000,0.000},
				{230.683,104.856,10.000,0.000},
				{241.412,107.294,10.000,0.000},
				{252.386,109.733,10.000,0.000},
				{263.603,112.171,10.000,0.000},
				{275.064,114.610,10.000,0.000},
				{286.769,117.048,10.000,0.000},
				{298.717,119.487,10.000,0.000},
				{310.910,121.925,10.000,0.000},
				{323.346,124.364,10.000,0.000},
				{336.026,126.802,10.000,0.000},
				{348.951,129.241,10.000,0.000},
				{362.118,131.679,10.000,0.000},
				{375.530,134.118,10.000,0.000},
				{389.186,136.556,10.000,0.000},
				{403.085,138.995,10.000,0.000},
				{417.229,141.433,10.000,0.000},
				{431.616,143.872,10.000,0.000},
				{446.247,146.311,10.000,0.000},
				{461.122,148.749,10.000,0.000},
				{476.241,151.188,10.000,0.000},
				{491.603,153.626,10.000,0.000},
				{507.210,156.065,10.000,0.000},
				{523.060,158.503,10.000,0.000},
				{539.154,160.942,10.000,0.000},
				{555.492,163.380,10.000,0.000},
				{572.074,165.819,10.000,0.000},
				{588.900,168.257,10.000,0.000},
				{605.969,170.696,10.000,0.000},
				{623.283,173.134,10.000,0.000},
				{640.840,175.573,10.000,0.000},
				{658.641,178.011,10.000,0.000},
				{676.686,180.450,10.000,0.000},
				{694.975,182.888,10.000,0.000},
				{713.508,185.327,10.000,0.000},
				{732.284,187.765,10.000,0.000},
				{751.304,190.204,10.000,0.000},
				{770.569,192.642,10.000,0.000},
				{789.954,193.858,10.000,0.000},
				{809.340,193.858,10.000,0.000},
				{828.726,193.858,10.000,0.000},
				{848.112,193.858,10.000,0.000},
				{867.497,193.858,10.000,0.000},
				{886.883,193.858,10.000,0.000},
				{906.269,193.858,10.000,0.000},
				{925.411,191.419,10.000,0.000},
				{944.309,188.981,10.000,0.000},
				{962.963,186.542,10.000,0.000},
				{981.373,184.104,10.000,0.000},
				{999.540,181.665,10.000,0.000},
				{1017.463,179.227,10.000,0.000},
				{1035.141,176.788,10.000,0.000},
				{1052.576,174.350,10.000,0.000},
				{1069.767,171.911,10.000,0.000},
				{1086.715,169.472,10.000,0.000},
				{1103.418,167.034,10.000,0.000},
				{1119.878,164.595,10.000,0.000},
				{1136.093,162.157,10.000,0.000},
				{1152.065,159.718,10.000,0.000},
				{1167.793,157.280,10.000,0.000},
				{1183.277,154.841,10.000,0.000},
				{1198.518,152.403,10.000,0.000},
				{1213.514,149.964,10.000,0.000},
				{1228.267,147.526,10.000,0.000},
				{1242.775,145.087,10.000,0.000},
				{1257.040,142.649,10.000,0.000},
				{1271.061,140.210,10.000,0.000},
				{1284.839,137.772,10.000,0.000},
				{1298.372,135.333,10.000,0.000},
				{1311.661,132.895,10.000,0.000},
				{1324.707,130.456,10.000,0.000},
				{1337.509,128.018,10.000,0.000},
				{1350.067,125.579,10.000,0.000},
				{1362.381,123.141,10.000,0.000},
				{1374.451,120.702,10.000,0.000},
				{1386.277,118.264,10.000,0.000},
				{1397.860,115.825,10.000,0.000},
				{1409.199,113.387,10.000,0.000},
				{1420.293,110.948,10.000,0.000},
				{1431.144,108.510,10.000,0.000},
				{1441.752,106.071,10.000,0.000},
				{1452.115,103.633,10.000,0.000},
				{1462.234,101.194,10.000,0.000},
				{1462.234,101.194,10.000,0.000},
				{1471.988,97.540,10.000,0.000},
				{1481.742,97.540,10.000,0.010},
				{1491.496,97.540,10.000,0.030},
				{1501.250,97.540,10.000,0.050},
				{1511.004,97.540,10.000,0.080},
				{1520.758,97.540,10.000,0.120},
				{1530.513,97.540,10.000,0.160},
				{1540.267,97.540,10.000,0.210},
				{1550.021,97.540,10.000,0.270},
				{1559.775,97.540,10.000,0.330},
				{1569.529,97.540,10.000,0.400},
				{1579.283,97.540,10.000,0.470},
				{1589.037,97.540,10.000,0.550},
				{1598.791,97.540,10.000,0.640},
				{1608.545,97.540,10.000,0.730},
				{1618.299,97.540,10.000,0.840},
				{1628.053,97.540,10.000,0.940},
				{1637.807,97.540,10.000,1.060},
				{1647.561,97.540,10.000,1.180},
				{1657.315,97.540,10.000,1.300},
				{1667.069,97.540,10.000,1.440},
				{1676.823,97.540,10.000,1.580},
				{1686.577,97.540,10.000,1.720},
				{1696.331,97.540,10.000,1.880},
				{1706.085,97.540,10.000,2.040},
				{1715.839,97.540,10.000,2.210},
				{1725.593,97.540,10.000,2.380},
				{1735.347,97.540,10.000,2.560},
				{1745.101,97.540,10.000,2.750},
				{1754.855,97.540,10.000,2.950},
				{1764.609,97.540,10.000,3.150},
				{1774.363,97.540,10.000,3.360},
				{1784.117,97.540,10.000,3.580},
				{1793.871,97.540,10.000,3.810},
				{1803.625,97.540,10.000,4.040},
				{1813.380,97.540,10.000,4.280},
				{1823.134,97.540,10.000,4.530},
				{1832.888,97.540,10.000,4.790},
				{1842.642,97.540,10.000,5.060},
				{1852.396,97.540,10.000,5.330},
				{1862.150,97.540,10.000,5.620},
				{1871.904,97.540,10.000,5.910},
				{1881.658,97.540,10.000,6.210},
				{1891.412,97.540,10.000,6.520},
				{1901.166,97.540,10.000,6.840},
				{1910.920,97.540,10.000,7.170},
				{1920.674,97.540,10.000,7.510},
				{1930.428,97.540,10.000,7.860},
				{1940.182,97.540,10.000,8.220},
				{1949.936,97.540,10.000,8.590},
				{1959.690,97.540,10.000,8.970},
				{1969.444,97.540,10.000,9.360},
				{1979.198,97.540,10.000,9.760},
				{1988.952,97.540,10.000,10.180},
				{1998.706,97.540,10.000,10.600},
				{2008.460,97.540,10.000,11.040},
				{2018.214,97.540,10.000,11.490},
				{2027.968,97.540,10.000,11.940},
				{2037.722,97.540,10.000,12.420},
				{2047.476,97.540,10.000,12.900},
				{2057.230,97.540,10.000,13.400},
				{2066.984,97.540,10.000,13.910},
				{2076.738,97.540,10.000,14.430},
				{2086.492,97.540,10.000,14.970},
				{2096.246,97.540,10.000,15.510},
				{2106.001,97.540,10.000,16.080},
				{2115.755,97.540,10.000,16.650},
				{2125.509,97.540,10.000,17.240},
				{2135.263,97.540,10.000,17.850},
				{2145.017,97.540,10.000,18.470},
				{2154.771,97.540,10.000,19.100},
				{2164.525,97.540,10.000,19.750},
				{2174.279,97.540,10.000,20.410},
				{2184.033,97.540,10.000,21.080},
				{2193.787,97.540,10.000,21.770},
				{2203.541,97.540,10.000,22.480},
				{2213.295,97.540,10.000,23.190},
				{2223.049,97.540,10.000,23.930},
				{2232.803,97.540,10.000,24.670},
				{2242.557,97.540,10.000,25.430},
				{2252.311,97.540,10.000,26.210},
				{2262.065,97.540,10.000,26.990},
				{2271.819,97.540,10.000,27.790},
				{2281.573,97.540,10.000,28.610},
				{2291.327,97.540,10.000,29.430},
				{2301.081,97.540,10.000,30.270},
				{2310.835,97.540,10.000,31.110},
				{2320.589,97.540,10.000,31.970},
				{2330.343,97.540,10.000,32.840},
				{2340.097,97.540,10.000,33.720},
				{2349.851,97.540,10.000,34.600},
				{2359.605,97.540,10.000,35.500},
				{2369.359,97.540,10.000,36.400},
				{2379.113,97.540,10.000,37.310},
				{2388.867,97.540,10.000,38.220},
				{2398.622,97.540,10.000,39.140},
				{2408.376,97.540,10.000,40.060},
				{2418.130,97.540,10.000,40.980},
				{2427.884,97.540,10.000,41.900},
				{2437.638,97.540,10.000,42.830},
				{2447.392,97.540,10.000,43.750},
				{2457.146,97.540,10.000,44.680},
				{2466.900,97.540,10.000,45.600},
				{2476.654,97.540,10.000,46.520},
				{2486.408,97.540,10.000,47.430},
				{2496.162,97.540,10.000,48.340},
				{2505.916,97.540,10.000,49.240},
				{2515.670,97.540,10.000,50.140},
				{2525.424,97.540,10.000,51.030},
				{2535.178,97.540,10.000,51.910},
				{2544.932,97.540,10.000,52.780},
				{2554.686,97.540,10.000,53.640},
				{2564.440,97.540,10.000,54.490},
				{2574.194,97.540,10.000,55.330},
				{2583.948,97.540,10.000,56.160},
				{2593.702,97.540,10.000,56.980},
				{2603.456,97.540,10.000,57.780},
				{2613.210,97.540,10.000,58.570},
				{2622.964,97.540,10.000,59.350},
				{2632.718,97.540,10.000,60.110},
				{2642.472,97.540,10.000,60.860},
				{2652.226,97.540,10.000,61.600},
				{2661.980,97.540,10.000,62.320},
				{2671.734,97.540,10.000,63.030},
				{2681.488,97.540,10.000,63.720},
				{2691.243,97.540,10.000,64.400},
				{2700.997,97.540,10.000,65.070},
				{2710.751,97.540,10.000,65.720},
				{2720.505,97.540,10.000,66.360},
				{2730.259,97.540,10.000,66.980},
				{2740.013,97.540,10.000,67.590},
				{2749.767,97.540,10.000,68.180},
				{2759.521,97.540,10.000,68.760},
				{2769.275,97.540,10.000,69.330},
				{2779.029,97.540,10.000,69.890},
				{2788.783,97.540,10.000,70.430},
				{2798.537,97.540,10.000,70.950},
				{2808.291,97.540,10.000,71.470},
				{2818.045,97.540,10.000,71.970},
				{2827.799,97.540,10.000,72.460},
				{2837.553,97.540,10.000,72.930},
				{2847.307,97.540,10.000,73.400},
				{2857.061,97.540,10.000,73.850},
				{2866.815,97.540,10.000,74.290},
				{2876.569,97.540,10.000,74.720},
				{2886.323,97.540,10.000,75.140},
				{2896.077,97.540,10.000,75.550},
				{2905.831,97.540,10.000,75.950},
				{2915.585,97.540,10.000,76.330},
				{2925.339,97.540,10.000,76.710},
				{2935.093,97.540,10.000,77.070},
				{2944.847,97.540,10.000,77.430},
				{2954.601,97.540,10.000,77.780},
				{2964.355,97.540,10.000,78.110},
				{2974.109,97.540,10.000,78.440},
				{2983.864,97.540,10.000,78.760},
				{2993.618,97.540,10.000,79.070},
				{3003.372,97.540,10.000,79.370},
				{3013.126,97.540,10.000,79.660},
				{3022.880,97.540,10.000,79.940},
				{3032.634,97.540,10.000,80.220},
				{3042.388,97.540,10.000,80.490},
				{3052.142,97.540,10.000,80.750},
				{3061.896,97.540,10.000,81.000},
				{3071.650,97.540,10.000,81.240},
				{3081.404,97.540,10.000,81.480},
				{3091.158,97.540,10.000,81.710},
				{3100.912,97.540,10.000,81.930},
				{3110.666,97.540,10.000,82.150},
				{3120.420,97.540,10.000,82.360},
				{3130.174,97.540,10.000,82.560},
				{3139.928,97.540,10.000,82.760},
				{3149.682,97.540,10.000,82.950},
				{3159.436,97.540,10.000,83.130},
				{3169.190,97.540,10.000,83.310},
				{3178.944,97.540,10.000,83.480},
				{3188.698,97.540,10.000,83.640},
				{3198.452,97.540,10.000,83.800},
				{3208.206,97.540,10.000,83.950},
				{3217.960,97.540,10.000,84.100},
				{3227.714,97.540,10.000,84.240},
				{3237.468,97.540,10.000,84.380},
				{3247.222,97.540,10.000,84.510},
				{3256.976,97.540,10.000,84.640},
				{3266.730,97.540,10.000,84.760},
				{3276.485,97.540,10.000,84.870},
				{3286.239,97.540,10.000,84.980},
				{3295.993,97.540,10.000,85.080},
				{3305.747,97.540,10.000,85.180},
				{3315.501,97.540,10.000,85.280},
				{3325.255,97.540,10.000,85.370},
				{3335.009,97.540,10.000,85.450},
				{3344.763,97.540,10.000,85.530},
				{3354.517,97.540,10.000,85.610},
				{3364.271,97.540,10.000,85.680},
				{3374.025,97.540,10.000,85.740},
				{3383.779,97.540,10.000,85.810},
				{3393.533,97.540,10.000,85.860},
				{3403.287,97.540,10.000,85.910},
				{3413.041,97.540,10.000,85.960},
				{3422.795,97.540,10.000,86.000},
				{3432.549,97.540,10.000,86.040},
				{3442.303,97.540,10.000,86.070},
				{3452.057,97.540,10.000,86.100},
				{3461.811,97.540,10.000,86.130},
				{3471.565,97.540,10.000,86.150},
				{3481.319,97.540,10.000,86.160},
				{3491.073,97.540,10.000,86.180},
				{3500.827,97.540,10.000,86.180},
				{3510.581,97.540,10.000,86.190},
				{3520.335,97.540,10.000,86.180},
				{3530.089,97.540,10.000,86.180},
				{3539.843,97.540,10.000,86.170},
				{3549.597,97.540,10.000,86.150},
				{3559.351,97.540,10.000,86.130},
				{3569.106,97.540,10.000,86.110},
				{3578.860,97.540,10.000,86.080},
				{3588.614,97.540,10.000,86.050},
				{3598.368,97.540,10.000,86.010},
				{3608.122,97.540,10.000,85.970},
				{3617.876,97.540,10.000,85.920},
				{3627.630,97.540,10.000,85.870},
				{3637.384,97.540,10.000,85.820},
				{3647.138,97.540,10.000,85.760},
				{3656.892,97.540,10.000,85.690},
				{3666.646,97.540,10.000,85.620},
				{3676.400,97.540,10.000,85.550},
				{3686.154,97.540,10.000,85.470},
				{3695.908,97.540,10.000,85.380},
				{3705.662,97.540,10.000,85.290},
				{3715.416,97.540,10.000,85.200},
				{3725.170,97.540,10.000,85.100},
				{3734.924,97.540,10.000,85.000},
				{3744.678,97.540,10.000,84.890},
				{3754.432,97.540,10.000,84.780},
				{3764.186,97.540,10.000,84.660},
				{3773.940,97.540,10.000,84.530},
				{3783.694,97.540,10.000,84.400},
				{3793.448,97.540,10.000,84.270},
				{3803.202,97.540,10.000,84.130},
				{3812.956,97.540,10.000,83.980},
				{3822.710,97.540,10.000,83.830},
				{3832.464,97.540,10.000,83.670},
				{3842.218,97.540,10.000,83.510},
				{3851.973,97.540,10.000,83.340},
				{3861.727,97.540,10.000,83.160},
				{3871.481,97.540,10.000,82.980},
				{3881.235,97.540,10.000,82.790},
				{3890.989,97.540,10.000,82.600},
				{3900.743,97.540,10.000,82.400},
				{3910.497,97.540,10.000,82.190},
				{3920.251,97.540,10.000,81.970},
				{3930.005,97.540,10.000,81.750},
				{3939.759,97.540,10.000,81.520},
				{3949.513,97.540,10.000,81.290},
				{3959.267,97.540,10.000,81.040},
				{3969.021,97.540,10.000,80.790},
				{3978.775,97.540,10.000,80.530},
				{3988.529,97.540,10.000,80.270},
				{3998.283,97.540,10.000,79.990},
				{4008.037,97.540,10.000,79.710},
				{4017.791,97.540,10.000,79.420},
				{4027.545,97.540,10.000,79.120},
				{4037.299,97.540,10.000,78.810},
				{4047.053,97.540,10.000,78.500},
				{4056.807,97.540,10.000,78.170},
				{4066.561,97.540,10.000,77.840},
				{4076.315,97.540,10.000,77.490},
				{4086.069,97.540,10.000,77.140},
				{4095.823,97.540,10.000,76.770},
				{4105.577,97.540,10.000,76.400},
				{4115.331,97.540,10.000,76.020},
				{4125.085,97.540,10.000,75.620},
				{4134.839,97.540,10.000,75.210},
				{4144.594,97.540,10.000,74.800},
				{4154.348,97.540,10.000,74.370},
				{4164.102,97.540,10.000,73.930},
				{4173.856,97.540,10.000,73.480},
				{4183.610,97.540,10.000,73.020},
				{4193.364,97.540,10.000,72.540},
				{4203.118,97.540,10.000,72.060},
				{4212.872,97.540,10.000,71.560},
				{4222.626,97.540,10.000,71.050},
				{4232.380,97.540,10.000,70.520},
				{4242.134,97.540,10.000,69.980},
				{4251.888,97.540,10.000,69.430},
				{4261.642,97.540,10.000,68.870},
				{4271.396,97.540,10.000,68.290},
				{4281.150,97.540,10.000,67.700},
				{4290.904,97.540,10.000,67.090},
				{4300.658,97.540,10.000,66.470},
				{4310.412,97.540,10.000,65.830},
				{4320.166,97.540,10.000,65.190},
				{4329.920,97.540,10.000,64.520},
				{4339.674,97.540,10.000,63.850},
				{4349.428,97.540,10.000,63.150},
				{4359.182,97.540,10.000,62.450},
				{4368.936,97.540,10.000,61.730},
				{4378.690,97.540,10.000,60.990},
				{4388.444,97.540,10.000,60.250},
				{4398.198,97.540,10.000,59.480},
				{4407.952,97.540,10.000,58.710},
				{4417.706,97.540,10.000,57.920},
				{4427.460,97.540,10.000,57.120},
				{4437.215,97.540,10.000,56.310},
				{4446.969,97.540,10.000,55.480},
				{4456.723,97.540,10.000,54.640},
				{4466.477,97.540,10.000,53.790},
				{4476.231,97.540,10.000,52.930},
				{4485.985,97.540,10.000,52.060},
				{4495.739,97.540,10.000,51.190},
				{4505.493,97.540,10.000,50.300},
				{4515.247,97.540,10.000,49.400},
				{4525.001,97.540,10.000,48.500},
				{4534.755,97.540,10.000,47.590},
				{4544.509,97.540,10.000,46.680},
				{4554.263,97.540,10.000,45.760},
				{4564.017,97.540,10.000,44.840},
				{4573.771,97.540,10.000,43.920},
				{4583.525,97.540,10.000,42.990},
				{4593.279,97.540,10.000,42.070},
				{4603.033,97.540,10.000,41.140},
				{4612.787,97.540,10.000,40.220},
				{4622.541,97.540,10.000,39.300},
				{4632.295,97.540,10.000,38.380},
				{4642.049,97.540,10.000,37.470},
				{4651.803,97.540,10.000,36.560},
				{4661.557,97.540,10.000,35.660},
				{4671.311,97.540,10.000,34.760},
				{4681.065,97.540,10.000,33.870},
				{4690.819,97.540,10.000,32.990},
				{4700.573,97.540,10.000,32.130},
				{4710.327,97.540,10.000,31.270},
				{4720.081,97.540,10.000,30.420},
				{4729.836,97.540,10.000,29.580},
				{4739.590,97.540,10.000,28.750},
				{4749.344,97.540,10.000,27.940},
				{4759.098,97.540,10.000,27.130},
				{4768.852,97.540,10.000,26.340},
				{4778.606,97.540,10.000,25.570},
				{4788.360,97.540,10.000,24.810},
				{4798.114,97.540,10.000,24.060},
				{4807.868,97.540,10.000,23.320},
				{4817.622,97.540,10.000,22.600},
				{4827.376,97.540,10.000,21.900},
				{4837.130,97.540,10.000,21.200},
				{4846.884,97.540,10.000,20.530},
				{4856.638,97.540,10.000,19.860},
				{4866.392,97.540,10.000,19.210},
				{4876.146,97.540,10.000,18.580},
				{4885.900,97.540,10.000,17.960},
				{4895.654,97.540,10.000,17.350},
				{4905.408,97.540,10.000,16.760},
				{4915.162,97.540,10.000,16.180},
				{4924.916,97.540,10.000,15.610},
				{4934.670,97.540,10.000,15.060},
				{4944.424,97.540,10.000,14.520},
				{4954.178,97.540,10.000,14.000},
				{4963.932,97.540,10.000,13.490},
				{4973.686,97.540,10.000,12.990},
				{4983.440,97.540,10.000,12.500},
				{4993.194,97.540,10.000,12.030},
				{5002.948,97.540,10.000,11.570},
				{5012.702,97.540,10.000,11.120},
				{5022.457,97.540,10.000,10.680},
				{5032.211,97.540,10.000,10.250},
				{5041.965,97.540,10.000,9.840},
				{5051.719,97.540,10.000,9.430},
				{5061.473,97.540,10.000,9.040},
				{5071.227,97.540,10.000,8.660},
				{5080.981,97.540,10.000,8.290},
				{5090.735,97.540,10.000,7.920},
				{5100.489,97.540,10.000,7.570},
				{5110.243,97.540,10.000,7.230},
				{5119.997,97.540,10.000,6.900},
				{5129.751,97.540,10.000,6.580},
				{5139.505,97.540,10.000,6.270},
				{5149.259,97.540,10.000,5.960},
				{5159.013,97.540,10.000,5.670},
				{5168.767,97.540,10.000,5.380},
				{5178.521,97.540,10.000,5.110},
				{5188.275,97.540,10.000,4.840},
				{5198.029,97.540,10.000,4.580},
				{5207.783,97.540,10.000,4.330},
				{5217.537,97.540,10.000,4.080},
				{5227.291,97.540,10.000,3.850},
				{5237.045,97.540,10.000,3.620},
				{5246.799,97.540,10.000,3.400},
				{5256.553,97.540,10.000,3.190},
				{5266.307,97.540,10.000,2.980},
				{5276.061,97.540,10.000,2.790},
				{5285.815,97.540,10.000,2.600},
				{5295.569,97.540,10.000,2.410},
				{5305.323,97.540,10.000,2.240},
				{5315.078,97.540,10.000,2.070},
				{5324.832,97.540,10.000,1.910},
				{5334.586,97.540,10.000,1.750},
				{5344.340,97.540,10.000,1.600},
				{5354.094,97.540,10.000,1.460},
				{5363.848,97.540,10.000,1.330},
				{5373.602,97.540,10.000,1.200},
				{5383.112,95.102,10.000,1.080},
				{5392.378,92.663,10.000,0.970},
				{5401.401,90.225,10.000,0.870},
				{5410.179,87.786,10.000,0.780},
				{5418.714,85.348,10.000,0.690},
				{5427.005,82.909,10.000,0.610},
				{5435.052,80.471,10.000,0.540},
				{5442.855,78.032,10.000,0.480},
				{5450.415,75.594,10.000,0.420},
				{5457.730,73.155,10.000,0.360},
				{5464.802,70.717,10.000,0.320},
				{5471.630,68.278,10.000,0.270},
				{5478.214,65.840,10.000,0.230},
				{5484.554,63.401,10.000,0.200},
				{5490.650,60.963,10.000,0.170},
				{5496.503,58.524,10.000,0.140},
				{5502.111,56.086,10.000,0.120},
				{5507.476,53.647,10.000,0.100},
				{5512.597,51.209,10.000,0.080},
				{5517.474,48.770,10.000,0.060},
				{5522.107,46.332,10.000,0.050},
				{5526.496,43.893,10.000,0.040},
				{5530.642,41.455,10.000,0.030},
				{5534.543,39.016,10.000,0.020},
				{5538.201,36.578,10.000,0.020},
				{5541.615,34.139,10.000,0.010},
				{5544.785,31.701,10.000,0.010},
				{5547.711,29.262,10.000,0.010},
				{5550.394,26.824,10.000,0.000},
				{5552.832,24.385,10.000,0.000},
				{5555.027,21.947,10.000,0.000},
				{5556.978,19.508,10.000,0.000},
				{5558.685,17.070,10.000,0.000},
				{5560.148,14.631,10.000,0.000},
				{5561.367,12.193,10.000,0.000},
				{5562.342,9.754,10.000,0.000},
				{5563.074,7.316,10.000,0.000},
				{5563.562,4.877,10.000,0.000}		};

}