package estudo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ordenando2 {

	public static void main(String[] args) {

		Usuario usuario1 = new Usuario("Mariana", 150);
		Usuario usuario2 = new Usuario("Gustavo", 120);
		Usuario usuario3 = new Usuario("Eliana", 190);

		List<Usuario> usuarios = Arrays.asList(usuario1, usuario2, usuario3);

//		usuarios.sort(Comparator.comparing(Usuario::getPontos).reversed());
		
//		usuarios.sort(Comparator.comparing((Usuario u) -> u.getPontos()).reversed());
		
//		usuarios.forEach(u -> System.out.println(u.getNome() + "-" + u.getPontos()));

		// com streams
		
		usuarios.stream().sorted(Comparator.comparing(Usuario::getPontos).reversed())
		.forEach(u -> System.out.println(u.getNome() + "-" + u.getPontos()));
		
		usuarios.stream().sorted(Comparator.comparing(Usuario::getPontos))
		.forEach(u -> System.out.println(u.getNome() + "-" + u.getPontos()));
		
		
	}

}
