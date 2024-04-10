public class HeartRates {
    private String firstName;
    private String lastName;
    private int birthYear;
    private int currentYear;

    public HeartRates (String firstname,String lastName,int birthYear /*int currentYear8*/) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        //this.currentYear = currentYear;

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setBirthYear(){
        this.birthYear = birthYear;
    }

    public int getBirthYear(){
        return birthYear;
    }
    
}

    

