public class cepApi {

	private static cepApi instancia = new cepApi();

	private cepApi() {
		super();
	}

	public static cepApi getInstancia() {
		return instancia;
	}
	
	public String recuperarCidade(String cep) {
		return "Araraquara";
	}
	
	public String recuperarEstado(String cep) {
		return "SP";
	}
}