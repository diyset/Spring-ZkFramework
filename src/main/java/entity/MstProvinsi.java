package entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "mst_provinsi")
@IdClass(MstProvinsiPk.class)
public class MstProvinsi implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String kodeProvinsi;
	private String namaProvinsi;
	@Id
	@Column(name="KODE_PROVINSI")
	public String getKodeProvinsi() {
		return kodeProvinsi;
	}

	public void setKodeProvinsi(String kodeProvinsi) {
		this.kodeProvinsi = kodeProvinsi;
	}
	@Column(name="NAMA_PROVINSI")
	public String getNamaProvinsi() {
		return namaProvinsi;
	}

	public void setNamaProvinsi(String namaProvinsi) {
		this.namaProvinsi = namaProvinsi;
	}

}
