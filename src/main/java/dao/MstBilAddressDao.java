//package dao;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//
//import entity.MstBilAddress;
//import entity.pk.MstEmployeePk;
//
//public interface MstBilAddressDao extends 
//JpaRepository<MstBilAddress, MstEmployeePk>{
//
//	//join
//@Query(value="SELECT p FROM MstBilAddress p, MstUser a WHERE p.username = a.addressName AND p.addressName = :username")
//public MstBilAddress findByAddressName(@Param("addressName") String username);
//
//}
