package test;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.MstEmployeeService;
import dao.MstDepartmentDao;
import dto.MstBilAddressDto;
import dto.MstEmployeeDto;
import entity.MstDepartment;
import service.MstBilAddressService;
import entity.enumcol.GenderEnum;

public class TestBilAddress {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/META-INF/spring/app-config.xml");
		
		MstEmployeeService mstEmployeeSvc = context.getBean(MstEmployeeService.class);
		MstDepartmentDao mstDepartmentDao = context.getBean(MstDepartmentDao.class);
		
		MstDepartment dept = mstDepartmentDao.findByDeptName("DIVISI FINANCE");
		
		MstBilAddressDto dto = new MstBilAddressDto();
		dto.setCreatedDate(new Date());
		dto.setCreatedUser("ADMIN");
		dto.setDeleted(false);
		dto.setGender(GenderEnum.MALE);
		dto.setIdAddress(3);
		dto.setAddressName("Rizky");
//		mstKaryawanSvc.save(dto);
		
		dto = mstBilAddressSvc.findByUsername("Haqi");
		System.out.println(dto.getAddressName()  + " USERNAME: " + dto.getAddressName());
	}
}
