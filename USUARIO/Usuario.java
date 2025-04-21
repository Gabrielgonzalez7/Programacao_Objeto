
public class Usuario {
	private String nomeUsuario;
	private String senha;
	private boolean logado = false;
	public Usuario(String nomeUsuario, String senha) {
		this.nomeUsuario = nomeUsuario;
		this.senha = senha;
	}
	public boolean login(String usuario, String senha) {
		if(this.nomeUsuario.equals(usuario) && this.senha.equals(senha)) {
			logado = true;
			return true;
		} else {
			return false;
		}
	}
	public void logout() {
		logado = false;
	}
	
	public void exibirStatus() {
		if(logado) {
			System.out.println("Usuário está logado!");
		} else {
			System.out.println("Usuário está deslogado!");
		}
	}
}
