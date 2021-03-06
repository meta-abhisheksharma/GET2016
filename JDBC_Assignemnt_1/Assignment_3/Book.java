package Assignment_3;

import java.sql.Date;

/**this is pojo class for Book
 *which have getter and setter for book's properties
 */
public class Book {

	private int accession_no;
	private int title_id;
	private Date purchase_dt;
	private float price;
	private String status;

	public int getAccession_no() {
		return accession_no;
	}

	public void setAccession_no(int accession_no) {
		this.accession_no = accession_no;
	}

	public int getTitle_id() {
		return title_id;
	}

	public void setTitle_id(int title_id) {
		this.title_id = title_id;
	}

	public Date getPurchase_dt() {
		return purchase_dt;
	}

	public void setPurchase_dt(Date purchase_dt) {
		this.purchase_dt = purchase_dt;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
