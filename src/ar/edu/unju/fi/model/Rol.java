package ar.edu.unju.fi.model;

// Generated 21-oct-2014 19:40:42 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Rol generated by hbm2java
 */
public class Rol implements java.io.Serializable {

	private int rolId;
	private String descripcion;
	private Set usuarios = new HashSet(0);

	public Rol() {
	}

	public Rol(int rolId) {
		this.rolId = rolId;
	}

	public Rol(int rolId, String descripcion, Set usuarios) {
		this.rolId = rolId;
		this.descripcion = descripcion;
		this.usuarios = usuarios;
	}

	public int getRolId() {
		return this.rolId;
	}

	public void setRolId(int rolId) {
		this.rolId = rolId;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Set getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(Set usuarios) {
		this.usuarios = usuarios;
	}
	@Override
	public String toString() {
		return descripcion;
	}

}
