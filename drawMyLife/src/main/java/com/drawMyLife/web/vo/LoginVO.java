package com.drawMyLife.web.vo;

public class LoginVO {
	public enum Succeed{
		IDERR("iderr"),
		PWERR("pwerr"),
		OK("ok");
		private final String val;
		
		private Succeed(String val){
			this.val=val;
		}
		public String toString()
		{
			return this.val;
		}
		
		public boolean equalsName(String otherName) {
	        // (otherName == null) check is not needed because name.equals(null) returns false 
	        return val.equals(otherName);
	    }
	}
	private String isSucceed;
	
	
	
	public String getIsSucceed() {
		return isSucceed;
	}

	/**
	 * 
	 * @return
	 * 
	 */
	public void setIsSucceed(String isSucceed) {
		this.isSucceed = isSucceed;
	}

	@Override
	public String toString() {
		return "LoginVO [isSucceed=" + isSucceed + "]";
	}
	
}	
