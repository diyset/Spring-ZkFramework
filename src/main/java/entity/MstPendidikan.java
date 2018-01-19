package entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "mst_pendidikan")
@IdClass(MstPendidikanPk.class)
public class MstPendidikan implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int idPendidikan;
	private String jenisPendidikan;

	@Id
	@Column(name = "ID_PENDIDIKAN")
	public int getIdPendidikan() {
		return idPendidikan;
	}

	public void setIdPendidikan(int idPendidikan) {
		this.idPendidikan = idPendidikan;
	}

	@Column(name = "JENIS_PENDIDIKAN")
	public String getJenisPendidikan() {
		return jenisPendidikan;
	}

	public void setJenisPendidikan(String jenisPendidikan) {
		this.jenisPendidikan = jenisPendidikan;
	}

}
