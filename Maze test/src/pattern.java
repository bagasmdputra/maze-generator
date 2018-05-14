import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter a number: ");
		int n = reader.nextInt(); // Scans the next token of the input as an int.
		
		printMaze1(n);
		System.out.println();
		printMaze2(n);
		System.out.println();
		printMaze3(n);
		System.out.println();
		printMaze4(n);
		
		//once finished
		reader.close();

	}
	
	public static void	printMaze1(int size) {
		for(int i = 0; i < size; i++) {
			if(i%2 == 0){
				for(int j = 0; j < size; j++) {
					if(
							(i%4==0 && j==1) ||
							(i%4==2 && j==size-2)
							) {
						System.out.print(' ');
					}
					else {
						System.out.print('@');
					}
				}
			}
			else{
				System.out.print('@');
				for(int j = 1; j < size-1; j++) {
					System.out.print(' ');
				}
				System.out.print('@');
			}
			System.out.println();
		}
			
	}
	
	public static void	printMaze2(int size) {
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				if(						
						//left
						(j%2==0 && i>=j-1 && i<size-j) ||
						//right
						(j%2==0 && i>=size-j && i<j+1) ||
						//bottom
						(i%2==0 && j>=size-i && j<i) ||
						//top
						(i%2==0 && j>=i+2 && j<size-i)
						) {
					System.out.print('@');
				}else {
					System.out.print(' ');
				}
					
			}
			System.out.println();
				
		}
	}
	
	public static void	printMaze3(int size) {
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				if(
						//left
						(j%2==0 && i>=j-1 && i<size-j) ||
						//right
						(j%2==0 && i>=size-j && i<j+2) ||
						//bottom
						(i%2==0 && j>=size-i && j<i-1) ||
						//top
						(i%2==0 && j>=i+2 && j<size-i)
						
						) {
					System.out.print('@');
				}else {
					System.out.print(' ');
				}
			}
			System.out.println();
				
		}
	}
	
	public static void	printMaze4(int size) {
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				if(
						//vertical odd
						(j%4==0 && (j==0 || (i!=0 && i>1)) && i<size-j) ||
						//vertical even
						(j%4==2 && (i<size-j || (j==size-1))) ||
						
						//vertical odd
						(i%4==0 && (i==0 || (j!=0 && j+1>size-i)) && (i==0 || j<size-2)) ||
						//vertical even
						(i%4==2 && (j+1>size-i || (i==size-1))) 
						
						//bottom
//						(i%2==0 && j>=size-i && j<i-1) 
//						//horizontal
//						(i%2==0 && j>=i+2 && j<size-i)
						
						) {
					System.out.print('@');
				}else {
					System.out.print(' ');
				}
			}
			System.out.println();
				
		}
	}

}
