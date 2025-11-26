class MyDate
{
    public static void main(String[] args) 
    {
        java.util.Date d = new java.util.Date();
        System.out.println(d.getDate() + "." + (d.getMonth() + 1) + "." + (d.getYear() + 1900));
    }
}
