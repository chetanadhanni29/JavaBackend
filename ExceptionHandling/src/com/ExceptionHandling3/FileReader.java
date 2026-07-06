package com.ExceptionHandling3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {

	public static void main(String[] args) {
		FileReader fileReader = new FileReader();
		fileReader.readFile();

	}

	public void readFile() {
		String fileName = "C:\\Users\\Dell\\Desktop\\Kodewala\\JavaBackend\\ExceptionHandling\\src\\com\\ExceptionHandling3\\sales_data.txt";
		try {
			BufferedReader br = new BufferedReader(new java.io.FileReader(fileName)); // FileNotFoundException

			String line;

			while ((line = br.readLine()) != null) {

				String lineArr[] = line.split(",");
				String city = lineArr[3];
				if (city.equals("Bangalore")) {
					System.out.println(line);
				}

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		catch (IOException e) {
			e.printStackTrace();
		}

	}

}