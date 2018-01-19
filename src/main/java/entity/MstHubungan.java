package entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="mst_hubungan")
@IdClass(MstHubunganPk.class)
public class MstHubungan implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int idHubungan;
	private String jenisHubungan;
	
	@Id
	@Column(name="ID_HUBUNGAN")
	public int getIdHubungan() {
		return idHubungan;
	}
	public void setIdHubungan(int idHubungan) {
		this.idHubungan = idHubungan;
	}
	@Column(name="JENIS_HUBUNGAN")
	public String getJenisHubungan() {
		return jenisHubungan;
	}
	public void setJenisHubungan(String jenisHubungan) {
		this.jenisHubungan = jenisHubungan;
	}
	
	

}
