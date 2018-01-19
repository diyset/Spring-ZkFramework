package dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import entity.MstProvinsi;
import entity.MstProvinsiPk;

public interface MstProvinsiDao extends
		JpaRepository<MstProvinsi, MstProvinsiPk> {
	@Query("Select a from MstProvinsi a")
	public List<MstProvinsi> findAllProvinsi();

	@Query("select a from MstProvinsi a where a.kodeProvinsi = :kodeProvinsi")
	public MstProvinsi findOneProvinsi(
			@Param("kodeProvinsi") String kodeProvinsi);

}
