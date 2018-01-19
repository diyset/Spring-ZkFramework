package entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "tr_karyawan_header")
@IdClass(TrKaryawanHeaderPk.class)
public class TrKaryawanHeader implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String nik;
	private String namaKaryawan;
	private String jenisKelamin;
	private String emailKaryawan;
	private double gajiKaryawan;
	private String kodeKota;
	private Date tanggalJoin;
	private Date tanggalLahir;
	private int usia;

	@Id
	@Column(name = "NIK")
	public String getNik() {
		return nik;
	}

	public void setNik(String nik) {
		this.nik = nik;
	}

	@Column(name = "NAMA_KARYAWAN")
	public String getNamaKaryawan() {
		return namaKaryawan;
	}

	public void setNamaKaryawan(String namaKaryawan) {
		this.namaKaryawan = namaKaryawan;
	}

	@Column(name = "JENIS_KELAMIN")
	public String getJenisKelamin() {
		return jenisKelamin;
	}

	public void setJenisKelamin(String jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
	}

	@Column(name = "EMAIL_KARYAWAN")
	public String getEmailKaryawan() {
		return emailKaryawan;
	}

	public void setEmailKaryawan(String emailKaryawan) {
		this.emailKaryawan = emailKaryawan;
	}

	@Column(name = "GAJI_KARYAWAN")
	public double getGajiKaryawan() {
		return gajiKaryawan;
	}

	public void setGajiKaryawan(double gajiKaryawan) {
		this.gajiKaryawan = gajiKaryawan;
	}

	@Column(name = "KODE_KOTA")
	public String getKodeKota() {
		return kodeKota;
	}

	public void setKodeKota(String kodeKota) {
		this.kodeKota = kodeKota;
	}

	@Column(name = "TANGGAL_JOIN")
	public Date getTanggalJoin() {
		return tanggalJoin;
	}

	public void setTanggalJoin(Date tanggalJoin) {
		this.tanggalJoin = tanggalJoin;
	}

	@Column(name = "TANGGAL_LAHIR_KARYAWAN")
	public Date getTanggalLahir() {
		return tanggalLahir;
	}

	public void setTanggalLahir(Date tanggalLahir) {
		this.tanggalLahir = tanggalLahir;
	}

	@Column(name = "USIA")
	public int getUsia() {
		return usia;
	}

	public void setUsia(int usia) {
		this.usia = usia;
	}

}
