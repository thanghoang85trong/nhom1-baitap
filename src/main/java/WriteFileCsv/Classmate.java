package WriteFileCsv;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Classmate {
    private String name;
    private String birthday;
    private String email;

    public Classmate(String name, String birthday, String email) {
        this.name = name;
        this.birthday = birthday;
        this.email = email;
    }

    public Classmate() {

    }

    @Override
    public String toString() {
        return "Classmate{" +
                "name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean checkName(String name){
        boolean resultname = false;
        String formatname = "^[A-Z]{1}[a-z]{0,6}$";
        resultname = name.matches(formatname);
        return (resultname);
    }
    public boolean checkEmail(String email){
        boolean resulemail = false;
        String formatemail = "^[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}";
        boolean resultemail = email.matches(formatemail);
        return (resultemail);
    }
    public boolean checkBirthday(String birthday){
        boolean resultbirthday = false;
        try {
            SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
            Date d = f.parse(birthday);
        } catch (Exception e) {
            resultbirthday = false;
        }
        return resultbirthday;
    }
    public Classmate inputClassmate() {
        Scanner scanner = new Scanner(System.in);
        Classmate classmate = new Classmate();
        System.out.println("Nhập tên: ");
        classmate.setName(scanner.nextLine());
        while (classmate.checkName(classmate.getName()) == false) {
            System.out.println("Nhập lại tên: ");
            classmate.setName(scanner.nextLine());
        }
        System.out.println("Nhập birthday: ");
        classmate.setBirthday(scanner.nextLine());
        while (classmate.checkBirthday(classmate.getBirthday()) == false) {
            System.out.println("Nhập lại birthday: ");
            classmate.setBirthday(scanner.nextLine());
        }
        System.out.println("Nhập email: ");
        classmate.setEmail(scanner.nextLine());
        while (classmate.checkEmail(classmate.getEmail()) == false) {
            System.out.println("Nhập lại email: ");
            classmate.setEmail(scanner.nextLine());
        }
        return classmate;
    }


}
