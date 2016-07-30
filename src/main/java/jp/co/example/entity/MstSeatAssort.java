package jp.co.example.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "mst_seat_assort")
public class MstSeatAssort {
	/** seat_assort_id */
	@Id
	@Column(name="seat_assort_id")
	@GeneratedValue
	private long seatAssorId;
	/** */
	@Column(name="seat_assort_name")
	private String seatAssortName;
	/** */
	@Column(name="create_at")
	private Date createAt;
	/** */
	@Column(name="update_at")
	private Date updateAt;
	/** */
	@Column(name="deleted_at")
	private Date deletedAt;
	/** trnProcessingPriceへのつなぎ込み */
	@OneToMany(mappedBy="mstSeatAssort")
	private List<TrnProcessingPrice> trnProcessingPrice;
	
	public long getSeatAssorId() {
		return seatAssorId;
	}
	
	public void setSeatAssorId(long seatAssorId) {
		this.seatAssorId = seatAssorId;
	}
	public String getSeatAssortName() {
		return seatAssortName;
	}
	public void setSeatAssortName(String seatAssortName) {
		this.seatAssortName = seatAssortName;
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
	public List<TrnProcessingPrice> getTrnProcessingPrice() {
		return trnProcessingPrice;
	}
	public void setTrnProcessingPrice(List<TrnProcessingPrice> trnProcessingPrice) {
		this.trnProcessingPrice = trnProcessingPrice;
	}
	
	

}
