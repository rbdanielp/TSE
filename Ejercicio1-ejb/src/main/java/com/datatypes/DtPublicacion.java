package com.datatypes;

import java.io.Serializable;

public class DtPublicacion implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String tipo;
	private String url;
	private int noticia;
	
	public DtPublicacion() {
		super();
	}
	public DtPublicacion(int id, String tipo, String url, int noticia) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.url = url;
		this.noticia = noticia;
	}
	public int getId() {
		return id;
	}
	public String getTipo() {
		return tipo;
	}
	public String getUrl() {
		return url;
	}
	public int getNoticia() {
		return noticia;
	}
}
