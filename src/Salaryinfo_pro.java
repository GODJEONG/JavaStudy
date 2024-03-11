/// 급여체계 값 저장Data

public class Salaryinfo_pro {

	private Salaryinfo2_pro[][][] salaryinfo_base;

	public Salaryinfo_pro() {
		salaryinfo_base = new Salaryinfo2_pro[5][2][3];

		salaryinfo_base[0][0][0] = new Salaryinfo2_pro(1, 1, 1, 30000, 45000, 60000);
		salaryinfo_base[0][0][1] = new Salaryinfo2_pro(1, 1, 2, 20000, 30000, 40000);
		salaryinfo_base[0][0][2] = new Salaryinfo2_pro(1, 1, 3, 10000, 15000, 20000);
		salaryinfo_base[0][1][0] = new Salaryinfo2_pro(1, 2, 1, 15000, 22500, 30000);
		salaryinfo_base[0][1][1] = new Salaryinfo2_pro(1, 2, 2, 10000, 15000, 20000);
		salaryinfo_base[0][1][2] = new Salaryinfo2_pro(1, 2, 3, 5000, 7500, 10000);
		salaryinfo_base[1][0][0] = new Salaryinfo2_pro(2, 1, 1, 60000, 90000, 120000);
		salaryinfo_base[1][0][1] = new Salaryinfo2_pro(2, 1, 2, 40000, 60000, 80000);
		salaryinfo_base[1][0][2] = new Salaryinfo2_pro(2, 1, 3, 20000, 30000, 40000);
		salaryinfo_base[1][1][0] = new Salaryinfo2_pro(2, 2, 1, 30000, 45000, 60000);
		salaryinfo_base[1][1][1] = new Salaryinfo2_pro(2, 2, 2, 20000, 30000, 40000);
		salaryinfo_base[1][1][2] = new Salaryinfo2_pro(2, 2, 3, 10000, 15000, 20000);
		salaryinfo_base[2][0][0] = new Salaryinfo2_pro(3, 1, 1, 120000, 180000, 240000);
		salaryinfo_base[2][0][1] = new Salaryinfo2_pro(3, 1, 2, 80000, 120000, 160000);
		salaryinfo_base[2][0][2] = new Salaryinfo2_pro(3, 1, 3, 40000, 60000, 80000);
		salaryinfo_base[2][1][0] = new Salaryinfo2_pro(3, 2, 1, 60000, 90000, 120000);
		salaryinfo_base[2][1][1] = new Salaryinfo2_pro(3, 2, 2, 40000, 60000, 80000);
		salaryinfo_base[2][1][2] = new Salaryinfo2_pro(3, 2, 3, 20000, 30000, 40000);
		salaryinfo_base[3][0][0] = new Salaryinfo2_pro(4, 1, 1, 240000, 360000, 480000);
		salaryinfo_base[3][0][1] = new Salaryinfo2_pro(4, 1, 2, 160000, 240000, 320000);
		salaryinfo_base[3][0][2] = new Salaryinfo2_pro(4, 1, 3, 80000, 120000, 160000);
		salaryinfo_base[3][1][0] = new Salaryinfo2_pro(4, 2, 1, 120000, 180000, 240000);
		salaryinfo_base[3][1][1] = new Salaryinfo2_pro(4, 2, 2, 80000, 120000, 160000);
		salaryinfo_base[3][1][0] = new Salaryinfo2_pro(4, 2, 3, 40000, 60000, 80000);
		salaryinfo_base[4][0][0] = new Salaryinfo2_pro(5, 1, 1, 480000, 720000, 960000);
		salaryinfo_base[4][0][1] = new Salaryinfo2_pro(5, 1, 2, 320000, 480000, 640000);
		salaryinfo_base[4][0][2] = new Salaryinfo2_pro(5, 1, 3, 160000, 240000, 320000);
		salaryinfo_base[4][1][0] = new Salaryinfo2_pro(5, 2, 1, 240000, 360000, 480000);
		salaryinfo_base[4][1][1] = new Salaryinfo2_pro(5, 2, 2, 160000, 240000, 320000);
		salaryinfo_base[4][1][2] = new Salaryinfo2_pro(5, 2, 3, 80000, 120000, 160000);
	}

	public int getSalaryinfo_base(int index1, int index2, int index3, int resultIndex) {
		switch (resultIndex) {
		//
		case 0:
			return salaryinfo_base[index1][index2][index3].getSalary_daywork();
			//
		case 1:
			return salaryinfo_base[index1][index2][index3].getSalary_nightwork();
			//
		case 2:
			return salaryinfo_base[index1][index2][index3].getSalary_hoildaywork();
			//
		default:
			return salaryinfo_base[index1][index2][index3].getSalary_daywork();
		}
	}

}
