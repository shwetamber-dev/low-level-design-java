package in.codewithsp.adapter;

public class ThirdPartyEmailService {

    public void sendEmailThroughThirdParty(String to, String from){
        System.out.println("Email sent from "+ from + " to "+ to + " using ThirdPartyEmail.");
    }
}
