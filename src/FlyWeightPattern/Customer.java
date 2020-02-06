package FlyWeightPattern;

public class Customer {
    String name;
    String age;
    String accountId;
    NGR ngr;

    public static int count;

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getAccountId() {
        return accountId;
    }

    public Customer(String name, String nationality, String gender, String religion, String age, String accountId) {
        this.name = name;
        this.age = age;
        this.accountId = accountId;
        count += 1 ;
        this.ngr = NGRPool.getInstance(nationality, gender, religion);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", nationality='" + ngr.nationality + '\'' +
                ", gender='" + ngr.gender + '\'' +
                ", religion='" + ngr.religion + '\'' +
                ", age='" + age + '\'' +
                ", accountId='" + accountId + '\'' +
                '}';
    }
}
