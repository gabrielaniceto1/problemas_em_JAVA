package exemplos1;

public class Computador {
	double clockCpu;
	double memoriaRam;
	String nome;
	double precoBase;
	Computador(double clockCpu, int memoriaRam, String nome, double precoBase){
		this.clockCpu = clockCpu;
		this.memoriaRam = memoriaRam;
		this.nome = nome;
		this.precoBase = precoBase;
	}
	double precoFinal() {
		return precoBase + (clockCpu * 0.2) + (memoriaRam *0.1);
	}
	public static void main(String[] args) {
		Computador p1 = new Computador(16000, 32000, "predator", 10000);
		System.out.println(p1.precoBase);
		System.out.println(p1.precoFinal());

	}

}
