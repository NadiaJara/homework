package hw14JavaCodingChallenge;

public class CharacterOneByOneVerticallyButReverse {

	public static void main(String[] args) {
		String s = "Nadia Jara";
		for(int i = 9; i < s.length(); i--) {
			System.out.println(s.charAt(i));
		}
	}
}
