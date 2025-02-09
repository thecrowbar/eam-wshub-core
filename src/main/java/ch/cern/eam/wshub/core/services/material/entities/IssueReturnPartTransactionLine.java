package ch.cern.eam.wshub.core.services.material.entities;

import java.io.Serializable;

public class IssueReturnPartTransactionLine implements Serializable {
	private static final long serialVersionUID = 8532103426384418187L;

	private String partCode;
	private String partDesc;
	private String partOrg;
	private String bin;
	private String lot;
	private String transactionQty = "1";
	private String assetIDCode;
	private String assetIDDesc;
	
	public IssueReturnPartTransactionLine() {
	}

	public String getPartCode() {
		return partCode;
	}
	public void setPartCode(String partCode) {
		this.partCode = partCode;
	}
	public String getBin() {
		return bin;
	}
	public void setBin(String bin) {
		this.bin = bin;
	}
	public String getLot() {
		return lot;
	}
	public void setLot(String lot) {
		this.lot = lot;
	}
	public String getTransactionQty() {
		return transactionQty;
	}
	public void setTransactionQty(String transactionQty) {
		this.transactionQty = transactionQty;
	}
	public String getAssetIDCode() {
		return assetIDCode;
	}
	public void setAssetIDCode(String assetIDCode) {
		this.assetIDCode = assetIDCode;
	}
	public String getAssetIDDesc() {
		return assetIDDesc;
	}
	public void setAssetIDDesc(String assetIDDesc) {
		this.assetIDDesc = assetIDDesc;
	}
	public String getPartOrg() {
		return partOrg;
	}
	public void setPartOrg(String partOrg) {
		this.partOrg = partOrg;
	}
	public String getPartDesc() {
		return partDesc;
	}
	public void setPartDesc(String partDesc) {
		this.partDesc = partDesc;
	}
	
	@Override
	public String toString() {
		return "IssueReturnTransactionLine ["
				+ (partCode != null ? "partCode=" + partCode + ", " : "")
				+ (bin != null ? "bin=" + bin + ", " : "")
				+ (lot != null ? "lot=" + lot + ", " : "")
				+ (assetIDCode != null ? "assetIDCode=" + assetIDCode + ", "
						: "") + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((assetIDCode == null) ? 0 : assetIDCode.hashCode());
		result = prime * result + ((bin == null) ? 0 : bin.hashCode());
		result = prime * result + ((lot == null) ? 0 : lot.hashCode());
		result = prime * result + ((partCode == null) ? 0 : partCode.hashCode());
		result = prime * result + ((partOrg == null) ? 0 : partOrg.hashCode());
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
		IssueReturnPartTransactionLine other = (IssueReturnPartTransactionLine) obj;
		if (assetIDCode == null) {
			if (other.assetIDCode != null)
				return false;
		} else if (!assetIDCode.equals(other.assetIDCode))
			return false;
		if (bin == null) {
			if (other.bin != null)
				return false;
		} else if (!bin.equals(other.bin))
			return false;
		if (lot == null) {
			if (other.lot != null)
				return false;
		} else if (!lot.equals(other.lot))
			return false;
		if (partCode == null) {
			if (other.partCode != null)
				return false;
		} else if (!partCode.equals(other.partCode))
			return false;
		if (partOrg == null) {
			if (other.partOrg != null)
				return false;
		} else if (!partOrg.equals(other.partOrg))
			return false;
		return true;
	}
	
}
