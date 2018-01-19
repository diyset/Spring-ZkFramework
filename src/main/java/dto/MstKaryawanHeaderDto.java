package dto;

import java.util.Date;

public class MstKaryawanHeaderDto {

	private String nik;
	private String namaKaryawan;
	private String jenisKelamin;
	private String emailKaryawan;
	private double gajiKaryawan;
	private String kodeKota;
	private Date tanggalJoin;
	private Date tanggalLahir;
	private int usia;
	

	public String getNik() {
		return nik;
	}

	public void setNik(String nik) {
		this.nik = nik;
	}

	public String getNamaKaryawan() {
		return namaKaryawan;
	}

	public void setNamaKaryawan(String namaKaryawan) {
		this.namaKaryawan = namaKaryawan;
	}

	public String getJenisKelamin() {
		return jenisKelamin;
	}

	public void setJenisKelamin(String jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
	}

	public String getEmailKaryawan() {
		return emailKaryawan;
	}

	public void setEmailKaryawan(String emailKaryawan) {
		this.emailKaryawan = emailKaryawan;
	}

	public double getGajiKaryawan() {
		return gajiKaryawan;
	}

	public void setGajiKaryawan(double gajiKaryawan) {
		this.gajiKaryawan = gajiKaryawan;
	}

	public String getKodeKota() {
		return kodeKota;
	}

	public void setKodeKota(String kodeKota) {
		this.kodeKota = kodeKota;
	}

	public Date getTanggalJoin() {
		return tanggalJoin;
	}

	public void setTanggalJoin(Date tanggalJoin) {
		this.tanggalJoin = tanggalJoin;
	}

	public Date getTanggalLahir() {
		return tanggalLahir;
	}

	public void setTanggalLahir(Date tanggalLahir) {
		this.tanggalLahir = tanggalLahir;
	}

	public int getUsia() {
		return usia;
	}

	public void setUsia(int usia) {
		this.usia = usia;
	}

}
