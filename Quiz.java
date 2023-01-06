public abstract class Quiz { 
    private int id;
    private String Student;
    private int totalScore;
	private int maxScore;
	private double grade;


    Quiz(int id,  String Student,  int totalScore, int maxScore){ 
        this.id = id; 
        this.Student = Student;
		this.totalScore = totalScore;
		this.maxScore =  maxScore;
    } 
	public double grade(){
		grade = totalScore/maxScore;
		return grade;
	}
	  

	public int getId(){
		return this.id;
	}
	public String getStundent() { 
		return this.Student; 
    } 
	public int getTotalScore() {
		return this.totalScore;
	}
	public int getMaxScore() {
		return this.maxScore;
	}
}

	
