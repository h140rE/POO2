package Model_MVC;

public class Funcionario extends Pessoa {

	private int idFuncionario;
        
        public Funcionario(String nome, String cpf, String telefone, int idFunc){
            super(nome,cpf,telefone);
            this.idFuncionario = idFunc;
        }
        
        public int getID(){
            return this.idFuncionario;
        }
        
        public void atualizaID(int n){
            this.idFuncionario = n;
        }
        
        
        

}
