package assignments;

public class StudentsClass implements Comparable<StudentsClass> {

	  int id;
	  String name;
	  int problemsSolved;
	  char grade;
	  
	  public StudentsClass(int id,String name,int problemsSolved,char grade)
	  {
		  this.id = id;
		  this.name = name;
		  this.problemsSolved = problemsSolved;
		  this.grade = grade;
	  }

	@Override
	public int compareTo(StudentsClass o) {
		
		if(grade == o.grade)
		{
			if(problemsSolved < o.problemsSolved)
			{
				return 1;
			}
			else if(problemsSolved > o.problemsSolved)
			{
				return -1;
			}
			else
			{
				return 0;
			}
		}
		else if(grade > o.grade)
		{
			return 1;
		}
		
		return -1;
		
	}
	
}
