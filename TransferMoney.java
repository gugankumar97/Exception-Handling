package ExceptionHandling;

public class TransferMoney {

	public static void main(String[] args) {
		
		AccountDetails accDet = new AccountDetails();

		accDet.setFromAccountNo("S001");
		accDet.setToAccountNo("S002");
		accDet.setFromAccountBal(1000);
		accDet.setTansferrableMoney(5000);

		// transferMoney(accDet.getFromAccountNo(),
		// accDet.toAccountNo,accDet.fromAccountBal, accDet.getTansferrableMoney());
		
		  
		  try { 
			  transferMoney(accDet.getFromAccountNo(),
		  accDet.toAccountNo,accDet.fromAccountBal, accDet.getTansferrableMoney());
		  }catch(LowBalanceException le) {
			  System.out.println("Exception handled : " +le.getMessage()); //name, description
			  //le.printStackTrace();//name, description, lineno from where the excpetion is thrown
			// System.out.println(le.toString());
		  }
		 
	}

	private static void transferMoney(String fromAccountNo, String toAccountNo, double fromAccountBal,
			double tansferrableMoney) throws LowBalanceException {

		LowBalanceException lb = new LowBalanceException("LB Exception");
		
		if (fromAccountBal < tansferrableMoney) {
			throw lb;
		} else {
			System.out.println(" Transaction Successful");
		}

	}


	}


