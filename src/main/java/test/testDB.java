package test;

import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.zkoss.zul.South;

import dao.MstKaryawanDao;
import dao.MstKaryawanDetailDao;
import dto.MstKaryawanDetailDto;
import entity.TrKaryawanDetail;
import entity.TrKaryawanHeader;

public class testDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"/META-INF/spring/app-config.xml");

		MstKaryawanDao mstKaryawanDao = ctx.getBean(MstKaryawanDao.class);
		MstKaryawanDetailDao mstKaryawanDetailDao = ctx.getBean(MstKaryawanDetailDao.class);

		List<TrKaryawanHeader> listKaryawan = mstKaryawanDao.findAllKaryawan();
		List<Object[]> listKaryawanObject = mstKaryawanDao
				.findAllKaryawanObject();
		
//		TrKaryawanDetail trKaryawanDetail = new TrKaryawanDetail();
//		trKaryawanDetail.setIdHubungan(1);
//		trKaryawanDetail.setIdPendidikan(1);
//		trKaryawanDetail.setNamaKeluarga("Sanak Familly");
//		trKaryawanDetail.setNik("111122");
//		trKaryawanDetail.setTanggalLahir(new Date());
//		mstKaryawanDetailDao.save(trKaryawanDetail);

		for (Object[] objects : listKaryawanObject) {
			TrKaryawanHeader trKaryawanHeader = (TrKaryawanHeader) objects[0];
			System.out.println(trKaryawanHeader.getNik()+"|"+trKaryawanHeader.getNamaKaryawan() + "|"
					+ objects[1].toString());
		}

		for (TrKaryawanHeader trKaryawanHeader : listKaryawan) {
			System.out.println(trKaryawanHeader.getNamaKaryawan());
			System.out.println(trKaryawanHeader.getKodeKota());
		}
		
	
	}

}
