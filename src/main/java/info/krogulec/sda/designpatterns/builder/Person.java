package info.krogulec.sda.designpatterns.builder;

/**
 * @author krogulecp
 */
class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String bloodType;
    private String carMake;

    private Person() {
    }

    static class Builder{
        private Person person = new Person();

        public Builder setFistName(String fistName){
            person.firstName = fistName;
            return this;
        }

        public Builder setLastName(String lastName){
            person.lastName = lastName;
            return this;
        }

        public Builder setAge(int age){
            person.age = age;
            return this;
        }

        public Builder setBloodType(String bloodType){
            person.bloodType = bloodType;
            return this;
        }

        public Builder setCarMake(String carMake){
            person.carMake = carMake;
            return this;
        }

        public Person build(){
            return person;
        }
    }
}
