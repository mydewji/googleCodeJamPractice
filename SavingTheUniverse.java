package com.emmwhydee;

import java.util.Arrays;

/**
 * Created by myd on 29/06/17.
 */
public class SavingTheUniverse
{

	public static void savingTheUniverse(String[] searchEngines, String[] searchQueries, int testCase)
	{
		int numberOfSwitches = 0;
		int maxIndex = 0;

		while (maxIndex < searchQueries.length)
		{
			maxIndex = getMaxIndexOfSearchEngine(searchEngines, searchQueries);

			if (maxIndex == -1) //We can finish everything w/ no switches
			{
				break;
			}
			numberOfSwitches++;
			searchQueries = Arrays.copyOfRange(searchQueries, maxIndex, searchQueries.length);
			maxIndex = 0;
		}

		System.out.println("Case #" + testCase + ": " + numberOfSwitches);
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
