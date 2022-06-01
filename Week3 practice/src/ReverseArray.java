
public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list1 = {1, 2, 3, 4, 5, 6};
		int[] list2 = reverse(list1);
		int[] a = {1,2};
		swap(a[0], a[1]);
		System.out.println("a[0] : "+a[0]+ " a[1] : " + a[1]);
		//★ 시작주소를 전달 
		swap(a);
		System.out.println("a[0] : "+a[0]+ " a[1] : " + a[1]);
		for(int e : list1)
		{
			System.out.print(e + " ");
		}
		System.out.println();
		for(int e : list2)
		{
			System.out.print(e + " ");
		}

		
		
	}
	public static int[] reverse(int [] list)
	{
		int[] result = new int[list.length];
		
		for(int i=0, j = result.length - 1; i < list.length ; i++, j--)
		{
			result[j] = list[i];
		}
		return result;
	}

	public static void swap(int n1, int n2)
	{
		int temp = n1;
		n1 = n2;
		n2 = temp;
	}
	
	//fuction overloading
	public static void swap(int[] array)
	{
		int temp = array[0];
		array[0] = array[1];
		array[1] = temp;
	}
		
	
}
