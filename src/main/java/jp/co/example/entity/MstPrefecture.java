package jp.co.example.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mst_prifecture")
public class MstPrefecture {
	/** prifecture_id */
	@Id
	@Column(name="prifecture_id")
	@GeneratedValue
	private long prifectureId;
	/** prefecture_value */
	@Column(name="prefecture_value")
	private long prefectureValue;
	/** prefecture_name */
	@Column(name="prefecture_name")
	private String prefectureName;
	/** view_position */
	@Column(name="view_position")
	private long viewPosition;
	/** create_at */
	@Column(name="create_at")
	private Date createAt;
	/** update_at */
	@Column(name="update_at")
	private Date updateAt;
	
	
	public long getPrifectureId() {
		return prifectureId;
	}
	public void setPrifectureId(long prifectureId) {
		this.prifectureId = prifectureId;
	}
	public long getPrefectureValue() {
		return prefectureValue;
	}
	public void setPrefectureValue(long prefectureValue) {
		this.prefectureValue = prefectureValue;
	}
	public String getPrefectureName() {
		return prefectureName;
	}
	public void setPrefectureName(String prefectureName) {
		this.prefectureName = prefectureName;
	}
	public long getViewPosition() {
		return viewPosition;
	}
	public void setViewPosition(long viewPosition) {
		this.viewPosition = viewPosition;
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
	
	
}
