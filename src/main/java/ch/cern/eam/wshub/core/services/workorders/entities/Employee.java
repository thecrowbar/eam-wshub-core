package ch.cern.eam.wshub.core.services.workorders.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "R5PERSONNEL")
public class Employee implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "PER_CODE")
	private String code;

	@Column(name = "PER_DESC")
	private String description;
	
	@Column(name = "PER_PHONE")
	private String phone;
	
	@Column(name = "PER_MOBILEPHONENO")
	private String mobilePhone;
	
	@Column(name = "PER_ADDRESS")
	private String address;
	
	@Column(name = "PER_CLASS")
	private String clazz;
	
	@Column(name = "PER_MRC")
	private String MRC;
	
	@Column(name = "PER_EMAILADDRESS")
	private String email;
	
	@Column(name = "PER_UDFNUM01")
	private String supervisor;

	@Column(name = "PER_USER")
	private String userCode;
	
	@Column(name = "PER_TRADE")
	private String trade;
	
	@Column(name = "PER_UDFCHAR02")
	private String department;
	
	@Column(name = "PER_UDFCHAR03")
	private String group;
	
	@Column(name = "PER_UDFCHAR04")
	private String section;

	private String outOfService;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getClazz() {
		return clazz;
	}

	public void setClazz(String clazz) {
		this.clazz = clazz;
	}

	public String getMRC() {
		return MRC;
	}

	public void setMRC(String mRC) {
		MRC = mRC;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor;
	}
	
	public String getUserCode() {
		return this.userCode;
	}
	
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getTrade() {
		return trade;
	}

	public void setTrade(String trade) {
		this.trade = trade;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getOutOfService() {
		return outOfService;
	}

	public void setOutOfService(String outOfService) {
		this.outOfService = outOfService;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((MRC == null) ? 0 : MRC.hashCode());
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((clazz == null) ? 0 : clazz.hashCode());
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((group == null) ? 0 : group.hashCode());
		result = prime * result + ((mobilePhone == null) ? 0 : mobilePhone.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((section == null) ? 0 : section.hashCode());
		result = prime * result + ((supervisor == null) ? 0 : supervisor.hashCode());
		result = prime * result + ((trade == null) ? 0 : trade.hashCode());
		result = prime * result + ((userCode == null) ? 0 : userCode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (MRC == null) {
			if (other.MRC != null)
				return false;
		} else if (!MRC.equals(other.MRC))
			return false;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (clazz == null) {
			if (other.clazz != null)
				return false;
		} else if (!clazz.equals(other.clazz))
			return false;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (group == null) {
			if (other.group != null)
				return false;
		} else if (!group.equals(other.group))
			return false;
		if (mobilePhone == null) {
			if (other.mobilePhone != null)
				return false;
		} else if (!mobilePhone.equals(other.mobilePhone))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (section == null) {
			if (other.section != null)
				return false;
		} else if (!section.equals(other.section))
			return false;
		if (supervisor == null) {
			if (other.supervisor != null)
				return false;
		} else if (!supervisor.equals(other.supervisor))
			return false;
		if (trade == null) {
			if (other.trade != null)
				return false;
		} else if (!trade.equals(other.trade))
			return false;
		if (userCode == null) {
			if (other.userCode != null)
				return false;
		} else if (!userCode.equals(other.userCode))
			return false;
		return true;
	}
	
	
	@Override
	public String toString() {
		return "Employee [code=" + code + ", description=" + description + ", phone=" + phone + ", mobilePhone="
				+ mobilePhone + ", address=" + address + ", clazz=" + clazz + ", MRC=" + MRC + ", email=" + email
				+ ", supervisor=" + supervisor + ", userCode=" + userCode + ", trade=" + trade + ", department="
				+ department + ", group=" + group + ", section=" + section + "]";
	}

}
