public class oops {
    public static void main(String[] args) {
     Pen p1=new Pen();
     p1.setColour("blue");
     System.out.println(p1.colour);
     p1.setTip(6);
     System.out.println(p1.tip);

     BankAccount myAccount=new BankAccount();
     myAccount.username="GaganShenvi";
     myAccount.setpassword("gbdbsbcsbc");
     System.out.println(myAccount.username);

    }
}





class Pen {
    String colour;
    int tip;

    void setColour(String newColour) {
        colour = newColour;
    }

    void setTip(int newtip) {
        tip = newtip;
    }
}


