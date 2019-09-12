package Computador;

public class MainPc {

	public static void main(String[] args) {
		
		Hd hd = new Hd();
		
		hd.setCapacidade(500);
		hd.setRpm(13);
		hd.setMarca("Samsung");
		hd.setModelo("Padrao");
		
		System.out.println(hd);
	
		System.out.println("\n-------------------------------------------------\n");
	
		Memoria memoria = new Memoria();
		
		memoria.setCapacidade(16);
		memoria.setVelocidade(30);
		memoria.setMarca("HyperX");
		memoria.setModelo("Geimer");
		
		System.out.println(memoria);
		
		System.out.println("\n-------------------------------------------------\n");
		
		Processador processador = new Processador();
		
		processador.setCache(6);
		processador.setClock((float) 3.75);
		processador.setMarca("Intel");
		processador.setModelo("Core i9");
		
		System.out.println(processador);
		
		System.out.println("\n-------------------------------------------------\n");
		
		Placamae placamae = new Placamae();
		
			placamae.setHd(hd);
			placamae.setProcessador(processador);
			placamae.setMemoria(memoria);
			placamae.setMarca("Placa Mae Asus");
			placamae.setModelo("1294-U");
			
			System.out.println(placamae);
			
			System.out.println("\n-------------------------------------------------\n");
			
			Gabinete gabinete = new Gabinete();
			
			gabinete.setPlacamae(placamae);
			gabinete.setTipo("Geimer");
			gabinete.setModelo("Famoso Gabinete Gamer Com Luzinha RGB");
			gabinete.setBaias(6);
			
			System.out.println(gabinete);
			
			System.out.println("\n-------------------------------------------------\n");
			
			Monitor monitor = new Monitor();
			
			monitor.setMarca("Toshiba");
			monitor.setResolucao("30000000 x 2");
			monitor.setTipo("Raio - X");
			
			System.out.println(monitor);
			
			System.out.println("\n-------------------------------------------------\n");
			
			Mouse mouse = new Mouse();
			
			mouse.setMarca("Dazz");
			mouse.setTipo("Mouse Professional");
			
			System.out.println(mouse);
			
			System.out.println("\n-------------------------------------------------\n");
			
			Teclado teclado = new Teclado();
			
			teclado.setMarca("Razer");
			teclado.setTipo("Gay Mer (com Luzinha verde)"); 
			
			System.out.println(teclado);
			
			System.out.println("\n-------------------------------------------------\n");
			
			EquipamentoEletronico ee = new EquipamentoEletronico();
			
			ee.setTensao(120);
			ee.setConsumo((float) 15.5);
			
			System.out.println(ee);
			
			System.out.println("\n-------------------------------------------------\n");
			
			Computador comp = new Computador();
			
			comp.setConsumo(770);
			comp.setTensao(220);
			comp.setGabinete(gabinete);
			comp.setMarca("Positivo");
			comp.setModelo("AA mais merda do Brasil");
			comp.setMonitor(monitor);
			comp.setMouse(mouse);
			comp.setTeclado(teclado);
			
			System.out.println(comp);
			
			System.out.println("\n-------------------------------------------------\n");
				
	}

}
