package lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsBuilder.practice.practiceTwo;

public class Student {
    private String name;
    private int age;
    private double psp;
    private String universityName;
    private String batch;
    private long id;
    private int graduationYear;
    private String phoneNumber;

    public Student(Builder builder){
        //validation starts
        if(builder.getGraduationYear()>2022){
            throw new IllegalArgumentException("Graduation year cannot be greater than 2022");
        }
        this.name = builder.getName();
        this.age = builder.getAge();
        this.psp = builder.getPsp();
        this.universityName = builder.getUniversityName();
        this.batch = builder.getBatch();
        this.id = builder.getId();
        this.graduationYear = builder.getGraduationYear();
        this.phoneNumber = builder.getPhoneNumber();
    }

}
