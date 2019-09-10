public class Ch4Ex7 
{

	public static void main(String[] args)
	{
		Temperature seven = new Temperature('F');

		Temperature one = new Temperature();
		Temperature two = new Temperature(32,'F');
		Temperature three = new Temperature(-40);
		Temperature four = new Temperature(-40,'F');
		Temperature five = new Temperature(100,'C');
		Temperature six = new Temperature(212,'F');

		System.out.println(one.equals(two)+":"+one.toString()+"="+two.toString());
		System.out.println(three.equals(four)+":"+three.toString()+"="+four.toString());
		System.out.println(five.equals(six)+":"+five.toString()+"="+six.toString());
		System.out.println(one.equals(three)+":"+one.toString()+"="+three.toString());
		
		System.out.println(one.greaterThan(three)+":"+one.toString()+">"+three.toString());
		System.out.println(three.greaterThan(one)+":"+three.toString()+">"+one.toString());
		System.out.println(one.lesserThan(three)+":"+one.toString()+"<"+three.toString());
		System.out.println(three.lesserThan(one)+":"+three.toString()+"<"+one.toString());

	}	
}