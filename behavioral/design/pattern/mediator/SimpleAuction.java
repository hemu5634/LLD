package behavioral.design.pattern.mediator;

import java.util.ArrayList;
import java.util.List;

public class SimpleAuction implements AuctionMediator{
    private List<Bidder> bidders = new ArrayList<>();
    @Override
    public void placeBid(Bidder bidder, int amount) {
        System.out.println("\n" + bidder.getName()+" placed a bid of amount " + amount);
        for (Bidder bid : bidders){
            if(bid!=bidder){
                bid.receiveBid(bidder,amount);
            }
        }
    }
    @Override
    public void registerBidder(Bidder bidder) {
        System.out.println(bidder.getName() + " registered for the Auction.");
        bidders.add(bidder);
    }
}
