package service;

import java.util.List;

import dto.MstKotaDto;
import entity.MstKota;

public interface MstKotaSvc {

	
	public List<MstKotaDto> findAllKota();
	
	public void delete(String kodeKota);
	
	public void save(MstKotaDto mstKotaDto);
	
	public void update(MstKotaDto mstKotaDto);
	
	public MstKotaDto findOneKota(String kodeKota);
	
	public List<MstKotaDto> findAllKotaByProvinsi(String kodeProvinsi);
}
