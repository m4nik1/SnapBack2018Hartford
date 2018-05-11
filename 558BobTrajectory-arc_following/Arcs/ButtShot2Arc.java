package org.usfirst.frc.team558.robot.paths;

import org.usfirst.frc.team558.robot.util.*;

public class ButtShot2Arc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (24.31,23.15,0.00)
	// (27.31,23.15,0.00)
	
    public ButtShot2Arc() {
		super();
		this.highGear = false;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public ButtShot2Arc(boolean flipped) {
		super();
		this.highGear = false;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = false;

	double[][] centerPoints = {
				{0.073,1.455,10.000,0.000},
				{0.364,4.365,10.000,0.000},
				{1.019,8.730,10.000,0.000},
				{2.183,14.551,10.000,0.000},
				{4.001,21.826,10.000,0.000},
				{6.621,30.557,10.000,0.000},
				{10.186,40.742,10.000,0.000},
				{14.842,52.383,10.000,0.000},
				{20.735,65.479,10.000,0.000},
				{28.010,80.030,10.000,0.000},
				{36.814,96.035,10.000,0.000},
				{47.290,113.496,10.000,0.000},
				{59.586,132.413,10.000,0.000},
				{73.845,152.784,10.000,0.000},
				{90.215,174.610,10.000,0.000},
				{108.840,197.891,10.000,0.000},
				{129.793,221.173,10.000,0.000},
				{153.075,244.454,10.000,0.000},
				{178.684,267.735,10.000,0.000},
				{206.622,291.017,10.000,0.000},
				{236.887,314.298,10.000,0.000},
				{269.481,337.579,10.000,0.000},
				{304.403,360.861,10.000,0.000},
				{341.653,384.142,10.000,0.000},
				{381.232,407.423,10.000,0.000},
				{423.138,430.704,10.000,0.000},
				{467.373,453.986,10.000,0.000},
				{513.935,477.267,10.000,0.000},
				{562.826,500.548,10.000,0.000},
				{614.045,523.830,10.000,0.000},
				{667.592,547.111,10.000,0.000},
				{723.467,570.392,10.000,0.000},
				{781.670,593.674,10.000,0.000},
				{842.202,616.955,10.000,0.000},
				{905.061,640.236,10.000,0.000},
				{970.249,663.518,10.000,0.000},
				{1037.765,686.799,10.000,0.000},
				{1107.609,710.080,10.000,0.000},
				{1179.781,733.362,10.000,0.000},
				{1254.281,756.643,10.000,0.000},
				{1331.110,779.924,10.000,0.000},
				{1410.266,803.206,10.000,0.000},
				{1491.751,826.487,10.000,0.000},
				{1575.564,849.768,10.000,0.000},
				{1661.704,873.050,10.000,0.000},
				{1750.174,896.331,10.000,0.000},
				{1840.971,919.612,10.000,0.000},
				{1934.096,942.894,10.000,0.000},
				{2029.477,964.720,10.000,0.000},
				{2126.967,985.091,10.000,0.000},
				{2226.422,1004.007,10.000,0.000},
				{2327.696,1021.468,10.000,0.000},
				{2430.643,1037.474,10.000,0.000},
				{2535.118,1052.025,10.000,0.000},
				{2640.975,1065.121,10.000,0.000},
				{2748.069,1076.761,10.000,0.000},
				{2856.255,1086.947,10.000,0.000},
				{2965.386,1095.677,10.000,0.000},
				{3075.317,1102.953,10.000,0.000},
				{3185.904,1108.773,10.000,0.000},
				{3296.999,1113.138,10.000,0.000},
				{3408.459,1116.048,10.000,0.000},
				{3520.136,1117.504,10.000,0.000},
				{3631.814,1116.051,10.000,0.000},
				{3743.274,1113.144,10.000,0.000},
				{3854.370,1108.782,10.000,0.000},
				{3964.957,1102.965,10.000,0.000},
				{4074.890,1095.692,10.000,0.000},
				{4184.023,1086.965,10.000,0.000},
				{4292.210,1076.782,10.000,0.000},
				{4399.307,1065.145,10.000,0.000},
				{4505.167,1052.052,10.000,0.000},
				{4609.644,1037.504,10.000,0.000},
				{4712.595,1021.501,10.000,0.000},
				{4813.872,1004.044,10.000,0.000},
				{4913.331,985.130,10.000,0.000},
				{5010.825,964.762,10.000,0.000},
				{5106.210,942.939,10.000,0.000},
				{5199.340,919.661,10.000,0.000},
				{5290.142,896.380,10.000,0.000},
				{5378.616,873.098,10.000,0.000},
				{5464.762,849.817,10.000,0.000},
				{5548.580,826.536,10.000,0.000},
				{5630.069,803.254,10.000,0.000},
				{5709.231,779.973,10.000,0.000},
				{5786.064,756.692,10.000,0.000},
				{5860.569,733.410,10.000,0.000},
				{5932.746,710.129,10.000,0.000},
				{6002.595,686.848,10.000,0.000},
				{6070.115,663.566,10.000,0.000},
				{6135.308,640.285,10.000,0.000},
				{6198.172,617.004,10.000,0.000},
				{6258.709,593.722,10.000,0.000},
				{6316.917,570.441,10.000,0.000},
				{6372.797,547.160,10.000,0.000},
				{6426.349,523.878,10.000,0.000},
				{6477.573,500.597,10.000,0.000},
				{6526.468,477.316,10.000,0.000},
				{6573.036,454.034,10.000,0.000},
				{6617.275,430.753,10.000,0.000},
				{6659.186,407.472,10.000,0.000},
				{6698.769,384.190,10.000,0.000},
				{6736.024,360.909,10.000,0.000},
				{6770.951,337.628,10.000,0.000},
				{6803.550,314.346,10.000,0.000},
				{6833.820,291.065,10.000,0.000},
				{6861.763,267.784,10.000,0.000},
				{6887.377,244.502,10.000,0.000},
				{6910.663,221.221,10.000,0.000},
				{6931.621,197.940,10.000,0.000},
				{6950.251,174.658,10.000,0.000},
				{6966.626,152.829,10.000,0.000},
				{6980.890,132.455,10.000,0.000},
				{6993.190,113.536,10.000,0.000},
				{7003.670,96.072,10.000,0.000},
				{7012.477,80.063,10.000,0.000},
				{7019.755,65.509,10.000,0.000},
				{7025.651,52.410,10.000,0.000},
				{7030.310,40.767,10.000,0.000},
				{7033.877,30.578,10.000,0.000},
				{7036.498,21.844,10.000,0.000},
				{7038.319,14.566,10.000,0.000},
				{7039.484,8.743,10.000,0.000},
				{7040.140,4.374,10.000,0.000},
				{7040.432,1.461,10.000,0.000},
				{7040.505,0.003,10.000,0.000},
				{7040.505,0.000,10.000,0.000},
				{7040.505,0.000,10.000,0.000}		};

}