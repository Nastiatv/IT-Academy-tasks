package example59;

public class MyArray {

int a[];

public MyArray(int size)
{
	a=new int[size];
	
}
	int get(int num) {
		return a[num];
	}
	void set(int num,int val) {
		a[num] =val;
			}
	int size()
	{
		return a.length;
	}
	MyIterator iterator()
	{
		return new IntIterator();
	}
	
	private class IntIterator implements MyIterator {
		
		int curNum=0;
		public Object next() {
			if(curNum<a.length)
			{
				curNum++;
				return new Integer(a[curNum-1]);
			}
			else
			{
				return null;
			}
		}
		public boolean hasNext()

		{
			if(curNum<a.length)
				return true;
			else
				return false;
			
		}

	}}	
	

