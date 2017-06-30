package com.emmwhydee;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner in = null;
		try
		{
			in = new Scanner(new File(args[0]));
		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		int testCases = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.

		for (int testCase = 1; testCase <= testCases; ++testCase)
		{
			int numberOfInputs = in.nextInt();
			String[] arrayA = new String[numberOfInputs];
			in.nextLine(); //advance from line w/ int -> need to get to actual line w/ text
			for (int j = 0; j < arrayA.length; j++)
			{
				String input = in.nextLine();
				arrayA[j] = input;
			}

			int numberOfBInputs = in.nextInt();

			String[] arrayB = new String[numberOfBInputs];
			in.nextLine(); //advance from line w/ int -> need to get to actual line w/ text
			for (int j = 0; j < arrayB.length; j++)
			{
				String input = in.nextLine();
				arrayB[j] = input;
			}

			//Search query problem
			SavingTheUniverse.savingTheUniverse(arrayA, arrayB, testCase);

		}
	}

}

