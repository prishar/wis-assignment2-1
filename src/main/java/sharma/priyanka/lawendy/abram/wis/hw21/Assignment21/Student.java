package sharma.priyanka.lawendy.abram.wis.hw21.Assignment21;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.UUID;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Student {
    private long id;
    private String name;
    private String subject;

    public Student() {
    }

    public Student(String name, String subject) {
//      Use unique numbers to display id if more then one students
        this.id = UUID.randomUUID().getMostSignificantBits() & Long.MAX_VALUE;
        this.name = name;
        this.subject = subject;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Student {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
