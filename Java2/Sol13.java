public class Sol13 {

    public static void main(String[] args) {
        try {
            throw new UserExeception("Custom Exception");
        }
        catch (UserExeception e) {
            e.printStackTrace();
        }
    }
}

class UserExeception extends Exception {

    public UserExeception(String msg){
        super(msg);
    }

    @Override
    public void printStackTrace() {
        System.out.println(getMessage());
    }
}
