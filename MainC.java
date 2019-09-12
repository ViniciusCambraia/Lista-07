package Carro_Motor_Pessoa;

public class MainC {

	public static void main(String[] args) {

		Pessoa pp = new Pessoa();

		pp.setEnderço("Rua Puipi");
		pp.setNome("Grande Valdecir");

		System.out.println(pp);

		System.out.println("-------------------------------------------------");
		
		Motor mm = new Motor();
		
		mm.setMarca("Ferrari");
		mm.setPotencia(120);
		mm.setCilindros(8);
		mm.setCombustivel(" Tá caro :c");
		
		System.out.println(mm);
	
		System.out.println("-------------------------------------------------");
	
		Carro car = new Carro();
		
		car.setFabricante("Bob Marley");
		car.setModelo("Fumaça");
		car.setCor("Verdinho");
		car.setAno(1943);
		car.setPesoa(pp);
		car.setMotor(mm);
	
		System.out.println(car);
		
		System.out.println("-------------------------------------------------");
	}

}
