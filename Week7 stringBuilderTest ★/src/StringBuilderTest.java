public class StringBuilderTest {
	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder();
		
		stringBuilder.append("weclome to");
		System.out.println(stringBuilder);
		StringBuilder stringBuilder1 = stringBuilder.reverse();
		//System.out.println(stringBuilder.reverse());
		System.out.println(stringBuilder);
		System.out.println(stringBuilder1);
		
		stringBuilder.append("avaJ");
		System.out.println(stringBuilder);
		System.out.println(stringBuilder1);
		// stringbuilder1과 stringbuilder은 같은거임 같은 주소일것임  리버스만해도 같은걸로되네
		
	}
}
