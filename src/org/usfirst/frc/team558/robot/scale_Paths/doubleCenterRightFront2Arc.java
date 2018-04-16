package org.usfirst.frc.team558.robot.scale_Paths;

import org.usfirst.frc.team558.robot.util.*;

public class doubleCenterRightFront2Arc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (3.08,13.18,0.00)
	// (12.58,8.48,0.00)
	
    public doubleCenterRightFront2Arc() {
		super();
		this.highGear = false;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public doubleCenterRightFront2Arc(boolean flipped) {
		super();
		this.highGear = false;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = false;

	double[][] centerPoints = {
				{0.073,1.454,10.000,0.000},
				{0.363,4.361,10.000,-0.000},
				{1.017,8.721,10.000,-0.000},
				{2.180,14.535,10.000,-0.000},
				{3.997,21.803,10.000,-0.000},
				{6.614,30.524,10.000,-0.000},
				{10.175,40.699,10.000,-0.000},
				{14.826,52.328,10.000,-0.000},
				{20.713,65.410,10.000,-0.000},
				{27.981,79.945,10.000,-0.001},
				{36.775,95.934,10.000,-0.001},
				{47.240,113.377,10.000,-0.002},
				{59.523,132.273,10.000,-0.003},
				{73.767,152.622,10.000,-0.005},
				{90.120,174.425,10.000,-0.007},
				{108.725,197.682,10.000,-0.010},
				{129.656,220.939,10.000,-0.015},
				{152.913,244.196,10.000,-0.021},
				{178.495,267.452,10.000,-0.028},
				{206.403,290.709,10.000,-0.037},
				{236.637,313.966,10.000,-0.049},
				{269.197,337.222,10.000,-0.063},
				{304.082,360.479,10.000,-0.080},
				{341.292,383.736,10.000,-0.101},
				{380.829,406.993,10.000,-0.125},
				{422.691,430.249,10.000,-0.154},
				{466.879,453.506,10.000,-0.187},
				{513.392,476.763,10.000,-0.226},
				{562.231,500.019,10.000,-0.270},
				{613.396,523.276,10.000,-0.321},
				{666.886,546.533,10.000,-0.378},
				{722.703,569.790,10.000,-0.442},
				{780.844,593.046,10.000,-0.515},
				{841.312,616.303,10.000,-0.595},
				{904.105,639.560,10.000,-0.685},
				{969.224,662.816,10.000,-0.785},
				{1036.668,686.073,10.000,-0.895},
				{1106.438,709.330,10.000,-1.015},
				{1178.534,732.587,10.000,-1.148},
				{1252.956,755.843,10.000,-1.293},
				{1329.703,779.100,10.000,-1.451},
				{1408.776,802.357,10.000,-1.622},
				{1490.174,825.614,10.000,-1.808},
				{1573.898,848.870,10.000,-2.010},
				{1659.948,872.127,10.000,-2.227},
				{1748.324,895.384,10.000,-2.462},
				{1839.025,918.640,10.000,-2.714},
				{1932.052,941.897,10.000,-2.984},
				{2027.404,965.154,10.000,-3.273},
				{2125.083,988.411,10.000,-3.583},
				{2225.087,1011.667,10.000,-3.913},
				{2327.416,1034.924,10.000,-4.265},
				{2432.071,1058.181,10.000,-4.640},
				{2539.052,1081.437,10.000,-5.038},
				{2648.359,1104.694,10.000,-5.460},
				{2759.991,1127.951,10.000,-5.908},
				{2873.949,1151.208,10.000,-6.381},
				{2990.233,1174.464,10.000,-6.881},
				{3108.842,1197.721,10.000,-7.409},
				{3229.777,1220.978,10.000,-7.964},
				{3353.037,1244.234,10.000,-8.549},
				{3478.624,1267.491,10.000,-9.162},
				{3606.536,1290.748,10.000,-9.806},
				{3736.773,1314.005,10.000,-10.481},
				{3869.337,1337.261,10.000,-11.186},
				{4004.226,1360.518,10.000,-11.922},
				{4141.440,1383.775,10.000,-12.690},
				{4280.981,1407.031,10.000,-13.488},
				{4422.847,1430.288,10.000,-14.318},
				{4567.038,1453.545,10.000,-15.178},
				{4713.555,1476.802,10.000,-16.069},
				{4862.398,1500.058,10.000,-16.988},
				{5013.567,1523.315,10.000,-17.935},
				{5167.062,1546.572,10.000,-18.910},
				{5322.882,1569.829,10.000,-19.909},
				{5481.027,1593.085,10.000,-20.932},
				{5641.499,1616.342,10.000,-21.976},
				{5804.296,1639.599,10.000,-23.040},
				{5969.418,1662.855,10.000,-24.119},
				{6136.867,1686.112,10.000,-25.213},
				{6306.641,1709.369,10.000,-26.317},
				{6478.740,1732.626,10.000,-27.428},
				{6653.166,1755.882,10.000,-28.544},
				{6829.917,1779.139,10.000,-29.660},
				{7008.994,1802.396,10.000,-30.773},
				{7190.396,1825.652,10.000,-31.880},
				{7374.124,1848.909,10.000,-32.976},
				{7560.178,1872.166,10.000,-34.060},
				{7748.557,1895.423,10.000,-35.126},
				{7939.262,1918.679,10.000,-36.173},
				{8132.293,1941.936,10.000,-37.196},
				{8327.650,1965.193,10.000,-38.193},
				{8525.332,1988.449,10.000,-39.161},
				{8725.340,2011.706,10.000,-40.097},
				{8927.673,2034.963,10.000,-41.000},
				{9132.332,2058.220,10.000,-41.867},
				{9339.317,2081.476,10.000,-42.696},
				{9548.627,2104.733,10.000,-43.485},
				{9760.263,2127.990,10.000,-44.233},
				{9974.153,2149.793,10.000,-44.938},
				{10190.149,2170.143,10.000,-45.598},
				{10408.108,2189.039,10.000,-46.213},
				{10627.884,2206.481,10.000,-46.780},
				{10849.332,2222.470,10.000,-47.299},
				{11072.306,2237.006,10.000,-47.770},
				{11296.660,2250.088,10.000,-48.190},
				{11522.251,2261.716,10.000,-48.561},
				{11748.931,2271.891,10.000,-48.881},
				{11976.556,2280.612,10.000,-49.151},
				{12204.981,2287.880,10.000,-49.369},
				{12434.059,2293.694,10.000,-49.536},
				{12663.647,2298.055,10.000,-49.652},
				{12893.598,2300.962,10.000,-49.716},
				{13123.730,2301.677,10.000,-49.729},
				{13353.788,2299.484,10.000,-49.690},
				{13583.554,2295.839,10.000,-49.600},
				{13812.883,2290.739,10.000,-49.458},
				{14041.629,2284.187,10.000,-49.265},
				{14269.647,2276.180,10.000,-49.020},
				{14496.792,2266.720,10.000,-48.725},
				{14722.919,2255.807,10.000,-48.379},
				{14947.881,2243.440,10.000,-47.983},
				{15171.534,2229.620,10.000,-47.537},
				{15393.732,2214.345,10.000,-47.042},
				{15614.330,2197.618,10.000,-46.498},
				{15833.183,2179.437,10.000,-45.907},
				{16050.145,2159.802,10.000,-45.269},
				{16265.071,2138.714,10.000,-44.586},
				{16477.815,2116.172,10.000,-43.859},
				{16688.270,2092.915,10.000,-43.090},
				{16896.398,2069.659,10.000,-42.281},
				{17102.201,2046.402,10.000,-41.432},
				{17305.679,2023.145,10.000,-40.547},
				{17506.830,1999.888,10.000,-39.627},
				{17705.656,1976.632,10.000,-38.674},
				{17902.157,1953.375,10.000,-37.691},
				{18096.331,1930.118,10.000,-36.681},
				{18288.180,1906.862,10.000,-35.645},
				{18477.704,1883.605,10.000,-34.588},
				{18664.901,1860.348,10.000,-33.513},
				{18849.773,1837.091,10.000,-32.422},
				{19032.320,1813.835,10.000,-31.320},
				{19212.540,1790.578,10.000,-30.210},
				{19390.435,1767.321,10.000,-29.095},
				{19566.004,1744.064,10.000,-27.978},
				{19739.248,1720.808,10.000,-26.864},
				{19910.166,1697.551,10.000,-25.756},
				{20078.758,1674.294,10.000,-24.657},
				{20245.025,1651.038,10.000,-23.571},
				{20408.966,1627.781,10.000,-22.499},
				{20570.581,1604.524,10.000,-21.445},
				{20729.871,1581.267,10.000,-20.411},
				{20886.834,1558.011,10.000,-19.400},
				{21041.473,1534.754,10.000,-18.413},
				{21193.785,1511.497,10.000,-17.452},
				{21343.772,1488.241,10.000,-16.519},
				{21491.433,1464.984,10.000,-15.614},
				{21636.769,1441.727,10.000,-14.739},
				{21779.779,1418.470,10.000,-13.894},
				{21920.463,1395.214,10.000,-13.080},
				{22058.822,1371.957,10.000,-12.298},
				{22194.854,1348.700,10.000,-11.546},
				{22328.562,1325.444,10.000,-10.825},
				{22459.943,1302.187,10.000,-10.136},
				{22588.999,1278.930,10.000,-9.477},
				{22715.729,1255.673,10.000,-8.848},
				{22840.134,1232.417,10.000,-8.249},
				{22962.213,1209.160,10.000,-7.680},
				{23081.966,1185.903,10.000,-7.138},
				{23199.393,1162.647,10.000,-6.625},
				{23314.495,1139.390,10.000,-6.139},
				{23427.271,1116.133,10.000,-5.678},
				{23537.722,1092.876,10.000,-5.244},
				{23645.846,1069.620,10.000,-4.834},
				{23751.646,1046.363,10.000,-4.448},
				{23855.119,1023.106,10.000,-4.085},
				{23956.267,999.849,10.000,-3.744},
				{24055.089,976.593,10.000,-3.424},
				{24151.585,953.336,10.000,-3.125},
				{24245.756,930.079,10.000,-2.845},
				{24337.601,906.823,10.000,-2.584},
				{24427.121,883.566,10.000,-2.341},
				{24514.314,860.309,10.000,-2.116},
				{24599.182,837.052,10.000,-1.906},
				{24681.725,813.796,10.000,-1.713},
				{24761.942,790.539,10.000,-1.534},
				{24839.833,767.282,10.000,-1.369},
				{24915.398,744.026,10.000,-1.218},
				{24988.638,720.769,10.000,-1.080},
				{25059.552,697.512,10.000,-0.953},
				{25128.140,674.255,10.000,-0.838},
				{25194.403,650.999,10.000,-0.733},
				{25258.340,627.742,10.000,-0.639},
				{25319.951,604.485,10.000,-0.554},
				{25379.237,581.229,10.000,-0.477},
				{25436.197,557.972,10.000,-0.409},
				{25490.831,534.715,10.000,-0.348},
				{25543.140,511.458,10.000,-0.294},
				{25593.123,488.202,10.000,-0.247},
				{25640.780,464.945,10.000,-0.206},
				{25686.112,441.688,10.000,-0.170},
				{25729.118,418.432,10.000,-0.139},
				{25769.798,395.175,10.000,-0.113},
				{25808.153,371.918,10.000,-0.090},
				{25844.182,348.661,10.000,-0.071},
				{25877.885,325.405,10.000,-0.056},
				{25909.263,302.148,10.000,-0.043},
				{25938.315,278.891,10.000,-0.032},
				{25965.041,255.634,10.000,-0.024},
				{25989.442,232.378,10.000,-0.017},
				{26011.517,209.121,10.000,-0.012},
				{26031.266,185.864,10.000,-0.009},
				{26048.726,163.346,10.000,-0.006},
				{26064.008,142.282,10.000,-0.004},
				{26077.255,122.671,10.000,-0.003},
				{26088.615,104.513,10.000,-0.002},
				{26098.231,87.809,10.000,-0.001},
				{26106.249,72.559,10.000,-0.001},
				{26112.815,58.762,10.000,-0.000},
				{26118.074,46.419,10.000,-0.000},
				{26122.172,35.529,10.000,-0.000},
				{26125.253,26.093,10.000,-0.000},
				{26127.463,18.110,10.000,-0.000},
				{26128.947,11.581,10.000,-0.000},
				{26129.852,6.505,10.000,-0.000},
				{26130.321,2.883,10.000,-0.000},
				{26130.501,0.715,10.000,0.000},
				{26130.537,0.000,10.000,0.000},
				{26130.537,0.000,10.000,0.000}		};

}