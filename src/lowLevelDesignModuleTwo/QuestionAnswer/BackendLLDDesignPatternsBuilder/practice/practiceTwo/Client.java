package lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsBuilder.practice.practiceTwo;

public class Client {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.setAge(12);
        builder.setName("John");
      //  builder.setGraduationYear(2023);
        builder.setGraduationYear(2021);
        Student student=new Student(builder);
        System.out.println("DEBUG");
    }
}
