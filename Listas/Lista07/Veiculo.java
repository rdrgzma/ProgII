class Veiculo{
	
	int codigo, ano, quilometragem;
	String descricao, placa;
	double preco;
	
	Veiculo ( int codigo, String descricao, int ano, String placa, double preco, int quilometragem){
		this.codigo=codigo;
		this.descricao=descricao;
		this.ano=ano;
		this.placa=placa;
		this.preco=preco;
		this.quilometragem=quilometragem;
	}
	void mostrar(){
		System.out.println("Veiculo Encontrado");
		System.out.printf("codigo: %d\n",codigo);
		System.out.printf("Descricao: %s\n",descricao);
		System.out.printf("Ano: %d\n",ano);
		System.out.printf("Placa: %s\n",placa);
		System.out.printf("Preco: %.2f\n",preco);
		System.out.printf("Quilometragem: %d\n",quilometragem);
		
	}
	
}