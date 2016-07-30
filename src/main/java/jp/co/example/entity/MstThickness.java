package jp.co.example.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "mst_thickness")
public class MstThickness {
	/** thickness_id */
	@Id
	@Column(name="thickness_id")
	@GeneratedValue
	private long thicknessId;
	/** thickness_value */
	@Column(name="thickness_value")
	private double thicknessValue;
	/** thickness_name */
	@Column(name="thickness_name")
	private String thicknessName;
	/** create_at */
	@Column(name="create_at")
	private Date createAt;
	/** update_at */
	@Column(name="update_at")
	private Date updateAt;
	/** deleted_at */
	@Column(name="deleted_at")
	private Date deletedAt;
	/** trnProcessingPriceへのつなぎ込み */
	@OneToMany(mappedBy="mstThickness")
	private List<TrnProcessingPrice> trnProcessingPrice;
	
	public long getThicknessId() {
		return thicknessId;
	}
	public void setThicknessId(long thicknessId) {
		this.thicknessId = thicknessId;
	}
	public double getThicknessValue() {
		return thicknessValue;
	}
	public void setThicknessValue(double thicknessValue) {
		this.thicknessValue = thicknessValue;
	}
	public String getThicknessName() {
		return thicknessName;
	}
	public void setThicknessName(String thicknessName) {
		this.thicknessName = thicknessName;
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
