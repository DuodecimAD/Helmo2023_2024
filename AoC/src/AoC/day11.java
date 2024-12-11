package AoC;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class day11 {

	public static void main(String[] args) {
		
		//part1();
		part2();

	}
	
	public static void part1() {
		
		List<Integer> start = Arrays.asList(125,17);
		
		ArrayList<Integer> a = new ArrayList<Integer>(start);
		
		//System.out.println(a);
		
		for (int i = 0; i < 25; i++) {
			
			ArrayList<Integer> b = new ArrayList<Integer>();
			
			for (int j = 0; j < a.size(); j++) {
				
				String numberStr = String.valueOf(a.get(j));
				int length = numberStr.length();
				int middle = length / 2;
				
				if (a.get(j) == 0) {
					b.add(1);
				} else if (a.get(j) == 1) {
					b.add(a.get(j) * 2024);
				} else if (length % 2 == 0) {
					b.add(Integer.parseInt(numberStr.substring(0, middle)));
					b.add(Integer.parseInt(numberStr.substring(middle)));
				} else if (length % 2 == 1) {
					b.add(a.get(j) * 2024);
				} else {
					System.out.println("Error");
				}
				
			}
			//System.out.println(b);
			a = b;
			System.out.println(i+1 + " " + a.size());
		}
		
	}

	/** Got heap overflow on first try, so i tried to write to file instead but it was way too slow
	 *  arrived at loop 46 that took by itself about 15 minutes to complete.
	 *  Guess if i had the patience i would use memory for calculations but do it as batches to avoid heap overflow.
	 * 
	 */
	public static void part2() {
		
		String PathA = "data/day11textA.txt";
		String PathB = "data/day11textB.txt";
		int batchSize = 10000;
		int totalTime= 0;
		
		File fileA = new File(PathA);

		try {
		    if (fileA.exists()) {
		        fileA.delete();
		    }
		    try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileA))) {
		        writer.write("3279\n998884\n1832781\n517\n8\n18864\n28\n0");
		    }

		    for (int i = 0; i < 75; i++) {
		    	long startTime = System.nanoTime();
		        File fileB = new File(PathB);
		        if (fileB.exists()) {
		            fileB.delete();
		        }

		        try (
		                BufferedReader readerA = new BufferedReader(new FileReader(PathA));
		                BufferedWriter writerB = new BufferedWriter(new FileWriter(fileB, true))
		            ) {
		                String line;
		                int lineCount = 0;

		                while ((line = readerA.readLine()) != null) {
		                    long lineValue = Long.parseLong(line);
		                    int length = line.length();
		                    int middle = length / 2;

		                    if (lineValue == 0) {
		                        writerB.write("1\n");
		                    } else if (lineValue == 1) {
		                        writerB.write((lineValue * 2024) + "\n");
		                    } else if (length % 2 == 0) {
		                        writerB.write(line.substring(0, middle) + "\n");
		                        String secondHalf = line.substring(middle);
		                        writerB.write(Long.parseLong(secondHalf) + "\n");
		                    } else {
		                        writerB.write((lineValue * 2024) + "\n");
		                    }

		                    lineCount++;

		                    if (lineCount % batchSize == 0) {
		                        writerB.flush(); 
		                    }
		                }
		            }

		        if (fileA.exists()) {
		            fileA.delete();
		        }

		        try (
		            BufferedReader readerB = new BufferedReader(new FileReader(fileB));
		            BufferedWriter writerA = new BufferedWriter(new FileWriter(fileA))
		        ) {
		            String line;
		            while ((line = readerB.readLine()) != null) {
		                writerA.write(line + "\n");
		            }
		        }

		        if (fileB.exists()) {
		            fileB.delete();
		        }
		        
		        long aCount = Files.lines(Paths.get(PathA)).count();
		        long endTime = System.nanoTime(); 
		        long duration = (endTime - startTime) / 1000000;
		        totalTime += duration/1000.00;
		        System.out.println("Loop " + i + " took " + duration/1000.00 + " sec for a total time of : " + totalTime/3600 + " hours and nbLines : " + aCount);

		        System.gc();
		    }
		} catch (IOException e) {
		    e.printStackTrace();
		}


	}

}
