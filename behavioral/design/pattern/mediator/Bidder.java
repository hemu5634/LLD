package behavioral.design.pattern.mediator;

public class Bidder {
    private AuctionMediator mediator;
    private String name;

    public Bidder(String name,AuctionMediator mediator){
        this.name=name;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void placeBid(int amount){
        mediator.placeBid(this,amount);
    }

    public void receiveBid(Bidder bidder,int amount){
        System.out.println(name + " recieved a bid from " + bidder.getName() + " of amount " + amount);
    }
}
