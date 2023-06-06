public class ElectricityBill {
    public static void main(String[] args) {
        System.out.println(electricityBill(4));
    }

    public static int electricityBill(int n) {
        double totalCost = 0.0;
        if (n <= 50) {
            totalCost = n * 0.5;
        } else if (n <= 150) {
            totalCost = 50 * 0.5 + (n-50) * 0.75;
        } else if (n <= 250) {
            totalCost = 50 * 0.5 + 100 * 0.75 + (n-150) * 1.2;
        } else {
            totalCost = 50 * 0.5 + 100 * 0.75 + 100 * 1.2 + (n-250) * 1.5;
        }
        totalCost += 0.2 * totalCost;
        return (int) Math.floor(totalCost);
    }
}
