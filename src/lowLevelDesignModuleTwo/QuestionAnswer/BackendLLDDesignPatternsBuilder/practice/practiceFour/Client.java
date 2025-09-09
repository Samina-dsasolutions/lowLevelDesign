package lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsBuilder.practice.practiceFour;

public class Client {
    public static void main(String[] args) {
       /* Student.Builder builder =Student.getBuilder();
        Student student = builder.build();

        */

        Student john=
                Student.getBuilder()
                        .setAge(10)
                        .setName("john")
                        .setPsp(8.8)
                        .setBatch("morning batch")
                        .setPhoneNumber("7600000000")
                        .setUniversityName("XYZ")
                        .setGraduationYear(2019)
                        .build();
        System.out.println(john);
    }
}
