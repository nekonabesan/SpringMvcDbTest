package jp.co.example.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "trn_processing_price")
public class TrnProcessingPrice {
	/** seqno */
	@Id
	@Column(name="seqno")
	@GeneratedValue
	private long seqno;
	/** thickness_id */
	@Column(name="thickness_id")
	private long thicknessId;
	/** seat_assort_id */
	@Column(name="seat_assort_id")
	private long seatAssotId;
	/** processing_price */
	@Column(name="processing_price")
	private long processingPrice;
	/** lower_pts */
	@Column(name="lower_pts")
	private long lowerPts;
	/** upper_pts */
	@Column(name="upper_pts")
	private long upperPts;
	/** lower_heibei */
	@Column(name="lower_heibei")
	private double lowerHeibei;
	/** upper_heibei */
	@Column(name="upper_heibei")
	private double upperHeibei;
	/** create_at */
	@Column(name="create_at")
	private Date createAt;
	/** update_at */
	@Column(name="update_at")
	private Date updateAt;
	/** deleted_at */
	@Column(name="deleted_at")
	private Date deletedAt;
	/** 板厚JOIN */
	@ManyToOne
	@JoinColumn(name="thickness_id",insertable=false,updatable=false)
	private MstThickness mstThickness;
	/** 板厚JOIN */
	@ManyToOne
	@JoinColumn(name="seat_assort_id",insertable=false,updatable=false)
	private MstSeatAssort mstSeatAssort;
	
	
	public long getSeqno() {
		return seqno;
	}
	public void setSeqno(long seqno) {
		this.seqno = seqno;
	}
	public long getThicknessId() {
		return thicknessId;
	}
	public void setThicknessId(long thicknessId) {
		this.thicknessId = thicknessId;
	}
	public long getSeatAssotId() {
		return seatAssotId;
	}
	public void setSeatAssotId(long seatAssotId) {
		this.seatAssotId = seatAssotId;
	}
	public long getProcessingPrice() {
		return processingPrice;
	}
	public void setProcessingPrice(long processingPrice) {
		this.processingPrice = processingPrice;
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
	public MstThickness getMstThickness() {
		return mstThickness;
	}
	public void setMstThickness(MstThickness mstThickness) {
		this.mstThickness = mstThickness;
	}
	public MstSeatAssort getMstSeatAssort() {
		return mstSeatAssort;
	}
	public void setMstSeatAssot(MstSeatAssort mstSeatAssort) {
		this.mstSeatAssort = mstSeatAssort;
	}

	
	
	
}
