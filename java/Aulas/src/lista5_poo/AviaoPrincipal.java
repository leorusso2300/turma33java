package lista5_poo;

public class AviaoPrincipal {

		
		private String nome;
		private String company;
		private int ano;
		private boolean voando = false;
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getCompany() {
			return company;
		}
		public void setCompany(String company) {
			this.company = company;
		}
		public int getAno() {
			return ano;
		}
		public void setAno(int ano) {
			this.ano = ano;
		}
		public boolean isVoando() {
			return voando;
		}
		public void setVoando(boolean voando) {
			this.voando = voando;
		}
		public AviaoPrincipal(String nome, String company, int ano, boolean voando) {
			super();
			this.nome = nome;
			this.company = company;
			this.ano = ano;
			this.voando = voando;
		}

		
		
		
	@Override
	public String toString() {
		return "Aviao [nome=" + nome + ", company=" + company + ", ano=" + ano + ", voando=" + voando
				+ "]";
	}

}
