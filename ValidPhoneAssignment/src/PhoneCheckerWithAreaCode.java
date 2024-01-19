//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PhoneCheckerWithAreaCode {
    private String phone;
    public PhoneCheckerWithAreaCode(String phone) {
        this.phone = phone;
    }
    public boolean checkValidNumber() {
        if (phone.length() != 10 || phone.length() != 12) {
            return false;
        }
        else return true;
    }
}