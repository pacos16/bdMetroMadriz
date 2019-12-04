package modelo;
// Generated 2 dic. 2019 23:08:30 by Hibernate Tools 5.4.7.Final

import java.util.HashSet;
import java.util.Set;

/**
 * TEstaciones generated by hbm2java
 */
public class TEstaciones implements java.io.Serializable {

	private int codEstacion;
	private String nombre;
	private String direccion;
	private Integer numaccesos;
	private Integer numlineas;
	private Integer numviajesdestino;
	private Integer numviajesprocedencia;
	private Set TLineaEstacions = new HashSet(0);
	private Set TAccesoses = new HashSet(0);
	private Set TViajesesForEstaciondestino = new HashSet(0);
	private Set TViajesesForEstacionorigen = new HashSet(0);

	public TEstaciones() {
	}

	public TEstaciones(int codEstacion, String nombre, String direccion) {
		this.codEstacion = codEstacion;
		this.nombre = nombre;
		this.direccion = direccion;
	}

	public TEstaciones(int codEstacion, String nombre, String direccion, Integer numaccesos, Integer numlineas,
			Integer numviajesdestino, Integer numviajesprocedencia, Set TLineaEstacions, Set TAccesoses,
			Set TViajesesForEstaciondestino, Set TViajesesForEstacionorigen) {
		this.codEstacion = codEstacion;
		this.nombre = nombre;
		this.direccion = direccion;
		this.numaccesos = numaccesos;
		this.numlineas = numlineas;
		this.numviajesdestino = numviajesdestino;
		this.numviajesprocedencia = numviajesprocedencia;
		this.TLineaEstacions = TLineaEstacions;
		this.TAccesoses = TAccesoses;
		this.TViajesesForEstaciondestino = TViajesesForEstaciondestino;
		this.TViajesesForEstacionorigen = TViajesesForEstacionorigen;
	}

	public int getCodEstacion() {
		return this.codEstacion;
	}

	public void setCodEstacion(int codEstacion) {
		this.codEstacion = codEstacion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getNumaccesos() {
		return this.numaccesos;
	}

	public void setNumaccesos(Integer numaccesos) {
		this.numaccesos = numaccesos;
	}

	public Integer getNumlineas() {
		return this.numlineas;
	}

	public void setNumlineas(Integer numlineas) {
		this.numlineas = numlineas;
	}

	public Integer getNumviajesdestino() {
		return this.numviajesdestino;
	}

	public void setNumviajesdestino(Integer numviajesdestino) {
		this.numviajesdestino = numviajesdestino;
	}

	public Integer getNumviajesprocedencia() {
		return this.numviajesprocedencia;
	}

	public void setNumviajesprocedencia(Integer numviajesprocedencia) {
		this.numviajesprocedencia = numviajesprocedencia;
	}

	public Set getTLineaEstacions() {
		return this.TLineaEstacions;
	}

	public void setTLineaEstacions(Set TLineaEstacions) {
		this.TLineaEstacions = TLineaEstacions;
	}

	public Set getTAccesoses() {
		return this.TAccesoses;
	}

	public void setTAccesoses(Set TAccesoses) {
		this.TAccesoses = TAccesoses;
	}

	public Set getTViajesesForEstaciondestino() {
		return this.TViajesesForEstaciondestino;
	}

	public void setTViajesesForEstaciondestino(Set TViajesesForEstaciondestino) {
		this.TViajesesForEstaciondestino = TViajesesForEstaciondestino;
	}

	public Set getTViajesesForEstacionorigen() {
		return this.TViajesesForEstacionorigen;
	}

	public void setTViajesesForEstacionorigen(Set TViajesesForEstacionorigen) {
		this.TViajesesForEstacionorigen = TViajesesForEstacionorigen;
	}

}
