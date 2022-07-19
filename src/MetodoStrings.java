import java.util.Arrays;

public class MetodoStrings {
	
	
	public void metodos() {
		String a = "";
		if (a.isBlank()) {
			System.out.println("Es vacio");
		} else {
			System.out.println("No es vacio");
		}		
			
			// toUpperCase Y toLowerCase
		String java = "Java";
		System.out.println(java.toUpperCase());
		System.out.println(java.toLowerCase());
			
			
			
			
			
			
			
			
			
			
			
			
			
			// split();
			String rolesbd = "106,104,002,001";
			String rolUsuario[] = {"106", "006", "009", "002"};
			
			String[] arrayUser = rolesbd.split(",");
			for (String rol : rolUsuario) {
				if (Arrays.asList(arrayUser).contains(rol)) {
					//System.out.println("El usurario tiene permisos");
					break;
				}
			}
					
			// replace();
			String o1 = "Java es un objTotal buen lenguaje de programación objprecio";
			//System.out.println(o1);
			String rplO1 = o1.replace('e', 'w');
			//System.out.println(rplO1);
			o1 = o1.replace("objTotal", "s/. 10");
			o1 = o1.replace("objprecio", "s/. 1");
			//System.out.println(o1);
			
			// trim()
			String nombre = " Java, Spring boot ";
			//System.out.println(nombre);
			//sSystem.out.println(nombre.trim());

			// subString
			String saludo = new String();
			saludo = "Hola mundo";
			//System.out.println(saludo.substring(5));
			//System.out.println(saludo.substring(0, 5));
			
			// equals() Y equalsIgnoreCase();
			String nombre01 = "java4";
			String nombre02 = "JAVA4";
			
			if (nombre01.equals(nombre02)) {
				//System.out.println("Son iguales");
			} else {
				//System.out.println("No son iguales");
			}
			
			if (nombre01.equalsIgnoreCase(nombre02)) {
				//System.out.println("Son iguales");
			} else {
				//System.out.println("No son iguales");
			}
	}

}
