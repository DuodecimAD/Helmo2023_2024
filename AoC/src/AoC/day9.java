package AoC;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class day9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//part1();
		//part1ForReal();
		part2();
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
	
	
	public static void part2() {

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
		
		
		int fullLength = fullString.size();
		String check = "";
		for (int j = fullLength-1; j > 0; j--) {
			if(check.equals("0")) {
				break;
			}
				
			check = fullString.get(j);
			String oldCheck = check;
			int backCount = 0;
			for (int i = 0; i <= j; i++) {
			
				check = fullString.get(j-i);
					
				if(!oldCheck.equals(".")) {
					
					if(!check.equals(oldCheck)) {
						int index = j-i;
						for (int k = 0; k <= index; k++) {
							if (fullString.get(k).equals(".")){
								int points = k;
								do {
									points++;
								} while (fullString.get(points).equals("."));
							
								if(backCount <=  points-k) {
									for (int m = 0; m < backCount; m++) {
										fullString.set(m+k,oldCheck);
										fullString.set(index+backCount-m, ".");
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

	}

}
