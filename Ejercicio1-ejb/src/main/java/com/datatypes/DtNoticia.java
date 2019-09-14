package com.datatypes;

import java.io.Serializable;
import java.util.List;


public class DtNoticia implements Serializable{

	private static final long serialVersionUID = 1L;

	
	private int id;
	private String descripcion;
	private String titulo;
	private List<DtPublicacion> publicacion;
	
	public DtNoticia() {
		super();
	}
	public DtNoticia(int id, String descripcion, String titulo, List<DtPublicacion> publicacion) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.titulo = titulo;
		this.publicacion = publicacion;
	}
	public int getId() {
		return id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public String getTitulo() {
		return titulo;
	}
	public List<DtPublicacion> getPublicacion() {
		return publicacion;
	}
}
