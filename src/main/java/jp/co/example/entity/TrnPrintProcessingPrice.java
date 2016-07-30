package jp.co.example.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "trn_print_processing_price")
public class TrnPrintProcessingPrice {
	/** */
	@Id
	@Column(name="seqno")
	@GeneratedValue
	private long seqno;
	/** lower_pts */
	@Column(name="lower_pts")
	private long lowerPts;
	/** upper_pts */
	@Column(name="upper_pts")
	private long upperPts;
	/** create_at */
	@Column(name="create_at")
	private Date createAt;
	/** update_at */
	@Column(name="update_at")
	private Date updateAt;
	/** deleted_at */
	@Column(name="deleted_at")
	private Date deletedAt;
	/** print_processing_price */
	@Column(name="print_processing_price")
	private long printProcessingPrice;
	/** lower_heibei */
	@Column(name="lower_heibei")
	private double lowerHeibei;
	/** upper_heibei */
	@Column(name="upper_heibei")
	private double upperHeibei;
	public long getSeqno() {
		return seqno;
	}
	public void setSeqno(long seqno) {
		this.seqno = seqno;
	}
	public long getLowerPts() {
		return lowerPts;
	}
	public void setLowerPts(long lowerPts) {
		this.lowerPts = lowerPts;
	}
	public long getUpperPts() {
		return upperPts;
	}
	public void setUpperPts(long upperPts) {
		this.upperPts = upperPts;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	public Date getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}
	public Date getDeletedAt() {
		return deletedAt;
	}
	public void setDeletedAt(Date deletedAt) {
		this.deletedAt = deletedAt;
	}
	public long getPrintProcessingPrice() {
		return printProcessingPrice;
	}
	public void setPrintProcessingPrice(long printProcessingPrice) {
		this.printProcessingPrice = printProcessingPrice;
	}
	public double getLowerHeibei() {
		return lowerHeibei;
	}
	public void setLowerHeibei(double lowerHeibei) {
		this.lowerHeibei = lowerHeibei;
	}
	public double getUpperHeibei() {
		return upperHeibei;
	}
	public void setUpperHeibei(double upperHeibei) {
		this.upperHeibei = upperHeibei;
	}
	
	
	
}
