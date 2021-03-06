//Author is WEN ZHANG
package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
// this class is for read all game results from AllGamesResults.txt
public class ReadAllResults {
	public static String allResults = null;
	public static String getAllGamesResutls() {
		allResults="";
		try {
			BufferedReader input = new BufferedReader(new FileReader("AllGamesResults.txt"));

			String next = input.readLine();

			while (next != null) {
				allResults = allResults + next +"\n";
				next = input.readLine();
			}
			input.close();

		} catch (IOException e) {
			System.err.println("File Reading Error!");
			System.exit(0);
		}
		return allResults;
	}
}
