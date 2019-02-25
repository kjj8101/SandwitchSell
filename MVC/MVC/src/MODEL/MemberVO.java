package MODEL;

public class MemberVO {
	private String ID;
	private String PW;
	private String NAME;
	private String ADDRESS;
	private String TELEPHONE;
	MemberVO(){
		//싱글톤으로 멤버데이터 받아와서 생성.
	}
	MemberVO(String ID,String PW){ 
		this.ID=ID;
		this.PW=PW;
		
	}
	public String getID() {
		return this.ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getPW() {
		return this.PW;
	}

	public void setPW(String pW) {
		PW = pW;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}

	public String getADDRESS() {
		return ADDRESS;
	}

	public void setADDRESS(String aDDRESS) {
		ADDRESS = aDDRESS;
	}

	public String getTELEPHONE() {
		return TELEPHONE;
	}

	public void setTELEPHONE(String tELEPHONE) {
		TELEPHONE = tELEPHONE;
	}
	
}
