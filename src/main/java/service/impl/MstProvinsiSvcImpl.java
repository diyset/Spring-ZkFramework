package service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.MstProvinsiDao;
import dto.MstProvinsiDto;
import entity.MstProvinsi;

import service.MstProvinsiSvc;

@Service("mstProvinsiSvc")
@Transactional
public class MstProvinsiSvcImpl implements MstProvinsiSvc {

	@Autowired
	MstProvinsiDao mstProvinsiDao;

	@Override
	public List<MstProvinsiDto> findAllProvinsi() {
		// TODO Auto-generated method stub
		List<MstProvinsi> listObject = mstProvinsiDao.findAllProvinsi();
		List<MstProvinsiDto> mstProvinsiDtos = new ArrayList<>();

		for (MstProvinsi mstProvinsi: listObject) {
			MstProvinsiDto mstProvinsiDto = new MstProvinsiDto();
			mstProvinsiDto.setKodeProvinsi(mstProvinsi.getKodeProvinsi());
			mstProvinsiDto.setNamaProvinsi(mstProvinsi.getNamaProvinsi());
			
			
			mstProvinsiDtos.add(mstProvinsiDto);
		}
		return mstProvinsiDtos;
	}


	@Override
	public MstProvinsiDto findOneProvinsi(String kodeProvinsi) {
		// TODO Auto-generated method stub
		MstProvinsi mp = mstProvinsiDao.findOneProvinsi(kodeProvinsi);
		MstProvinsiDto provinsiDto = new MstProvinsiDto();
		if (mp != null) {
			provinsiDto.setKodeProvinsi(mp.getKodeProvinsi());
			provinsiDto.setNamaProvinsi(mp.getNamaProvinsi());
			return provinsiDto;
		}
		return provinsiDto;
	}

}
