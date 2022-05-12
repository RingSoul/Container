public class Player {
    private int hunger; // 1-10 with 1 as not hungry and 10 as extremely hungry
    private int intelligence; // 1-10 with 1 as not intelligent and 10 as extremely intelligent
    private int sanity; // 1-10 with 1 as insane and 10 as extremely calm
    private String status; // random

    public Player()
    {
        hunger = 5;
        intelligence = 5;
        sanity = 5;
        status = "confused about life";
    }
}
