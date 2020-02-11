package homework1;

public interface Constants {
	public static final String[] MENU = 
		{
				"0.�� ��� ���",
				"1.�ű԰���",
				"2.���� �� ���� ����",
				"3.�� ����Ʈ ��ȸ",
				"4.�� ��ȣ�� ����Ʈ ����",
				"5.�� ����",
				"6.���α׷� ����"
		};
	public static final int PRINT_ALL = 0;
	public static final int SIGN_UP = 1;
	public static final int SET_INFO = 2;
	public static final int GET_POINT = 3;
	public static final int SET_POINT = 4;
	public static final int RM_CUSTOMER = 5;
	public static final int EXIT = 7;
	public static final int MENU_NUM = 7;
	public static final String NO_MORE_CUSTOMERS = "���� �����ϴ�";
	public static final String ENTER_PHONENUM = "��ȭ��ȣ�� �Է��ϼ���";
	public static final String ENTER_NAME = "�̸��� �Է��ϼ���";
	public static final String ENTER_GENDER = "������ �Է��ϼ���";
	public static final String COMPLETE = "�Ϸ�Ǿ����ϴ�";
	public static final String ENTER_PASSWORD = "��й�ȣ�� �Է��ϼ���";
	public static final String LOGIN_SUCCESS = "�α��ο� �����Ͽ����ϴ�";
	public static final String ENTER_POINT = "�����Ͻ� ����Ʈ�� �Է��ϼ���";
	public static final String REMOVE_COMPLETE = "�� ���� �Ϸ�";
	
	
	

	public static final int PRINT_CUSTOMER_LIST = 0;
	public static final int REGISTER_NEW_CUSTOMER = 1;
	public static final int MODIFY_CUSTOMER_INFO = 2;
	public static final int LOOKUP_CUSTOMER_POINT = 3;
	public static final int DELETE_CUSTOMER = 4;

	public static final String TITLE = "\n\t### Customer Management Program v1.1 ###\n";
	public static final String[] MENUS = {"## 0. �� ��� ���\n",
										 "## 1. �ű� �� ���\n",
										 "## 2. �� ���� ����\n",
										 "## 3. �� ����Ʈ ��ȸ\n",
										 "## 4. �� ����\n",
										 "## 5. ���α׷� ����\n",
										 ">> Input : "}; 
	public static final String INT_MISMATCH_EXCEPT_MSG = "�߸��Է��߽��ϴ�!! ������ �ٽ� �Է����ּ���.";
	public static final String FATAL_ELSE_MSG = "�߻��ϸ� �� �Ǵ� else�� �߻��߽��ϴ�!!";
	public static final String NO_EXIST_CUSTOMER_MSG = "�� ����� �����ϴ�!!";
	public static final String INVALID_CUSTOMER_NO_MSG = "�ش� �� ��ȣ�� �������� �ʽ��ϴ�!! �ٽ� �Է��ϼ���";
	public static final String MODIFY_CUSTOMER_MSG = ">> �����ϰ� ���� ������ �� ��ȣ�� �Է��ϼ��� : ";
	public static final String LOOKUP_CUSTOMER_MSG = ">> ��ȸ�� ���ϴ� ������ �� ��ȣ�� �Է��ϼ��� : ";
	public static final String DELETE_CUSTOMER_MSG = ">> ������ ���ϴ� ������ �� ��ȣ�� �Է��ϼ��� : ";
	public static final String CNO_ALREADY_EXIST_MSG = ">> �̹� �����ϴ� ��ȣ�Դϴ�. �ٽ� �Է����ּ���.";
	public static final String ADMIN_LOGIN_ID_MSG = "������ ������ �ʿ��մϴ�.\n>> ADMIN ID : ";
	public static final String ADMIN_LOGIN_PASSWD_MSG = ">> ADMIN PASSWORD : ";
	public static final String ADMIN_LOGIN_FAIL_MSG = "������ ���� ���ٿ� �����ϼ̽��ϴ�.";
	public static final String CNO_INPUT_MSG = ">> �� ��ȣ : ";
	public static final String PNUM_INPUT_MSG = ">> �ڵ��� ��ȣ : ";
	public static final String CNAME_INPUT_MSG = ">> �� �̸� : ";
	public static final String GENDER_INPUT_MSG = ">> ���� : ";
	public static final String POINT_INPUT_MSG = ">> ����Ʈ : ";
	public static final String PASSWD_INPUT_MSG = ">> ��й�ȣ : ";
	public static final String PASSWD_CHECK_MSG = ">> ��й�ȣ ��Ȯ�� : ";
	public static final String PASSWD_MISMATCH_MSG = ">> ��й�ȣ�� ���� �ٸ��ϴ�. �ٽ� �Է����ּ���.";
	public static final String CUSTOMER_TABLE_NAME = "CUSTOMER_TABLE";
	public static final String DB_NOT_CONN_MSG = "�����ͺ��̽��� ������ ���� �ʾҽ��ϴ�\n���α׷��� ����˴ϴ�..";
	public static final String DB_CONN_MSG = "�����ͺ��̽��� ���� �Ǿ����ϴ�!!";
	public static final String TAP = "\t";
	public static final String SQL_COMMA = "','";
	public static final String SQL_INT_COMMA = ",";
	public static final String SQL_OPEN = "('";
	public static final String SQL_CLOSE = "');";
	public static final String SQL_INT_CLOSE = ")";
	public static final String ADMIN_TABLE_NAME = "ADMIN_LIST";
	public static final String UPDATE_ATTR_MSG = ">> �����ϰ��� �ϴ� �Ӽ� : ";
	public static final String UPDATE_VALUE_MSG = ">> �����ϰ��� �ϴ� �� : ";
	public static final String DB_LOGIN_ID_MSG = "ORACLE ID : ";
	public static final String DB_LOGIN_PASSWD_MSG = "ORACLE PASSWD : ";
	public static final String[] CUSTOMER_TABLE_ATTRS = {"CUSTOMER_NO",
														 "CUSTOMER_NAME",
														 "PHONE_NUM",
														 "GENDER",
														 "POINT_"};
	
}
