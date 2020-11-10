package com.ddd.erp;

public class Bank {

	
	private int tot_money = 9000;
	
	
	public int getMoney() {
		
	
		return tot_money;

	}
	
	// deposit 입금하다
	public void deposit(int deposit_money) {
		
		tot_money = tot_money + deposit_money;	
		
		System.out.println("[입금성공] => [입금액]: " +
		deposit_money + "[현재잔액]: " + tot_money);
	}
	// withdraw 출금액 외부에서 들어온 출금액
	public void withdraw(int withdraw_money) {
		
		if (tot_money >= withdraw_money ) {
			
			tot_money = tot_money - withdraw_money;
			
			System.out.println("[출금성공] => [출금액]: " +
					withdraw_money + "[현재잔액]: " + tot_money);
			
		}else {
			
			System.out.println("[출금실패] => [출금액]: " +
					withdraw_money + "은 잔액보다 큽니다" );
			
		}

	}
	
}
