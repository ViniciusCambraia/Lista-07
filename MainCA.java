package Conta_Avancada;

public class MainCA {

	public static void main(String[] args) {
	
		Pessoa pp= new Pessoa();
		
		pp.setEndereco("Quixaramobim");
		pp.setNome("Bia");
		
		System.out.println(pp);
	
		System.out.println("-------------------------------------------------");
	
		Banco banc = new Banco();
		
		banc.setCodigo(199);
		banc.setNome("Santo André");
		banc.setNumeroAgencias(77);
	
		System.out.println(banc);
	
		System.out.println("-------------------------------------------------");
		
		ContaBancaria cb = new ContaBancaria();
		
		cb.setBank(banc);
		cb.setAgencia(123);
		cb.setNumerodaconta(9754);
		cb.setSaldo(3569825);
		cb.setPesoa(pp);
	
		System.out.println(cb);
	
		System.out.println("-------------------------------------------------");
	
		ContaSimples cs = new ContaSimples();
		
		cs.setPoupanca(4256);
		cs.setAgencia(432);
		cs.setBank(banc);
		cs.setPesoa(pp);
		cs.setNumerodaconta(75364);
		cs.setSaldo(15);
		
		System.out.println(cs);
	
		System.out.println("-------------------------------------------------");
		
		Cartao card = new Cartao();
		
		card.setNumero(433653);
		card.setOperadora("Master Card");
		card.setLimite(645648787);
		card.setTipodecartao("Cartao de rico");
		
		System.out.println(card);
		
		System.out.println("-------------------------------------------------");
		
		
		ContaEspecial ce = new ContaEspecial();
		
		ce.setDiassemjuros(6);
		ce.setLimite(77);
		ce.setCartao(card);
		ce.setBank(banc);
		ce.setPesoa(pp);
		ce.setAgencia(6);
		ce.setNumerodaconta(12);
		ce.setSaldo(389);
		System.out.println(ce);
		
	}

}
