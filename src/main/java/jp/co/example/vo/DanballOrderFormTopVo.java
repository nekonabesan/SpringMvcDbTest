package jp.co.example.vo;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class DanballOrderFormTopVo {
	@NotNull
	private Integer width=0;
	@NotNull
	private Integer height=0;
	@NotNull
	private Integer depth=0;
	@NotNull
	private Integer printFlg=0;
	private Integer printPlateFlg=0;
	private Integer printPts=0;
	private Integer printWidth=0;
	private Integer printHeight=0;
	@NotNull
	private Integer pts=0;
	private Integer prefecture=0;
	private String emailAddress;
	private Integer phoneNumber;
	private String message;
	
	public Integer getWidth() {
		return width;
	}
	public void setWidth(Integer width) {
		this.width = width;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	public Integer getDepth() {
		return depth;
	}
	public void setDepth(Integer depth) {
		this.depth = depth;
	}
	public Integer getPrintFlg() {
		return printFlg;
	}
	public void setPrintFlg(Integer printFlg) {
		this.printFlg = printFlg;
	}
	public Integer getPrintPlateFlg() {
		return printPlateFlg;
	}
	public void setPrintPlateFlg(Integer printPlateFlg) {
		this.printPlateFlg = printPlateFlg;
	}
	public Integer getPrintPts() {
		return printPts;
	}
	public void setPrintPts(Integer printPts) {
		this.printPts = printPts;
	}
	public Integer getPrintWidth() {
		return printWidth;
	}
	public void setPrintWidth(Integer printWidth) {
		this.printWidth = printWidth;
	}
	public Integer getPrintHeight() {
		return printHeight;
	}
	public void setPrintHeight(Integer printHeight) {
		this.printHeight = printHeight;
	}
	public Integer getPts() {
		return pts;
	}
	public void setPts(Integer pts) {
		this.pts = pts;
	}
	public Integer getPrefecture() {
		return prefecture;
	}
	public void setPrefecture(Integer prefecture) {
		this.prefecture = prefecture;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public Integer getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
