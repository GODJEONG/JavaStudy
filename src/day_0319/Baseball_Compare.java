package day_0319;

public class Baseball_Compare {

	String input;
	Baseball_RandomInt br;

	public Baseball_Compare() {
		br = new Baseball_RandomInt();
	}

	public int Strike(String input, String random) {
		int result = 0;

		for (int i = 0; i < 3; i++) {
			if (input.substring(i, i + 1).equals(random.substring(i, i + 1))) {
				result++;
			}
		}
		return result;
	}

	public int Ball(String input, String random) {
		int result = 0;

		if (input.substring(0, 1).equals(random.substring(1, 2))
				|| input.substring(0, 1).equals(random.substring(2, 3))) {
			result++;
		}
		if (input.substring(1, 2).equals(random.substring(0, 1))
				|| input.substring(1, 2).equals(random.substring(2, 3))) {
			result++;
		}
		if (input.substring(2, 3).equals(random.substring(0, 1))
				|| input.substring(2, 3).equals(random.substring(1, 2))) {
			result++;
		}
		return result;
	}

	// input get set
	public String getInput() {
		return input;
	}

	public String setInput(String input) {
		return this.input = input;
	}

}