package info.krogulec.sda.designpatterns.builder;

/**
 * @author krogulecp
 */
class PersonUser {

    void usePerson(){
        Person janek = new Person.Builder()
                .setFistName("Jan")
                .setLastName("Kowalski")
                .setAge(12)
                .setBloodType("A")
                .build();
    }

    void usePersonWithLombok(){
        PersonWithLombok personWithLombok = PersonWithLombok.builder()
                .firstName("Jan")
                .lastName("Kowalski")
                .build();
    }
}
