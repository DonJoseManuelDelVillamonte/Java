package com.orange.modelo;

import com.orange.modelo.interfaces.IDeportista;

public class Rugbier implements IDeportista{

	private String nombre;
	private String posicion;
	private int edad;
	
	public Rugbier(String nombre, String posicion, int edad) {
		super();
		this.nombre = nombre;
		this.posicion = posicion;
		this.edad = edad;
		
	public Rugbier() {
		
	}
	@Override
	public void crearDeportista() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IDeportista[] crearDeportistas() {
		// TODO Auto-generated method stub
		return null;
	}
}
