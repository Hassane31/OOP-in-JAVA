public class Employee {
   private String name ;
   private String email ;
   private String phone ;
   private String departement ;
   private String yearOfBirth ;


public Employee (){
    System.out.println("no paramter comstructor");
}
public Employee (String name ,String email , String phone ,String departement ,String yearOfBirth){
    this.name = name ;
    this.email = email;
    this.phone = phone;
    this.departement =departement ;
    this.yearOfBirth = yearOfBirth ;
}
public String getName() {
    return name;
}
public String getPhone() {
    return phone;
}public String getEmail() {
    return email;
}public String getDepartement() {
    return departement;
}public String getYearOfBirth() {
    return yearOfBirth;
}
public void setName(String name) {
    this.name = name;
}public void setEmail(String email) {
    this.email = email;
}public void setPhone(String phone) {
    this.phone = phone;
}public void setDepartement(String departement) {
    this.departement = departement;
}public void setYearOfBirth(String yearOfBirth) {
    this.yearOfBirth = yearOfBirth;
}
}