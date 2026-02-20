package behavioral.design.pattern.mediator;

public interface AuctionMediator {
    void placeBid(Bidder bidder,int amount);
    void registerBidder(Bidder bidder);
}
