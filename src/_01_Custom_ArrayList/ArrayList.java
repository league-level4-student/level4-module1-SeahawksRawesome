package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList<T> {

	public ArrayList() {
		arr = (T[]) new Object[0];
	}

	// T[] arr = new Array<T>[0];
	T[] arr;
	int[] array = new int[6];

	public T get(int loc) throws IndexOutOfBoundsException {

		return arr[loc];
	}

	public void add(T val) {
		T[] copyarr = (T[]) new Object[arr.length + 1];

		for (int i = 0; i < copyarr.length; i++) {
			if (i == arr.length) {
				copyarr[i] = val;
			} else {
				copyarr[i] = arr[i];
			}
		}
		arr = copyarr;
	}

	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] copyarr = (T[]) new Object[arr.length + 1];

		for (int i = 0; i < copyarr.length; i++) {
			if (i == loc) {
				copyarr[i] = val;
			} else if (i < loc) {
				copyarr[i] = arr[i];
			} else {
				copyarr[i] = arr[i - 1];
			}
		}
		arr = copyarr;
	}

	public void set(int loc, T val) throws IndexOutOfBoundsException {
		arr[loc] = val;
	}

	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] copyarr = (T[]) new Object[arr.length - 1];

		for (int i = 0; i < arr.length; i++) {
			if (i < loc) {
				copyarr[i] = arr[i];
			}
			if (i > loc) {
				copyarr[i-1] = arr[i];
			} else {

			}
		}
		arr = copyarr;
	}

	public boolean contains(T val) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(val)) {
				return true;
			}
		}
		return false;
	}

	public int size() {
		// TODO Auto-generated method stub

		return arr.length;
	}

}