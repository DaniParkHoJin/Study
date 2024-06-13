
public class Corona19Data {
	private int resultCode; // 결과코드
	private String resultMsg;// 결과메시지	
	private int numOfRows; // 한 페이지당 표출 데이터 수
	private int pageNo; // 페이지 수
	private int totalCount; // 데이터 총 개수
	private int defCnt; // 누적 확진자 수
	private String gubun; // 시도명(한글)
	private String gubunCn; // 시도명(중국어)
	private String gubunEn; // 시도명(영어)
	private int incDec; // 전일대비 증감 수
	private int isolClearCnt; // 격리 해제 수
	private int localOccCnt; // 지역발생 수
	private int overFlowCnt; // 해외유입 수
	private String qurRate; // 10만명당 발생률
	private String stdDay; // 기준 일시
	public Corona19Data() {
		super();
	}
	public Corona19Data(int resultCode, String resultMsg, int numOfRows, int pageNo, int totalCount, int defCnt,
			String gubun, String gubunCn, String gubunEn, int incDec, int isolClearCnt, int localOccCnt,
			int overFlowCnt, String qurRate, String stdDay) {
		super();
		this.resultCode = resultCode;
		this.resultMsg = resultMsg;
		this.numOfRows = numOfRows;
		this.pageNo = pageNo;
		this.totalCount = totalCount;
		this.defCnt = defCnt;
		this.gubun = gubun;
		this.gubunCn = gubunCn;
		this.gubunEn = gubunEn;
		this.incDec = incDec;
		this.isolClearCnt = isolClearCnt;
		this.localOccCnt = localOccCnt;
		this.overFlowCnt = overFlowCnt;
		this.qurRate = qurRate;
		this.stdDay = stdDay;
	}
	public int getResultCode() {
		return resultCode;
	}
	public void setResultCode(int resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultMsg() {
		return resultMsg;
	}
	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public int getNumOfRows() {
		return numOfRows;
	}
	public void setNumOfRows(int numOfRows) {
		this.numOfRows = numOfRows;
	}
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getDefCnt() {
		return defCnt;
	}
	public void setDefCnt(int defCnt) {
		this.defCnt = defCnt;
	}
	public String getGubun() {
		return gubun;
	}
	public void setGubun(String gubun) {
		this.gubun = gubun;
	}
	public String getGubunCn() {
		return gubunCn;
	}
	public void setGubunCn(String gubunCn) {
		this.gubunCn = gubunCn;
	}
	public String getGubunEn() {
		return gubunEn;
	}
	public void setGubunEn(String gubunEn) {
		this.gubunEn = gubunEn;
	}
	public int getIncDec() {
		return incDec;
	}
	public void setIncDec(int incDec) {
		this.incDec = incDec;
	}
	public int getIsolClearCnt() {
		return isolClearCnt;
	}
	public void setIsolClearCnt(int isolClearCnt) {
		this.isolClearCnt = isolClearCnt;
	}
	public int getLocalOccCnt() {
		return localOccCnt;
	}
	public void setLocalOccCnt(int localOccCnt) {
		this.localOccCnt = localOccCnt;
	}
	public int getOverFlowCnt() {
		return overFlowCnt;
	}
	public void setOverFlowCnt(int overFlowCnt) {
		this.overFlowCnt = overFlowCnt;
	}
	public String getQurRate() {
		return qurRate;
	}
	public void setQurRate(String qurRate) {
		this.qurRate = qurRate;
	}
	public String getStdDay() {
		return stdDay;
	}
	public void setStdDay(String stdDay) {
		this.stdDay = stdDay;
	}
	@Override
	public String toString() {
		return "Corona19Data [결과코드=" + resultCode + ", 결과메시지=" + resultMsg + ", 한 페이지 결과 수=" + numOfRows
				+ ", 페이지 수=" + pageNo + ", 데이터 총 개수=" + totalCount + ", 누적확진자 수=" + defCnt + ", 시도명=" + gubun
				+ ", 시도명(중국어)=" + gubunCn + ", 시도명(영문)=" + gubunEn + ", 전일대비증감=" + incDec + ", 누적격리해재 수="
				+ isolClearCnt + ", 지역발생 수=" + localOccCnt + ", 해외유입 수=" + overFlowCnt + ", 10만명당 발생 수="
				+ qurRate + ", 기준일자=" + stdDay + "]";
	}
	
}
