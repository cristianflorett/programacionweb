package pe.edu.upc.view;

import pe.edu.upc.Entity.Fruta;
import pe.edu.upc.Entity.Mermelada;

public class appFruteria {
	
	public static void main(String[] args)
	{
		Fruta f = new Fruta("Amarillo","Dulce");
		Mermelada mer = new Mermelada("Rojo","Acido",1,"Vidrio");
		
		System.out.println(f.toString());
		f.SoyUnMetodoObjecto();
		
		System.out.println(mer.toString());
		mer.SoyUnMetodoObjecto();
		
		Fruta.LugarOrigen="Tierra";
		Fruta.SoyUnMetodoGlobal();
		
	}

}
