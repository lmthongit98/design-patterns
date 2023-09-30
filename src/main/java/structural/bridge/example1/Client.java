package structural.bridge.example1;

import structural.bridge.example1.abstractions.BasicMemberRegistration;
import structural.bridge.example1.abstractions.MemberRegistration;
import structural.bridge.example1.abstractions.VipMemberMemberRegistration;
import structural.bridge.example1.implementations.MomoPaymentProcess;
import structural.bridge.example1.implementations.PaymentProcess;
import structural.bridge.example1.implementations.VisaPaymentProcess;

public class Client {

    public static void main(String[] args) {
        PaymentProcess momoPaymentProcess = new MomoPaymentProcess("0363898771");
        MemberRegistration vipMemberMemberRegistration = new VipMemberMemberRegistration(momoPaymentProcess);
        vipMemberMemberRegistration.register();

        PaymentProcess visaPaymentProcess = new VisaPaymentProcess("13579");
        MemberRegistration basicMemberRegistration = new BasicMemberRegistration(visaPaymentProcess);
        basicMemberRegistration.register();
    }

}
