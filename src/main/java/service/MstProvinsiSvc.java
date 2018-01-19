package service;

import java.util.List;

import dto.MstProvinsiDto;
import entity.MstProvinsi;

public interface MstProvinsiSvc {

	public List<MstProvinsiDto> findAllProvinsi();
	
	public MstProvinsiDto findOneProvinsi(String kodeProvinsi);
	
}
