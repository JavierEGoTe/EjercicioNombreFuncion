import java.util.Scanner;

public class FuncionNombre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nombre();
	}
	public static void nombre() {
		
		String nombre;
		String apellidos;
		System.out.println("Escribe tu o tus nombres: ");
		Scanner in = new Scanner(System.in);
		nombre = in.nextLine();
		System.out.println("Escribe tus apellidos: ");
		apellidos = in.nextLine();
		
		System.out.println("Tu nombre es: "+ nombre + " " + apellidos);
	}
}
