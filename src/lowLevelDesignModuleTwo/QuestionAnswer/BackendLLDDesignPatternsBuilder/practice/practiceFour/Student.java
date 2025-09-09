package lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsBuilder.practice.practiceFour;

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
        return new Builder();
    }
    private Student(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.psp = builder.psp;
        this.universityName = builder.universityName;
        this.batch = builder.batch;
        this.id = builder.id;
        this.graduationYear = builder.graduationYear;
        this.phoneNumber = builder.phoneNumber;
    }
    //-------------static class----------------
    public static class Builder{
        private String name;
        private int age;
        private double psp;
        private String universityName;
        private String batch;
        private long id;
        private int graduationYear;
        private String phoneNumber;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public String getUniversityName() {
            return universityName;
        }

        public Builder setUniversityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public long getId() {
            return id;
        }

        public Builder setId(long id) {
            this.id = id;
            return this;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public int getGraduationYear() {
            return graduationYear;
        }

        public Builder setGraduationYear(int graduationYear) {
            this.graduationYear = graduationYear;
            return this;
        }

        public Student build(){
            if(getGraduationYear()>2022){
                throw new IllegalArgumentException("Graduation year is greater than 2022");
            }
            return new Student(this);
        }
    }
}
