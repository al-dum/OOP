package Practica;

public class Person {
    public String FirstName;
    public String LastName;
    public String Gender;
    public String Occupation;
    public int dateOfBirth;


    public Person(String FirstName, String LastName, String Gender, String Occupation, int dateOfBirth) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Gender = "Male";
        this.Occupation = "Accountant";
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setOccupation(String occupation) {
        Occupation = occupation;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getOccupation() {
        return Occupation;
    }

    public String getGender() {
        return Gender;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }


    public String toString() {
        return "First Name: " + FirstName + " Last Name: " + LastName;
    }
}
