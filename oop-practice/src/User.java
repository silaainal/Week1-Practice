//make it clear difference between parameter and class variable.

public class User {
    String name;
    String email;
    int userID;

    public User(String name, String email, int userID){
        //this keyword represents the current object.
        //basically, you can directly access to a variable or an object in a class.

        this.name = name;
        this.email = email;
        this.userID = userID;
    }

    public void displayInfo(){
        System.out.println("User Name: " + name + " Email: " + email + " UserID: " + userID);
    }

    public User changeEmail(String newEmail){
        //if we wrote return null, it will not run. return stops method. it becomes unreachable.
        if (this.email.equals(newEmail)) {
            System.out.println("Old Email cannot be same with New Email");
        } else {
            this.email = newEmail;
            System.out.println("Email changed successfully");
        }

        if(newEmail == null || newEmail.equals("")){
            System.out.println("New Email cannot be empty.");
            return this;
        }

        return this;
    }
}