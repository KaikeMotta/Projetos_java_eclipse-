package br.com.fepi;

import java.util.ArrayList;

public class Grupo {
	private int id;
	private String nome;
	private String descricao;
	private ArrayList<Usuario> membros;

	// Construtor
	public Grupo(int id, String nome, String descricao) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.membros = new ArrayList<>();
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public ArrayList<Usuario> getMembros() {
		return membros;
	}

	public void setMembros(ArrayList<Usuario> membros) {
		this.membros = membros;
	}

	// Métodos
	public void adicionarMembro(Usuario usuario) {
		if (usuario.isAtivo()) {
			if (!membros.contains(usuario)) {
				membros.add(usuario);
				System.out.println("Usuário " + usuario.getNome() + " adicionado ao grupo " + this.nome);
			} else {
				System.out.println("Usuário " + usuario.getNome() + " já é membro do grupo" + this.nome);
			}
		} else {
			System.out.println("Usuário " + usuario.getNome() + " não pode ser adicionado ao grupo "+ this.nome +" pois está desativado.");
		}
	}

	public void removerMembro(Usuario usuario) {
		if (membros.contains(usuario)) {
			membros.remove(usuario);
			System.out.println("Usuário " + usuario.getNome() + " removido do grupo " + this.nome);
		} else {
			System.out.println("Usuário não é membro do grupo " + this.nome);
		}
	}

	public void listarMembros() {
		System.out.println("Membros do grupo " + nome + ":");
		for (Usuario membro : membros) {
			System.out.println(membro);
		}
	}
}
