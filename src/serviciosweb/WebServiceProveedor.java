/**
 * WebServiceProveedor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package serviciosweb;

public interface WebServiceProveedor extends java.rmi.Remote {
    public java.lang.String busquedaSimple(java.lang.String busqueda) throws java.rmi.RemoteException, org.orm.PersistentException;
    public java.lang.String busquedaAvanzada(java.lang.String run, java.lang.String nombre, java.lang.String apellido, java.lang.String mail, java.lang.String telefono, java.lang.String pais, java.lang.String region, java.lang.String ciudad) throws java.rmi.RemoteException, org.orm.PersistentException;
}
