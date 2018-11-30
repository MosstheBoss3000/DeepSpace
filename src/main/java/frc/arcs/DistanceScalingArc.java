package frc.arcs;

import com.team319.follower.SrxMotionProfile;
import com.team319.follower.SrxTrajectory;

public class DistanceScalingArc extends SrxTrajectory {
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (2.00,13.50,0.00)
	// (5.00,13.50,0.00)
	
    public DistanceScalingArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public DistanceScalingArc(boolean flipped) {
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
				{460.878,146.311,10.000,0.000},
				{475.509,146.311,10.000,0.000},
				{490.140,146.311,10.000,0.000},
				{504.771,146.311,10.000,0.000},
				{519.402,146.311,10.000,0.000},
				{534.033,146.311,10.000,0.000},
				{548.664,146.311,10.000,0.000},
				{563.295,146.311,10.000,0.000},
				{577.926,146.311,10.000,0.000},
				{592.558,146.311,10.000,0.000},
				{607.189,146.311,10.000,0.000},
				{621.820,146.311,10.000,0.000},
				{636.451,146.311,10.000,0.000},
				{651.082,146.311,10.000,0.000},
				{665.713,146.311,10.000,0.000},
				{680.344,146.311,10.000,0.000},
				{694.975,146.311,10.000,0.000},
				{709.606,146.311,10.000,0.000},
				{724.237,146.311,10.000,0.000},
				{738.868,146.311,10.000,0.000},
				{753.499,146.311,10.000,0.000},
				{768.130,146.311,10.000,0.000},
				{782.761,146.311,10.000,0.000},
				{797.392,146.311,10.000,0.000},
				{812.023,146.311,10.000,0.000},
				{826.654,146.311,10.000,0.000},
				{841.285,146.311,10.000,0.000},
				{855.916,146.311,10.000,0.000},
				{870.547,146.311,10.000,0.000},
				{885.179,146.311,10.000,0.000},
				{899.810,146.311,10.000,0.000},
				{914.441,146.311,10.000,0.000},
				{929.072,146.311,10.000,0.000},
				{943.703,146.311,10.000,0.000},
				{958.334,146.311,10.000,0.000},
				{972.965,146.311,10.000,0.000},
				{987.596,146.311,10.000,0.000},
				{1002.227,146.311,10.000,0.000},
				{1016.858,146.311,10.000,0.000},
				{1031.489,146.311,10.000,0.000},
				{1045.876,143.872,10.000,0.000},
				{1060.020,141.433,10.000,0.000},
				{1073.919,138.995,10.000,0.000},
				{1087.575,136.556,10.000,0.000},
				{1100.987,134.118,10.000,0.000},
				{1114.154,131.679,10.000,0.000},
				{1127.079,129.241,10.000,0.000},
				{1139.759,126.802,10.000,0.000},
				{1152.195,124.364,10.000,0.000},
				{1164.388,121.925,10.000,0.000},
				{1176.336,119.487,10.000,0.000},
				{1188.041,117.048,10.000,0.000},
				{1199.502,114.610,10.000,0.000},
				{1210.719,112.171,10.000,0.000},
				{1221.693,109.733,10.000,0.000},
				{1232.422,107.294,10.000,0.000},
				{1242.908,104.856,10.000,0.000},
				{1253.149,102.417,10.000,0.000},
				{1263.147,99.979,10.000,0.000},
				{1272.901,97.540,10.000,0.000},
				{1282.412,95.102,10.000,0.000},
				{1291.678,92.663,10.000,0.000},
				{1300.700,90.225,10.000,0.000},
				{1309.479,87.786,10.000,0.000},
				{1318.014,85.348,10.000,0.000},
				{1326.305,82.909,10.000,0.000},
				{1334.352,80.471,10.000,0.000},
				{1342.155,78.032,10.000,0.000},
				{1349.714,75.594,10.000,0.000},
				{1357.030,73.155,10.000,0.000},
				{1364.102,70.717,10.000,0.000},
				{1370.929,68.278,10.000,0.000},
				{1377.513,65.840,10.000,0.000},
				{1383.854,63.401,10.000,0.000},
				{1389.950,60.963,10.000,0.000},
				{1395.802,58.524,10.000,0.000},
				{1401.411,56.086,10.000,0.000},
				{1406.775,53.647,10.000,0.000},
				{1411.896,51.209,10.000,0.000},
				{1416.773,48.770,10.000,0.000},
				{1421.407,46.332,10.000,0.000},
				{1425.796,43.893,10.000,0.000},
				{1429.941,41.455,10.000,0.000},
				{1433.843,39.016,10.000,0.000},
				{1437.501,36.578,10.000,0.000},
				{1440.915,34.139,10.000,0.000},
				{1444.085,31.701,10.000,0.000},
				{1447.011,29.262,10.000,0.000},
				{1449.693,26.824,10.000,0.000},
				{1452.132,24.385,10.000,0.000},
				{1454.326,21.947,10.000,0.000},
				{1456.277,19.508,10.000,0.000},
				{1457.984,17.070,10.000,0.000},
				{1459.447,14.631,10.000,0.000},
				{1460.667,12.193,10.000,0.000},
				{1461.642,9.754,10.000,0.000},
				{1462.373,7.316,10.000,0.000},
				{1462.861,4.877,10.000,0.000}		};

}