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

		SavingTheUniverse.savingTheUniverse(in);
	}
}

