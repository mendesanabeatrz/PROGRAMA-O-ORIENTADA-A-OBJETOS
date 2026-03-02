package aula02;

public class Principal {

	public static void main(String[] args) {
		//----------------- ATIVIDDAE 1 -------------------
		// instanciando 2 objetos
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		
		// alterados valores
		carro1.modelo = "Golf";
		carro2.modelo = "RAM";
		
		// chamando métodos
		carro1.acelerar(40);
		carro2.acelerar(50);
		
		// imprimir valores na tela 
		System.out.println("Velociddae do carro: " + carro1.modelo + carro1.velocidade);
		System.out.println("Velociddae do carro: " + carro2.modelo + carro2.velocidade);
		// -----------------------IMPRIMA O ANO TAMBEM-------------------------------
		carro1.freiar(50);
		System.out.println("Velociddae do carro: " + carro1.modelo + carro1.velocidade);
		//-------------------------------------------------------------------
		
		// --------------------------ATIVIDDAES 2 -------------------
		
		ContaBancaria conta = new ContaBancaria();
		conta.setTitular("Beatriz");
		conta.depositar(1000);
		
		System.out.println("Títular: " + conta.getTitular());
		System.out.println("Saldo: " + conta.getSaldo());
		
		boolean sucesso = conta.sacar(500)
		if (suceso){
			System.out.println("Saque feito com sucesso");
		} else {
			System.out.println("Saldo insuficiente");
		}
		System.out.println("Novo saldo: " + conta.getSaldo());
		
		
	}
	

}
