package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeCheckingException extends Exception {
	public AgeCheckingException(String message) {
		super(message);
	}

	@Override
	public String getMessage() {
		return "Lỗi nhập vào một tuổi: " + super.getMessage();
	}

	private static int nhapTuoiNhanVien() throws AgeCheckingException {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Hãy nhập tuổi nhân viên: ");
		int tuoi = 0;
		try {
			tuoi = scanner.nextInt();
			if (tuoi < 0)
				throw new AgeCheckingException("tuổi không được nhỏ hơn 0.");
		} catch (InputMismatchException e) {
			throw new AgeCheckingException("tuổi phải là một số.");
		}
		return tuoi;
	}

	public static void main(String[] args) {
		try {
			int tuoi = nhapTuoiNhanVien();
			System.out.println("Tuổi đã nhập: " + tuoi);
		} catch (AgeCheckingException e) {
			System.out.println(e.getMessage());
		}
	}
}
