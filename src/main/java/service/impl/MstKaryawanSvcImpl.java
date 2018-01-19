package service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.MstKaryawanDao;
import dto.MstKaryawanHeaderDto;
import entity.TrKaryawanHeader;
import entity.TrKaryawanHeaderPk;
import service.MstKaryawanSvc;

@Service("mstKaryawanSvc")
@Transactional
public class MstKaryawanSvcImpl implements MstKaryawanSvc {

	@Autowired
	MstKaryawanDao mstKaryawanDao;

	@Override
	public List<MstKaryawanHeaderDto> findAllKaryawanDto() {
		// TODO Auto-generated method stub
		List<Object[]> listObject = mstKaryawanDao.findAllKaryawanObject();
		List<MstKaryawanHeaderDto> mstKaryawanHeaderDtos = new ArrayList<>();

		for (Object[] objects : listObject) {
			MstKaryawanHeaderDto karyawanHeaderDto = new MstKaryawanHeaderDto();
			TrKaryawanHeader tk = (TrKaryawanHeader) objects[0];
			karyawanHeaderDto.setNamaKaryawan(tk.getNamaKaryawan());
			karyawanHeaderDto.setEmailKaryawan(tk.getEmailKaryawan());
			karyawanHeaderDto.setGajiKaryawan(tk.getGajiKaryawan());
			karyawanHeaderDto.setKodeKota(tk.getKodeKota());
			karyawanHeaderDto.setNik(tk.getNik());
			karyawanHeaderDto.setJenisKelamin(tk.getJenisKelamin());
			karyawanHeaderDto.setUsia(tk.getUsia());
			karyawanHeaderDto.setTanggalJoin(tk.getTanggalJoin());
			karyawanHeaderDto.setTanggalLahir(tk.getTanggalLahir());
			mstKaryawanHeaderDtos.add(karyawanHeaderDto);
		}

		return mstKaryawanHeaderDtos;
	}

	@Override
	public void save(MstKaryawanHeaderDto mstKaryawanHeaderDto) {
		// TODO Auto-generated method stub
		TrKaryawanHeader trKaryawanHeader = new TrKaryawanHeader();
		
		trKaryawanHeader.setEmailKaryawan(mstKaryawanHeaderDto
				.getEmailKaryawan());
		trKaryawanHeader
				.setGajiKaryawan(mstKaryawanHeaderDto.getGajiKaryawan());
		trKaryawanHeader
				.setJenisKelamin(mstKaryawanHeaderDto.getJenisKelamin());
		trKaryawanHeader.setKodeKota(mstKaryawanHeaderDto.getKodeKota());
		trKaryawanHeader
				.setNamaKaryawan(mstKaryawanHeaderDto.getNamaKaryawan());
		trKaryawanHeader.setNik(mstKaryawanHeaderDto.getNik());
		trKaryawanHeader.setTanggalJoin(mstKaryawanHeaderDto.getTanggalJoin());
		trKaryawanHeader
				.setTanggalLahir(mstKaryawanHeaderDto.getTanggalLahir());
		trKaryawanHeader.setUsia(mstKaryawanHeaderDto.getUsia());

		mstKaryawanDao.save(trKaryawanHeader);

	}

	@Override
	public void update(MstKaryawanHeaderDto mstKaryawanHeaderDto) {
		// TODO Auto-generated method stub
		TrKaryawanHeader trKaryawanHeader = new TrKaryawanHeader();
		trKaryawanHeader.setEmailKaryawan(mstKaryawanHeaderDto
				.getEmailKaryawan());
		trKaryawanHeader
				.setGajiKaryawan(mstKaryawanHeaderDto.getGajiKaryawan());
		trKaryawanHeader
				.setJenisKelamin(mstKaryawanHeaderDto.getJenisKelamin());
		trKaryawanHeader.setKodeKota(mstKaryawanHeaderDto.getKodeKota());
		trKaryawanHeader
				.setNamaKaryawan(mstKaryawanHeaderDto.getNamaKaryawan());
		trKaryawanHeader.setNik(mstKaryawanHeaderDto.getNik());
		trKaryawanHeader.setTanggalJoin(mstKaryawanHeaderDto.getTanggalJoin());
		trKaryawanHeader
				.setTanggalLahir(mstKaryawanHeaderDto.getTanggalLahir());
		trKaryawanHeader.setUsia(mstKaryawanHeaderDto.getUsia());

		mstKaryawanDao.save(trKaryawanHeader);
	}

	@Override
	public void delete(String nik) {
		// TODO Auto-generated method stub
		TrKaryawanHeaderPk headerPk = new TrKaryawanHeaderPk();
		headerPk.setNik(nik);
		mstKaryawanDao.delete(headerPk);
	}

	@Override
	public MstKaryawanHeaderDto findOne(String nik) {
		// TODO Auto-generated method stub
		TrKaryawanHeader trKaryawanHeader = mstKaryawanDao
				.findOneKaryawanHeader(nik);
		MstKaryawanHeaderDto mstKaryawanHeaderDto = new MstKaryawanHeaderDto();

		if (trKaryawanHeader != null) {
			mstKaryawanHeaderDto.setEmailKaryawan(trKaryawanHeader
					.getEmailKaryawan());
			mstKaryawanHeaderDto.setGajiKaryawan(trKaryawanHeader
					.getGajiKaryawan());
			mstKaryawanHeaderDto.setJenisKelamin(trKaryawanHeader
					.getJenisKelamin());
			mstKaryawanHeaderDto.setKodeKota(trKaryawanHeader.getKodeKota());
			mstKaryawanHeaderDto.setNamaKaryawan(trKaryawanHeader
					.getNamaKaryawan());
			mstKaryawanHeaderDto.setNik(trKaryawanHeader.getNik());
			mstKaryawanHeaderDto.setTanggalJoin(trKaryawanHeader
					.getTanggalJoin());
			mstKaryawanHeaderDto.setTanggalLahir(trKaryawanHeader
					.getTanggalLahir());
			mstKaryawanHeaderDto.setUsia(trKaryawanHeader.getUsia());
			return mstKaryawanHeaderDto;
		}

		return mstKaryawanHeaderDto;
	}

}
