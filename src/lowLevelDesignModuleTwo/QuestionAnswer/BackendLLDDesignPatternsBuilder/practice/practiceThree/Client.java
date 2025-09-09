package lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsBuilder.practice.practiceThree;

public class Client {
    public static void main(String[] args) {
        Builder builder=Student.getBuilder();
        Student john=builder.build();
        System.out.println(john);
    }
}
