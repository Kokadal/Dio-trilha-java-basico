public class ComputadorPedrinho {
	public static void main(String[] args) {
		
		MSNMessenger msn = new MSNMessenger();
		msn.enviarMensagem();
		msn.receberMensagem();
		
		facebook fbm = new facebook();
		fbm.enviarMensagem();
		fbm.receberMensagem();
		
		telegram tlg = new telegram();
		tlg.enviarMensagem();
		tlg.receberMensagem();
		
	}
}