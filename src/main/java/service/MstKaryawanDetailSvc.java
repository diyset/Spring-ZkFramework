package service;

import java.util.List;

import dto.MstKaryawanDetailDto;
import dto.MstKaryawanHeaderDto;

public interface MstKaryawanDetailSvc {

	public List<MstKaryawanDetailDto> findAllKaryawanDetailDto();
	
	public void save(MstKaryawanDetailDto mstKaryawanDetailDto);

	public void update(MstKaryawanDetailDto mstKaryawanDetailDto);

	public void delete(String idDetail);

	public MstKaryawanHeaderDto findOne(String idDetail); 
}
