public class IDK {
    public double totalWages(double hours, double rate){
        double overtime=hours-40;
        double overrate=rate*1.5;

        if (hours<=40)
            return (hours*rate);
        else
            return ((40*rate)+(overrate*overtime));
    }

    public boolean isLeapYear(int year){
        //if (year/4==)
    }




    /* double wages = totalWages(45, 12.5);
System.out.println(&quot;Wages for 45 hours at $12.50 &quot; + wages);
    wages = totalWages(30, 10);
System.out.println(&quot;Wages for 30 hours at $10.00 &quot; + wages);
// leap year
System.out.println(&quot;2000 &quot; + isLeapYear(2000));
System.out.println(&quot;2004 &quot; + isLeapYear(2004));
System.out.println(&quot;2003 &quot; + isLeapYear(2003));
System.out.println(&quot;2100 &quot; + isLeapYear(2100));
// is later
System.out.println(&quot;1/2/2010 is later than 1/2/2011 &quot; + isLater(1,2,2010,
                                                                                  1,2,2011));
System.out.println(&quot;1/2/2011 is later than 1/2/2010 &quot; + isLater(1,2,2011,
                                                                                  1,2,2010));
System.out.println(&quot;1/2/2010 is later than 3/2/2010 &quot; + isLater(1,2,2010,
                                                                                  3,2,2010));
System.out.println(&quot;3/2/2010 is later than 1/2/2010 &quot; + isLater(3,2,2010,
                                                                                  1,2,2010));
System.out.println(&quot;1/3/2010 is later than 1/2/2010 &quot; + isLater(1,3,2010,
                                                                                  1,2,2010));
System.out.println(&quot;1/2/2010 is later than 1/3/2011 &quot; + isLater(1,2,2010,
                                                                                  1,3,2010));
System.out.println(&quot;1/2/2010 is later than 1/2/2010 &quot; + isLater(1,2,2010,
                                                                                  1,2,2010));
// Best match
System.out.println(&quot;Best match 2 3 4 &quot; + bestMatch(2,3,4));
System.out.println(&quot;Best match 4 3 3 &quot; + bestMatch(4,3,3));
System.out.println(&quot;Best match 3 8 4 &quot; + bestMatch(3,8,4));
System.out.println(&quot;Best match 4 3 4 &quot; + bestMatch(4,3,4));
System.out.println(&quot;Best match 2 4 4 &quot; + bestMatch(2,4,4));
System.out.println(&quot;Best match 8 8 4 &quot; + bestMatch(8,8,4));

System.out.println(&quot;Best match 4 4 4 &quot; + bestMatch(4,4,4));
// Best Fit
System.out.println(&quot;Find Best fit 2 3 6 is &quot; + findBestFit(2,3,6));
System.out.println(&quot;Find Best fit 4 3 6 is &quot; + findBestFit(4,3,6));
System.out.println(&quot;Find Best fit 3 4 6 is &quot; + findBestFit(3,4,6));
System.out.println(&quot;Find Best fit 2 3 1 is &quot; + findBestFit(2,3,1));
System.out.println(&quot;Find Best fit 6 3 4 is &quot; + findBestFit(6,3,4));
System.out.println(&quot;Find Best fit 3 6 4 is &quot; + findBestFit(3,6,4));
 */
}
