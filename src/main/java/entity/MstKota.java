package entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "mst_kota")
@IdClass(MstKotaPk.class)
public class MstKota implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String kodeKota;
	private String namaKota;
	private String kodeProvinsi;

	@Id
	@Column(name="KODE_KOTA")
	public String getKodeKota() {
		return kodeKota;
	}

	public void setKodeKota(String kodeKota) {
		this.kodeKota = kodeKota;
	}
	@Column(name="NAMA_KOTA")
	public String getNamaKota() {
		return namaKota;
	}

	public void setNamaKota(String namaKota) {
		this.namaKota = namaKota;
	}
	@Column(name="KODE_PROVINSI")
	public String getKodeProvinsi() {
		return kodeProvinsi;
	}

	public void setKodeProvinsi(String kodeProvinsi) {
		this.kodeProvinsi = kodeProvinsi;
	}

}
