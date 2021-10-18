package client;

public class PacketConstants {

	public static final int[] SIZE = new int[256];

	static {
		SIZE[4] = 6;
		SIZE[8] = 4;
		SIZE[24] = 1;
		SIZE[34] = -2;
		SIZE[35] = 4;
		SIZE[36] = 3;
		SIZE[44] = 5;
		SIZE[47] = 6;
		SIZE[50] = 9;
		SIZE[53] = -2;
		SIZE[60] = -2;
		SIZE[61] = 1;
		SIZE[64] = 2;
		SIZE[65] = -2;
		SIZE[70] = 6;
		SIZE[71] = 3;
		SIZE[72] = 2;
		SIZE[73] = 4;
		SIZE[74] = 2;
		SIZE[75] = 4;
		SIZE[79] = 4;
		SIZE[81] = -2;
		SIZE[84] = 7;
		SIZE[85] = 2;
		SIZE[87] = 6;
		SIZE[97] = 2;
		SIZE[99] = 1;
		SIZE[101] = 2;
		SIZE[104] = -1;
		SIZE[105] = 4;
		SIZE[106] = 1;
		SIZE[110] = 1;
		SIZE[114] = 2;
		SIZE[117] = 15;
		SIZE[121] = 4;
		SIZE[122] = 4;
		SIZE[126] = -2;
		SIZE[134] = 6;
		SIZE[142] = 2;
		SIZE[147] = 14;
		SIZE[151] = 4;
		SIZE[156] = 3;
		SIZE[160] = 4;
		SIZE[164] = 2;
		SIZE[166] = 6;
		SIZE[171] = 3;
		SIZE[174] = 5;
		SIZE[176] = 10;
		SIZE[177] = 6;
		SIZE[185] = 2;
		SIZE[196] = -1;
		SIZE[200] = 4;
		SIZE[206] = 3;
		SIZE[208] = 2;
		SIZE[214] = -2;
		SIZE[215] = 7;
		SIZE[218] = 2;
		SIZE[221] = 1;
		SIZE[230] = 8;
		SIZE[240] = 2;
		SIZE[241] = -2;
		SIZE[246] = 6;
		SIZE[248] = 4;
		SIZE[249] = 3;
		SIZE[253] = -1;
		SIZE[254] = 6;
	}
}
