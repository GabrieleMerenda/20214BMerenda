import java.util.*;
public class Test_Main {

	public static void main(String[] args) {
		rettangolo r=new rettangolo(32,23,"red",5,7);

		System.out.println(r.calcolaPerimetro());
		System.out.println(r.calcolaArea());
		System.out.println(r.toString());
	}
}