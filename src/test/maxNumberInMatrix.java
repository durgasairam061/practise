package test;

public class maxNumberInMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int abc[][] = { { 8, 4, 5 }, { 3, 4, 7 }, { 1, 2, 9 } };
		int max = abc[0][0];
		for (int i = 0; i < 3; i++) {

			// 2 4 5
			// 3 8 7
			// 1 0 9

			for (int j = 0; j < 3; j++) {
				// System.out.print(abc[i][j]);
				if (abc[i][j] > max) {
					max = abc[i][j];
				}
			}

		}
		System.out.println(max);
	}

}
