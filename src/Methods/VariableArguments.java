package Methods;

public class VariableArguments {
	static void ShowList(int start, String ...s)
	{
		for(int i=0;i<s.length;i++)
		{
			System.out.println(start+". "+s[i]);
			start++;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShowList(5,"keshav","Ashish","Vandana","Tanya","Deepak","Biru");

	}

}
