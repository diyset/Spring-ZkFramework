package dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import entity.MstKota;
import entity.MstKotaPk;

public interface MstKotaDao extends JpaRepository<MstKota, MstKotaPk> {
	@Query("select a from MstKota a")
	public List<MstKota> findAllKota();

	@Query("select a from MstKota a where a.kodeKota = :kodeKota")
	public MstKota findOneKota(@Param("kodeKota") String kodeKota);

	@Query("select a from MstKota a where a.kodeProvinsi = :kodeProvinsi")
	public List<MstKota> findKotaByIdProvinsi(
			@Param("kodeProvinsi") String kodeProvinsi);
}
