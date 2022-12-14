import java.util.Scanner;

public class XuLy {
	final static int MIN = -100;
    final static int MAX = 100;

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int n = nhapN(scan);
       int a[] = taoMang(n);
       xuatMang(a);
       lietKe(a);       
	}
	
	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.print("Nhập a > 0 ");
			n = Integer.parseInt(scan.nextLine());
		} while(n < 1);
		return n;
	}
	
	public static int[] taoMang(int n) {
		int a[] = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = MIN + (int)(Math.random()*((MAX - MIN) + 1)); 
		}
		return a;
	}
	
	public static void xuatMang(int a[]) {
	  for(int pt : a) {
		  System.out.print(pt + "\t");
	  }
	  System.out.println("\n");
	} 

	public static boolean ktraChuSoDauTienLaLe(int x) {
         boolean laLe;
		//		int dv;
         x = Math.abs(x);
		while(x >= 10) {
//			dv = x%10;
			x/=10; //x = x/10
		}
		if(x%2 == 0) {
			laLe = false;
		}else {
			laLe = true;
		}
		return laLe;
	}
	
	public static void lietKe(int a[]) {
		for(int pt: a) {
			if(ktraChuSoDauTienLaLe(pt)) {
				System.out.print(pt + "\t");
			}
		}
	}
}
