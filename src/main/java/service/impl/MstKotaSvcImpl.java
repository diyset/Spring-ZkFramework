package service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.MstKotaDao;
import dao.MstProvinsiDao;
import dto.MstKotaDto;
import entity.MstKota;
import entity.MstKotaPk;
import service.MstKotaSvc;

@Service("mstKotaSvc")
@Transactional
public class MstKotaSvcImpl implements MstKotaSvc {

	@Autowired
	MstKotaDao mstKotaDao;

	@Autowired
	MstProvinsiDao mstProvinsiDao;

	@Override
	public List<MstKotaDto> findAllKota() {
		// TODO Auto-generated method stub
		List<MstKota> mstKotas = mstKotaDao.findAllKota();
		List<MstKotaDto> mstKotaDtos = new ArrayList<>();
		for (MstKota mk : mstKotas) {
			MstKotaDto mstKotaDto = new MstKotaDto();
			mstKotaDto.setKodeKota(mk.getKodeKota());
			mstKotaDto.setKodeProvinsi(mk.getKodeProvinsi());
			mstKotaDto.setNamaKota(mk.getNamaKota());

			mstKotaDtos.add(mstKotaDto);
		}

		return mstKotaDtos;
	}

	@Override
	public void delete(String kodeKota) {
		// TODO Auto-generated method stub
		MstKotaPk mstKotaPK = new MstKotaPk();
		mstKotaPK.setKodeKota(kodeKota);

		mstKotaDao.delete(mstKotaPK);
	}

	@Override
	public void save(MstKotaDto mstKotaDto) {
		// TODO Auto-generated method stub
		MstKota mstKota = new MstKota();

		mstKota.setKodeKota(mstKotaDto.getKodeKota());
		mstKota.setKodeProvinsi(mstKotaDto.getKodeProvinsi());
		mstKota.setNamaKota(mstKotaDto.getNamaKota());

		mstKotaDao.save(mstKota);
	}

	@Override
	public void update(MstKotaDto mstKotaDto) {
		// TODO Auto-generated method stub
		MstKota mstKota = new MstKota();

		mstKota.setKodeKota(mstKotaDto.getKodeKota());
		mstKota.setKodeProvinsi(mstKotaDto.getKodeProvinsi());
		mstKota.setNamaKota(mstKotaDto.getNamaKota());

		mstKotaDao.save(mstKota);

	}

	@Override
	public MstKotaDto findOneKota(String kodeKota) {
		// TODO Auto-generated method stub
		MstKota kota = mstKotaDao.findOneKota(kodeKota);
		MstKotaDto mstKotaDto = new MstKotaDto();
		if (kota != null) {
			mstKotaDto.setKodeKota(kota.getKodeKota());
			mstKotaDto.setKodeProvinsi(kota.getKodeProvinsi());
			mstKotaDto.setNamaKota(kota.getNamaKota());
			return mstKotaDto;
		}
		return mstKotaDto;
	}

	@Override
	public List<MstKotaDto> findAllKotaByProvinsi(String kodeProvinsi) {
		List<MstKota> listObject = mstKotaDao.findKotaByIdProvinsi(kodeProvinsi);
		List<MstKotaDto> mstKotaDtos = new ArrayList<>();
		for (MstKota objects : listObject) {
			MstKotaDto mstKotaDto = new MstKotaDto();
			mstKotaDto.setKodeKota(objects.getKodeKota());
			mstKotaDto.setKodeProvinsi(objects.getKodeProvinsi());
			mstKotaDto.setNamaKota(objects.getNamaKota());

			mstKotaDtos.add(mstKotaDto);
		}

		return mstKotaDtos;
	}

}
