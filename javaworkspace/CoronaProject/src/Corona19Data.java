
public class Corona19Data {
	private int resultCode; // ����ڵ�
	private String resultMsg;// ����޽���	
	private int numOfRows; // �� �������� ǥ�� ������ ��
	private int pageNo; // ������ ��
	private int totalCount; // ������ �� ����
	private int defCnt; // ���� Ȯ���� ��
	private String gubun; // �õ���(�ѱ�)
	private String gubunCn; // �õ���(�߱���)
	private String gubunEn; // �õ���(����)
	private int incDec; // ���ϴ�� ���� ��
	private int isolClearCnt; // �ݸ� ���� ��
	private int localOccCnt; // �����߻� ��
	private int overFlowCnt; // �ؿ����� ��
	private String qurRate; // 10����� �߻���
	private String stdDay; // ���� �Ͻ�
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
		return "Corona19Data [����ڵ�=" + resultCode + ", ����޽���=" + resultMsg + ", �� ������ ��� ��=" + numOfRows
				+ ", ������ ��=" + pageNo + ", ������ �� ����=" + totalCount + ", ����Ȯ���� ��=" + defCnt + ", �õ���=" + gubun
				+ ", �õ���(�߱���)=" + gubunCn + ", �õ���(����)=" + gubunEn + ", ���ϴ������=" + incDec + ", �����ݸ����� ��="
				+ isolClearCnt + ", �����߻� ��=" + localOccCnt + ", �ؿ����� ��=" + overFlowCnt + ", 10����� �߻� ��="
				+ qurRate + ", ��������=" + stdDay + "]";
	}
	
}
