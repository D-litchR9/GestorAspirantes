import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@Named
@ApplicationScoped
public class teastBean {
	public static void main(String args[]) {
		System.out.println("bean de prueba good.");
	}
	
	public String mensaje() {
		return "Hola, todo esta bien :D";
	}
}
