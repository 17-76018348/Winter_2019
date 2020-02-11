package customer_client;

public interface Constants {
	public static final String TITLE = "Customer Management";
	public static final String[] MENU = 
		{
				"0.고객 목록 출력",
				"1.신규가입",
				"2.기존 고객 정보 수정",
				"3.고객 포인트 조회",
				"4.고객 번호로 포인트 설정",
				"5.고객 삭제",
				"6.프로그램 종료"
		};
	public static final int MENU_NUM = 7;
	public static final int PRINT_ALL = 0;
	public static final int SIGN_UP = 1;
	public static final int SET_INFO = 2;
	public static final int GET_POINT = 3;
	public static final int SET_POINT = 4;
	public static final int RM_CUSTOMER = 5;
	public static final int EXIT = 6;
	
	public static final String DB_ID_LOGIN = "sql ID 입력:";
	public static final String DB_PW_LOGIN = "sql password 입력:";
	public static final String DB_CONNECT = "DB 연결 성공";
	public static final String DB_NOT_CONNECT = "DB 연결 실패";
	
	
}
