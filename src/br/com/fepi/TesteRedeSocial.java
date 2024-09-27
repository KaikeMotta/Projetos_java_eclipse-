package br.com.fepi;

/*
 * Aluno: kaike Michel Motta

 */

public class TesteRedeSocial {
    public static void main(String[] args) {
        // A. Criação de instâncias de usuários
        Usuario usuario1 = new Usuario(1, "Robson", 28, 4.5, false);
        Usuario usuario2 = new Usuario(2, "Roberta", 32, 3.8, false);
        Usuario usuario3 = new Usuario(3, "Kaike", 25, 5.0, false);
        Usuario usuario4 = new Usuario(4, "Chrystian", 25, 5.0, false);

        // Exibindo as informações dos usuários criados
        System.out.println("Usuários Criados:");
        System.out.println(usuario1);
        System.out.println(usuario2);
        System.out.println(usuario3);
        System.out.println(usuario4);

        // B. Ativação e desativação de usuários
        System.out.println("\nAtivando e Desativando Usuários:");
        System.out.println(usuario1.ativar());  // Ativando usuário1
        System.out.println(usuario2.ativar());  // Ativando usuário2
        System.out.println(usuario4.ativar());  // Ativando usuário4

        // C. Veirficando se o usuario esta ativo:
        
        System.out.println("\nverificando usuarios:");
        System.out.println(usuario1.estaAtivo());  // 
        System.out.println(usuario2.estaAtivo());  // Ativando usuário2
        System.out.println(usuario3.estaAtivo());  // Ativando usuário3
        System.out.println(usuario4.estaAtivo());  // Ativando usuário4

        // D. Ativação e desativação de usuários
        System.out.println("\ndesativando alguns usuarios:");
        System.out.println(usuario1.desativar()); // Desativando usuário1
        System.out.println(usuario3.desativar()); // Tentativa de desativar usuário3 (já desativado)
        System.out.println(usuario4.desativar()); // Desativando usuário4

        // E. Criação de Grupos
        Grupo grupo1 = new Grupo(1, "Desenvolvedores", "Grupo para discussão de desenvolvimento");
        Grupo grupo2 = new Grupo(2, "Amigos", "Grupo pessoal de amigos");

        // Exibindo os grupos criados
        System.out.println("\nGrupos Criados:");
        System.out.println("Grupo: " + grupo1.getNome() + " - " + grupo1.getDescricao());
        System.out.println("Grupo: " + grupo2.getNome() + " - " + grupo2.getDescricao());

        // Adicionando usuários aos grupos
        System.out.println("\nAdicionando Usuários aos Grupos:");
        grupo1.adicionarMembro(usuario1);  // Adicionando usuário1 ao grupo1
        grupo1.adicionarMembro(usuario2);  // Adicionando usuário2 ao grupo1
        grupo2.adicionarMembro(usuario1);  // Adicionando usuário1 ao grupo2
        grupo2.adicionarMembro(usuario3);  // Adicionando usuário3 ao grupo2
        grupo2.adicionarMembro(usuario4);  // Adicionando usuário4 ao grupo2

        // Listando membros dos grupos
        System.out.println("\nListando Membros dos Grupos:");
        grupo1.listarMembros();  // Membros do grupo1
        grupo2.listarMembros();  // Membros do grupo2

        // Removendo usuários dos grupos
        System.out.println("\nRemovendo Usuários dos Grupos:");
        grupo1.removerMembro(usuario1);  // Removendo usuário1 do grupo1
        grupo1.listarMembros();  // Listando membros do grupo1 após a remoção
    }
}
