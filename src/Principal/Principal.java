package Principal;

import serviciosweb.WebServiceProveedor;
import serviciosweb.WebServiceProveedorServiceLocator;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			
		     WebServiceProveedorServiceLocator Locator = new WebServiceProveedorServiceLocator();
	         WebServiceProveedor ws = Locator.getWebServiceProveedor();
	         String resultadoBusquedaS =ws.busquedaSimple("camila");
	         String resultadoBusquedaA=ws.busquedaAvanzada("10.592.444-5", "", "", "", "", "", "", "");

	        if(resultadoBusquedaA!= null ){    
	        System.out.println("resultado busqueda Avanzada: " +resultadoBusquedaA);
	        }
	       
	        if(resultadoBusquedaS!= null ){    
	        System.out.println("resultado busqueda Simple: " +resultadoBusquedaS);
	             }      
	         
		  } catch (Exception e) {

	          e.printStackTrace();
		  
	    }
		}

	}


