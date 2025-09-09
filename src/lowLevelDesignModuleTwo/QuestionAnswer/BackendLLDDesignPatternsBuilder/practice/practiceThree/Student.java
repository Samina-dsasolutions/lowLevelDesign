package lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsBuilder.practice.practiceThree;

public class Student {
    private String name;
    private int age;
    private double psp;
    private String universityName;
    private String batch;
    private long id;
    private int graduationYear;
    private String phoneNumber;

    public static Builder getBuilder(){
        return  new Builder();
    }
    public Student(Builder builder){
        this.name=builder.getName();
        this.age=builder.getAge();
        this.psp=builder.getPsp();
        this.universityName=builder.getUniversityName();
        this.batch=builder.getBatch();
        this.id=builder.getId();
        this.graduationYear=builder.getGraduationYear();
        this.phoneNumber=builder.getPhoneNumber();
    }
}
