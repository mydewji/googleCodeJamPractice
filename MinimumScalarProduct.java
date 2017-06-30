package com.emmwhydee;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by myd on 29/06/17.
 */
public class MinimumScalarProduct
{
	public static void minimumScalarProduct(Scanner in)
	{
		int testCases = in.nextInt();

		for (int testCase = 1; testCase <= testCases; testCase++)
		{
			int lengthOfArray = in.nextInt();
			long[] arrayA = new long[lengthOfArray];
			for(int j = 0; j < lengthOfArray; j++)
			{
				arrayA[j] = in.nextInt();
			}

			long[] arrayB = new long[lengthOfArray];
			for(int j = 0; j < lengthOfArray; j++)
			{
				arrayB[j] = in.nextInt();
			}

			long minimumScalarProduct = 0;
			//Sort arrays
			Arrays.sort(arrayA);
			Arrays.sort(arrayB);

			//Mult largest to smallest
			for(int a = 0; a < lengthOfArray; a++)
			{
				minimumScalarProduct = minimumScalarProduct + (arrayA[a] * arrayB[lengthOfArray-1-a]);
			}

			System.out.println("Case #" + testCase + ":" + " "+ minimumScalarProduct );
		}




	}
}
