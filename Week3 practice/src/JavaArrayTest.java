
public class JavaArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sourceArray = {2, 3, 1, 5, 10};
		int[] targetArray = new int[sourceArray.length];
		
		System.arraycopy(sourceArray, 0, targetArray,0,sourceArray.length);
		
		/*
		for (int i=0;i<sourceArray.length;i++)
		{
			targetArray[i] = sourceArray[i];
		}
		*/
		for (int e : sourceArray)
		{
			System.out.print(e + " ");
		}
		System.out.println();
		for (int e : targetArray)
		{
			System.out.print(e + " ");
		}
		System.out.println();
		sourceArray[0] = 100;
		
		for (int e : sourceArray)
		{
			System.out.print(e + " ");
		}
		System.out.println();
		for (int e : targetArray)
		{
			System.out.print(e + " ");
		}
		System.out.println();
		// �̰Ŵ� �ּҸ� ���ƿ��°��� ��
		targetArray = sourceArray;
		System.out.println("targetArray=SourceArray �� ���Ŀ�");
		sourceArray[1] = 20;
		targetArray[4] = 10000;
		for (int e : sourceArray)
		{
			System.out.print(e + " ");
		}
		System.out.println();
		for (int e : targetArray)
		{
			System.out.print(e + " ");
		}
		
		for(int e : targetArray)
		{
			System.out.println("������");
		}
	}

}
