package service;

import java.util.List;


import dto.MstKaryawanHeaderDto;

public interface MstKaryawanSvc {
	
	public List<MstKaryawanHeaderDto> findAllKaryawanDto();

	public void save(MstKaryawanHeaderDto mstKaryawanHeaderDto);

	public void update(MstKaryawanHeaderDto mstKaryawanHeaderDto);

	public void delete(String nik);

	public MstKaryawanHeaderDto findOne(String nik);

}
