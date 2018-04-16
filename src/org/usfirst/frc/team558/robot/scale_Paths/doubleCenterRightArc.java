package org.usfirst.frc.team558.robot.scale_Paths;

import org.usfirst.frc.team558.robot.util.*;

public class doubleCenterRightArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (1.31,13.08,0.00)
	// (11.08,8.38,0.00)
	
    public doubleCenterRightArc() {
		super();
		this.highGear = false;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public doubleCenterRightArc(boolean flipped) {
		super();
		this.highGear = false;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = false;

	double[][] centerPoints = {
				{0.073,1.455,10.000,0.000},
				{0.364,4.364,10.000,-0.000},
				{1.018,8.728,10.000,-0.000},
				{2.182,14.546,10.000,-0.000},
				{4.000,21.819,10.000,-0.000},
				{6.618,30.547,10.000,-0.000},
				{10.182,40.729,10.000,-0.000},
				{14.837,52.366,10.000,-0.000},
				{20.728,65.457,10.000,-0.000},
				{28.001,80.003,10.000,-0.001},
				{36.801,96.004,10.000,-0.001},
				{47.275,113.459,10.000,-0.002},
				{59.566,132.369,10.000,-0.003},
				{73.821,152.733,10.000,-0.005},
				{90.185,174.552,10.000,-0.007},
				{108.804,197.826,10.000,-0.010},
				{129.751,221.100,10.000,-0.014},
				{153.024,244.373,10.000,-0.020},
				{178.625,267.647,10.000,-0.027},
				{206.554,290.920,10.000,-0.035},
				{236.809,314.194,10.000,-0.046},
				{269.392,337.468,10.000,-0.060},
				{304.303,360.741,10.000,-0.076},
				{341.541,384.015,10.000,-0.096},
				{381.106,407.289,10.000,-0.119},
				{422.998,430.562,10.000,-0.147},
				{467.218,453.836,10.000,-0.178},
				{513.766,477.110,10.000,-0.215},
				{562.640,500.383,10.000,-0.257},
				{613.842,523.657,10.000,-0.305},
				{667.372,546.931,10.000,-0.359},
				{723.228,570.204,10.000,-0.421},
				{781.412,593.478,10.000,-0.490},
				{841.924,616.751,10.000,-0.566},
				{904.763,640.025,10.000,-0.652},
				{969.929,663.299,10.000,-0.747},
				{1037.422,686.572,10.000,-0.851},
				{1107.243,709.846,10.000,-0.966},
				{1179.392,733.120,10.000,-1.092},
				{1253.867,756.393,10.000,-1.230},
				{1330.670,779.667,10.000,-1.380},
				{1409.801,802.941,10.000,-1.543},
				{1491.258,826.214,10.000,-1.720},
				{1575.044,849.488,10.000,-1.911},
				{1661.156,872.761,10.000,-2.118},
				{1749.596,896.035,10.000,-2.340},
				{1840.363,919.309,10.000,-2.579},
				{1933.458,942.582,10.000,-2.836},
				{2028.879,965.856,10.000,-3.111},
				{2126.629,989.130,10.000,-3.404},
				{2226.705,1012.403,10.000,-3.718},
				{2329.109,1035.677,10.000,-4.052},
				{2433.841,1058.951,10.000,-4.407},
				{2540.900,1082.224,10.000,-4.784},
				{2650.286,1105.498,10.000,-5.184},
				{2761.999,1128.771,10.000,-5.608},
				{2876.040,1152.045,10.000,-6.056},
				{2992.408,1175.319,10.000,-6.529},
				{3111.104,1198.592,10.000,-7.027},
				{3232.127,1221.866,10.000,-7.553},
				{3355.477,1245.140,10.000,-8.105},
				{3481.155,1268.413,10.000,-8.685},
				{3609.160,1291.687,10.000,-9.293},
				{3739.492,1314.961,10.000,-9.930},
				{3872.152,1338.234,10.000,-10.596},
				{4007.139,1361.508,10.000,-11.291},
				{4144.453,1384.782,10.000,-12.016},
				{4284.095,1408.055,10.000,-12.770},
				{4426.064,1431.329,10.000,-13.553},
				{4570.361,1454.602,10.000,-14.365},
				{4716.985,1477.876,10.000,-15.206},
				{4865.936,1501.150,10.000,-16.075},
				{5017.215,1524.423,10.000,-16.970},
				{5170.821,1547.697,10.000,-17.892},
				{5326.754,1570.971,10.000,-18.838},
				{5485.015,1594.244,10.000,-19.807},
				{5645.603,1617.518,10.000,-20.798},
				{5808.518,1640.792,10.000,-21.808},
				{5973.761,1664.065,10.000,-22.835},
				{6141.331,1687.339,10.000,-23.876},
				{6311.229,1710.612,10.000,-24.930},
				{6483.454,1733.886,10.000,-25.993},
				{6658.006,1757.160,10.000,-27.062},
				{6834.886,1780.433,10.000,-28.134},
				{7014.093,1803.707,10.000,-29.206},
				{7195.627,1826.981,10.000,-30.274},
				{7379.489,1850.254,10.000,-31.336},
				{7565.678,1873.528,10.000,-32.389},
				{7754.195,1896.802,10.000,-33.428},
				{7945.038,1920.075,10.000,-34.450},
				{8138.210,1943.349,10.000,-35.454},
				{8333.708,1966.622,10.000,-36.436},
				{8531.534,1989.896,10.000,-37.392},
				{8731.687,2013.170,10.000,-38.321},
				{8934.168,2036.443,10.000,-39.221},
				{9138.976,2059.717,10.000,-40.088},
				{9346.112,2082.991,10.000,-40.921},
				{9555.574,2106.264,10.000,-41.718},
				{9767.364,2129.538,10.000,-42.477},
				{9981.482,2152.812,10.000,-43.198},
				{10197.854,2174.631,10.000,-43.877},
				{10416.335,2194.995,10.000,-44.514},
				{10636.780,2213.905,10.000,-45.107},
				{10859.044,2231.360,10.000,-45.655},
				{11082.980,2247.361,10.000,-46.157},
				{11308.443,2261.907,10.000,-46.612},
				{11535.288,2274.998,10.000,-47.019},
				{11763.370,2286.635,10.000,-47.378},
				{11992.542,2296.817,10.000,-47.689},
				{12222.661,2305.545,10.000,-47.951},
				{12453.579,2312.818,10.000,-48.163},
				{12685.151,2318.636,10.000,-48.326},
				{12917.233,2323.000,10.000,-48.440},
				{13149.679,2325.909,10.000,-48.503},
				{13382.310,2326.716,10.000,-48.517},
				{13614.877,2324.614,10.000,-48.481},
				{13847.160,2321.058,10.000,-48.395},
				{14079.015,2316.047,10.000,-48.260},
				{14310.297,2309.581,10.000,-48.075},
				{14540.859,2301.660,10.000,-47.840},
				{14770.556,2292.285,10.000,-47.557},
				{14999.243,2281.456,10.000,-47.225},
				{15226.775,2269.172,10.000,-46.844},
				{15453.005,2255.433,10.000,-46.415},
				{15677.788,2240.239,10.000,-45.940},
				{15900.980,2223.591,10.000,-45.417},
				{16122.434,2205.489,10.000,-44.849},
				{16342.005,2185.932,10.000,-44.237},
				{16559.548,2164.920,10.000,-43.581},
				{16774.916,2142.453,10.000,-42.883},
				{16987.998,2119.180,10.000,-42.145},
				{17198.752,2095.906,10.000,-41.369},
				{17407.179,2072.632,10.000,-40.556},
				{17613.279,2049.359,10.000,-39.707},
				{17817.051,2026.085,10.000,-38.825},
				{18018.496,2002.811,10.000,-37.913},
				{18217.613,1979.538,10.000,-36.971},
				{18414.403,1956.264,10.000,-36.003},
				{18608.866,1932.991,10.000,-35.011},
				{18801.001,1909.717,10.000,-33.999},
				{18990.809,1886.443,10.000,-32.969},
				{19178.290,1863.170,10.000,-31.923},
				{19363.443,1839.896,10.000,-30.866},
				{19546.269,1816.622,10.000,-29.801},
				{19726.768,1793.349,10.000,-28.731},
				{19904.939,1770.075,10.000,-27.658},
				{20080.783,1746.801,10.000,-26.587},
				{20254.299,1723.528,10.000,-25.521},
				{20425.488,1700.254,10.000,-24.461},
				{20594.350,1676.981,10.000,-23.413},
				{20760.884,1653.707,10.000,-22.377},
				{20925.091,1630.433,10.000,-21.358},
				{21086.971,1607.160,10.000,-20.356},
				{21246.523,1583.886,10.000,-19.375},
				{21403.748,1560.612,10.000,-18.416},
				{21558.646,1537.339,10.000,-17.480},
				{21711.216,1514.065,10.000,-16.570},
				{21861.459,1490.791,10.000,-15.686},
				{22009.374,1467.518,10.000,-14.830},
				{22154.962,1444.244,10.000,-14.002},
				{22298.223,1420.970,10.000,-13.203},
				{22439.156,1397.697,10.000,-12.432},
				{22577.762,1374.423,10.000,-11.691},
				{22714.041,1351.150,10.000,-10.980},
				{22847.992,1327.876,10.000,-10.298},
				{22979.616,1304.602,10.000,-9.645},
				{23108.913,1281.329,10.000,-9.021},
				{23235.882,1258.055,10.000,-8.425},
				{23360.524,1234.781,10.000,-7.857},
				{23482.838,1211.508,10.000,-7.317},
				{23602.825,1188.234,10.000,-6.803},
				{23720.485,1164.960,10.000,-6.316},
				{23835.818,1141.687,10.000,-5.854},
				{23948.823,1118.413,10.000,-5.417},
				{24059.500,1095.140,10.000,-5.004},
				{24167.850,1071.866,10.000,-4.614},
				{24273.873,1048.592,10.000,-4.247},
				{24377.569,1025.319,10.000,-3.901},
				{24478.937,1002.045,10.000,-3.577},
				{24577.978,978.771,10.000,-3.272},
				{24674.691,955.498,10.000,-2.987},
				{24769.077,932.224,10.000,-2.720},
				{24861.136,908.950,10.000,-2.472},
				{24950.868,885.677,10.000,-2.240},
				{25038.272,862.403,10.000,-2.025},
				{25123.348,839.130,10.000,-1.825},
				{25206.097,815.856,10.000,-1.640},
				{25286.519,792.582,10.000,-1.469},
				{25364.614,769.309,10.000,-1.312},
				{25440.381,746.035,10.000,-1.167},
				{25513.821,722.761,10.000,-1.035},
				{25584.933,699.488,10.000,-0.914},
				{25653.718,676.214,10.000,-0.804},
				{25720.176,652.940,10.000,-0.704},
				{25784.306,629.667,10.000,-0.613},
				{25846.109,606.393,10.000,-0.532},
				{25905.585,583.119,10.000,-0.458},
				{25962.733,559.846,10.000,-0.393},
				{26017.554,536.572,10.000,-0.335},
				{26070.048,513.299,10.000,-0.283},
				{26120.214,490.025,10.000,-0.238},
				{26168.053,466.751,10.000,-0.198},
				{26213.564,443.478,10.000,-0.164},
				{26256.748,420.204,10.000,-0.134},
				{26297.605,396.930,10.000,-0.109},
				{26336.134,373.657,10.000,-0.087},
				{26372.336,350.383,10.000,-0.069},
				{26406.211,327.109,10.000,-0.054},
				{26437.758,303.836,10.000,-0.041},
				{26466.978,280.562,10.000,-0.031},
				{26493.871,257.289,10.000,-0.023},
				{26518.436,234.015,10.000,-0.017},
				{26540.674,210.741,10.000,-0.012},
				{26560.584,187.468,10.000,-0.008},
				{26578.200,164.841,10.000,-0.006},
				{26593.625,143.670,10.000,-0.004},
				{26607.006,123.953,10.000,-0.002},
				{26618.488,105.690,10.000,-0.002},
				{26628.217,88.882,10.000,-0.001},
				{26636.338,73.529,10.000,-0.001},
				{26642.996,59.631,10.000,-0.000},
				{26648.337,47.187,10.000,-0.000},
				{26652.506,36.197,10.000,-0.000},
				{26655.649,26.662,10.000,-0.000},
				{26657.911,18.582,10.000,-0.000},
				{26659.438,11.956,10.000,-0.000},
				{26660.375,6.785,10.000,-0.000},
				{26660.868,3.069,10.000,-0.000},
				{26661.061,0.807,10.000,0.000},
				{26661.102,0.000,10.000,0.000},
				{26661.102,0.000,10.000,0.000}		};

}