package TestPattern;

public class Customer {
    String name;
    String nationality;
    String gender;
    String religion;
    String age;
    String accountId;
    public static int count;

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public String getGender() {
        return gender;
    }

    public String getReligion() {
        return religion;
    }

    public String getAge() {
        return age;
    }

    public String getAccountId() {
        return accountId;
    }

    public Customer(String name, String nationality, String gender, String religion, String age, String accountId) {
        this.name = name;
        this.nationality = nationality;
        this.gender = gender;
        this.religion = religion;
        this.age = age;
        this.accountId = accountId;
        count += 1 ;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", nationality='" + nationality + '\'' +
                ", gender='" + gender + '\'' +
                ", religion='" + religion + '\'' +
                ", age='" + age + '\'' +
                ", accountId='" + accountId + '\'' +
                '}';
    }
}
