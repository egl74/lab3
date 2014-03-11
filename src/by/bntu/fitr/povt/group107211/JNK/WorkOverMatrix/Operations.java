package by.bntu.fitr.povt.group107211.JNK.WorkOverMatrix;

//import java.lang.Math;
import by.bntu.fitr.povt.group107211.JNK.Array2D.Arr2D;

public class Operations 
{
	/*public static void showMatrix(int[][] m1)
	{
		for (int i = 0; i < m1.length; i++)
		{
			for (int j = 0; j < m1[0].length; j++)
			{
				System.out.print(m1[i][j]);
				System.out.print(" ");				
			}
			System.out.println("");
		}
	}*/
	
    public static int calculateDeterminant(Arr2D matrix)
    {
    	if (matrix.getStrings() != matrix.getRows())
    	{
    		//EXCEPTION System.out.println("Matrix is not a square matrix!");
    		return 0;
    	}
        int calcResult=0;
        if (matrix.getRows()==2)
        {
            calcResult=matrix.getA(0, 0)*matrix.getA(1, 1)-matrix.getA(1, 0)*matrix.getA(0, 1);
        }
        else
        {
            int koeff=1;
            for(int i=0; i<matrix.getStrings(); i++)
            {
                if(i%2==1)
                {  
                    koeff=-1;
                }
                else
                {
                    koeff=1;
                }                
                calcResult += koeff*matrix.getA(0, i)*Operations.calculateDeterminant(getMinor(matrix,0,i)); 
            }
        }
        return calcResult;
    }
    
    private static Arr2D getMinor(Arr2D matrix, int row, int column)
    {
        int minorLength = matrix.getRows()-1;
        int[][] minor = new int[minorLength][minorLength];
        int dI = 0;
        int dJ = 0;
        for (int i = 0; i <= minorLength; i++)
        {
            dJ = 0;
            for(int j = 0; j <= minorLength; j++)
            {
                if(i == row)
                {
                    dI = 1;
                }
                else
                {
                    if(j == column)
                    {
                        dJ = 1;
                    }
                    else
                    {
                        minor[i-dI][j-dJ] = matrix.getA(i, j);
                    }
                }
            }
        }
        return new Arr2D(minor);
    }
    
    public static int stringwithmin(Arr2D m)
    {
    	int t;
    	int str = 0;
    	t = m.getA(0, 0);
    	for (int i = 0; i < m.getRows(); i++)
    	{
    		for (int j = 0; j < m.getStrings(); j++)
    		{
    			if (t > m.getA(i, j))
    			{
    				t = m.getA(i, j);
    				str = i;
    			}
    		}
    	}
    	return str;
    }
    
    public static int stringwithmax(Arr2D m)
    {
    	int t;
    	int str = 0;
    	t = m.getA(0, 0);
    	for (int i = 0; i < m.getRows(); i++)
    	{
    		for (int j = 0; j < m.getStrings(); j++)
    		{
    			if (t < m.getA(i, j))
    			{
    				t = m.getA(i, j);
    				str = i;
    			}
    		}
    	}
    	return str;
    }
    
    public static Arr2D interchangestrings(Arr2D m, int s1, int s2)
    {
    	int t;
    	for (int i = 0; i < m.getStrings(); i++)
    	{
    		t = m.getA(s1, i);
    		m.setA(m.getA(s2, i), s1, i);
    		m.setA(t, s2, i);
    	}
    	return m;
    }
    
    private static int maxvalueofstring(Arr2D m, int s)
    {
    	int t;
    	t = m.getA(0, 0);
    	for (int i = 0; i < m.getRows(); i++)
    	{
    		if (t < m.getA(s, i))
    		{
    			t = m.getA(s, i);
    		}
    	}
    	return t;
    }
    
    public static void zeroesonmaindiagonal(Arr2D m)
    {
    	boolean b = false;
    	if (m.getRows() != m.getStrings())
    	{
    		//System.out.println("Matrix is not a square matrix!");
    		return;
    	}
    	for (int i = 0; i < m.getRows(); i++)
    	{
    		if (m.getA(i, i) == 0)
    		{
    			b = true;
    			System.out.println("String " + Integer.toString(i + 1) + " has 0 value on the main diagonal");
    			System.out.println("The biggest value of string " + Integer.toString(i) + " is " + maxvalueofstring(m, i));
    		}
    	}
    	if (b == false)
    	{
    		System.out.println("There are no 0 values on the main diagonal");
    	}
    }
    
    public static int findNorm(Arr2D m)
    {
    	int cur, max;
    	max = 0;
    	for (int j = 0; j < m.getRows(); j++)
    	{
    		cur = 0;
    		for (int i = 0; i < m.getStrings(); i++)
    		{
    			cur = cur + Math.abs(m.getA(j, i));
    			if (cur > max)
    			{
    				max = cur;
    			}
    		}
    	}
    	return max;
    }
    
    public static boolean isSymmetric(Arr2D m)
    {
    	if (m.getRows() != m.getStrings())
    	{
    		System.out.println("Matrix is not a square matrix!");
    		return false;
    	}
    	for (int i = 0; i < m.getRows(); i++)
      	{
    		for (int j = 0; j < m.getStrings(); j++)
				{
					if (m.getA(i, j) != m.getA(j, i))
					{						
						return false;
					}
				}	       
	      }
          return true;
    }
    
    public static int[] maxvalueofdiagonals(Arr2D m)
    {
    	if (m.getRows() != m.getStrings())
    	{
    		System.out.println("Matrix is not a square matrix!");
    		return null;
    	}
    	int t = m.getA(0, 0);
    	int x = 0;
    	int y = 0;
    	for (int i = 0; i < m.getRows(); i++)
      	{
    		if (t < m.getA(i, i))
    		{
    			t = m.getA(i, i);
    			x = i;
    			y = i;
    		}
    		if (t < m.getA(i, m.getStrings() - i - 1))
    		{
    			t = m.getStrings() - i - 1;
    			x = m.getRows() - i - 1;
    			y = i;
    		}
      	}
    	int[] arr = new int[3];
    	arr[0] = t;
    	arr[1] = x;
    	arr[2] = y;
    	return arr;
    }
    
    public static Arr2D interchgmaxofdgnlswcntr(Arr2D m)
    {
    	if (m.getRows() != m.getStrings())
    	{
    		System.out.println("Matrix is not a square matrix!");
    		return null;
    	}
    	if (m.getStrings() % 2 == 0)
    	{
    		System.out.println("Matrix doesn't have a point where two diagonals cross");
    		return null;
    	}
    	
    	int t;    	
    	int[] arr = maxvalueofdiagonals(m);
    	t = m.getA(Math.round(m.getStrings() / 2), Math.round(m.getStrings() / 2));
    	m.setA(arr[0], Math.round(m.getStrings() / 2), Math.round(m.getStrings() / 2));
    	m.setA(t, arr[1], arr[2]);
    	return m;
    }
}


