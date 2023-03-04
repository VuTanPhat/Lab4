package Lab_4;

public class Vuong extends ChuNhat{

	public Vuong(double canh) {
		super(canh, canh);
		double rong = canh;
	}
	public void xuat(){
		System.out.printf("Dien tich hv: %.2f|Chu vi hv: %.2f", getDienTich(),getChuVi());
	}
}
