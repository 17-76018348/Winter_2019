package customer_server;

public interface Constants {
	
	public static final String DB_LOG_ID = "DB 아이디 입력:";
	public static final String DB_LOG_PW = "DB 비밀번호 입력:";
	public static final String CONN_TRU = "연결 성공";
	public static final String CONN_FAL = "연결 실패";
	public static final String CUSTOMER_TABLE_NAME = "CUSTOMER_TABLE";
	public static final String[] CUSTOMER_TABLE_ATTRS = {
			 "CUSTOMER_NAME",
			 "PHONE_NUM",
			 "GENDER",
			 "POINT_"};
	public static final String TAP = "\t";
	public static final String PW_RETRY = "비밀번호가 틀렸습니다 다시 하세요";
	public static final String INPUT_PW = "비밀번호:";
	public static final String REINPUT_PW = "비밀번호 재확인:";
	public static final String SQL_OPEN = "('";
	public static final String SQL_CLOSE = "');";
	public static final String SQL_COMMA = "','";
	public static final String SQL_INT_COMMA = ",";
	public static final String SQL_INT_CLOSE = ")";
}
