package com.emmwhydee;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by myd on 29/06/17.
 */
public class SavingTheUniverse
{

	public static void savingTheUniverse(Scanner in)
	{
		int testCases = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.

		for (int i = 1; i <= testCases; ++i)
		{
			int numberOfSearchEngines = in.nextInt();
			String[] searchEngines = new String[numberOfSearchEngines];
			in.nextLine(); //advance from line w/ int -> need to get to actual line w/ text
			for (int j = 0 ; j < searchEngines.length; j++)
			{
				String searchEngine = in.nextLine();
				searchEngines[j] = searchEngine;
			}

			int numberOfQueries = in.nextInt();

			String[] searchQueries = new String[numberOfQueries];
			in.nextLine(); //advance from line w/ int -> need to get to actual line w/ text
			for (int j = 0 ; j < searchQueries.length; j++)
			{
				String searchQuery = in.nextLine();
				searchQueries[j] = searchQuery;
			}


			int numberOfSwitches = 0;
			int maxIndex = 0;

			while (maxIndex < searchQueries.length)
			{
				maxIndex = getMaxIndexOfSearchEngine (searchEngines, searchQueries);

				if (maxIndex == -1) //We can finish everything w/ no switches
				{
					break;
				}
				numberOfSwitches++;
				searchQueries = Arrays.copyOfRange(searchQueries, maxIndex, searchQueries.length);
				maxIndex = 0;
			}

			System.out.println("Case #" + i + ": " + numberOfSwitches);
		}
	}

	private static int getMaxIndexOfSearchEngine(String[] searchEngines, String[] searchQueries)
	{
		int maxIndex = 0;
		for (int i = 0; i < searchEngines.length; i++)
		{

			boolean matchFound = false;
			for (int j = 0; j < searchQueries.length; j++)
			{
				if (searchEngines[i].equals(searchQueries[j]))
				{
					matchFound = true;
					if (maxIndex < j)
					{
						maxIndex = j;
					}
					break;
				}
			}
			if (!matchFound)
			{
				return -1;
			}
		}
		return maxIndex;
	}
}
