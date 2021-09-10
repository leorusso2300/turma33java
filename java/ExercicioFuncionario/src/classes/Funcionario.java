package classes;

public class Funcionario {

	protected String matricula;
	protected int horasTrabalhadas;
	protected double valorHora;
	protected String nome;
	protected double adicional;

	public Funcionario(String matricula, int horasTrabalhadas) {
		super();
		this.matricula = matricula;
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public Funcionario(String matricula, int horasTrabalhadas, double valorHora, String nome, double adicional) {
		super();
		this.matricula = matricula;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHora = valorHora;
		this.nome = nome;
		this.adicional = adicional;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}

	public double salario() {

		return (this.horasTrabalhadas * this.valorHora);

	}

}
