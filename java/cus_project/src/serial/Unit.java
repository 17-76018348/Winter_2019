package serial;

import java.io.*;
public class Unit implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//�ν��Ͻ� ����, ��� ����
    private String name;  //�մԸ�
    private String food;  //�ֹ� �޴�
   
    //������, return type�� �����ϴ�.
    public Unit(String n, String f){
        //heap    = stack
        this.name = n;
        this.food = f;
    }
   
    // ������ �ִ� �ν��Ͻ� ������ ���� ���
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("�մԸ�: ");
        sb.append(name);
        sb.append(" : ");
        sb.append(" �ֹ� �޴�: ");
        sb.append(food);
       
        return sb.toString();
    }
}
