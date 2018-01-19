package dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import entity.MstHubungan;
import entity.MstHubunganPk;

public interface MstHubunganDao extends
		JpaRepository<MstHubungan, MstHubunganPk> {
	@Query("select a from MstHubungan a")
	public List<MstHubungan> findAllHubungan();

	@Query("select a from MstHubungan a where a.idHubungan = :idHubungan")
	public MstHubungan findOneHubungan(@Param("idHubungan") int idHubungan);
}
