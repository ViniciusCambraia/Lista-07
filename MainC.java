package Carro_Motor_Pessoa;

public class MainC {

	public static void main(String[] args) {

		Pessoa pp = new Pessoa();

		pp.setEnder�o("Rua Puipi");
		pp.setNome("Grande Valdecir");

		System.out.println(pp);

		System.out.println("-------------------------------------------------");
		
		Motor mm = new Motor();
		
		mm.setMarca("Ferrari");
		mm.setPotencia(120);
		mm.setCilindros(8);
		mm.setCombustivel(" T� caro :c");
		
		System.out.println(mm);
	
		System.out.println("-------------------------------------------------");
	
		Carro car = new Carro();
		
		car.setFabricante("Bob Marley");
		car.setModelo("Fuma�a");
		car.setCor("Verdinho");
		car.setAno(1943);
		car.setPesoa(pp);
		car.setMotor(mm);
	
		System.out.println(car);
		
		System.out.println("-------------------------------------------------");
	}

}
