package vmd;

import java.util.ArrayList;
import java.util.List;

import org.zkoss.bind.BindUtils;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zul.Include;
import org.zkoss.zul.Messagebox;

import service.MstBilAddressService;
import dto.MstBilAddressDto;

@VariableResolver(org.zkoss.zkplus.spring.DelegatingVariableResolver.class)
public class BilAddressVmd {

	private List<MstBilAddressDto> listBilAddress = new ArrayList<MstBilAddressDto>();
	private MstBilAddressDto mstBilAddressDto = new MstBilAddressDto();
	private boolean readonly = false;
	
	@WireVariable
	private MstBilAddressService mstBilAddressSvc;
	
	@Init
	public void load(){
		listBilAddress = mstBilAddressSvc.findAll();
	}
	
	@Command(value="add")
	public void add(){
		MstBilAddressDto mstBilAddress = new MstBilAddressDto();
		
		Sessions.getCurrent().setAttribute("objBilAddress", mstBilAddressDto);
		
		Include inc = (Include) Executions.getCurrent().getDesktop().getPage("index").getFellow("mainInclude");
		
		inc.setSrc("/master/biladdress/biladdressedit.zul");
	}
	
	@Command(value="edit")
	public void edit(){
		
		if(mstBilAddressDto == null && mstBilAddressDto.getIdAddress() == null){
			Messagebox.show("Pilih data yang akan diedit");
		}
		else{
			Sessions.getCurrent().setAttribute("objBilAddress", mstBilAddressDto);
			Include inc = (Include) Executions.getCurrent().getDesktop().getPage("index").getFellow("mainInclude");
			inc.setSrc("/master/biladdress/biladdressedit.zul");
		}
		
	}
	
	@Command("delete")
	public void delete(){
		if(mstBilAddressDto == null && mstBilAddressDto.getIdAddress() == null){
			Messagebox.show("Pilih data yang akan di delete");
		}
		else{
			mstBilAddressSvc.delete(mstBilAddressDto);
			listBilAddress.remove(mstBilAddressDto);
			BindUtils.postNotifyChange(null, null, BilAddressVmd.this, "listBilAddress");
			Clients.showNotification("Data Berhasil di Delete", Clients.NOTIFICATION_TYPE_INFO, null, null, 500);
		}
	}
}
