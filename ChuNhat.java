package Lab_4;

public class ChuNhat {
	double rong;
	double dai;
	
	public ChuNhat(double rong,double dai) {
		this.rong=rong;
		this.dai=dai;
	}
	public double getChuVi() {
		return (dai+rong)*2;
	}
	public double getDienTich() {
		return dai*rong;
	}
	public void xuat(){
		System.out.printf("Dien tich hcn: %.2f|Chu vi hcn: %.2f", getDienTich(),getChuVi());
	}
}
