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
            int numberOfSwitches = 0;
            ArrayList<String> searchEngineList = new ArrayList<String>(Arrays.asList(searchEngines));



            String[] searchQueries = new String[numberOfQueries];
            in.nextLine(); //advance from line w/ int -> need to get to actual line w/ text
            for (int j = 0 ; j < searchQueries.length; j++)
            {
                String searchQuery = in.nextLine();
                searchQueries[j] = searchQuery;

                //check against searchEngine list -> remove that search engine (if not found already removed - don't care?)
                    //if search engine list is empty -> switch and repopulate list

                if (searchEngineList.size() > 0)
                {
                    Iterator itr = searchEngineList.iterator();
                    while (itr.hasNext())
                    {
                        if (searchQuery.equals(itr.next()))
                        {
                            itr.remove();
                        }
                    }
                }
                else
                {
                    numberOfSwitches++;
                    searchEngineList = new ArrayList<String>(Arrays.asList(searchEngines));
                }
            }

            System.out.println("Case #" + i + ": " + numberOfSwitches);
        }
    }


}