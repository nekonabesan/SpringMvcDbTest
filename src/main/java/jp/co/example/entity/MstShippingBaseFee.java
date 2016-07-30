package jp.co.example.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mst_shipping_base_fee")
public class MstShippingBaseFee {
	/** sipping_base_fee_id */
	@Id
	@Column(name="sipping_base_fee_id")
	@GeneratedValue
	private long shippingBaseFeeId;
	/** prifecture_id */
	@Column(name="prifecture_id")
	private long prifectureId;
	/** shipping_base_fee_value */
	@Column(name="shipping_base_fee_value")
	private long shippingBaseFeeValue;
	/** create_at */
	@Column(name="create_at")
	private Date createAt;
	/** update_at */
	@Column(name="update_at")
	private Date updateAt;
	/** deleted_at */
	@Column(name="deleted_at")
	private Date deletedAt;
	
	
	public long getShippingBaseFeeId() {
		return shippingBaseFeeId;
	}
	public void setShippingBaseFeeId(long shippingBaseFeeId) {
		this.shippingBaseFeeId = shippingBaseFeeId;
	}
	public long getPrifectureId() {
		return prifectureId;
	}
	public void setPrifectureId(long prifectureId) {
		this.prifectureId = prifectureId;
	}
	public long getShippingBaseFeeValue() {
		return shippingBaseFeeValue;
	}
	public void setShippingBaseFeeValue(long shippingBaseFeeValue) {
		this.shippingBaseFeeValue = shippingBaseFeeValue;
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
	
	
}
