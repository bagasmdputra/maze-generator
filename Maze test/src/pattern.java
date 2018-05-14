import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter a number: ");
		int n = reader.nextInt(); // Scans the next token of the input as an int.
		printMaze2(n);
		//once finished
		reader.close();

	}
	
	public static void	printMaze1(int size) {
		for(int i = 0; i < size; i++) {
			if(i%2 == 0){
				for(int j = 0; j < size; j++) {
					if(i%4==0 && j==1) {
						System.out.print(' ');
					}
					else if(i%4==2 && j==size-2) {
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
				if(j%2 == 0){
					System.out.print('@');
				}else {
					System.out.print(' ');
				}
				
			}
			System.out.println();
				
		}
	}
	

}
