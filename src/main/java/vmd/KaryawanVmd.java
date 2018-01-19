package vmd;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.zkoss.bind.BindUtils;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zkplus.spring.DelegatingVariableResolver;
import org.zkoss.zul.Messagebox;
import org.zkoss.zul.Messagebox.Button;
import org.zkoss.zul.Messagebox.ClickEvent;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zul.Messagebox.*;

import service.MstKaryawanSvc;
import service.MstKotaSvc;
import service.MstProvinsiSvc;
import dto.MstKaryawanHeaderDto;
import entity.TrKaryawanHeader;

@VariableResolver(org.zkoss.zkplus.spring.DelegatingVariableResolver.class)
public class KaryawanVmd {

	private List<TrKaryawanHeader> listKaryawan = new ArrayList<>();

	private TrKaryawanHeader trKaryawanHeader = new TrKaryawanHeader();

	private boolean readOnly = false;

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
		mstKaryawanHeaderDtos = mstKaryawanSvc.findAllKaryawanDto();
	}

	@Command("add")
	public void add() {
		mstKaryawanHeaderDto = new MstKaryawanHeaderDto();
		Sessions.getCurrent().setAttribute("obj", mstKaryawanHeaderDto);
		Executions.sendRedirect("/addkaryawan.zul");
	}

	@Command("edit")
	public void edit() {
		if (mstKaryawanHeaderDto.getNik() == null) {
			Messagebox.show("Pilih Data yang akan di edit");
		} else {
			Sessions.getCurrent().setAttribute("obj", mstKaryawanHeaderDto);
			Executions.sendRedirect("/addkaryawan.zul");
		}
	}

	@Command("delete")
	public void delete() {
		if (mstKaryawanHeaderDto.getNik() == null) {
			Messagebox.show("Pilih Data yang akan di delete");
		} else {
			Messagebox.show("Apakah yakin mau di apus?", "perhatian",
					new Button[] { Button.YES, Button.NO },
					Messagebox.QUESTION, Button.NO,
					new EventListener<Messagebox.ClickEvent>() {

						@Override
						public void onEvent(ClickEvent event) throws Exception {
							// TODO Auto-generated method stub
							if (Messagebox.ON_YES.equals(event.getName())) {

								mstKaryawanSvc.delete(mstKaryawanHeaderDto
										.getNik());
								mstKaryawanHeaderDtos
										.remove(mstKaryawanHeaderDto);
								BindUtils.postNotifyChange(null, null,
										KaryawanVmd.this, "customerDtos");
								Clients.showNotification(
										"Data Berhasil di Delete",
										Clients.NOTIFICATION_TYPE_INFO, null,
										null, 500);
							}
						}
					});
		}
	}
	

	
	
	

	public List<TrKaryawanHeader> getListKaryawan() {
		return listKaryawan;
	}

	public void setListKaryawan(List<TrKaryawanHeader> listKaryawan) {
		this.listKaryawan = listKaryawan;
	}

	public TrKaryawanHeader getTrKaryawanHeader() {
		return trKaryawanHeader;
	}

	public void setTrKaryawanHeader(TrKaryawanHeader trKaryawanHeader) {
		this.trKaryawanHeader = trKaryawanHeader;
	}

	public boolean isReadOnly() {
		return readOnly;
	}

	public void setReadOnly(boolean readOnly) {
		this.readOnly = readOnly;
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

	public MstKaryawanSvc getMstKaryawanSvc() {
		return mstKaryawanSvc;
	}

	public void setMstKaryawanSvc(MstKaryawanSvc mstKaryawanSvc) {
		this.mstKaryawanSvc = mstKaryawanSvc;
	}

	public MstKotaSvc getMstKotaSvc() {
		return mstKotaSvc;
	}

	public void setMstKotaSvc(MstKotaSvc mstKotaSvc) {
		this.mstKotaSvc = mstKotaSvc;
	}

	public MstProvinsiSvc getMstProvinsiSvc() {
		return mstProvinsiSvc;
	}

	public void setMstProvinsiSvc(MstProvinsiSvc mstProvinsiSvc) {
		this.mstProvinsiSvc = mstProvinsiSvc;
	}

}
