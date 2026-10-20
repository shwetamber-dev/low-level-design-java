package in.codewithsp.adapter;

public class Main {
    public static void main(String[] args) {
        ThirdPartyEmailService thirdPartyEmailService = new ThirdPartyEmailService();
        EmailAdapter emailAdapter = new EmailAdapter(thirdPartyEmailService);
        String to = "someone@email.com";
        String from = "me@email.com";
        emailAdapter.sendEmail(to, from);
    }
}
