package Arrays;

public class add_Two_matrices {

	public static void main(String[] args) 
	{
		int row=2,col=3;
		int mat1[][]= {{2,3,4},{5,2,3}};
		int mat2[][]= {{-4,5,3},{5,6,3}};
		
		//adding tow matrices
		int[][] sum=new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				sum[i][j]=mat1[i][j]+mat2[i][j];
			}
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}

	}

}
