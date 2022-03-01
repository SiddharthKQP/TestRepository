class MyTestClass {
	public static void main(String[] args) throws Exception {
		System.out.println("This will go into initial commit");
	}

	public static Integer divideTwoNumbers(Integer a, Integer b) {
		if(b == 0) {
			throw new MyRuntimeException("Trying to divide by zero");
		} else {
			return (a/b);
		}
	}
}

class MyRuntimeException extends RuntimeException {
	private String msg;
	
	public MyRuntimeException() {
		System.out.println("An exception occured. Log this ASAP");
	}
	
	public MyRuntimeException(String msg) {
		this.msg= msg;
	}
	
	@Override
	public String toString() {
		return this.msg;
	}
}
