package classes;

public class Terceiro extends Funcionario {

	
	@Override
	public double salario() {

		return ((horasTrabalhadas * valorHora) + adicional);

	}
	

}
