
import java.util.HashMap;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class ATM extends javax.swing.JFrame {

   public static void main(String[] args) 
	{
		OptionMenu op  = new OptionMenu();
		System.out.println("\t\t** WEL_COME TO RSCOE ATM **");
		System.out.println("\t      ______________________________");
		System.out.println("\t      ______________________________\n");
		op.getlogin();
	}
    
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        txt3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(204, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("WEL-COME TO RSCOE ATM");

        jLabel2.setText("Enter Account Number");

        jLabel3.setText("PassWord");

        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });

        txt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt2ActionPerformed(evt);
            }
        });

        txt3.setText("Login");
        txt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(423, 423, 423)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(393, 393, 393)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(137, 137, 137)
                                .addComponent(txt2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(67, 67, 67)
                                .addComponent(txt1, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)))))
                .addGap(707, 707, 707))
            .addGroup(layout.createSequentialGroup()
                .addGap(555, 555, 555)
                .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(127, 127, 127)
                .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(252, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1ActionPerformed

    private void txt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt2ActionPerformed

    private void txt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt3ActionPerformed

    /**
     * @param args the command line arguments
     */
    //import java.text.DecimalFormat;

class Account {
	private  int CN ;
	private int PN;
	double CB = 2000;
	double SB = 1000;
//	DecimalFormat df = new DecimalFormat("'Rupee '###,##0.00");
	Scanner s = new Scanner(System.in);
	
	 void setCustomerNumber(int CustomerNumber)
	{
		 CN  = CustomerNumber;
		 //System.out.println("CN ");
	}
	 void setPINNumber(int PINNumber)
	 {
		 PN = PINNumber;
		 //System.out.println("PN ");
	 }
	 int getCustomerNumber()
	 {
		 return CN;
	 }
	 int getPINNumber()

	 {
		  return PN;
	 }
	 
	 double getCurrentBalance()
	 {
		 return CB;
	 }
	 double getSavingBalance()
	 {
		 return SB;
	 }
	 
	 void getCurrentWithdrawInput()
	 {
		 System.out.println("Your Current Account Balance is :  "+ (CB));
		 
	 }
}
static class OptionMenu extends Account 
{	
	Scanner s = new Scanner(System.in);
	HashMap <Integer, Integer> hm = new HashMap<Integer, Integer>();
	//DecimalFormat df = new DecimalFormat("'Rupee '###,##0.00");
	
	void getlogin()
	{
		int x = 1;
		
		do
		{
			try
			{
				
				
				System.out.print("Enter your Customer Number: ");
				setCustomerNumber(s.nextInt());
				
				System.out.print("Enter your Pin Number: ");
				setPINNumber(s.nextInt());
				
				hm.put(11111, 111);
				hm.put(22222, 222);
				hm.put(33333, 333);
				hm.put(44444, 444);
				hm.put(55555, 555);
				
				int a = getCustomerNumber();
				int b = getPINNumber();
				
				if(hm.containsKey(a)&& hm.get(a) == b)
				{
					System.out.println("\n\t\tlogin Secussfully");
					System.out.println("           __________________________ ");
					System.out.println("           __________________________\n ");
					getAccountType(); 
				}
				else
				{
					System.out.println("Opps ! Invalid Credential ! Plz Try Again");
					System.out.println("_________________________________________\n ");
				}
				
			}
			catch(Exception a)
			{
				System.out.println("Please enter only numbers." +"\nCharacters and symbols not Allowed !");
				x = 2;
			}
		} while(x == 1);
		
	}
	void getAccountType()
	{
		System.out.println("Select the Account type you want to access: \n");
		System.out.println("Type 1 : Current Account ");
		System.out.println("Type 2 : Savings Account ");
		System.out.println("Type 3 : Exit \n");
		System.out.print("\tSelect Choice : ");
		System.out.print("\n\t_____________");

		
		int choice = s.nextInt();
		
		switch(choice)
		{
		case 1:	getCurrent();
				break;
		case 2:	getSaving();
				break;		
		case 3:System.out.println("Thank you for Visiting ! Visit Again");
		getAccountType();
			break;
		default:System.out.println("Invalid Choice ! Please enter valid Choice! ");
			break;
		}
		
	}
	void getCurrent()
	{
		System.out.println("\n------You Have Entered In Current Account------------\n");
		System.out.println("Type 1 : View Balance ");
		System.out.println("Type 2 : Withdraw Funds");
		System.out.println("Type 3 : Deposit Funds");
		System.out.println("Type 4 : Exit");
		System.out.print("\n\tSelect Choice : ");
		System.out.println("\n\t_____________");
		
		int choice = s.nextInt();
		
		switch(choice)
		{
		case 1:System.out.println("Your Current Account balance : " +(getCurrentBalance()));
			break;
		case 2:getcurrentwithdrawinput();	
		    getCurrent();
			break;
		case 3:currentdeposit();
		System.out.println("Now your balace is : "+ CB);
			break;
		case 4:System.out.println("Thank you for visiting ! Visit Again ! ");
		getAccountType();
			break;
		default:System.out.println("Invalid Choice !");
		getCurrent();
			break;
		}
		
		
	}
	void getSaving()
	{
		System.out.println("-------------You Have Entered In Current Account\n");
		System.out.println("Type 1 : View Balance ");
		System.out.println("Type 2 : Withdraw Funds");
		System.out.println("Type 3 : Deposit Funds");
		System.out.println("Type 4 : Exit\n");
		System.out.print("\n\tSelect Choice : ");
		System.out.println("\n\t_____________");		
		int choice = s.nextInt();
		
		switch(choice)
		{
		case 1:System.out.println("Your Saving Account balance : " +(getSavingBalance()));
			break;
		case 2:getSavingwithdrawinput();
		    getAccountType();
			break;
		case 3:savingdeposit();
		System.out.println("Now your balace is : "+ SB +"\n");
		
		
			break;
		case 4:System.out.println("Thank you for visiting ! Visit Again ! ");
			break;
			
		default:System.out.println("Invalid Choice !");
		getSaving();
			break;
		}
	}
	double calsiCurrentWithdraw(double money) {
		CB=CB-money;
		return CB;
	}
	
	double calsiSavingWithdraw(double money) {
		SB=SB-money;
		return SB;
	}
	
	void getcurrentwithdrawinput() {
		System.out.println("your current account balance is :"+CB);
		System.out.println("Amount you want to withdraw from your current account :");
		double Amount=s.nextDouble();
		if((CB-Amount)>=0) {
			calsiCurrentWithdraw(Amount);
			
			//System.out.println("your new checking account balance is:"+" "+(CB-Amount));
		}
		else {
			System.out.println("insufficient balace for this transition");
		}
	}
	
	void getSavingwithdrawinput() {
		System.out.println("your current account balance is :"+SB);
		System.out.println("Amount you want to withdraw from your current account :");
		double Amount=s.nextDouble();
		if((SB-Amount)>=0) {
			calsiCurrentWithdraw(Amount);
			//System.out.println("your new checking account balance is:"+" "+(SB-Amount));
		}
		else {
			System.out.println("insufficient balace for this transition !");
		}
	}
	
	  void currentdeposit() {
		 
		  System.out.println("amount you want to deposit :__");
		  double A=s.nextDouble();
		  if(CB+A>=0) {
			  CB+=A;
		  }
		  else {
			  System.out.println("Enter valid Amount");
		  }
	  }
	  void savingdeposit() {
		 
		  System.out.print("amount you want to deposit :__");
		  double A=s.nextDouble();
		  if(SB+A>=0) {
			  SB+=A;
		  }
		  else {
			  System.out.println("Enter valid Amount");
		  }
	  }
}



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JButton txt3;
    // End of variables declaration//GEN-END:variables
}