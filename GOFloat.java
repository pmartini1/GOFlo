import java.util.*;

public class GOFloat {

	
	public static void main (String[]args) {
		System.out.println("Yo");
	}
	
	public static boolean Floater(char[] L) {
		
		if ((L[0]== '0' && L[1]=='x' )   |   (L[0]== '0' && L[1]=='X')) {
			for (int i = 2; i < L.length ;i++) {
				if(L[i]=='_') {
					if (L[i-1] == '0' | L[i-1] == '1' | L[i-1] == '2' | L[i-1] == '3' | L[i-1] == '4' | L[i-1] == '5' | L[i-1] == '6' | L[i-1] == '7' | L[i-1] == '8' | L[i-1] == '9'){
						if(L[i+1] == '0' | L[i+1] == '1' | L[i+1] == '2' | L[i+1] == '3' | L[i+1] == '4' | L[i+1] == '5' | L[i+1] == '6' | L[i+1] == '7' | L[i+1] == '8' | L[i+1] == '9') {
							i= i+1; 
						} else {
							return false;
						}
					} else {
						return false;
					}
				
				} 
				if (L[i] == '0' |L[i+1] == '+' |L[i+1] == '-' | L[i] == 'A' | L[i] == 'B' | L[i] == 'C' | L[i] == 'D' | L[i] == 'E' | L[i] == 'F' | L[i] == 'a' | L[i] == 'b' | L[i] == 'c' | L[i] == 'd' | L[i] == 'e' | L[i] == 'f' | L[i] == '1' | L[i] == '2' | L[i] == '3' | L[i] == '4' | L[i] == '5' | L[i] == '6' | L[i] == '7' | L[i] == '8' | L[i] == '9') {
					i = i+1;
				}
				if (L[i] == '.' ) {
					if (L[i-1] == 'x' | L[i-1]== 'X' ) {
						if(L[i+1] == 'p' | L[i+1] =='P' ) {
							return false;
							
						}
					} else {
						i= i+1;
					}
				} 
				if (L[i] == 'p' | L[i] =='P' ) {
					if (L[i+1] == '0' |L[i+1] == '+' |L[i+1] == '-' |L[i+1] == 'A' | L[i+1] == 'B' | L[i+1] == 'C' | L[i+1] == 'D' | L[i+1] == 'E' | L[i+1] == 'F' | L[i+1] == 'a' | L[i+1] == 'b' | L[i+1] == 'c' | L[i+1] == 'd' | L[i+1] == 'e' | L[i+1] == 'f' | L[i+1] == '1' | L[i+1] == '2' | L[i+1] == '3' | L[i+1] == '4' | L[i+1] == '5' | L[i+1] == '6' | L[i+1] == '7' | L[i+1] == '8' | L[i+1] == '9') {
						return true;
					}
				}
			}
		}
		
		if (L[0]!= '0' && L[1]!='x' | L[0]!= '0' && L[1]!='X') {
			for (int i = 2; i < L.length ;i++) {
				if(L[i]=='_') {
					if (L[i-1] == '0' | L[i-1] == '1' | L[i-1] == '2' | L[i-1] == '3' | L[i-1] == '4' | L[i-1] == '5' | L[i-1] == '6' | L[i-1] == '7' | L[i-1] == '8' | L[i-1] == '9'){
						if(L[i+1] == '0' | L[i+1] == '1' | L[i+1] == '2' | L[i+1] == '3' | L[i+1] == '4' | L[i+1] == '5' | L[i+1] == '6' | L[i+1] == '7' | L[i+1] == '8' | L[i+1] == '9') {
							i= i+1; 
						} else {
							return false;
						}
					} else {
						return false;
					}
				
				} 
				if ( L[i] == '0' | L[i] == '1' | L[i] == '2' | L[i] == '3' | L[i] == '4' | L[i] == '5' | L[i] == '6' | L[i] == '7' | L[i] == '8' | L[i] == '9') {
					i = i+1;
				}
				if (L[i] == '.' ) {
					i= i+1; 
					}
				if (L[i] == 'e' | L[i] == 'E') {
				i= i+1; 
				}
				if (L[i] == '+' | L[i] == '-') {
					if(L[i+1] == '0' | L[i+1] == '1' | L[i+1] == '2' | L[i+1] == '3' | L[i+1] == '4' | L[i+1] == '5' | L[i+1] == '6' | L[i+1] == '7' | L[i+1] == '8' | L[i+1] == '9') {
					i= i+1; 
					} else {
						return false;
					}
				}
				
			}
		
		
		}
		
		return true;
		
		
	}
}
