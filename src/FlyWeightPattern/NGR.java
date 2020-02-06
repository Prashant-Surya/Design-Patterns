package FlyWeightPattern;

public class NGR {
    String nationality;
    String gender;
    String religion;
    public static int count;

    public NGR(String nationality, String gender, String religion) {
        this.nationality = nationality;
        this.gender = gender;
        this.religion = religion;
        count += 1;
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
}
