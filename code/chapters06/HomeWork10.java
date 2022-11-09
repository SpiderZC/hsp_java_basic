public class HomeWork10 {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("jack" , 20, "doctor", 1, 100000);
        Doctor doctor2 = new Doctor("jack" , 20, "doctor", 1, 100000);
        System.out.println(doctor.equals(doctor2));
    }
}

class Doctor {
    private String name;
    private int age;
    private String job;
    private int gender;
    private double sal;

    public Doctor(String name, int age, String job, int gender, double sal) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.sal = sal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getGender() {
        return gender;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public double sal() {
        return sal;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Doctor)) {
            return false;
        }
        Doctor doctor = (Doctor) obj;
        return this.name.equals(doctor.name) && this.age == doctor.age && this.gender == doctor.gender && this.job.equals(doctor.job) && this.sal == doctor.sal;
    }
}
