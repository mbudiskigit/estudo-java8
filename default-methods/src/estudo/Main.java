package estudo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {

	public static void main(String... args) {

		Usuario usuario1 = new Usuario("Mariana", 150);
		Usuario usuario2 = new Usuario("Gustavo", 120);
		Usuario usuario3 = new Usuario("Eliana", 190);

		List<Usuario> usuarios = Arrays.asList(usuario1, usuario2, usuario3);

		Consumer<Usuario> mostrarMensagem = u -> {
			System.out.println("Antes de imprimir os nomes");
		};

		Consumer<Usuario> imprimeNome = u -> {
			System.out.println(u.getNome());
		};

		usuarios.forEach(mostrarMensagem.andThen(imprimeNome));

		// removendo itens da lista

		Predicate<Usuario> predicado = new Predicate<Usuario>() {
			public boolean test(Usuario u) {
				return u.getPontos() > 160;
			}
		};
		//ou usuarios.removeIf(u -> u.getPontos() > 160);
		
		List<Usuario> usuariosListaMutavel = new ArrayList<>();
		usuariosListaMutavel.add(usuario1);
		usuariosListaMutavel.add(usuario2);
		usuariosListaMutavel.add(usuario3);
		
		usuariosListaMutavel.removeIf(predicado);
		
		usuariosListaMutavel.forEach(u -> System.out.println(u.getNome() + " - " + u.getPontos()));

	}

}
