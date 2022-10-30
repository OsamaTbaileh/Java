
class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    private double total;
    public static int numberOfAccounts;
    public static double amountOfMoney;


    // constructor:
    BankAccount(double checkingBalance, double savingsBalance){
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        numberOfAccounts++;
    }


    // getters:
    public double getCheckingBalance(){
        return checkingBalance;
    }

    public double getSavingsBalance(){
        return savingsBalance;
    }


    // setters:
    public void setCheckingBalance(double checkingBalance){
        this.checkingBalance = checkingBalance;
    }

    public void setSavingsBalance(double savingsBalance){
        this.savingsBalance = savingsBalance;
    }



    // methods:

    public void makeDeposite(double amount, String saveOrCheck){
        if (saveOrCheck == "save"){
            this.savingsBalance+=amount;
        }
        else if (saveOrCheck == "check"){
            this.checkingBalance+=amount;
        }
        amountOfMoney += amount;
        // System.out.printf("%s $ has been deposited in your acount. \n", amount);
    }

    public void makeWithdraw(double amount, String saveOrCheck){
        if (saveOrCheck == "save" && this.savingsBalance >= amount){
            this.savingsBalance -= amount;
        }
        if (saveOrCheck == "check" && this.checkingBalance >= amount){
            this.checkingBalance -= amount;
        }
        amountOfMoney -= amount;
    }

    public void displayTotal(){
        System.out.println("Total money in checking balance: " + this.checkingBalance);
        System.out.println("Total money in saving balance: " + this.savingsBalance);
    }

}