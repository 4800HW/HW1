public class driver {
    
    public static void main(String[] args)
    {
        SalariedEmployee employee1 = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500.0);
        HourlyEmployee employee2 = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25.0, 32.0);
        HourlyEmployee employee3 = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19.0, 47.0);
        CommissionEmployee employee4 = new CommissionEmployee("Nicole", "Dior", "444-44-4444", 15, 50000.0);
        SalariedEmployee employee5 = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700.0);
        BaseEmployee employee6 = new BaseEmployee("Mike", "Dvenport", "666-66-6666", 95000.0);
        CommissionEmployee employee7 = new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 22, 40000.0);
    }
}
