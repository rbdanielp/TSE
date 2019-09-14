package com.clases;

public class Publicacion {
	private int id;
	private String tipo;
	private String url;
	private Noticia noticia;
	
	public Publicacion() {
		super();
	}
	public Publicacion(int id, String tipo, String url, Noticia noticia) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.url = url;
		this.noticia = noticia;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Noticia getNoticia() {
		return noticia;
	}
	public void setNoticia(Noticia noticia) {
		this.noticia = noticia;
	}
}
