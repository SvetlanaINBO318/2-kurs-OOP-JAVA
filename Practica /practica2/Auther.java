public class Auther {
	 private String email;
     private String name;
     private char gender;

    public Auther(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
       return ""+getName()+" "+getGender()+ " at "+getEmail()+"" ;
    }
}

