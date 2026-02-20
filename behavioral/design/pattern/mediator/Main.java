package behavioral.design.pattern.mediator;

public class Main {
    public static void main(String[] args) {
        AuctionMediator simple = new SimpleAuction();
        Bidder himanshu = new Bidder("himanshu",simple);
        Bidder yash = new Bidder("yash",simple);
        Bidder ayush = new Bidder("ayush",simple);
        simple.registerBidder(himanshu);
        simple.registerBidder(ayush);
        simple.registerBidder(yash);
        himanshu.placeBid(100);
        yash.placeBid(200);
        ayush.placeBid(250);
    }
}
