package dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import entity.TrKaryawanHeader;
import entity.TrKaryawanHeaderPk;

public interface MstKaryawanDao extends JpaRepository<TrKaryawanHeader, TrKaryawanHeaderPk> {
	@Query("Select a from TrKaryawanHeader a")
	public List<TrKaryawanHeader> findAllKaryawan();
	
	@Query("select a,b.namaKota from TrKaryawanHeader a, MstKota b where a.kodeKota = b.kodeKota")
	public List<Object[]> findAllKaryawanObject();
	
	@Query("select a from TrKaryawanHeader a where a.nik = :nik")
	public TrKaryawanHeader findOneKaryawanHeader(@Param("nik")String nik);
}
