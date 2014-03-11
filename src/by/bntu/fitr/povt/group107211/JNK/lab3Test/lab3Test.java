package by.bntu.fitr.povt.group107211.JNK.lab3Test;

import by.bntu.fitr.povt.group107211.JNK.InitializeMatrix.Generate;
import by.bntu.fitr.povt.group107211.JNK.WorkOverMatrix.Operations;
import by.bntu.fitr.povt.group107211.JNK.Array2D.Arr2D;;

public class lab3Test 
{
	public static void main(String[] args)
	{
		Arr2D m1 = Generate.Randomly(5, 5);
		System.out.print(m1.toString());
		System.out.println("Matrix determinant: " + Integer.toString(Operations.calculateDeterminant(m1)));
		//System.out.println("Minimum at string " + Integer.toString(Operations.stringwithmin(m1.getA()) + 1));
		//System.out.println("Maximum at string " + Integer.toString(Operations.stringwithmax(m1.getA()) + 1));
		//m1 = Operations.interchangestrings(m1.A, Operations.stringwithmin(m1.A), Operations.stringwithmax(m1.A));
		//Operations.zeroesonmaindiagonal(m1.getA());
		
		//System.out.println("Matrix norm: " + Integer.toString(Operations.findNorm(m1.A)));
		/*if (Operations.isSymmetric(m1.A))
		{
			System.out.println("Matrix is symmetric");
		}
		else
		{
			System.out.println("Matrix is not symmetric");
		}*/
		//System.out.println("Maximal value on the diagonals: " + Integer.toString(Operations.maxvalueofdiagonals(m1.A)[0]));
		//Operations.interchgmaxofdgnlswcntr(m1.getA());
		//Operations.showMatrix(m1.getA());
	}
}
