package entities;

public class AgeAndGender {
	
	private String genero;
	private Integer idade;
	
	public AgeAndGender(String genero, Integer idade) {
		
		this.genero = genero;
		this.idade = idade;
	}
	
	public AgeAndGender() {};
	
	public void toString(String genero) {
		this.genero = genero.toString().toLowerCase();
	}
	
	public void testAge(Integer idade) {
		if (idade < 18.0) {
			System.out.println("Menor de idade");
		} else {
			System.out.println("Maior de idade - ADULTO");
		}
	}

	public void testGender(String genero) {
		if (genero.toLowerCase().charAt(0) == 'f') {
			System.out.print("Genero Feminino (Mulher)");
		} else
			if (genero.toLowerCase().charAt(0) == 'm') {
			System.out.print("Gênero Masculino (Homem)");
		}
	}
	
}
