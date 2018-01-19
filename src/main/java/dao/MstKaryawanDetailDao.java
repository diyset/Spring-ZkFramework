package dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import entity.TrKaryawanDetail;
import entity.TrKaryawanDetailPk;

public interface MstKaryawanDetailDao extends
		JpaRepository<TrKaryawanDetail, TrKaryawanDetailPk> {

	@Query("select a from TrKaryawanDetail a")
	public List<TrKaryawanDetail> findAllKaryawanDetail();

	@Query("select a from TrKaryawanDetail a where a.idDetail = :idDetail")
	public TrKaryawanDetail findOneKaryawanDetail(
			@Param("idDetail")Integer idDetail);
}
