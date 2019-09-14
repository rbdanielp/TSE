package com.clases;

	import java.util.ArrayList;
	import java.util.List;

	public class Noticia {
		private int id;
		private String descripcion;
		private String titulo;
		private List<Publicacion> publicacion;
		
		public Noticia() {
			super();
		}

		public Noticia(int id, String descripcion, String titulo) {
			super();
			this.id = id;
			this.descripcion = descripcion;
			this.titulo = titulo;
			this.publicacion = new ArrayList<Publicacion>();
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getDescripcion() {
			return descripcion;
		}

		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public List<Publicacion> getPublicacion() {
			return publicacion;
		}

		public void setPublicacion(List<Publicacion> publicacion) {
			this.publicacion = publicacion;
		}
	}

