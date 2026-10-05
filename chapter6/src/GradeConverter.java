
public class GradeConverter 
{

		public static boolean isvValidNumber(int userNum, int minNum, int maxNum)
		{
			if(minNum <= userNum && userNum <= maxNum)
			{
				return(true);
			}
			else
			{
				return(false);
			}
			
		}

	}


