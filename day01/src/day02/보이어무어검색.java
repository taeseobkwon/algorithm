package day02;

public class 보이어무어검색 {

	public static void main(String[] args) {
		String txt = "ABABCDEFGHA";
		String pat = "ABC";
		int idx = bmMatch(txt, pat);

	}

	private static int bmMatch(String txt, String pat) {
		int pt; // txt커서
		int pp; // pat커서
		int txtLen = txt.length(); // 11
		int patLen = pat.length(); // 3
		System.out.println(Character.MAX_VALUE);

		int[] skip = new int[Character.MAX_VALUE + 1]; // 건너뛰기 표의 크기는 65535
		for (pt = 0; pt <= Character.MAX_VALUE; pt++) {
			skip[pt] = patLen;
		}
		for (pt = 0; pt <= patLen - 1; pt++) {
			skip[pat.charAt(pt)] = patLen - pt - 1;

		}
		// 건너뛰기 표의 내용 출력
//		for ( pt=0; pt <= Character.MAX_VALUE; pt++) {
//			System.out.println(skip[pt] + " ");
//		}
		while (pt < txtLen) {
			pp = patLen - 1;
			while (txt.charAt(pt) == pat.charAt(pp)) {
				if (pp == 0)
					return pt; // 성공
				pp--;
				pt--;
			}
			pt += (skip[txt.charAt(pt)] > patLen - pp) ? skip[txt.charAt(pt)] : patLen - pp;
		}
		return -1;

		// return 0;
	}
}
