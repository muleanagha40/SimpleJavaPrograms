class Scan1{
	public static void main()//throws IOException
	{
		System.out.println("Enter Employee Details ");
		System.out.println("Id\tName\tDepartment\tSalary");
		Scanner sc = new Scanner( System.in);
		int id = sc.nextInt();
		String name = sc.next();
		String dept = sc.next();
		float salary = sc.nextFloat();
		System.out.println("Id\tName\tDepartment\tSalary");
		System.out.println("*****************************************************************************");
		System.out.println(id+"\t"+name+"\t"+dept+"\t"+salary);
	}
}