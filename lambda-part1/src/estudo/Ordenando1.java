package estudo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class Ordenando1 {

	public static void main(String... args) {

		Usuario usuario1 = new Usuario("Mariana", 150);
		Usuario usuario2 = new Usuario("Gustavo", 120);
		Usuario usuario3 = new Usuario("Eliana", 190);

		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		usuarios.add(usuario3);

		// Metodo 1
		// Comparator<Usuario> comparator =
		// (u1, u2) -> u1.getNome().compareTo(u2.getNome());
		// Collections.sort(usuarios, comparator);

		// Metodo 2
		// Collections.sort(usuarios,
		// (u1, u2) -> u1.getNome().compareTo(u2.getNome()));

		// Usando o default method sort
		// usuarios.sort((u1, u2) -> u1.getNome().compareTo(u2.getNome()));

		// Usando metodos estaticis
		usuarios.sort(Comparator.comparing(u -> u.getNome()));

		usuarios.forEach(u -> System.out.println(u.getNome()));

		List<String> palavras = Arrays.asList("Casa do Código", "Alura", "Caelum");
		palavras.sort(Comparator.naturalOrder());

		palavras.forEach(p -> System.out.println(p));

		palavras.sort(Comparator.reverseOrder());

		palavras.forEach(p -> System.out.println(p));

		// Ordenando por pontos
		Function<Usuario, Integer> extraiPontos = u -> u.getPontos();
		Comparator<Usuario> comparator = Comparator.comparing(extraiPontos);
		usuarios.sort(comparator);

		// mais enxuto
		usuarios.sort(Comparator.comparing(u -> u.getPontos()));

		usuarios.forEach(u -> System.out.println(u.getNome() + " - " + u.getPontos()));

		// evitando autoboxing
		ToIntFunction<Usuario> pontos = u -> u.getPontos();
		Comparator<Usuario> comparatorPontos = Comparator.comparingInt(pontos);
		usuarios.sort(comparatorPontos);
		
		usuarios.sort(Comparator.comparingInt(u -> u.getPontos()));
		
		usuarios.forEach(u -> System.out.println(u.getNome() + " - " + u.getPontos()));

	}

}
