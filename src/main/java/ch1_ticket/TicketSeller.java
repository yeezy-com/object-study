package ch1_ticket;

public class TicketSeller {

    // 판매원이 매표소를 소유하는 것이 맞나?
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public TicketOffice getTicketOffice() {
        return ticketOffice;
    }
}
