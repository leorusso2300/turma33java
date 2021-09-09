package entities;

public class ContaEmpresa extends Conta{
	
	// attribute
		private	double	emprestimoEmpresa;
	
	// constructor
		public ContaEmpresa(int numero, String cpf, Double saldo) {
			super(numero, cpf, saldo);
		}
		
	// encapsulation
		public double getEmprestimoEmpresa() {
			return emprestimoEmpresa;
		}

		public void setEmprestimoEmpresa(double emprestimoEmpresa) {
			this.emprestimoEmpresa = emprestimoEmpresa;
		}
		
	// methods
		public void pedirEmprestimo(double emprestimo)
		{
			this.saldo += emprestimo;
			this.emprestimoEmpresa -= emprestimo;
			
		}
	
}
