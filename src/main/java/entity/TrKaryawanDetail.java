package entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "tr_karyawan_detail")
@IdClass(TrKaryawanDetailPk.class)
public class TrKaryawanDetail implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int idDetail;
	private int idHubungan;
	private int idPendidikan;

	private String namaKeluarga;
	private String nik;
	private Date tanggalLahir;

	@Id
	@Column(name = "ID_DETAIL")
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getIdDetail() {
		return idDetail;
	}

	public void setIdDetail(int idDetail) {
		this.idDetail = idDetail;
	}

	@Column(name = "ID_HUBUNGAN")
	public int getIdHubungan() {
		return idHubungan;
	}

	public void setIdHubungan(int idHubungan) {
		this.idHubungan = idHubungan;
	}

	@Column(name = "ID_PENDIDIKAN")
	public int getIdPendidikan() {
		return idPendidikan;
	}

	public void setIdPendidikan(int idPendidikan) {
		this.idPendidikan = idPendidikan;
	}

	@Column(name = "NAMA_KELUARGa")
	public String getNamaKeluarga() {
		return namaKeluarga;
	}

	public void setNamaKeluarga(String namaKeluarga) {
		this.namaKeluarga = namaKeluarga;
	}

	@Column(name = "NIK")
	public String getNik() {
		return nik;
	}

	public void setNik(String nik) {
		this.nik = nik;
	}

	@Column(name = "TANGGAL_LAHIR")
	public Date getTanggalLahir() {
		return tanggalLahir;
	}

	public void setTanggalLahir(Date tanggalLahir) {
		this.tanggalLahir = tanggalLahir;
	}

}
