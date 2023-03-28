package orientacao_objeto;

public class TestaCliente {
	
	public static void main(String[] args) {
		
		  Exer01_ClasseCliente tc = new Exer01_ClasseCliente ("Andresa" , 26, "Feminino" , "Rio de Janeiro" , "(21 96719-5996");
		  tc.visualizar();

		  Exer01_ClasseCliente  tc1 = new Exer01_ClasseCliente ("Jamile" , 18, "Feminino" , "Rio de Janeiro" , "(21 95734-5959");
		  tc1.visualizar();
		  
		  PessoaFisica pf = new PessoaFisica ("Andresa" , 26, "Feminino" , "Rio de Janeiro" , "(21) 96719-5996" , "960.568.432-93");
		  pf.visualizar();
		  

		  PessoaFisica pf1 = new PessoaFisica ("Jamile" , 18, "Feminino" , "Rio de Janeiro" , "(21 95734-5959" , "890.456.321-98");
		  pf1.visualizar();
		  
		  PessoaJuridica pj = new PessoaJuridica ("Douglas" , 31, "Masculino" , "Rio de Janeiro" , "(21) 9895-6498" , "96.366.589./0001-59");
		  pj.visualizar();
		  
		  PessoaJuridica pj1 = new PessoaJuridica ("Onassis" , 54, "Masculino" , "Rio de Janeiro" , "(21) 9425-7536" , "65.657.523./0001-64");
		  pj1.visualizar();
	}
}


