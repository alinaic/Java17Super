public class PeliculaDVD extends Pelicula {

	public PeliculaDVD() {

		// super();
		// asi digo que cuando cree un objecto de esta clase se use el
		// constructor que nos pide nada
		// de la clase padre. En este caso Pelicula

		super("titulo pelicula");
		System.out
				.println("constructor de pelicula que no pide nada de la PeliculaDVD");
	}
}
