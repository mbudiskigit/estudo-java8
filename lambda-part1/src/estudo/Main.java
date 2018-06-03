package estudo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {

	public static void main(String... args) {

		Usuario usuario1 = new Usuario("Mariana", 150);
		Usuario usuario2 = new Usuario("Gustavo", 120);
		Usuario usuario3 = new Usuario("Eliana", 190);

		List<Usuario> usuarios = Arrays.asList(usuario1, usuario2, usuario3);

		for (Usuario usuario : usuarios) {
			System.out.println(usuario.getNome());
		}

		Mostrador mostrador1 = new Mostrador();
		usuarios.forEach(mostrador1);

		// refatirando com classe anônima
		Consumer<Usuario> mostrador2 = new Consumer<Usuario>() {
			public void accept(Usuario u) {
				System.out.println(u.getNome());
			}
		};
		usuarios.forEach(mostrador2);

		// refatorando para um modo mais enxuto para não criar
		// um objeto mostrador
		usuarios.forEach(new Consumer<Usuario>() {
			public void accept(Usuario u) {
				System.out.println(u.getNome());
			}
		});
		
		//refatorando com lambda
		Consumer<Usuario> mostrador3 = u ->{
			System.out.println(u.getNome());
		};
		
		//passando o trecho para o forEach
		usuarios.forEach(u -> System.out.println(u.getNome()));
		
		//Criando uma interface funcional
		Validador<String> validadorCEP =
				valor -> valor.matches("[0-9]{5}-[0-9]{3}");
				
		boolean valido = validadorCEP.valida("teste");
		System.out.println(valido);
		
		valido = validadorCEP.valida("04101-300");
		System.out.println(valido);

	}

}
