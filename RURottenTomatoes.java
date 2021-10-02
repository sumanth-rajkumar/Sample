
public class RURottenTomatoes {

    public static void main(String[] args) {
		int rows = Integer.parseInt(args[0]);
		int columns = Integer.parseInt(args[1]);
		int[][] ratings = new int[rows][columns];
		int counter = 0;
		for(int r = 0; r < rows; r++)
		{
			for(int c = 0; c < columns; c++)
			{
				ratings[r][c]=Integer.parseInt(args[2+counter]);
				counter++;
			}
		}
		int maxSum = 0;
		int index = 0;
		for(int c = 0; c < columns; c++)
		{
			int sum = 0;
			for(int r = 0; r < rows; r++)
			{
				sum+=ratings[r][c];
			}
			if(sum>maxSum)
			{
				maxSum=sum;
				index = c;
			}
		}
		System.out.println(index);
	}
}
