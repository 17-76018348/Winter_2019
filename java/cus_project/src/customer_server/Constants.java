package customer_server;

public interface Constants {
	
	public static final String DB_LOG_ID = "DB ���̵� �Է�:";
	public static final String DB_LOG_PW = "DB ��й�ȣ �Է�:";
	public static final String CONN_TRU = "���� ����";
	public static final String CONN_FAL = "���� ����";
	public static final String CUSTOMER_TABLE_NAME = "CUSTOMER_TABLE";
	public static final String[] CUSTOMER_TABLE_ATTRS = {
			 "CUSTOMER_NAME",
			 "PHONE_NUM",
			 "GENDER",
			 "POINT_"};
	public static final String TAP = "\t";
	public static final String PW_RETRY = "��й�ȣ�� Ʋ�Ƚ��ϴ� �ٽ� �ϼ���";
	public static final String INPUT_PW = "��й�ȣ:";
	public static final String REINPUT_PW = "��й�ȣ ��Ȯ��:";
	public static final String SQL_OPEN = "('";
	public static final String SQL_CLOSE = "');";
	public static final String SQL_COMMA = "','";
	public static final String SQL_INT_COMMA = ",";
	public static final String SQL_INT_CLOSE = ")";
}
