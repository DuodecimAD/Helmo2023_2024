package chap6;

import io.Console;

public class OperateursLogiques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x = Console.lireDouble("Un réel ? ");
		

		// [8;10[
		if(x >= 8 && x < 10) {
			System.out.println(x + " est dans l'intervalle [8;10[");
		}
		
		// ]-inf;-5] U [5;+inf[
		
		// if (Math.abs(x) >= 5){
		if(x <= -5 || x >= 5 ) {
			System.out.println(x + " est dans l'intervalle [-inf;-5] U [5;+inf[");
		}
		
		// ]-inf;0] U [5;10[
		if(x <= 0 || (x >=5 && x < 10)) {
			System.out.println(x + " est dans l'intervalle [-inf;-0] U [5;10[");
		}
		
		// [-5;15] / {0} != 0
		if((x >= -5 && x < 0) && (x > 0 && x <= 15)) {
			System.out.println(x + " est dans l'intervalle [-5;15[ / {0}");
		}
	}

}
