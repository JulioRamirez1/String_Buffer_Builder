import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class semana16 {

	public static void main(String[] args) {
		
		
		 Map<String, Object> map = new HashMap();
		  map.put("apple", new Date());
		  map.put("a", 3);
		  System.out.println(map.get("apple"));   // green
		
		/*try {
			//Diferencias entre fechas
			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
			Date primerFecha = formato.parse("30/07/1992");
			Date segundaFecha = formato.parse("27/10/2022");
			
			long diferenciaTiempo = Math.abs(segundaFecha.getTime() - primerFecha.getTime());
			System.out.println(diferenciaTiempo);
			long dias = TimeUnit.DAYS.convert(diferenciaTiempo, TimeUnit.MILLISECONDS);
			System.out.println("Diferecia en dias: " + dias);
			
			Date hoy = new Date();
			//System.out.println(hoy);
			//System.out.println("Fecha y hora: " + new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:SS").format(hoy));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}*/
	
	}

}
