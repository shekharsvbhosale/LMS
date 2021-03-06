package models;
import java.io.Serializable;
 
public class Bleach implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; 
	private int Id;
	private String Brand;
	private double AbbritionEffect;
	private double UnitPrice;
	public Bleach()
	{}
	public Bleach(String brand, double abbritionEffect, double unitPrice) {
		Brand = brand;
		AbbritionEffect = abbritionEffect;
		UnitPrice = unitPrice;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public double getAbbritionEffect() {
		return AbbritionEffect;
	}
	public void setAbbritionEffect(double abbritionEffect) {
		AbbritionEffect = abbritionEffect;
	}
	public double getUnitPrice() {
		return UnitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		UnitPrice = unitPrice;
	}
}
