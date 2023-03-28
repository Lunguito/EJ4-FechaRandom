import java.util.Random;
import javax.swing.JOptionPane;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String op, str;
		boolean continuar = true;

		do {
			str = JOptionPane.showInputDialog(
					"1: mostrar 5 números aleatorios.\n" + "2: muestra la suma de 5 números aleatorios.\n"
							+ "3: Muestra la fecha y hora actual.\n" + "Fin: para finalizar");
			op = str.toUpperCase();

			switch (op) {
			case "1":
				Opcion1();
				break;
			case "2":
				Opcion2();
				break;
			case "3":
				Opcion3();
				break;
			case "FIN":
				continuar = false;
				break;
			}
		} while (continuar);
	}

	private static void Opcion3() {
		LocalDateTime fecha = LocalDateTime.now();
		DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String fechaConFormato = fecha.format(formateador);

		System.out.println(fechaConFormato);
	}

	private static void Opcion2() {
		int suma = 0, num;
		Random rnd = new Random();
		for (int i = 0; i < 5; i++) {
			num = rnd.nextInt(9999999);
			System.out.println(num + " +");
			suma += num;
		}
		System.out.println("________");
		System.out.println(suma);
	}

	static void Opcion1() {
		Random rnd = new Random();
		for (int i = 0; i < 5; i++) {
			System.out.println(rnd.nextInt(9999999));
		}
	}
}
