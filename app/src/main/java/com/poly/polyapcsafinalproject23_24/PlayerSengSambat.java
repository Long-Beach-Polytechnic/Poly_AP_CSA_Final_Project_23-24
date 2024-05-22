public class Player{

    private String name;
    private int points;
    private double money;
    private int numLives;


    public Player(String name, int numLives)
    {
        this.name = name;
        this.points = 0;
        this.money = 0.00;
        this.numLives = numLives;
    }

    public Player(String name, int numLives, double money)
    {
        this.name = name;
        this.points = 0;
        this.money = money;
        this.numLives = numLives;
    }

    public String getName()
    {
        return name;
    }

    public int getPoints()
    {
        return points;
    }

    public double getMoney()
    {
        return money;
    }

    public int getLives()
    {
        return numLives;
    }

    @Override
    public String toString()
    {
        return "name:\t" + name +
                "\npoints:\t" + points +
                "\nmoney:\t" + money +
                "\nlives:\t" + numLives;
    }

    public void setName(String newName)
    {
        this.name = newName;
    }

    public void setPoints(int numPoints)
    {
        this.points = numPoints;
    }

    public void setMoney(double amount)
    {
        this.money = amount;
    }

    public void setLives(int numberOfLives)
    {
        this.numLives = numberOfLives;
    }

    public void addPoints(int amount)
    {
        this.points += amount;
    }

    public void addMoney(double amount)
    {
        this.money += amount;
    }

    public void gainLife()
    {
        numLives++;
    }

    public void loseLife()
    {
        numLives--;
    }


}