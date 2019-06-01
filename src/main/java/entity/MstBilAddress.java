//package entity;
//
//import java.io.Serializable;
//import java.math.BigDecimal;
//import java.util.Date;
//
//import javax.persistence.Column;
//import javax.persistence.Id;
//import javax.persistence.ManyToOne;
//
//import component.BaseEntity;
//import entity.enumcol.GenderEnum;
//import entity.enumcol.ProductCategoryEnum;
//
//public class MstBilAddress extends BaseEntity implements Serializable{
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = -7865347181874217794L;
//
//	@Id
//	@Column(name="id_address")
//	private Integer idAddress;
//	
//	@Column(name="address_name")
//	private String addressName;
//	
//	
//	@Column(name="gender")
//	private GenderEnum gender;
//	@Column(name="job")
//	private GenderEnum job;
//
//
//	public Integer getIdAddress() {
//		return idAddress;
//	}
//
//	public void setIdAddress(Integer idAddress) {
//		this.idAddress = idAddress;
//	}
//
//	public String getAddressName() {
//		return addressName;
//	}
//
//	public void setAddressName(String addressName) {
//		this.addressName = addressName;
//	}
//
//	public GenderEnum getGender() {
//		return gender;
//	}
//
//	public void setGender(GenderEnum gender) {
//		this.gender = gender;
//	}
//
//	public GenderEnum getJob() {
//		return job;
//	}
//
//	public void setJob(GenderEnum job) {
//		this.job = job;
//	}
//	
//}
