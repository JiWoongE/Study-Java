package Class07;

public class TransposeMatrix {
	static void transpose(int[][] matrix, int[][] tmatrix, int n, int m) {
		 for (int i=0; i<n; i++)
			 for (int j=0; j<m; j++)
				 tmatrix[j][i] = matrix[i][j]; }
	public static void main(String[] args) {
		 int[][] a = { {1,2,3 },{4,5,6} };
		 int[][] b = new int[3][2];
		 transpose(a, b, 2, 3);
		 for (int i=0; i<b.length; ++i) {
			 for (int j=0; j<b[0].length; ++j)
				 System.out.print(b[i][j]+" ");
			 System.out.println();
		 }
		}
	 
}
