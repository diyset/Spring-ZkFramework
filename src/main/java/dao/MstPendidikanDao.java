package dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import entity.MstPendidikan;
import entity.MstPendidikanPk;

public interface MstPendidikanDao extends
		JpaRepository<MstPendidikan, MstPendidikanPk> {
	@Query("select a from MstPendidikan a")
	public List<MstPendidikan> findAllPendidikan();

	@Query("select a from MstPendidikan a where a.idPendidikan = :idPendidikan")
	public MstPendidikan findOnePendidikan(
			@Param("idPendidikan") int idPendidikan);
}
