package pekan3_2511533006;
import java.util.*;
public class StackArray_2511533006 {
	static final int MAX = 1000;
	int top;
	int a[] = new int [MAX];
	boolean isEmpty()
	{
		return (top < 0);
	}
	StackArray_2511533006()
	{
		top = -1;
	}
	boolean push_2511533006 (int x)
	{
		if (top >= (MAX - 1)) {
			System.out.println("Stack Overflow");
			return false;
		}
		else {
			a [++ top] = x;
			System.out.println(x  + " Dimasukkan dalam stack");
			return true;
		}
	}
	int pop_2511533006()
	{
		if (top < 0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int x = a[top--];
			return x;
		}
	}
	int peek_2511533006()
	{
		if (top < 0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int x = a[top];
			return x;
		}
	}
	void print() {
	for(int i = top;i>-1;i--) {
		System.out.print(" "+ a[i]);
	}
  }
}
