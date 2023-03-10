package common;

public enum Enums {
    Login("Login"),
    Register("Register"),
    BookTicketPage("BookTicketPage"),
    Logout("Logout"),
    ManageTicket("ManageTicket"),
    ChangePassword("ChangePassword"),

    CurrentPassword("currentPassword"),
    NewPassword("newPassword"),
    ConfirmPassword("confirmPassword");
    private String Name;

    Enums(String Name) {
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }
}
