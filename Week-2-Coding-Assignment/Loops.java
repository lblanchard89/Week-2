
public class Loops {
public static void main(String[] args) {
		//loop that prints all even numbers from 0 to 100
		int x = 0;
		while (x <= 100) {
			System.out.println(x);
			x += 2;
		}
		/*loop that prints every 3rd number going backwards
		from 100 to 0*/
		int y = 100;
		while (y >= 0) {
			System.out.println(y);
			y -= 3;
		}
		//loop that prints every other number from 1 to 100
		for (int z = 1; z <= 100; z +=2) {
			System.out.println(z);
		}
		
		/*loop that prints every number from 0 to 100 with
	    conditional statements*/
		for (int i = 0; i <= 100; i++){
			
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("HelloWorld");
			}
			else if (i % 3 == 0) {
				System.out.println("Hello");
			}
			else if (i % 5 == 0) {
				System.out.println("World");
			}
			else {
				System.out.println(i);
			}
		}
	}
}