package collections;

public class Profesor implements Persona {

	@Override
	public void andar() {
		System.out.println("el profesor habla");
	}

	@Override
	public void hablar() {
		System.out.println("el profesor anda");
	}

}
