package lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsBuilder.practice.practiceOne;

public class Student {
    private String name;
    private int age;
    private double psp;
    private String universityName;
    private String batch;
    private long id;
    private int graduationYear;
    private String phoneNumber;

    public Student(String name, double psp, int age, String universityName, String batch, long id, int graduationYear, String phoneNumber) {

        this.name = name;
        this.psp = psp;
        this.age = age;
        this.universityName = universityName;
        this.batch = batch;
        this.id = id;
        this.graduationYear = graduationYear;
        this.phoneNumber = phoneNumber;
    }
}
/*
this is the not right way to create constructor becase there might be all 2 -3 field value constructor is required
 */
/*
to achive with different argument constructor we will use helper class
 */