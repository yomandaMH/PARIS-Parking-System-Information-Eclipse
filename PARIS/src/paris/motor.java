package paris;

public class motor {

	public motor(String nopol, String tanggal) {
		// TODO Auto-generated constructor stub
		this.nopol=nopol;
		this.tanggal=tanggal;
	}
	
	private String nopol;
	private String tanggal;
	
	public String getNopol() {
		return nopol.toUpperCase();
	}
	
	public String getTanggal() {
		return tanggal;
	}
	
	public void setTanggal(String tanggal) {
		this.tanggal = tanggal;
	}
	
	public String toString()
	{
		return getNopol()+"\t"+getTanggal();
	}
}
