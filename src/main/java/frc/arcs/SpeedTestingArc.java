package frc.arcs;

import com.team319.follower.SrxMotionProfile;
import com.team319.follower.SrxTrajectory;

public class SpeedTestingArc extends SrxTrajectory {
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (2.00,13.50,0.00)
	// (5.00,16.50,89.99)
	// (2.00,19.50,179.98)
	
    public SpeedTestingArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public SpeedTestingArc(boolean flipped) {
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
				{89943.844,5812.328,10.000,88.860},
				{90525.076,5812.328,10.000,89.000},
				{91106.309,5812.328,10.000,89.120},
				{91687.542,5812.328,10.000,89.240},
				{92268.775,5812.328,10.000,89.350},
				{92850.008,5812.328,10.000,89.450},
				{93431.241,5812.328,10.000,89.540},
				{94012.473,5812.328,10.000,89.620},
				{94593.706,5812.328,10.000,89.690},
				{95174.939,5812.328,10.000,89.760},
				{95756.172,5812.328,10.000,89.820},
				{96337.405,5812.328,10.000,89.870},
				{96918.638,5812.328,10.000,89.910},
				{97499.870,5812.328,10.000,89.940},
				{98081.103,5812.328,10.000,89.970},
				{98662.336,5812.328,10.000,89.980},
				{98662.336,5812.328,10.000,89.980},
				{99243.569,5812.328,10.000,89.990},
				{99824.802,5812.328,10.000,89.990},
				{100406.035,5812.328,10.000,90.000},
				{100987.267,5812.328,10.000,90.020},
				{101568.500,5812.328,10.000,90.050},
				{102149.733,5812.328,10.000,90.080},
				{102730.966,5812.328,10.000,90.120},
				{103312.199,5812.328,10.000,90.180},
				{103893.432,5812.328,10.000,90.230},
				{104474.664,5812.328,10.000,90.300},
				{105055.897,5812.328,10.000,90.380},
				{105637.130,5812.328,10.000,90.460},
				{106218.363,5812.328,10.000,90.560},
				{106799.596,5812.328,10.000,90.660},
				{107380.829,5812.328,10.000,90.770},
				{107962.061,5812.328,10.000,90.890},
				{108543.294,5812.328,10.000,91.010},
				{109124.527,5812.328,10.000,91.150},
				{109705.760,5812.328,10.000,91.290},
				{110286.993,5812.328,10.000,91.450},
				{110868.226,5812.328,10.000,91.610},
				{111449.458,5812.328,10.000,91.780},
				{112030.691,5812.328,10.000,91.960},
				{112611.924,5812.328,10.000,92.150},
				{113193.157,5812.328,10.000,92.350},
				{113774.390,5812.328,10.000,92.560},
				{114355.623,5812.328,10.000,92.780},
				{114936.855,5812.328,10.000,93.010},
				{115518.088,5812.328,10.000,93.250},
				{116099.321,5812.328,10.000,93.500},
				{116680.554,5812.328,10.000,93.760},
				{117261.787,5812.328,10.000,94.030},
				{117843.020,5812.328,10.000,94.310},
				{118424.252,5812.328,10.000,94.600},
				{119005.485,5812.328,10.000,94.910},
				{119586.718,5812.328,10.000,95.230},
				{120167.951,5812.328,10.000,95.550},
				{120749.184,5812.328,10.000,95.900},
				{121330.417,5812.328,10.000,96.250},
				{121911.649,5812.328,10.000,96.620},
				{122492.882,5812.328,10.000,97.000},
				{123074.115,5812.328,10.000,97.400},
				{123655.348,5812.328,10.000,97.810},
				{124236.581,5812.328,10.000,98.230},
				{124817.814,5812.328,10.000,98.680},
				{125399.046,5812.328,10.000,99.130},
				{125980.279,5812.328,10.000,99.600},
				{126561.512,5812.328,10.000,100.090},
				{127142.745,5812.328,10.000,100.600},
				{127723.978,5812.328,10.000,101.120},
				{128305.211,5812.328,10.000,101.660},
				{128886.443,5812.328,10.000,102.220},
				{129467.676,5812.328,10.000,102.800},
				{130048.909,5812.328,10.000,103.400},
				{130630.142,5812.328,10.000,104.010},
				{131211.375,5812.328,10.000,104.650},
				{131792.608,5812.328,10.000,105.310},
				{132373.840,5812.328,10.000,105.990},
				{132955.073,5812.328,10.000,106.690},
				{133536.306,5812.328,10.000,107.410},
				{134117.539,5812.328,10.000,108.160},
				{134698.772,5812.328,10.000,108.930},
				{135280.005,5812.328,10.000,109.720},
				{135861.237,5812.328,10.000,110.530},
				{136442.470,5812.328,10.000,111.370},
				{137023.703,5812.328,10.000,112.230},
				{137604.936,5812.328,10.000,113.120},
				{138186.169,5812.328,10.000,114.030},
				{138767.402,5812.328,10.000,114.960},
				{139348.634,5812.328,10.000,115.920},
				{139929.867,5812.328,10.000,116.900},
				{140511.100,5812.328,10.000,117.910},
				{141092.333,5812.328,10.000,118.930},
				{141673.566,5812.328,10.000,119.980},
				{142254.799,5812.328,10.000,121.050},
				{142836.031,5812.328,10.000,122.140},
				{143417.264,5812.328,10.000,123.250},
				{143998.497,5812.328,10.000,124.380},
				{144579.730,5812.328,10.000,125.520},
				{145160.963,5812.328,10.000,126.680},
				{145742.196,5812.328,10.000,127.860},
				{146323.428,5812.328,10.000,129.040},
				{146904.661,5812.328,10.000,130.230},
				{147485.894,5812.328,10.000,131.440},
				{148067.127,5812.328,10.000,132.650},
				{148648.360,5812.328,10.000,133.860},
				{149229.593,5812.328,10.000,135.070},
				{149810.825,5812.328,10.000,136.290},
				{150392.058,5812.328,10.000,137.500},
				{150973.291,5812.328,10.000,138.710},
				{151554.524,5812.328,10.000,139.910},
				{152135.757,5812.328,10.000,141.100},
				{152716.990,5812.328,10.000,142.290},
				{153298.222,5812.328,10.000,143.460},
				{153879.455,5812.328,10.000,144.620},
				{154460.688,5812.328,10.000,145.760},
				{155041.921,5812.328,10.000,146.880},
				{155623.154,5812.328,10.000,147.990},
				{156204.387,5812.328,10.000,149.080},
				{156785.619,5812.328,10.000,150.140},
				{157366.852,5812.328,10.000,151.190},
				{157948.085,5812.328,10.000,152.210},
				{158529.318,5812.328,10.000,153.210},
				{159110.551,5812.328,10.000,154.190},
				{159691.784,5812.328,10.000,155.140},
				{160273.016,5812.328,10.000,156.070},
				{160854.249,5812.328,10.000,156.980},
				{161435.482,5812.328,10.000,157.860},
				{162016.715,5812.328,10.000,158.720},
				{162597.948,5812.328,10.000,159.560},
				{163179.181,5812.328,10.000,160.370},
				{163760.413,5812.328,10.000,161.160},
				{164341.646,5812.328,10.000,161.920},
				{164922.879,5812.328,10.000,162.660},
				{165504.112,5812.328,10.000,163.380},
				{166085.345,5812.328,10.000,164.080},
				{166666.578,5812.328,10.000,164.760},
				{167247.810,5812.328,10.000,165.410},
				{167829.043,5812.328,10.000,166.040},
				{168410.276,5812.328,10.000,166.660},
				{168991.509,5812.328,10.000,167.250},
				{169572.742,5812.328,10.000,167.830},
				{170153.975,5812.328,10.000,168.380},
				{170735.207,5812.328,10.000,168.920},
				{171316.440,5812.328,10.000,169.440},
				{171897.673,5812.328,10.000,169.950},
				{172478.906,5812.328,10.000,170.430},
				{173060.139,5812.328,10.000,170.900},
				{173641.372,5812.328,10.000,171.350},
				{174222.604,5812.328,10.000,171.790},
				{174803.837,5812.328,10.000,172.220},
				{175385.070,5812.328,10.000,172.620},
				{175966.303,5812.328,10.000,173.020},
				{176547.536,5812.328,10.000,173.400},
				{177128.769,5812.328,10.000,173.760},
				{177710.001,5812.328,10.000,174.120},
				{178291.234,5812.328,10.000,174.460},
				{178872.467,5812.328,10.000,174.790},
				{179453.700,5812.328,10.000,175.100},
				{180034.933,5812.328,10.000,175.410},
				{180616.166,5812.328,10.000,175.700},
				{181197.398,5812.328,10.000,175.980},
				{181778.631,5812.328,10.000,176.250},
				{182359.864,5812.328,10.000,176.510},
				{182941.097,5812.328,10.000,176.750},
				{183522.330,5812.328,10.000,176.990},
				{184103.563,5812.328,10.000,177.220},
				{184684.795,5812.328,10.000,177.440},
				{185266.028,5812.328,10.000,177.640},
				{185847.261,5812.328,10.000,177.840},
				{186428.494,5812.328,10.000,178.030},
				{187009.727,5812.328,10.000,178.210},
				{187590.960,5812.328,10.000,178.380},
				{188172.192,5812.328,10.000,178.540},
				{188737.926,5657.333,10.000,178.690},
				{189288.159,5502.337,10.000,178.830},
				{189822.894,5347.342,10.000,178.950},
				{190342.128,5192.347,10.000,179.060},
				{190845.863,5037.351,10.000,179.170},
				{191334.099,4882.356,10.000,179.260},
				{191806.835,4727.360,10.000,179.350},
				{192264.072,4572.365,10.000,179.430},
				{192705.809,4417.370,10.000,179.500},
				{193132.046,4262.374,10.000,179.560},
				{193542.784,4107.379,10.000,179.620},
				{193938.022,3952.383,10.000,179.670},
				{194317.761,3797.388,10.000,179.710},
				{194682.000,3642.392,10.000,179.750},
				{195030.740,3487.397,10.000,179.790},
				{195363.980,3332.402,10.000,179.820},
				{195681.721,3177.406,10.000,179.850},
				{195983.962,3022.411,10.000,179.870},
				{196270.703,2867.415,10.000,179.890},
				{196541.945,2712.420,10.000,179.910},
				{196797.688,2557.424,10.000,179.920},
				{197037.931,2402.429,10.000,179.930},
				{197262.674,2247.434,10.000,179.940},
				{197471.918,2092.438,10.000,179.950},
				{197665.662,1937.443,10.000,179.960},
				{197843.907,1782.447,10.000,179.960},
				{198006.652,1627.452,10.000,179.970},
				{198153.898,1472.457,10.000,179.970},
				{198285.644,1317.461,10.000,179.970},
				{198401.890,1162.466,10.000,179.980},
				{198502.637,1007.470,10.000,179.980},
				{198587.885,852.475,10.000,179.980},
				{198657.633,697.479,10.000,179.980},
				{198711.881,542.484,10.000,179.980},
				{198750.630,387.489,10.000,179.980},
				{198773.879,232.493,10.000,179.980}		};

}