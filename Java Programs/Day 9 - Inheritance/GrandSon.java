class Thatha
{
int cash = 100000000;
Thatha(int bonus)
{
    cash = cash+99;
}
void farmer()
{
    System.out.println("Farming");
}
}
class Dad extends Thatha
{
    Dad()
    {
        super(99);
    }
    
    int cash = 999;
    
    void business()
    {
        System.out.println("Business");
    }
    void getCash()
    {
        System.out.println(super.cash);
    }
}
class Son extends Dad
{
    int cash = 99;
    void job()
    {        
        System.out.println("Job");
    }
    
}

class GrandSon extends Son
{
    void streamer()
    {
        System.out.println("Streamer");
    }
public static void main(String args[])
    {
        int sonCash = 99;
        GrandSon gs = new GrandSon();
        Dad d = new Dad();
        gs.getCash();
        /*System.out.println(gs.cash);
        
        gs.business();
        gs.farmer();
        gs.job();
        gs.streamer();
        //System.out.println(gs.cash);
        //System.out.println(gs.cash);
        d.business();
        d.farmer();*/
        

    }
}