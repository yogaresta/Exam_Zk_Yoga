package service;

import java.util.List;

import dto.MstBilAddressDto;

public interface MstBilAddressService {

	public void save(MstBilAddressDto mstBillAddressDto);
	public List<MstBilAddressDto> findAll();
	public void delete(MstBilAddressDto MstBilAddressDto);
	public MstBilAddressDto findByEmpId(Integer addressId);
	public void update(MstBilAddressDto mstBilAddressDto);
	public MstBilAddressDto findByAddresName(String addresName);
	MstBilAddressDto findByAddressName(String addressName);
}
