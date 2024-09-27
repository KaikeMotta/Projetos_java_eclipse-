package br.com.fepi;

	import java.util.Objects;

	public class Usuario {
	    private int id;
	    private String nome;
	    private int idade;
	    private double reputacao;
	    private boolean ativo;

	    // Construtor
	    public Usuario(int id, String nome, int idade, double reputacao, boolean ativo) {
	        this.id = id;
	        this.nome = nome;
	        this.idade = idade;
	        this.reputacao = reputacao;
	        this.ativo = ativo;
	    }

	    // Getters e Setters
	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public int getIdade() {
	        return idade;
	    }

	    public void setIdade(int idade) {
	        this.idade = idade;
	    }

	    public double getReputacao() {
	        return reputacao;
	    }

	    public void setReputacao(double reputacao) {
	        if (reputacao >= 0 && reputacao <= 5) {
	            this.reputacao = reputacao;
	        }
	    }

	    public boolean isAtivo() {
	        return ativo;
	    }

	    public void setAtivo(boolean ativo) {
	        this.ativo = ativo;
	    }
	    
	    public String estaAtivo() {
	    	if (this.isAtivo()) {
	    		return "Usuario " + this.nome + " está Ativo";
	    	} else {
	    		return "Usuario "+ this.nome +" está Inativo";
	    	}
	    }

	    // Métodos
	    public String ativar() {
	        if (!this.ativo) {
	            this.ativo = true;
	            return "Usuário "+ this.nome +" ativado com sucesso.";
	        }
	        return "Usuário "+ this.nome +" já está ativo.";
	    }

	    public String desativar() {
	        if (this.ativo) {
	            this.ativo = false;
	            return "Usuário "+ this.nome +" desativado com sucesso.";
	        }
	        return "Usuário "+ this.nome +" já está desativado.";
	    }

	    @Override
	    public String toString() {
	        return "Usuário: " + nome + " | Idade: " + idade + " | Reputação: " + reputacao + " | Ativo: " + ativo;
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        Usuario usuario = (Usuario) o;
	        return id == usuario.id;
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(id);
	    }
	}