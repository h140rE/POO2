package Model_MVC;

public class Pessoa {

	private String nome;

	private String CPF;

	private String telefone;

        public Pessoa(String nome, String CPF, String telefone){
            this.nome = nome;
            this.CPF = CPF;
            this.telefone = telefone;
        }
        
        public String getNome(){
            return this.nome;
        }
        public String getCPF(){
            return this.CPF;
        }
        public String getTelefone(){
            return this.telefone;
        }
        
        public void atualizaNome(String s){
            nome = s;
        }
        public void atualizaCPF(String n){
            this.CPF = n;
        }
        public void atualizaTelefone(String n){
            this.telefone = n;
        }


}



