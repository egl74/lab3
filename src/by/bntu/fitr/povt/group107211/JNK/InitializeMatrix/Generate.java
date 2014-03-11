package by.bntu.fitr.povt.group107211.JNK.InitializeMatrix;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
import by.bntu.fitr.povt.group107211.JNK.Array2D.Arr2D;

public class Generate
{
	public static Arr2D Randomly(int a, int b)
	{
		int[][] m = new int[a][b];
		Random r = new Random();
		for (int i = 0; i < a; i++)
		{
			for (int j = 0; j < b; j++)
			{
				m[i][j] = r.nextInt(50) - 25;
			}
		}
		return new Arr2D(m);
	}
	
	public static Arr2D Manually(int a, int b)
	{
		int[][] m = new int[a][b];
		for (int i = 0; i < a; i++)
		{	
			System.out.println("Enter row " + Integer.toString(i+1));
			try {
		        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		        for (int j = 0; j < b ; j++) 
		        {
		                int k = Integer.parseInt(br.readLine());
		                m[i][j] = k;
		        }
		     }

		    catch (Exception e) {
		            e.printStackTrace();
		     }
		}
		return new Arr2D(m);
	}
}
