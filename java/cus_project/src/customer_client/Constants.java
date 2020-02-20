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
	public static final String COMPLETE = "완료되었습니다";
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
	
	public static final String ENTER_PHONENUM = "전화번호를 입력하세요";
	public static final String ENTER_NAME = "이름을 입력하세요";
	public static final String ENTER_GENDER = "성별을 입력하세요";
	public static final String ENTER_PASSWORD = "비밀번호를 입력하세요";
	public static final String CHANGE_POINT = "변경하실 포인트를 입력하세요";
	public static final String ENTER_TARGET = "변경하실 항목을 입력하세요";
}
