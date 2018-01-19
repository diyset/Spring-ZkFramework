package vmd;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zkplus.spring.DelegatingVariableResolver;

import service.MstKaryawanSvc;
import service.MstKotaSvc;
import service.MstProvinsiSvc;
import dto.MstKaryawanHeaderDto;
import dto.MstKotaDto;
import dto.MstProvinsiDto;
import entity.TrKaryawanHeader;

@VariableResolver(DelegatingVariableResolver.class)
public class EditKaryawanVmd {

	private List<MstKotaDto> mstKotaDtos = new ArrayList<>();
	private List<MstProvinsiDto> mstProvinsiDtos = new ArrayList<>();
	private MstKotaDto mstKotaDto = new MstKotaDto();
	private MstProvinsiDto mstProvinsiDto = new MstProvinsiDto();

	private MstKaryawanHeaderDto mstKaryawanHeaderDto = new MstKaryawanHeaderDto();
	private List<MstKaryawanHeaderDto> mstKaryawanHeaderDtos = new ArrayList<>();

	@WireVariable
	private MstKaryawanSvc mstKaryawanSvc;
	@WireVariable
	private MstKotaSvc mstKotaSvc;
	@WireVariable
	private MstProvinsiSvc mstProvinsiSvc;

	@Init
	public void load() {
		mstKaryawanHeaderDto = (MstKaryawanHeaderDto) Sessions.getCurrent()
				.getAttribute("obj");
		if (mstKaryawanHeaderDto.getNik() != null) {
			mstProvinsiDtos = mstProvinsiSvc.findAllProvinsi();
			mstKotaDtos = mstKotaSvc.findAllKota();
			mstKotaDto = mstKotaSvc.findOneKota(mstKaryawanHeaderDto
					.getKodeKota());
			MstProvinsiDto aa = mstProvinsiSvc.findOneProvinsi(mstKotaDto
					.getKodeProvinsi());
			String bb = aa.getKodeProvinsi();
			if (aa != null) {
				mstProvinsiDto.setKodeProvinsi(bb);
				mstProvinsiDto.setNamaProvinsi(aa.getNamaProvinsi());
			}
			findkotaEdit();
		} else {
			mstKotaDtos = mstKotaSvc.findAllKota();
			mstProvinsiDtos = mstProvinsiSvc.findAllProvinsi();
		}
	}
	@Command("save")
	public void save() {
		MstKaryawanHeaderDto mstKaryawanFindOne = new MstKaryawanHeaderDto();
		mstKaryawanFindOne = mstKaryawanSvc.findOne(mstKaryawanHeaderDto
				.getNik());
		mstKaryawanFindOne.setKodeKota(mstKotaDto.getKodeKota());

		if (mstKaryawanFindOne.getNik() == null) {
			mstKaryawanHeaderDto.setKodeKota(mstKotaDto.getKodeKota());
			mstKaryawanSvc.save(mstKaryawanHeaderDto);
			Clients.showNotification("Data Berhasil Di Simpan",
					Clients.NOTIFICATION_TYPE_INFO, null, null, 1500);
			Executions.sendRedirect("/karyawan.zul");
		} else if (mstKaryawanFindOne.getNik() != null) {
			mstKaryawanSvc.update(mstKaryawanHeaderDto);
			Clients.showNotification("Data Berhasil Di Edit",
					Clients.NOTIFICATION_TYPE_INFO, null, null, 1500);
			Executions.sendRedirect("/karyawan.zul");
		}
	}
	
	@Command("back")
	public void back(){
		Executions.getCurrent().sendRedirect("/karyawan.zul");
	}

	@Command("findkota")
	@NotifyChange({ "mstKotaDtos", "mstKotaDto" })
	public void findkota() {
		mstKotaDto = null;
		String kode = mstProvinsiDto.getKodeProvinsi();
		mstKotaDtos = mstKotaSvc.findAllKotaByProvinsi(kode);
	}

	@Command("findkotaEdit")
	@NotifyChange({ "mstKotaDtos", "mstKotaDto" })
	public void findkotaEdit() {
		// mstKota=null;
		String kode = mstProvinsiDto.getKodeProvinsi();
		mstKotaDtos = mstKotaSvc.findAllKotaByProvinsi(kode);
	}
	
	public int calculateUsia(){
		int UsiaTemp = mstKaryawanHeaderDto.getTanggalLahir().getYear() - new Date().getYear();
		return UsiaTemp;
	}

	public List<MstKotaDto> getMstKotaDtos() {
		return mstKotaDtos;
	}

	public void setMstKotaDtos(List<MstKotaDto> mstKotaDtos) {
		this.mstKotaDtos = mstKotaDtos;
	}

	public List<MstProvinsiDto> getMstProvinsiDtos() {
		return mstProvinsiDtos;
	}

	public void setMstProvinsiDtos(List<MstProvinsiDto> mstProvinsiDtos) {
		this.mstProvinsiDtos = mstProvinsiDtos;
	}

	public MstKotaDto getMstKotaDto() {
		return mstKotaDto;
	}

	public void setMstKotaDto(MstKotaDto mstKotaDto) {
		this.mstKotaDto = mstKotaDto;
	}

	public MstProvinsiDto getMstProvinsiDto() {
		return mstProvinsiDto;
	}

	public void setMstProvinsiDto(MstProvinsiDto mstProvinsiDto) {
		this.mstProvinsiDto = mstProvinsiDto;
	}

	public MstKaryawanHeaderDto getMstKaryawanHeaderDto() {
		return mstKaryawanHeaderDto;
	}

	public void setMstKaryawanHeaderDto(
			MstKaryawanHeaderDto mstKaryawanHeaderDto) {
		this.mstKaryawanHeaderDto = mstKaryawanHeaderDto;
	}

	public List<MstKaryawanHeaderDto> getMstKaryawanHeaderDtos() {
		return mstKaryawanHeaderDtos;
	}

	public void setMstKaryawanHeaderDtos(
			List<MstKaryawanHeaderDto> mstKaryawanHeaderDtos) {
		this.mstKaryawanHeaderDtos = mstKaryawanHeaderDtos;
	}

}
