
public class Gerente extends Funcionario {
	private String login;
	private String senha;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	/*public boolean validar(String senha, String login) {
		String s = "maiseleegentefina";
		String l = "gerentebravo";
		if (senha == s && login == l) {
			System.out.println("logado com sucesso");

		}else {
			System.out.println("senha e login incorretos");
		}
		return true;
	}*/

}
