package practiceDay31CustomClass;

public class SalaryCalculator {

    public double hourlyRate, stateTaxRate, federalTaxRate;
    public int weeklyHours;

    public SalaryCalculator(double hourlyRate, double stateTaxRate, double federalTaxRate, int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }

    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", weeklyHours=" + weeklyHours +
                '}';
    }

    public double salary() {
        return weeklyHours * hourlyRate * 52;
    }

    public double stateTax() {
        return stateTaxRate * salary();
    }

    public double federalTax() {
        return federalTaxRate * salary();
    }

    public double salaryAfterTax() {
        return salary() - federalTaxRate - stateTaxRate;
    }
}
