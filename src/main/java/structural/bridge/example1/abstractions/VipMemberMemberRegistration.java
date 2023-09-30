package structural.bridge.example1.abstractions;

import structural.bridge.example1.implementations.PaymentProcess;

public class VipMemberMemberRegistration implements MemberRegistration {

    private final PaymentProcess paymentProcess;

    public VipMemberMemberRegistration(PaymentProcess paymentProcess) {
        this.paymentProcess = paymentProcess;
    }

    @Override
    public void register() {
        int amount = 10000;
        this.paymentProcess.pay(amount);
        System.out.println("Registered for Youtube membership");
    }

}
