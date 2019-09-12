package HomeTheater;

public class Main {

	public static void main(String[] args) {
		
		EquipamentoEletronico ee = new EquipamentoEletronico();
		
		ee.setTensao(220);
		ee.setConsumo(1500);

		System.out.println(ee);
	
		System.out.println("-------------------------------------------------");
	
		SistemaDeSom ss = new SistemaDeSom();
	
		ss.setTensao(150);
		ss.setConsumo(1200);
		ss.setMarca("Sony");
		ss.setModelo("X05-M");
		ss.setPotencia(125);
	
		System.out.println(ss);
		
		System.out.println("-------------------------------------------------");
		
		SistemaDeVideo sv = new SistemaDeVideo();
		
		sv.setTensao(80);
		sv.setConsumo(2000);
		sv.setMarca("NVIDIA");
		sv.setResolucao("1080");
		sv.setModelo("GHJ-091");
		sv.setTipo("DDR4");
		System.out.println(sv);
	
		System.out.println("-------------------------------------------------");
	
		HomeTheater ht = new HomeTheater();
		
		//ht.setSom(ss);
		//ht.setVideo(sv);
	
		ht.setSom(ss);
		System.out.println(ht);
	
	}

}
