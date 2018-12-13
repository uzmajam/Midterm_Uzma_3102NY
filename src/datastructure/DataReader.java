package datastructure;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class DataReader {

	public static void main(String[] args) {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";

		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		//file reader (open file)
		try {
			fileReader = new FileReader("/Users/nacer-zimu/IdeaProjects/MidtemMarch2018/src/data/self-driving-car");
		}catch (Exception ex){
			ex.printStackTrace();
		}
		//buffer reader (read file)
		try {
			bufferedReader = new BufferedReader(fileReader);
			String str = " ";
			while ((str = bufferedReader.readLine()) != null){
				System.out.println(str);
			}
		}catch (Exception ex){
			ex.printStackTrace();
		}
		//close file
		finally {
			if(fileReader != null){
				try {
					fileReader.close();
					fileReader = null;
				}catch (Exception ex){
					ex.printStackTrace();
				}
			}
			if(bufferedReader != null){
				try {
					bufferedReader.close();
					bufferedReader = null;
				}catch (Exception ex){
					ex.printStackTrace();
				}
			}



		}

	}
}

