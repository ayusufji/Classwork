package feb26;

public class Fraction implements Comparable<Fraction>
{
    private int num;
    private int denom;

    public Fraction(int num, int denom)
    {
        this.num = num;
        this.denom = denom;
        simplifiy();

    }

    @Override
    public int compareTo(Fraction o) {
        int diff = this.num*o.denom - o.num*this.denom;
        if (diff > 0) return 1;
        else if (diff < 0) return -1;
        return 0;
    }

    private void simplifiy()
    {

    }

    @Override
    public boolean equals(Object o)
    {
        if (o instanceof Fraction)
        {
            return this.compareTo((Fraction) o) == 0;
        }
        return false;
    }

}
