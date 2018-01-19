package dto;

import java.util.Date;

public class MstKaryawanDetailDto {

	private int idDetail;
	private int idHubungan;
	private int idPendidikan;

	private String namaKeluarga;
	private String nik;
	private Date tanggalLahir;

	public int getIdDetail() {
		return idDetail;
	}

	public void setIdDetail(int idDetail) {
		this.idDetail = idDetail;
	}

	public int getIdHubungan() {
		return idHubungan;
	}

	public void setIdHubungan(int idHubungan) {
		this.idHubungan = idHubungan;
	}

	public int getIdPendidikan() {
		return idPendidikan;
	}

	public void setIdPendidikan(int idPendidikan) {
		this.idPendidikan = idPendidikan;
	}

	public String getNamaKeluarga() {
		return namaKeluarga;
	}

	public void setNamaKeluarga(String namaKeluarga) {
		this.namaKeluarga = namaKeluarga;
	}

	public String getNik() {
		return nik;
	}

	public void setNik(String nik) {
		this.nik = nik;
	}

	public Date getTanggalLahir() {
		return tanggalLahir;
	}

	public void setTanggalLahir(Date tanggalLahir) {
		this.tanggalLahir = tanggalLahir;
	}

}
