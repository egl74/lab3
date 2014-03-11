package by.bntu.fitr.povt.group107211.JNK.Array2D;

public class Arr2D
{
	private int[][] A;
	
	public Arr2D()
	{
		A = new int[5][5];
		
		A = new int[5][];
		
		for (int i = 0; i < A.length; i++)
		{
			A[i] = new int[i];
		}
		
	}
	
	public Arr2D(int[][] B)
	{
		A = B;
	}

	public int getA(int i, int j)
	{
		return A[i][j];
	}

	public void setA(int a, int i, int j)
	{
		//A = a;
		A[i][j] = a;
	}
	
	public int getStrings()
	{
		return A.length;
	}
	
	public int getRows()
	{
		return A[0].length;
	}
	
	@Override
	public String toString()
	{
		String s = "";
		for (int i = 0; i < A.length; i++)
		{
			for (int j = 0; j < A[0].length; j++)
			{
				//System.out.print(A[i][j]);
				s += A[i][j];
				s += " ";
				//System.out.print(" ");				
			}
			//System.out.println("");
			s += "\n";
		}
		// TODO Auto-generated method stub
		return s;
	}
	
}
