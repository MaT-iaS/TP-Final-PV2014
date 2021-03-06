package ar.edu.unju.fi.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import ar.edu.unju.fi.dao.RolUsuarioDAO;
import ar.edu.unju.fi.dao.UsuarioDAO;
import ar.edu.unju.fi.dao.imp.RolUsuarioDAOimp;
import ar.edu.unju.fi.dao.imp.UsuarioDAOImp;
import ar.edu.unju.fi.model.Usuario;

@ManagedBean
@SessionScoped
public class LoginBean {
	public Integer dni;
	public String password;
	public Usuario logedUser;

	public String url() {
		logedUser = null;
		return "login?faces-redirect=true";
	}

	public String ingresar() {
		UsuarioDAO dao = new UsuarioDAOImp();
		RolUsuarioDAO daoRol = new RolUsuarioDAOimp();
		Usuario user = dao.get(dni);
		user.setRol(daoRol.get(user.getRol().getRolId()));
		logedUser = user;
		return "home?faces-redirect=true";
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Usuario getLogedUser() {
		return logedUser;
	}

	public void setLogedUser(Usuario logedUser) {
		this.logedUser = logedUser;
	}

}