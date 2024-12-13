package AoC;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class day9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//part1();
		//part1ForReal();
		
		
		// Cannot get the freaking correct number for part 2 of AoC 9 
		// but at least I optimized the running time of my code ...	  
		part2Original();
		//	answer : 6353640225186
		//	Duration : 1.717 sec 
		part2();
		//	answer : 6353640225186
		//	Duration : 0.923 sec 
		part2NewIdea();	
		//	answer : 6353640225186
		//	Duration : 0.371 sec 
		 

        //part2StringBuilder();
	}
		
	public static void part1() {
		//String[] string = Fichier.lireLignes("data/day8Input1.txt");
		Path file = Paths.get("data/day9Input2.txt");
		String string = null;
		try {
			string = Files.readString(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		System.out.println(string);
		
		String fullString = "";
		int count = 0, length = string.length();
		
		for (int i = 0; i < length; i++) {
			
			if (count == 10) {
				count = 0;
			}
						
			if(i % 2 == 0) {
				int repeats = Character.getNumericValue(string.charAt(i));
				for (int j = 0; j < repeats; j++) {
					fullString += count;
				}
				count++;
			} else {
				int repeats = Character.getNumericValue(string.charAt(i));
				for (int j = 0; j < repeats; j++) {
					fullString += ".";
				}
			}

		}

//		System.out.println(fullString);
		
		String fragmentedString = "";
		int fullLength = fullString.length();
		for (int i = 0; i < fullLength; i++) {
			if(fullString.equals("")){
				break;
			} else if(fullString.charAt(0) == '.') {
				fullString = fullString.substring(1);
				int newfullLength = fullString.length();
				for (int j = newfullLength-1; j < newfullLength; j--) {
					if(fullString.charAt(j) != '.') {
						newfullLength = fullString.length();
						fragmentedString += fullString.charAt(j);
						fullString = fullString.substring(0, newfullLength-1);
						break;
					}
					fullString = fullString.substring(0, newfullLength-1);
				}
			} else {
				fragmentedString += fullString.charAt(0);
				fullString = fullString.substring(1);
			}
		}
		
//		System.out.println(fragmentedString);
		
		long somme = 0;
		int fragmentedLength = fragmentedString.length();
		for (int i = 0; i < fragmentedLength; i++) {
			int value = Character.getNumericValue(fragmentedString.charAt(i));
			int calcul = i * value;
			somme += calcul;
		}
		
		System.out.println(somme);
		
	}
	
	public static void part1ForReal() {
		//String[] string = Fichier.lireLignes("data/day8Input1.txt");
		Path file = Paths.get("data/day8Input9.txt");
		String string = null;
		try {
			string = Files.readString(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		System.out.println(string);
		
		ArrayList<String> fullString = new ArrayList<String>();
		int count = 0, length = string.length();
		
		for (int i = 0; i < length; i++) {
					
			if(i % 2 == 0) {
				int repeats = Character.getNumericValue(string.charAt(i));
				for (int j = 0; j < repeats; j++) {
					fullString.add(String.valueOf(count));
				}
				count++;
			} else {
				int repeats = Character.getNumericValue(string.charAt(i));
				for (int j = 0; j < repeats; j++) {
					fullString.add(".");
				}
			}

		}

//		System.out.println(fullString);
		
		ArrayList<String> fragmentedString = new ArrayList<String>();
		
		int fullLength = fullString.size();
		
		for (int i = 0; i < fullLength; i++) {
			int newfullLength = fullString.size();
			if(newfullLength == 0){
				
				break;
			} else if(fullString.get(0).equals(".")) {
				fullString.remove(0);
				newfullLength = fullString.size();
				for (int j = newfullLength-1; j < newfullLength; j--) {
					
					if(!fullString.get(j).equals(".")) {
						
						fragmentedString.add(fullString.get(j));
						fullString.remove(j);
						break;
					}
					
					fullString.remove(j);
					newfullLength = fullString.size();
					
					if(j == 0) {
						break;
					}
				}
			} else {
				fragmentedString.add(fullString.get(0));
				fullString.remove(0);
			}

		}
		
//		System.out.println(fragmentedString);
		

		long somme = 0;
		int fragmentedLength = fragmentedString.size();
		
		for (int i = 0; i < fragmentedLength; i++) {
			int value = Integer.parseInt(fragmentedString.get(i));
			int calcul = i * value;
			somme += calcul;
		}
		
		System.out.println(somme);

	}
	
	public static void part2Original() {
		long startTime = System.nanoTime();
		
		Path file = Paths.get("data/day9Input2.txt");
		String string = null;
		try {
			string = Files.readString(file);
		} catch (IOException e) {
			e.printStackTrace();
		}

//		System.out.println(string);
		
		ArrayList<String> fullString = new ArrayList<String>();
		int count = 0, length = string.length();
		
		for (int i = 0; i < length; i++) {
					
			int repeats = Character.getNumericValue(string.charAt(i));
			String toAppend;
			
			if (i % 2 == 0) {
				toAppend = String.valueOf(count++);
			} else {
			    toAppend = ".";
			}
			
			for (int j = 0; j < repeats; j++) {
				fullString.add(String.valueOf(toAppend));
			}
		}

//		System.out.println(Arrays.toString(fullString));

		int fullLength = fullString.size();
		String check = "";
		int j = fullLength-1;
		
		check = fullString.get(j);
		String oldCheck = check;
		int backCount = 0;
		for (int i = 0; i < j; i++) {
		
			check = fullString.get(j-i);
				
			if(!oldCheck.equals(".")) {
				
				if(!check.equals(oldCheck)) {
					int index = j-i;
					for (int k = 0; k < index; k++) {
						if (fullString.get(k).equals(".")){
							int points = k;
							do {
								points++;
							} while (fullString.get(points).equals("."));
						
							if(backCount <=  points-k) {
								for (int m = 0; m < backCount; m++) {
									fullString.set(m+k,oldCheck);
									fullString.set(index+backCount-m,".");
								}
								backCount = 0;
//									System.out.println(Arrays.toString(fullString));
								break;
							}
						}
					}	
					backCount = 0;			
				}
			
			}else {
				backCount = 0;
			}
			oldCheck = check;
			backCount++;
		}

//		System.out.println(fullString);
		
		long somme = 0;
		int finalIndex = 0;
		for (int i = 0; i < fullLength; i++) {
			if(fullString.get(i).equals(".") && i > 0) {
				finalIndex++;
			} else {
				int value = Integer.parseInt(fullString.get(i));
				long calcul = finalIndex * value;
//				System.out.printf("%d * %d = %d\n", value, finalIndex, calcul);
				somme += calcul;
				finalIndex++;
			}
		}
		
		System.out.println(somme);
		
		long endTime = System.nanoTime(); 
        long duration = (endTime - startTime) / 1000000;
        System.out.println("Duration : " + duration/1000.00 + " sec ");
        
	}
	
	// copied the ArrayList<String> to a String[] to optimize the process and overall time got faster but still got same result :'(
	public static void part2() {
		long startTime = System.nanoTime();
		
		Path file = Paths.get("data/day9Input2.txt");
		String string = null;
		try {
			string = Files.readString(file);
		} catch (IOException e) {
			e.printStackTrace();
		}

//		System.out.println(string);
		
		ArrayList<String> array = new ArrayList<String>();
		int count = 0, length = string.length();
		
		for (int i = 0; i < length; i++) {
					
			int repeats = Character.getNumericValue(string.charAt(i));
			String toAppend;
			
			if (i % 2 == 0) {
				toAppend = String.valueOf(count++);
			} else {
			    toAppend = ".";
			}
			
			for (int j = 0; j < repeats; j++) {
				array.add(String.valueOf(toAppend));
			}
		}
		
		String[] fullString = array.toArray(new String[0]);

//		System.out.println(Arrays.toString(fullString));

		int fullLength = fullString.length;
		String check = "";
		int j = fullLength-1;
		
		check = fullString[j];
		String oldCheck = check;
		int backCount = 0;
		for (int i = 0; i < j; i++) {
		
			check = fullString[j-i];
				
			if(!oldCheck.equals(".")) {
				
				if(!check.equals(oldCheck)) {
					int index = j-i;
					for (int k = 0; k < index; k++) {
						if (fullString[k].equals(".")){
							int points = k;
							do {
								points++;
							} while (fullString[points].equals("."));
						
							if(backCount <=  points-k) {
								for (int m = 0; m < backCount; m++) {
									fullString[m+k] = oldCheck;
									fullString[index+backCount-m] = ".";
								}
								backCount = 0;
//									System.out.println(Arrays.toString(fullString));
								break;
							}
						}
					}	
					backCount = 0;			
				}
			}else {
				backCount = 0;
			}
			oldCheck = check;
			backCount++;
		}


//		System.out.println(fullString);

		long somme = 0;
		int finalIndex = 0;
		for (int i = 0; i < fullLength; i++) {
			if(fullString[i].equals(".") && i > 0) {
				finalIndex++;
			} else {
				int value = Integer.parseInt(fullString[i]);
				long calcul = finalIndex * value;
//				System.out.printf("%d * %d = %d\n", value, finalIndex, calcul);
				somme += calcul;
				finalIndex++;
			}
		}
		
		
		System.out.println(somme);
		
		long endTime = System.nanoTime(); 
        long duration = (endTime - startTime) / 1000000;
        System.out.println("Duration : " + duration/1000.00 + " sec ");
        
	}
	
	// Trying to change the logic from using strings to int, we'll see
		public static void part2NewIdea() {
			long startTime = System.nanoTime();
			
			Path file = Paths.get("data/day9Input2.txt");
			String string = null;
			try {
				string = Files.readString(file);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			int firstNumberOfString = 6;

//			System.out.println(string);
			
			ArrayList<Integer> array = new ArrayList<Integer>();
			int count = 0, length = string.length();
			
			for (int i = 0; i < length; i++) {
						
				int repeats = Character.getNumericValue(string.charAt(i));
				int toAdd;
				
				if (i % 2 == 0) {
					toAdd = count++;
				} else {
				    toAdd = 0;
				}
				
				for (int j = 0; j < repeats; j++) {
					array.add(toAdd);
				}
			}
			
			int fullLength = array.size();
			
			int[] fullArray = new int[fullLength];
	        for (int i = 0; i < fullLength; i++) {
	        	fullArray[i] = array.get(i);
	        }

//			System.out.println(Arrays.toString(fullArray));
			
			int check;
			int j = fullLength-1;
			// starting from the end of the array --
			
			check = fullArray[j];
			int oldCheck = check;
			int backCount = 0;
			
			// starting after the "firstNumberOfString" first elements 0
			for (int i = firstNumberOfString; i < j; i++) {
			
				check = fullArray[j-i+firstNumberOfString];
					
				if(!(oldCheck == 0)) {
					// if the new number is != than the previous one
					if(!(check == oldCheck)) {
						int index = j-i+firstNumberOfString;
						// search left to right for zeros
						for (int k = firstNumberOfString; k < index; k++) {
							if (fullArray[k] == 0){
								int points = k;
								// count how many zeros after first one found
								do {
									points++;
								} while (fullArray[points] == 0);
							
								if(backCount <=  points-k) {
									for (int m = 0; m < backCount; m++) {
										fullArray[m+k] = oldCheck;
										fullArray[index+backCount-m] = 0;
									}
									backCount = 0;
//									System.out.println(Arrays.toString(fullArray));
									break;
								}
							}
						}	
						backCount = 0;			
					}
				}else {
					backCount = 0;
				}
				oldCheck = check;
				backCount++;
			}

//			System.out.println(fullString);
			
			long somme = 0;

			for (int i = 0; i < fullLength; i++) {
				int value = fullArray[i];
				long calcul = i * value;
//					System.out.printf("%d * %d = %d\n", value, i, calcul);
				somme += calcul;
			}
			
			System.out.println(somme);
			
			long endTime = System.nanoTime(); 
	        long duration = (endTime - startTime) / 1000000;
	        System.out.println("Duration : " + duration/1000.00 + " sec ");
	        
		}

	
	// NOT GOOD (9999 is seen as 4 9) but keeping for stringBuilder logic
	public static void part2StringBuilder() {
		long startTime = System.nanoTime();
		
		Path file = Paths.get("data/day9Input2.txt");
		String string = null;
		try {
			string = Files.readString(file);
		} catch (IOException e) {
			e.printStackTrace();
		}

//		System.out.println(string);
		
		StringBuilder fullString = new StringBuilder();
		int count = 0, length = string.length();
		
		for (int i = 0; i < length; i++) {
					
			int repeats = Character.getNumericValue(string.charAt(i));
			String toAppend;
			
			if (i % 2 == 0) {
				toAppend = String.valueOf(count++);
			} else {
			    toAppend = ".";
			}
			
			for (int j = 0; j < repeats; j++) {
			    fullString.append(String.valueOf(toAppend));
			}
		}

//		System.out.println(fullString);
		
		
		int fullLength = fullString.length();
		char check = ' ';
		for (int j = fullLength-1; j > 0; j--) {
			if(check == '0') {
				break;
			}
				
			check = fullString.charAt(j);
			char oldCheck = check;
			int backCount = 0;
			for (int i = 0; i <= j; i++) {
			
				check = fullString.charAt(j-i);
					
				if(!(oldCheck == '.')) {
					
					if(!(check == oldCheck)) {
						int index = j-i;
						for (int k = 0; k <= index; k++) {
							if (fullString.charAt(k) == '.'){
								int points = k;
								do {
									points++;
								} while (fullString.charAt(points) == '.');
							
								if(backCount <=  points-k) {
									for (int m = 0; m < backCount; m++) {
										fullString.setCharAt(m+k,oldCheck);
										fullString.setCharAt(index+backCount-m, '.');
									}
									backCount = 0;
//									System.out.println(fullString);
									break;
								}
							}
						}	
						backCount = 0;			
					}
				
				}else {
					backCount = 0;
				}
				oldCheck = check;
				backCount++;
			}
		}
		

//		System.out.println(fullString);
		

		long somme = 0;
		int finalIndex = 0;
		for (int i = 0; i < fullLength; i++) {
			if(fullString.charAt(i) == '.' && i > 0) {
				finalIndex++;
			} else {
				int value = Character.getNumericValue(fullString.charAt(i));
				long calcul = finalIndex * value;
//				System.out.printf("%d * %d = %d\n", value, finalIndex, calcul);
				somme += calcul;
				finalIndex++;
			}
		}
		
		
		System.out.println(somme);
		
		long endTime = System.nanoTime(); 
        long duration = (endTime - startTime) / 1000000;
        System.out.println("Duration : " + duration/1000.00 + " sec ");
	}
	
}
