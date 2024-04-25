//package collections;
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[4];
		for(int i=0;i<4;i++)
		{
			a[i] =i;
		}
		for(int x: a)
		{
			System.out.println(x);
		}
	}

}
