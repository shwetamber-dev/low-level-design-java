package in.codewithsp.adapter;

public class EmailAdapter implements OurEmailService{

    ThirdPartyEmailService thirdPartyEmailService;

    public EmailAdapter(ThirdPartyEmailService thirdPartyEmailService){
        this.thirdPartyEmailService = thirdPartyEmailService;
    }

    @Override
    public void sendEmail(String to, String from) {
       thirdPartyEmailService.sendEmailThroughThirdParty(to,from);
    }
}
