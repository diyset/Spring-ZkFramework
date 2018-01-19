package entity;

import java.io.Serializable;


public class MstKotaPk implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String kodeKota;
	
	public MstKotaPk() {
		// TODO Auto-generated constructor stub
	}

	public String getKodeKota() {
		return kodeKota;
	}

	public void setKodeKota(String kodeKota) {
		this.kodeKota = kodeKota;
	}
	
}
