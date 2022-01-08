package New;

public class UserDetailsImpl{

    private String username;

    private String password;

    private double balance;

    public UserDetailsImpl(String username, String password, double balance) {
        this.username = username;
        this.password = password;
        this.balance = balance;
    }

    public UserDetailsImpl build (UserEntity user){
        return new UserDetailsImpl(user.getName(), user.getPsw(), user.getBal());
    }


    class UserEntity{
        private String name;
        private String psw;
        private double bal;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPsw() {
            return psw;
        }

        public void setPsw(String psw) {
            this.psw = psw;
        }

        public double getBal() {
            return bal;
        }

        public void setBal(double bal) {
            this.bal = bal;
        }
    }
}
