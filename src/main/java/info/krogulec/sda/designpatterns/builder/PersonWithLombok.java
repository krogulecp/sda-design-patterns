package info.krogulec.sda.designpatterns.builder;

import lombok.Builder;
import lombok.Getter;

/**
 * @author krogulecp
 */
@Builder
@Getter
class PersonWithLombok {
    private String firstName;
    private String lastName;
    private int age;
    private String bloodType;
    private String carMake;
}
