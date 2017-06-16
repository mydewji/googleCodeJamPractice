package com.emmwhydee;

import java.util.*;
import java.io.*;

// java -classpath /home/myd/IdeaProjects/googleCodeJamSearchEngineProblem/out/production/googleCodeJamSearchEngineProblem com.emmwhydee.Main < input.in

public class Main
{
    public static void main(String[] args)
    {
      Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
//        Scanner in = null;
//        try
//        {
//            in = new Scanner(new File(args[0]));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
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

            int minOccurences = searchQueries.length;
            for (int j = 0; j< searchEngines.length; j++)
            {
                String searchEngine = searchEngines[j];
                int numOccurences = numberOfOccurences(searchEngine, searchQueries);
                if (numOccurences == 0)
                {
                    minOccurences = numOccurences;
                    break;
                }
                else
                {
                    if(numOccurences < minOccurences)
                    {
                        minOccurences = numOccurences;
                    }
                }
            }

            System.out.println("Case #" + i + ": " + minOccurences);

        }
    }

    private static int numberOfOccurences(String searchEngine, String[] searchQueries)
    {
        int numberOfOccurences = 0;
        for (int i = 0; i < searchQueries.length; i++)
        {
            if (searchEngine.equals(searchQueries[i]))
            {
                numberOfOccurences++;
            }
        }
        return numberOfOccurences;
    }
}