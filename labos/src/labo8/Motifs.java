package labo8;

import java.util.Arrays;

import util.Tableau2D;

public class Motifs {

	public static void main(String[] args) {


//		Tableau2D.afficher(creerMotifCarre(7));
//		System.out.println();
//		Tableau2D.afficher(creerMotifTriangles(7));
//		System.out.println();
//		Tableau2D.afficher(creerMotifX(7));
//		System.out.println();
//		Tableau2D.afficher(creerMotifPapillon(7));
//		System.out.println();
		Tableau2D.afficher(creerMotifLosange(7));
		System.out.println();
		
	}
	
	private static char[][] creerMotifCarre(int taille){
		char[][] motif = new char[taille][taille];
		for (int i = 0; i < motif.length; i++) {
			for (int j = 0; j < motif.length; j++) {
				motif[i][j] = '*';
			}
		}
		return motif;
	}
	
	private static char[][] creerMotifTriangles(int taille){
		char[][] motif = new char[taille][taille];
		for (int i = 0; i < motif.length; i++) {
			for (int j = 0; j < motif.length; j++) {
				
				if (j >= i) {
					motif[i][j] = '*';
				} else {
					motif[i][j] = '.';
				}
			}
		}
		return motif;
	}
	
	private static char[][] creerMotifX(int taille){
		char[][] motif = new char[taille][taille];
		for (int i = 0; i < motif.length; i++) {
			for (int j = 0; j < motif.length; j++) {
				
				if(j == i) {
					motif[i][j] = '*';
				} else if (j == motif.length - 1 - i) {
					motif[i][j] = '*';
					
				} else {
					motif[i][j] = '.';
				}
			}

		}
		return motif;
	}
	
	private static char[][] creerMotifPapillon(int taille){
		char[][] motif = new char[taille][taille];
		for (int i = 0; i < motif.length; i++) {
            for (int j = 0; j < motif.length; j++) {
                
            	if(j <= i && j <= motif.length - i) {
					motif[i][j] = '*';
				} else if (j >= i && j >= motif.length - 1 - i){
					motif[i][j] = '*';
				} else {
					motif[i][j] = '.';
                }
            }
         }
		return motif;
	}
	
	private static char[][] creerMotifLosange(int taille){
		char[][] motif = new char[taille][taille];
		for (int i = 0; i < motif.length; i++) {
            for (int j = 0; j < motif.length; j++) {
            	if(j >= motif.length/2-i && j <= motif.length/2+i) {
					motif[i][j] = '*';
				} else {
					motif[i][j] = '.';
                }
            	
            	if(i > motif.length/2+j) {
					motif[i][j] = '.';
				}
            	
            	if(i > motif.length/2 && j > motif.length-(j/2+1+i/2-3)) {
					motif[i][j] = '.';

				}
            	
            }
        }
		return motif;
		
	}

}
