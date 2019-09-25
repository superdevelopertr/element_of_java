package cp4.linkedlist;

import java.util.Iterator;

public class DataSet<T> implements Iterable<T> {

	private T[] numbers;
	
	public DataSet(T...numbers) {
		this.numbers=numbers;
	}
	
	
	@Override
	public Iterator<T> iterator() {
		return new DataSetIterator<T>();
	}
	
	class DataSetIterator<A> implements Iterator<T>{
		private int currentIndex;
		
		@Override
		public boolean hasNext() {
			return currentIndex < numbers.length;
		}

		@Override
		public T next() {
			if(hasNext()){
				return numbers[currentIndex++];
			}else{
				return null;
			}
		}
	}
	
	public static void main(String[] args) {
		 DataSet<String> dataSet = new DataSet<String>("elma","armut");
	        Iterator<String> iterator = dataSet.iterator();
	        while (iterator.hasNext()) {
	        	String nextValue = iterator.next();
	            System.out.println("The next value with Iterator is: " + nextValue);
	        }
	 
	        for (String nextValue : dataSet) {
	            System.out.println("The next value with the for Loop is: " + nextValue);
	        }
	}
}