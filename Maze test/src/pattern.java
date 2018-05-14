import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter a number: ");
		int n = reader.nextInt(); // Scans the next token of the input as an int.
		
		
		//print maze patterns
		System.out.println("\n Maze Pattern 1\n");
		printMaze1(n);
		System.out.println("\n Maze Pattern 2\n");
		printMaze2(n);
		System.out.println("\n Maze Pattern 3\n");
		printMaze3(n);
		System.out.println("\n Maze Pattern 4\n");
		printMaze4(n);
		
		//once finished
		reader.close();

	}
	
	public static void	printMaze1(int size) {
		for(int i = 0; i < size; i++) {
				for(int j = 0; j < size; j++) {
					if(
							//right indent horizontal
							(i%4==0 && j==1) || 
										
							//left indent horizontal
							(i%4==2 && j==size-2) ||
							
							//vertical
							(i%2 == 1 && j>0 && j<size-1)
							
							) {
						System.out.print(' ');
					}
					else {
						System.out.print('@');
					}
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
						
						//horizontal odd
						(i%4==0 && ((i==0 && j>1) || (j!=0 && j+1>size-i)) && (i==0 || j<size-2)) ||
						//horizontal even
						(i%4==2 && (j+1>size-i || (i==size-1))) 			
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
