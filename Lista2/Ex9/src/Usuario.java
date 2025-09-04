public class Usuario {
    private String nome;
    private String senha;

    Usuario(String nome, String senha){
        this.nome = nome;
        this.senha = senha;
    }

    public void setSenha(String senha) {
        if(senha.length() >=8){
            this.senha = senha;
            System.out.println("Senha definida com sucesso!");
        }else{
            System.out.println("A senha deve ter pelo menos 8 caracteres");
        }
    }

    public String getSenha(){
        return this.senha;
    }
}
